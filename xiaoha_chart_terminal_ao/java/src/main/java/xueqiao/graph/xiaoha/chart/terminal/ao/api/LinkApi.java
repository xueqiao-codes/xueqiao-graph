package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import org.apache.thrift.TException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LinkState;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.personal.user.dao.thriftapi.client.PersonalUserDaoStub;
import xueqiao.personal.user.thriftapi.PersonalUserEntry;
import xueqiao.personal.user.thriftapi.PersonalUserErrorCode;
import xueqiao.personal.user.thriftapi.ReqPersonalUserOption;

import java.util.List;

public class LinkApi extends AuthorizeApi {

    private PersonalUserDaoStub stub = new PersonalUserDaoStub();
    private long personalUserId;

    public LinkApi(XiaohaChartLandingInfo landingInfo) throws TException {
        super(landingInfo);
        this.personalUserId = landingInfo.getPersonalUserId();
    }

    public LinkState getState() throws TException {
        boolean isLinked = stub.isUserRelate(this.personalUserId);
        if (isLinked)
            return LinkState.LINKED;
        return LinkState.UN_LINKED;
    }

    public void link(String tel, String verifyCode) throws TException {
        new SmsApi().verifySmsCode(tel, verifyCode);
        ReqPersonalUserOption option = new ReqPersonalUserOption();
        option.setTel(tel);
        List<PersonalUserEntry> users = stub.reqPersonalUser(option);
        if (users.size() == 0) {
            throw new ErrorInfo(PersonalUserErrorCode.USER_NOT_FOUND.getValue(), "User not found.");
        }
        long targetUserId = users.get(0).getUserId();
        stub.mergeUserRelateInfo(personalUserId, targetUserId);
    }
}
