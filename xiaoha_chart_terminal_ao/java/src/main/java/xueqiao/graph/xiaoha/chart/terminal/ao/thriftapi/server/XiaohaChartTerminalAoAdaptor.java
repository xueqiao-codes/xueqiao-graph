package xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.server;

import java.util.Properties;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LinkState;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LoginReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.SignUpReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XueQiaoAppSession;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalAo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalAoVariable;


public abstract class XiaohaChartTerminalAoAdaptor implements XiaohaChartTerminalAo.Iface{
  // unmodified map, so we do not need lock for this 
  private final Map<String, String[]> methodParameterNameMap = new HashMap<String, String[]>(); 

  public String[] getMethodParameterName(String methodName) {
    return methodParameterNameMap.get(methodName);
  }

  @Override
  public XiaohaChartLandingInfo login(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, LoginReq loginReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"login",platformArgs);
    return login(oCntl, loginReq);
  }

  protected abstract XiaohaChartLandingInfo login(TServiceCntl oCntl, LoginReq loginReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void logout(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"logout",platformArgs);
logout(oCntl, landingInfo);
  }

  protected abstract void logout(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public XiaohaChartLandingInfo authorizeXueQiaoApp(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XueQiaoAppSession appSession) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"authorizeXueQiaoApp",platformArgs);
    return authorizeXueQiaoApp(oCntl, appSession);
  }

  protected abstract XiaohaChartLandingInfo authorizeXueQiaoApp(TServiceCntl oCntl, XueQiaoAppSession appSession) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public XiaohaChartLandingInfo signUp(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, SignUpReq signUpReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"signUp",platformArgs);
    return signUp(oCntl, signUpReq);
  }

  protected abstract XiaohaChartLandingInfo signUp(TServiceCntl oCntl, SignUpReq signUpReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void sendVerifyCode(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, String tel) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"sendVerifyCode",platformArgs);
sendVerifyCode(oCntl, tel);
  }

  protected abstract void sendVerifyCode(TServiceCntl oCntl, String tel) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"reqChartFolder",platformArgs);
    return reqChartFolder(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"reqChart",platformArgs);
    return reqChart(oCntl, option, pageOption);
  }

  protected abstract xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.personal.user.thriftapi.FavoriteFolder addFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"addFavoriteFolder",platformArgs);
    return addFavoriteFolder(oCntl, landingInfo, favoriteFolder);
  }

  protected abstract xueqiao.personal.user.thriftapi.FavoriteFolder addFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.personal.user.thriftapi.FavoriteFolder> reqFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"reqFavoriteFolder",platformArgs);
    return reqFavoriteFolder(oCntl, landingInfo, option);
  }

  protected abstract List<xueqiao.personal.user.thriftapi.FavoriteFolder> reqFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void removeFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"removeFavoriteFolder",platformArgs);
removeFavoriteFolder(oCntl, landingInfo, folderId);
  }

  protected abstract void removeFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void renameFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long folderId, String newName) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"renameFavoriteFolder",platformArgs);
renameFavoriteFolder(oCntl, landingInfo, folderId, newName);
  }

  protected abstract void renameFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long folderId, String newName) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void moveFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"moveFavoriteFolder",platformArgs);
moveFavoriteFolder(oCntl, landingInfo, folderId, parentFolderId);
  }

  protected abstract void moveFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public xueqiao.personal.user.thriftapi.FavoriteChart addFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"addFavoriteChart",platformArgs);
    return addFavoriteChart(oCntl, landingInfo, favoriteChart);
  }

  protected abstract xueqiao.personal.user.thriftapi.FavoriteChart addFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.personal.user.thriftapi.FavoriteChart> reqFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"reqFavoriteChart",platformArgs);
    return reqFavoriteChart(oCntl, landingInfo, option);
  }

  protected abstract List<xueqiao.personal.user.thriftapi.FavoriteChart> reqFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void removeFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"removeFavoriteChart",platformArgs);
removeFavoriteChart(oCntl, landingInfo, favoriteChartId);
  }

  protected abstract void removeFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void moveFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"moveFavoriteChart",platformArgs);
moveFavoriteChart(oCntl, landingInfo, favoriteChartId, parentFolderId);
  }

  protected abstract void moveFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void linkExistAccount(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"linkExistAccount",platformArgs);
linkExistAccount(oCntl, landingInfo, tel, verifyCode);
  }

  protected abstract void linkExistAccount(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public LinkState getLinkState(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(XiaohaChartTerminalAoVariable.serviceKey,"getLinkState",platformArgs);
    return getLinkState(oCntl, landingInfo);
  }

  protected abstract LinkState getLinkState(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  protected XiaohaChartTerminalAoAdaptor(){
    methodParameterNameMap.put("login",new String[]{"platformArgs", "loginReq"});
    methodParameterNameMap.put("logout",new String[]{"platformArgs", "landingInfo"});
    methodParameterNameMap.put("authorizeXueQiaoApp",new String[]{"platformArgs", "appSession"});
    methodParameterNameMap.put("signUp",new String[]{"platformArgs", "signUpReq"});
    methodParameterNameMap.put("sendVerifyCode",new String[]{"platformArgs", "tel"});
    methodParameterNameMap.put("reqChartFolder",new String[]{"platformArgs", "option", "pageOption"});
    methodParameterNameMap.put("reqChart",new String[]{"platformArgs", "option", "pageOption"});
    methodParameterNameMap.put("addFavoriteFolder",new String[]{"platformArgs", "landingInfo", "favoriteFolder"});
    methodParameterNameMap.put("reqFavoriteFolder",new String[]{"platformArgs", "landingInfo", "option"});
    methodParameterNameMap.put("removeFavoriteFolder",new String[]{"platformArgs", "landingInfo", "folderId"});
    methodParameterNameMap.put("renameFavoriteFolder",new String[]{"platformArgs", "landingInfo", "folderId", "newName"});
    methodParameterNameMap.put("moveFavoriteFolder",new String[]{"platformArgs", "landingInfo", "folderId", "parentFolderId"});
    methodParameterNameMap.put("addFavoriteChart",new String[]{"platformArgs", "landingInfo", "favoriteChart"});
    methodParameterNameMap.put("reqFavoriteChart",new String[]{"platformArgs", "landingInfo", "option"});
    methodParameterNameMap.put("removeFavoriteChart",new String[]{"platformArgs", "landingInfo", "favoriteChartId"});
    methodParameterNameMap.put("moveFavoriteChart",new String[]{"platformArgs", "landingInfo", "favoriteChartId", "parentFolderId"});
    methodParameterNameMap.put("linkExistAccount",new String[]{"platformArgs", "landingInfo", "tel", "verifyCode"});
    methodParameterNameMap.put("getLinkState",new String[]{"platformArgs", "landingInfo"});
  }
  protected abstract int InitApp(final Properties props);

  protected abstract void destroy();

}
