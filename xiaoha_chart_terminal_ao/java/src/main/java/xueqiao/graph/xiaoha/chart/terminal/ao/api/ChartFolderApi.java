package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import org.apache.thrift.TException;
import org.soldier.platform.page.IndexedPageOption;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.client.XiaohaChartDaoStub;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption;

public class ChartFolderApi {

    private XiaohaChartDaoStub stub = new XiaohaChartDaoStub();

    public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(ReqChartFolderOption option, IndexedPageOption pageOption) throws TException {
        return stub.reqChartFolder(option,pageOption);
    }


    public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(ReqChartOption option, IndexedPageOption pageOption) throws TException {
        return stub.reqChart(option,pageOption);
    }
}
