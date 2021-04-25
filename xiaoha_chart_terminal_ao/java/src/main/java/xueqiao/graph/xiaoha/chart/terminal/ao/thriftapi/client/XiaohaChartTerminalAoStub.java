package xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.soldier.platform.svr_platform.client.BaseStub;
import org.soldier.platform.svr_platform.client.TStubOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import java.util.List;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LinkState;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LoginReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.SignUpReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XueQiaoAppSession;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalAo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalAoVariable;

public class XiaohaChartTerminalAoStub extends BaseStub {

  public XiaohaChartTerminalAoStub() {
    super(XiaohaChartTerminalAoVariable.serviceKey);
  }

  public XiaohaChartLandingInfo  login(LoginReq loginReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return login(loginReq, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public XiaohaChartLandingInfo  login(LoginReq loginReq,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("login").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<XiaohaChartLandingInfo>(){
    @Override
    public XiaohaChartLandingInfo call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).login(platformArgs, loginReq);
      }
    }, invokeInfo);
  }

  public XiaohaChartLandingInfo  login(int routeKey, int timeout,LoginReq loginReq)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return login(loginReq, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  logout(XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    logout(landingInfo, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  logout(XiaohaChartLandingInfo landingInfo,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("logout").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).logout(platformArgs, landingInfo);
      return null;
      }
    }, invokeInfo);
  }

  public void  logout(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    logout(landingInfo, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public XiaohaChartLandingInfo  authorizeXueQiaoApp(XueQiaoAppSession appSession) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return authorizeXueQiaoApp(appSession, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public XiaohaChartLandingInfo  authorizeXueQiaoApp(XueQiaoAppSession appSession,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("authorizeXueQiaoApp").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<XiaohaChartLandingInfo>(){
    @Override
    public XiaohaChartLandingInfo call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).authorizeXueQiaoApp(platformArgs, appSession);
      }
    }, invokeInfo);
  }

  public XiaohaChartLandingInfo  authorizeXueQiaoApp(int routeKey, int timeout,XueQiaoAppSession appSession)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return authorizeXueQiaoApp(appSession, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public XiaohaChartLandingInfo  signUp(SignUpReq signUpReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return signUp(signUpReq, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public XiaohaChartLandingInfo  signUp(SignUpReq signUpReq,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("signUp").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<XiaohaChartLandingInfo>(){
    @Override
    public XiaohaChartLandingInfo call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).signUp(platformArgs, signUpReq);
      }
    }, invokeInfo);
  }

  public XiaohaChartLandingInfo  signUp(int routeKey, int timeout,SignUpReq signUpReq)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return signUp(signUpReq, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  sendVerifyCode(String tel) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    sendVerifyCode(tel, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  sendVerifyCode(String tel,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("sendVerifyCode").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).sendVerifyCode(platformArgs, tel);
      return null;
      }
    }, invokeInfo);
  }

  public void  sendVerifyCode(int routeKey, int timeout,String tel)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    sendVerifyCode(tel, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
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
      return new XiaohaChartTerminalAo.Client(protocol).reqChartFolder(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage  reqChartFolder(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChartFolder(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
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
      return new XiaohaChartTerminalAo.Client(protocol).reqChart(platformArgs, option, pageOption);
      }
    }, invokeInfo);
  }

  public xueqiao.graph.xiaoha.chart.thriftapi.ChartPage  reqChart(int routeKey, int timeout,xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqChart(option, pageOption, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.personal.user.thriftapi.FavoriteFolder  addFavoriteFolder(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteFolder(landingInfo, favoriteFolder, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.personal.user.thriftapi.FavoriteFolder  addFavoriteFolder(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<xueqiao.personal.user.thriftapi.FavoriteFolder>(){
    @Override
    public xueqiao.personal.user.thriftapi.FavoriteFolder call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).addFavoriteFolder(platformArgs, landingInfo, favoriteFolder);
      }
    }, invokeInfo);
  }

  public xueqiao.personal.user.thriftapi.FavoriteFolder  addFavoriteFolder(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteFolder(landingInfo, favoriteFolder, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteFolder>  reqFavoriteFolder(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteFolder(landingInfo, option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteFolder>  reqFavoriteFolder(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.personal.user.thriftapi.FavoriteFolder>>(){
    @Override
    public List<xueqiao.personal.user.thriftapi.FavoriteFolder> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).reqFavoriteFolder(platformArgs, landingInfo, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteFolder>  reqFavoriteFolder(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteFolder(landingInfo, option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteFolder(XiaohaChartLandingInfo landingInfo, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteFolder(landingInfo, folderId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteFolder(XiaohaChartLandingInfo landingInfo, long folderId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("removeFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).removeFavoriteFolder(platformArgs, landingInfo, folderId);
      return null;
      }
    }, invokeInfo);
  }

  public void  removeFavoriteFolder(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, long folderId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteFolder(landingInfo, folderId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  renameFavoriteFolder(XiaohaChartLandingInfo landingInfo, long folderId, String newName) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    renameFavoriteFolder(landingInfo, folderId, newName, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  renameFavoriteFolder(XiaohaChartLandingInfo landingInfo, long folderId, String newName,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("renameFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).renameFavoriteFolder(platformArgs, landingInfo, folderId, newName);
      return null;
      }
    }, invokeInfo);
  }

  public void  renameFavoriteFolder(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, long folderId, String newName)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    renameFavoriteFolder(landingInfo, folderId, newName, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  moveFavoriteFolder(XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    moveFavoriteFolder(landingInfo, folderId, parentFolderId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  moveFavoriteFolder(XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("moveFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).moveFavoriteFolder(platformArgs, landingInfo, folderId, parentFolderId);
      return null;
      }
    }, invokeInfo);
  }

  public void  moveFavoriteFolder(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    moveFavoriteFolder(landingInfo, folderId, parentFolderId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.personal.user.thriftapi.FavoriteChart  addFavoriteChart(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteChart(landingInfo, favoriteChart, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public xueqiao.personal.user.thriftapi.FavoriteChart  addFavoriteChart(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<xueqiao.personal.user.thriftapi.FavoriteChart>(){
    @Override
    public xueqiao.personal.user.thriftapi.FavoriteChart call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).addFavoriteChart(platformArgs, landingInfo, favoriteChart);
      }
    }, invokeInfo);
  }

  public xueqiao.personal.user.thriftapi.FavoriteChart  addFavoriteChart(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteChart(landingInfo, favoriteChart, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteChart>  reqFavoriteChart(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteChart(landingInfo, option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteChart>  reqFavoriteChart(XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.personal.user.thriftapi.FavoriteChart>>(){
    @Override
    public List<xueqiao.personal.user.thriftapi.FavoriteChart> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).reqFavoriteChart(platformArgs, landingInfo, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteChart>  reqFavoriteChart(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteChart(landingInfo, option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteChart(XiaohaChartLandingInfo landingInfo, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteChart(landingInfo, favoriteChartId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteChart(XiaohaChartLandingInfo landingInfo, long favoriteChartId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("removeFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).removeFavoriteChart(platformArgs, landingInfo, favoriteChartId);
      return null;
      }
    }, invokeInfo);
  }

  public void  removeFavoriteChart(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, long favoriteChartId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteChart(landingInfo, favoriteChartId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  moveFavoriteChart(XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    moveFavoriteChart(landingInfo, favoriteChartId, parentFolderId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  moveFavoriteChart(XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("moveFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).moveFavoriteChart(platformArgs, landingInfo, favoriteChartId, parentFolderId);
      return null;
      }
    }, invokeInfo);
  }

  public void  moveFavoriteChart(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    moveFavoriteChart(landingInfo, favoriteChartId, parentFolderId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  linkExistAccount(XiaohaChartLandingInfo landingInfo, String tel, String verifyCode) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    linkExistAccount(landingInfo, tel, verifyCode, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  linkExistAccount(XiaohaChartLandingInfo landingInfo, String tel, String verifyCode,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("linkExistAccount").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new XiaohaChartTerminalAo.Client(protocol).linkExistAccount(platformArgs, landingInfo, tel, verifyCode);
      return null;
      }
    }, invokeInfo);
  }

  public void  linkExistAccount(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo, String tel, String verifyCode)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    linkExistAccount(landingInfo, tel, verifyCode, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public LinkState  getLinkState(XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return getLinkState(landingInfo, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public LinkState  getLinkState(XiaohaChartLandingInfo landingInfo,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("getLinkState").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<LinkState>(){
    @Override
    public LinkState call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new XiaohaChartTerminalAo.Client(protocol).getLinkState(platformArgs, landingInfo);
      }
    }, invokeInfo);
  }

  public LinkState  getLinkState(int routeKey, int timeout,XiaohaChartLandingInfo landingInfo)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return getLinkState(landingInfo, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

}
