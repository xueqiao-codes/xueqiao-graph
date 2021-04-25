package xueqiao.graph.xiaoha.chart.webapi.thriftapi.server;

import java.util.Properties;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.OperateResult;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.XiaohaChartWebapi;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.XiaohaChartWebapiVariable;


public abstract class XiaohaChartWebapiAdaptor implements XiaohaChartWebapi.Iface{
  // unmodified map, so we do not need lock for this 
  private final Map<String, String[]> methodParameterNameMap = new HashMap<String, String[]>(); 

  public String[] getMethodParameterName(String methodName) {
    return methodParameterNameMap.get(methodName);
  }

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"reqChart",platformArgs);
    return reqChart(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public OperateResult updateChartTags(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long chartId, Set<String> tags) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"updateChartTags",platformArgs);
    return updateChartTags(oCntl, chartId, tags);
  }

  protected abstract OperateResult updateChartTags(TServiceCntl oCntl, long chartId, Set<String> tags) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public OperateResult updateChartState(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"updateChartState",platformArgs);
    return updateChartState(oCntl, chartId, state);
  }

  protected abstract OperateResult updateChartState(TServiceCntl oCntl, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<String> reqTags(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"reqTags",platformArgs);
    return reqTags(oCntl);
  }

  protected abstract List<String> reqTags(TServiceCntl oCntl) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<String> reqPlates(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"reqPlates",platformArgs);
    return reqPlates(oCntl);
  }

  protected abstract List<String> reqPlates(TServiceCntl oCntl) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public OperateResult removeTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long tagId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"removeTag",platformArgs);
    return removeTag(oCntl, tagId);
  }

  protected abstract OperateResult removeTag(TServiceCntl oCntl, long tagId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public OperateResult updateTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"updateTag",platformArgs);
    return updateTag(oCntl, tag);
  }

  protected abstract OperateResult updateTag(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public OperateResult addTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"addTag",platformArgs);
    return addTag(oCntl, tag);
  }

  protected abstract OperateResult addTag(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage reqTagPage(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartWebapiVariable.serviceKey,"reqTagPage",platformArgs);
    return reqTagPage(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage reqTagPage(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  protected XiaohaChartWebapiAdaptor(){
    methodParameterNameMap.put("reqChart",new String[]{"platformArgs", "option", "pageOption"});
    methodParameterNameMap.put("updateChartTags",new String[]{"platformArgs", "chartId", "tags"});
    methodParameterNameMap.put("updateChartState",new String[]{"platformArgs", "chartId", "state"});
    methodParameterNameMap.put("reqTags",new String[]{"platformArgs"});
    methodParameterNameMap.put("reqPlates",new String[]{"platformArgs"});
    methodParameterNameMap.put("removeTag",new String[]{"platformArgs", "tagId"});
    methodParameterNameMap.put("updateTag",new String[]{"platformArgs", "tag"});
    methodParameterNameMap.put("addTag",new String[]{"platformArgs", "tag"});
    methodParameterNameMap.put("reqTagPage",new String[]{"platformArgs", "option", "pageOption"});
  }
  protected abstract int InitApp(final Properties props);

  protected abstract void destroy();

}
