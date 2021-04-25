package xueqiao.graph.xiaoha.chart.dao.thriftapi.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.soldier.platform.svr_platform.client.BaseStub;
import org.soldier.platform.svr_platform.client.TStubOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import java.util.List;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDao;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDaoVariable;

public class XiaohaChartDaoStub extends BaseStub {

  public XiaohaChartDaoStub() {
    super(XiaohaChartDaoVariable.serviceKey);
  }

  public void  addChart(xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addChart(chart, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addChart(xueqiao.graph.xiaoha.chart.thriftapi.Chart chart,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).addChart(platformArgs, chart);
      return null;
      }
    }, invokeInfo);
  }

  public void  addChart(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.Chart chart)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addChart(chart, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateChart(xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateChart(chart, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateChart(xueqiao.graph.xiaoha.chart.thriftapi.Chart chart,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).updateChart(platformArgs, chart);
      return null;
      }
    }, invokeInfo);
  }

  public void  updateChart(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.Chart chart)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateChart(chart, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage  reqChart(xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChart(option, pageOption, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage  reqChart(xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<xueqiao.graph.xiaoha.chart.thriftapi.ChartPage>(){
    @Override
    public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartDao.Client(protocol).reqChart(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage  reqChart(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChart(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addChartFolder(xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addChartFolder(chartFolder, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addChartFolder(xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addChartFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).addChartFolder(platformArgs, chartFolder);
      return null;
      }
    }, invokeInfo);
  }

  public void  addChartFolder(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addChartFolder(chartFolder, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateChartFolder(xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateChartFolder(chartFolder, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateChartFolder(xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateChartFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).updateChartFolder(platformArgs, chartFolder);
      return null;
      }
    }, invokeInfo);
  }

  public void  updateChartFolder(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateChartFolder(chartFolder, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage  reqChartFolder(xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChartFolder(option, pageOption, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage  reqChartFolder(xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqChartFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage>(){
    @Override
    public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartDao.Client(protocol).reqChartFolder(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage  reqChartFolder(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChartFolder(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addTag(tag, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).addTag(platformArgs, tag);
      return null;
      }
    }, invokeInfo);
  }

  public void  addTag(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addTag(tag, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeTag(long tagId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeTag(tagId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeTag(long tagId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("removeTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).removeTag(platformArgs, tagId);
      return null;
      }
    }, invokeInfo);
  }

  public void  removeTag(int routeKey, int timeout,long tagId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeTag(tagId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag>  reqTag(xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTag(option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag>  reqTag(xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag>>(){
    @Override
    public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartDao.Client(protocol).reqTag(platformArgs, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag>  reqTag(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTag(option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addPlate(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addPlate(plate, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addPlate(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addPlate").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).addPlate(platformArgs, plate);
      return null;
      }
    }, invokeInfo);
  }

  public void  addPlate(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addPlate(plate, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate>  reqPlate() throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqPlate(new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate>  reqPlate(TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqPlate").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate>>(){
    @Override
    public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartDao.Client(protocol).reqPlate(platformArgs);
      }
    }, invokeInfo);
  }

  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate>  reqPlate(int routeKey, int timeout)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqPlate(new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateTag(tag, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartDao.Client(protocol).updateTag(platformArgs, tag);
      return null;
      }
    }, invokeInfo);
  }

  public void  updateTag(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateTag(tag, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage  reqTagPage(xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTagPage(option, pageOption, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage  reqTagPage(xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqTagPage").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage>(){
    @Override
    public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartDao.Client(protocol).reqTagPage(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage  reqTagPage(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTagPage(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

}
