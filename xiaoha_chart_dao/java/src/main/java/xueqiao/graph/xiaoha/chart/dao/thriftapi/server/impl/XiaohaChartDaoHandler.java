package xueqiao.graph.xiaoha.chart.dao.thriftapi.server.impl;


import java.util.List;
import java.util.Properties;

import org.apache.thrift.TException;
import org.soldier.base.logger.AppLog;
import org.soldier.platform.dal_set.DalSetProxy;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import xueqiao.graph.xiaoha.chart.api.ChartFolderHandler;
import xueqiao.graph.xiaoha.chart.api.ChartHandler;
import xueqiao.graph.xiaoha.chart.api.PlateHandler;
import xueqiao.graph.xiaoha.chart.api.TagHandler;
import xueqiao.graph.xiaoha.chart.config.ConfigurationProperty;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.server.XiaohaChartDaoAdaptor;
import xueqiao.graph.xiaoha.chart.thriftapi.*;

import javax.sql.DataSource;

public class XiaohaChartDaoHandler extends XiaohaChartDaoAdaptor {
    @Override
    public int InitApp(Properties props) {

        try {
            DalSetProxy.getInstance().loadFromXml();
        } catch (Exception e) {
            AppLog.e("DAL init fail.", e);
            e.printStackTrace();
            return -1;
        }
        try {
            ConfigurationProperty.instance().init(props);

        } catch (Exception e) {
            e.printStackTrace();
            AppLog.e("Config init fail.", e);
            return -1;
        }
        AppLog.e("======= SERVICE START =======");
        return 0;
    }

    @Override
    protected void addChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new ChartHandler().addChart(getDataSource(oCntl), chart);
    }

    @Override
    protected void updateChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new ChartHandler().updateChart(getDataSource(oCntl), chart);
    }

    @Override
    protected xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new ChartHandler().queryChart(getDataSource(oCntl), option, pageOption);
    }

    @Override
    protected void addChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new ChartFolderHandler().addFolder(getDataSource(oCntl), chartFolder);
    }

    @Override
    protected void updateChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new ChartFolderHandler().updateFolder(getDataSource(oCntl), chartFolder);
    }

    @Override
    protected xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new ChartFolderHandler().queryFolder(getDataSource(oCntl), option, pageOption);
    }

    @Override
    protected void addTag(TServiceCntl oCntl, XueQiaoTag tag) throws ErrorInfo, TException {
        new TagHandler().addXueQiaoTag(getDataSource(oCntl), tag);
    }

    @Override
    protected void removeTag(TServiceCntl oCntl, long tagId) throws ErrorInfo, TException {
        new TagHandler().removeTag(getDataSource(oCntl), tagId);
    }

    @Override
    protected List<XueQiaoTag> reqTag(TServiceCntl oCntl, ReqTagOption option) throws ErrorInfo, TException {
        return new TagHandler().query(getDataSource(oCntl), option);
    }

    @Override
    protected void addPlate(TServiceCntl oCntl, XueQiaoPlate plate) throws ErrorInfo, TException {
        new PlateHandler().addXueQiaoPlate(getDataSource(oCntl), plate);
    }

    @Override
    protected List<XueQiaoPlate> reqPlate(TServiceCntl oCntl) throws ErrorInfo, TException {
        return new PlateHandler().query(getDataSource(oCntl));
    }

    @Override
    protected void updateTag(TServiceCntl oCntl, XueQiaoTag tag) throws ErrorInfo, TException {
        new TagHandler().updateTag(getDataSource(oCntl), tag);
    }

    @Override
    protected XueQiaoTagPage reqTagPage(TServiceCntl oCntl, ReqTagOption option, IndexedPageOption pageOption) throws ErrorInfo, TException {
        return new TagHandler().query(getDataSource(oCntl), option, pageOption);
    }

    private DataSource getDataSource(TServiceCntl oCntl) {
        return ConfigurationProperty.instance().getDataSource(oCntl.getDalSetServiceName());
    }

    @Override
    public void destroy() {
    }
}
