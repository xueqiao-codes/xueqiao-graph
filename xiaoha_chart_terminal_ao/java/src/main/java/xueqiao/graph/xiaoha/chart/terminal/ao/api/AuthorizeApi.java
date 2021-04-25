package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import org.apache.thrift.TException;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;

public abstract class AuthorizeApi {

    public AuthorizeApi(XiaohaChartLandingInfo landingInfo) throws TException {
        SessionHandler handler = new SessionHandler();
        handler.check(landingInfo);
    }
}
