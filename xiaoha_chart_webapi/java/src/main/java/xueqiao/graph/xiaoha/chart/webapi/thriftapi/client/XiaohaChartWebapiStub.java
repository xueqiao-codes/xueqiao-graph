package xueqiao.graph.xiaoha.chart.webapi.thriftapi.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.soldier.platform.svr_platform.client.BaseStub;
import org.soldier.platform.svr_platform.client.TStubOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import java.util.List;
import java.util.Set;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.OperateResult;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.XiaohaChartWebapi;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.XiaohaChartWebapiVariable;

public class XiaohaChartWebapiStub extends BaseStub {

  public XiaohaChartWebapiStub() {
    super(XiaohaChartWebapiVariable.serviceKey);
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
      return new XiaohaChartWebapi.Client(protocol).reqChart(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage  reqChart(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChart(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  updateChartTags(long chartId, Set<String> tags) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return updateChartTags(chartId, tags, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  updateChartTags(long chartId, Set<String> tags,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateChartTags").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<OperateResult>(){
    @Override
    public OperateResult call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).updateChartTags(platformArgs, chartId, tags);
      }
    }, invokeInfo);
  }

  public OperateResult  updateChartTags(int routeKey, int timeout,long chartId, Set<String> tags)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return updateChartTags(chartId, tags, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  updateChartState(long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return updateChartState(chartId, state, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  updateChartState(long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateChartState").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<OperateResult>(){
    @Override
    public OperateResult call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).updateChartState(platformArgs, chartId, state);
      }
    }, invokeInfo);
  }

  public OperateResult  updateChartState(int routeKey, int timeout,long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return updateChartState(chartId, state, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<String>  reqTags() throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTags(new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<String>  reqTags(TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqTags").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<String>>(){
    @Override
    public List<String> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).reqTags(platformArgs);
      }
    }, invokeInfo);
  }

  public List<String>  reqTags(int routeKey, int timeout)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTags(new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<String>  reqPlates() throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqPlates(new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<String>  reqPlates(TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqPlates").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<String>>(){
    @Override
    public List<String> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).reqPlates(platformArgs);
      }
    }, invokeInfo);
  }

  public List<String>  reqPlates(int routeKey, int timeout)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqPlates(new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  removeTag(long tagId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return removeTag(tagId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  removeTag(long tagId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("removeTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<OperateResult>(){
    @Override
    public OperateResult call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).removeTag(platformArgs, tagId);
      }
    }, invokeInfo);
  }

  public OperateResult  removeTag(int routeKey, int timeout,long tagId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return removeTag(tagId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  updateTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return updateTag(tag, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  updateTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<OperateResult>(){
    @Override
    public OperateResult call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).updateTag(platformArgs, tag);
      }
    }, invokeInfo);
  }

  public OperateResult  updateTag(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return updateTag(tag, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  addTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addTag(tag, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public OperateResult  addTag(xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addTag").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<OperateResult>(){
    @Override
    public OperateResult call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartWebapi.Client(protocol).addTag(platformArgs, tag);
      }
    }, invokeInfo);
  }

  public OperateResult  addTag(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addTag(tag, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
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
      return new XiaohaChartWebapi.Client(protocol).reqTagPage(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage  reqTagPage(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqTagPage(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

}
