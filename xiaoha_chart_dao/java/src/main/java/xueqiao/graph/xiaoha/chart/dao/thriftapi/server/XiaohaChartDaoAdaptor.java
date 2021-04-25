package xueqiao.graph.xiaoha.chart.dao.thriftapi.server;

import java.util.Properties;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDao;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDaoVariable;


public abstract class XiaohaChartDaoAdaptor implements XiaohaChartDao.Iface{
  // unmodified map, so we do not need lock for this 
  private final Map<String, String[]> methodParameterNameMap = new HashMap<String, String[]>(); 

  public String[] getMethodParameterName(String methodName) {
    return methodParameterNameMap.get(methodName);
  }

  @Override
  public void addChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"addChart",platformArgs);
addChart(oCntl, chart);
  }

  protected abstract void addChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void updateChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"updateChart",platformArgs);
updateChart(oCntl, chart);
  }

  protected abstract void updateChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"reqChart",platformArgs);
    return reqChart(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void addChartFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"addChartFolder",platformArgs);
addChartFolder(oCntl, chartFolder);
  }

  protected abstract void addChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void updateChartFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"updateChartFolder",platformArgs);
updateChartFolder(oCntl, chartFolder);
  }

  protected abstract void updateChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"reqChartFolder",platformArgs);
    return reqChartFolder(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void addTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"addTag",platformArgs);
addTag(oCntl, tag);
  }

  protected abstract void addTag(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void removeTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long tagId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"removeTag",platformArgs);
removeTag(oCntl, tagId);
  }

  protected abstract void removeTag(TServiceCntl oCntl, long tagId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag> reqTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"reqTag",platformArgs);
    return reqTag(oCntl, option);
  }

  protected abstract List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag> reqTag(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void addPlate(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"addPlate",platformArgs);
addPlate(oCntl, plate);
  }

  protected abstract void addPlate(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate> reqPlate(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"reqPlate",platformArgs);
    return reqPlate(oCntl);
  }

  protected abstract List<xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate> reqPlate(TServiceCntl oCntl) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void updateTag(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"updateTag",platformArgs);
updateTag(oCntl, tag);
  }

  protected abstract void updateTag(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage reqTagPage(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey,"reqTagPage",platformArgs);
    return reqTagPage(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage reqTagPage(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  protected XiaohaChartDaoAdaptor(){
    methodParameterNameMap.put("addChart",new String[]{"platformArgs", "chart"});
    methodParameterNameMap.put("updateChart",new String[]{"platformArgs", "chart"});
    methodParameterNameMap.put("reqChart",new String[]{"platformArgs", "option", "pageOption"});
    methodParameterNameMap.put("addChartFolder",new String[]{"platformArgs", "chartFolder"});
    methodParameterNameMap.put("updateChartFolder",new String[]{"platformArgs", "chartFolder"});
    methodParameterNameMap.put("reqChartFolder",new String[]{"platformArgs", "option", "pageOption"});
    methodParameterNameMap.put("addTag",new String[]{"platformArgs", "tag"});
    methodParameterNameMap.put("removeTag",new String[]{"platformArgs", "tagId"});
    methodParameterNameMap.put("reqTag",new String[]{"platformArgs", "option"});
    methodParameterNameMap.put("addPlate",new String[]{"platformArgs", "plate"});
    methodParameterNameMap.put("reqPlate",new String[]{"platformArgs"});
    methodParameterNameMap.put("updateTag",new String[]{"platformArgs", "tag"});
    methodParameterNameMap.put("reqTagPage",new String[]{"platformArgs", "option", "pageOption"});
  }
  protected abstract int InitApp(final Properties props);

  protected abstract void destroy();

}
