package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import org.apache.thrift.TException;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.company.CompanyUser;
import xueqiao.company.CompanyUserPage;
import xueqiao.company.QueryCompanyUserOption;
import xueqiao.company.dao.client.CompanyDaoStub;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalError;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XueQiaoAppSession;
import xueqiao.hosting.machine.HostingRelatedInfo;
import xueqiao.hosting.machine.HostingRelatedInfoPageResult;
import xueqiao.hosting.machine.QueryHostingRelatedInfoOption;
import xueqiao.hosting.machine.dao.client.HostingMachineDaoStub;
import xueqiao.personal.user.dao.thriftapi.client.PersonalUserDaoStub;
import xueqiao.personal.user.thriftapi.PersonalUserEntry;
import xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption;
import xueqiao.personal.user.thriftapi.UserRelateInfo;
import xueqiao.trade.hosting.HostingSession;
import xueqiao.trade.hosting.HostingUser;
import xueqiao.trade.hosting.QueryHostingUserOption;
import xueqiao.trade.hosting.QueryHostingUserPage;
import xueqiao.trade.hosting.cloud.ao.client.TradeHostingCloudAoStub;
import xueqiao.trade.hosting.proxy.client.TradeHostingProxyStub;

import java.util.List;

public class RelateUserApi {

    private long companyId;
    private long companyUserId;

    public void get(long machineId, int subUserId) throws TException {

        QueryHostingRelatedInfoOption option = new QueryHostingRelatedInfoOption();
        option.setMachineId(machineId);
        IndexedPageOption pageOption = new IndexedPageOption();
        pageOption.setPageIndex(0);
        pageOption.setPageSize(1);
        HostingRelatedInfoPageResult page = new HostingMachineDaoStub()
                .queryRelatedInfoPage((int) machineId, 2000, option, pageOption);

        if (page.getResultListSize() > 0) {
            HostingRelatedInfo relatedInfo = page.getResultList().get(0);
            companyId = relatedInfo.getCompanyId();

            TradeHostingCloudAoStub cloudAoStub = new TradeHostingCloudAoStub();
            cloudAoStub.setPeerAddr(relatedInfo.getMachineInnerIP());
            QueryHostingUserOption queryOption = new QueryHostingUserOption();
            queryOption.setSubUserId(subUserId);
            QueryHostingUserPage subUserPage = cloudAoStub.getHostingUserPage(queryOption, pageOption);
            if (subUserPage.getResultListSize() > 0) {
                HostingUser subUser = subUserPage.getResultList().get(0);
                String userName = subUser.getLoginName();

                CompanyDaoStub companyDaoStub = new CompanyDaoStub();
                QueryCompanyUserOption companyUserOption = new QueryCompanyUserOption();
                companyUserOption.setCompanyId((int) companyId);
                companyUserOption.setUserName(userName);
                CompanyUserPage companyUserPage = companyDaoStub.queryCompanyUser(companyUserOption, pageOption);
                if (companyUserPage.getPageSize() > 0) {
                    CompanyUser companyUser = companyUserPage.getPage().get(0);
                    companyUserId = companyUser.getUserId();
                }
            }
        }
    }

    public XiaohaChartLandingInfo authorizeXueQiaoApp(XueQiaoAppSession appSession) throws TException {

        TradeHostingProxyStub stub = new TradeHostingProxyStub();
        HostingSession hostingSession = new HostingSession();
        hostingSession.setMachineId(appSession.getMachineId());
        hostingSession.setSubUserId(appSession.getSubUserId());
        hostingSession.setToken(appSession.getToken());
        boolean success = stub.checkSession(hostingSession);
        if (!success) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_ERROR.getValue(), "Token error.");
        }
        get(appSession.getMachineId(), appSession.getSubUserId());

        PersonalUserDaoStub personalUserDaoStub = new PersonalUserDaoStub();
        ReqUserRelateInfoOption option = new ReqUserRelateInfoOption();
        option.setCompanyId(companyId);
        option.setCompanyUserId(companyUserId);
        List<UserRelateInfo> relateInfo = personalUserDaoStub.reqUserRelateInfo(option);
        long personalUserId;
        if (relateInfo.size() == 0) {
            PersonalUserEntry newUser = new PersonalUserEntry();
            personalUserId = personalUserDaoStub.addPersonalUser(newUser);
            UserRelateInfo userRelateInfo = new UserRelateInfo();
            userRelateInfo.setPersonalUserId(personalUserId);
            userRelateInfo.setCompanyUserId(companyUserId);
            userRelateInfo.setCompanyId(companyId);
            personalUserDaoStub.addUserRelateInfo(userRelateInfo);
        } else {
            personalUserId = relateInfo.get(0).getPersonalUserId();
        }
        XiaohaChartLandingInfo landingInfo = new XiaohaChartLandingInfo();
        landingInfo.setPersonalUserId(personalUserId);
        landingInfo.setToken(SessionHandler.genToken(personalUserId));
        return landingInfo;
    }

    public long getCompanyUserId() {
        return companyUserId;
    }

    public long getCompanyId() {
        return companyId;
    }
}
