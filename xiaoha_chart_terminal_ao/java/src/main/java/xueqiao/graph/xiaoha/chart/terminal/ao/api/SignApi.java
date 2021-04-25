package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import org.apache.thrift.TException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LoginReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.SignUpReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.personal.user.dao.thriftapi.client.PersonalUserDaoStub;
import xueqiao.personal.user.thriftapi.PersonalUserEntry;
import xueqiao.personal.user.thriftapi.PersonalUserErrorCode;
import xueqiao.personal.user.thriftapi.ReqPersonalUserOption;

import java.util.List;

public class SignApi {
    private PersonalUserDaoStub stub = new PersonalUserDaoStub();

    public XiaohaChartLandingInfo signIn(LoginReq loginReq) throws TException {
        ReqPersonalUserOption option = new ReqPersonalUserOption();
        option.setTel(loginReq.getTel());
        List<PersonalUserEntry> users = stub.reqPersonalUser(option);
        if (users.size() == 0) {
            throw new ErrorInfo(PersonalUserErrorCode.USER_NOT_FOUND.getValue(),"User not found.");
        }
        PersonalUserEntry user = users.get(0);
        // TODO remove for test
        if (!"18576421291".equals(user.getTel())) {
            new SmsApi().verifySmsCode(loginReq.getTel(), loginReq.getPassword());
        }
        XiaohaChartLandingInfo landingInfo = new XiaohaChartLandingInfo();
        landingInfo.setPersonalUserId(user.getUserId());
        landingInfo.setToken(SessionHandler.genToken(user.getUserId()));
        return landingInfo;
    }

    public void signOut(XiaohaChartLandingInfo landingInfo) throws TException {
        SessionHandler handler = new SessionHandler();
        handler.remove(landingInfo);
    }

    public XiaohaChartLandingInfo signUp(SignUpReq signUpReq) throws TException {
        ReqPersonalUserOption option = new ReqPersonalUserOption();
        option.setTel(signUpReq.getTel());
        List<PersonalUserEntry> users = stub.reqPersonalUser(option);
        if (users.size() > 0) {
            throw new ErrorInfo();
        }
        new SmsApi().verifySmsCode(signUpReq.getTel(), signUpReq.getVerifyCode());

        PersonalUserEntry personalUserEntry = new PersonalUserEntry();
        personalUserEntry.setTel(signUpReq.getTel());
        long userId = stub.addPersonalUser(personalUserEntry);

        XiaohaChartLandingInfo landingInfo = new XiaohaChartLandingInfo();
        landingInfo.setPersonalUserId(userId);
        landingInfo.setToken(SessionHandler.genToken(userId));
        return landingInfo;
    }
}
