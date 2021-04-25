package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import com.longsheng.xueqiao.duck.thriftapi.client.DuckServiceStub;
import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalError;

import java.nio.ByteBuffer;
import java.util.UUID;

public class SessionHandler {

    private static final int EXPIRE_SECONDS = 900;
    private static final String APP_KEY = "XH_CTA";
    private static final String SEPARATOR = "|";

    private DuckServiceStub stub = new DuckServiceStub();

    public static String genToken(long userId) throws TException {
        UUID uuid = UUID.randomUUID();
        String sessionValue = uuid.toString().replace("-", "");
        StringBuilder builder = new StringBuilder(128);
        builder.append(APP_KEY)
                .append(SEPARATOR)
                .append(userId)
                .append(SEPARATOR)
                .append(sessionValue);

        ByteBuffer buff = ByteBuffer.wrap(sessionValue.getBytes());
        new DuckServiceStub().updateAppSession(String.valueOf(userId), buff, EXPIRE_SECONDS, APP_KEY);
        return builder.toString();
    }

    public void check(XiaohaChartLandingInfo landingInfo) throws TException {
        String token = landingInfo.getToken();
        String[] parts = StringUtils.split(token, SEPARATOR);
        if (parts.length != 3) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_ERROR.getValue(), "Token error.");
        }

        String appKey = parts[0];
        String idStr = parts[1];
        String sessionValue = parts[2];
        if (!APP_KEY.equals(appKey)) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_ERROR.getValue(), "Token error.");
        }
        long userId;
        try {
            userId = Long.parseLong(idStr);
        } catch (Exception e) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_ERROR.getValue(), "Token error.");
        }

        if (userId != landingInfo.getPersonalUserId()) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_ERROR.getValue(), "Token error.");
        }


        ByteBuffer buff = stub.getAppSession(idStr, APP_KEY);
        String inSessionValue = new String(buff.array());
        if (inSessionValue == null || "".equals(inSessionValue)) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_TIMEOUT.getValue(), "Token timeout.");
        }
        if (!inSessionValue.equals(sessionValue)) {
            throw new ErrorInfo(XiaohaChartTerminalError.SESSION_DIFFERENT.getValue(), "Token different.");
        }
        stub.updateAppSession(idStr, buff, EXPIRE_SECONDS, APP_KEY);
    }

    public void remove(XiaohaChartLandingInfo landingInfo) throws TException {
        check(landingInfo);
        stub.deleteAppSession(String.valueOf(landingInfo.getPersonalUserId()), APP_KEY);
    }
}
