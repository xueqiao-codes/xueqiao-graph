package xueqiao.graph.xiaoha.chart.webapi.thriftapi.server.impl;


import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.thrift.TException;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import xueqiao.graph.xiaoha.chart.api.ChartApi;
import xueqiao.graph.xiaoha.chart.api.PlateApi;
import xueqiao.graph.xiaoha.chart.api.TagApi;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.server.XiaohaChartWebapiAdaptor;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.OperateResult;

public class XiaohaChartWebapiHandler extends XiaohaChartWebapiAdaptor {
    @Override
    public int InitApp(Properties props) {
        return 0;
    }

    @Override
    protected xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new ChartApi().reqChart(option, pageOption);
    }

    @Override
    protected OperateResult updateChartTags(TServiceCntl oCntl, long chartId, Set<String> tags) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new ChartApi().updateChartTags(chartId, tags);
        return new OperateResult().setSuccess(true);
    }

    @Override
    protected OperateResult updateChartState(TServiceCntl oCntl, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new ChartApi().updateChartState(chartId, state);
        return new OperateResult().setSuccess(true);
    }

    @Override
    protected List<String> reqTags(TServiceCntl oCntl) throws ErrorInfo, TException {
        return new TagApi().reqTags();
    }

    @Override
    protected List<String> reqPlates(TServiceCntl oCntl) throws ErrorInfo, TException {
        return new PlateApi().req();
    }

    @Override
    protected OperateResult removeTag(TServiceCntl oCntl, long tagId) throws ErrorInfo, TException {
        new TagApi().removeTag(tagId);
        return new OperateResult().setSuccess(true);
    }

    @Override
    protected OperateResult updateTag(TServiceCntl oCntl, XueQiaoTag tag) throws ErrorInfo, TException {
        new TagApi().updateTag(tag);
        return new OperateResult().setSuccess(true);
    }

    @Override
    protected OperateResult addTag(TServiceCntl oCntl, XueQiaoTag tag) throws ErrorInfo, TException {
        new TagApi().addTag(tag);
        return new OperateResult().setSuccess(true);
    }

    @Override
    protected XueQiaoTagPage reqTagPage(TServiceCntl oCntl, ReqTagOption option, IndexedPageOption pageOption) throws ErrorInfo, TException {
        return new TagApi().reqTagPage(option, pageOption);
    }

    @Override
    public void destroy() {
    }
}
