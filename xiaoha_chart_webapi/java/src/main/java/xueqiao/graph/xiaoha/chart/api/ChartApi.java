package xueqiao.graph.xiaoha.chart.api;

import org.apache.thrift.TException;
import org.soldier.platform.page.IndexedPageOption;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.client.XiaohaChartDaoStub;
import xueqiao.graph.xiaoha.chart.thriftapi.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChartApi {

    public ChartPage reqChart(ReqChartOption option, IndexedPageOption pageOption) throws TException {
        return new XiaohaChartDaoStub().reqChart(option, pageOption);
    }

    public void updateChartTags(long chartId, Set<String> tags) throws TException {

        XiaohaChartDaoStub stub = new XiaohaChartDaoStub();
        List<XueQiaoTag> existTags = stub.reqTag(null);
        Set<String> exist = new HashSet<>();
        for (XueQiaoTag xueQiaoTag : existTags) {
            exist.add(xueQiaoTag.getCnName());
        }
        for (String tag : tags) {
            if (null != tag && !exist.contains(tag)) {
                XueQiaoTag newTag = new XueQiaoTag();
                newTag.setCnName(tag);
                stub.addTag(newTag);
            }
        }

        Chart chart = new Chart();
        chart.setChartId(chartId);
        chart.setTags(tags);
        new XiaohaChartDaoStub().updateChart(chart);
    }

    public void updateChartState(long chartId, ChartState state) throws TException {
        Chart chart = new Chart();
        chart.setChartId(chartId);
        chart.setChartState(state);
        new XiaohaChartDaoStub().updateChart(chart);
    }
}
