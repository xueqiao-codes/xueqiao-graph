package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import com.longsheng.xueqiao.goose.thriftapi.client.GooseAoStub;
import org.apache.thrift.TException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalError;

public class SmsApi {

    private GooseAoStub stub = new GooseAoStub();

    public void sendVerifyCode(String tel) throws TException {
        stub.sendVerifyCode(tel);
    }

    public void verifySmsCode(String tel, String code) throws TException {
        boolean success= stub.verifySmsCode(tel, code);
        if (!success) {
            throw new ErrorInfo(XiaohaChartTerminalError.VERIFY_CODE_ERROR.getValue()," Verify code error.");
        }
    }
}
