package xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.client;

import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalAo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartTerminalAoVariable;
import org.apache.thrift.TException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.soldier.base.logger.AppLog;
import org.soldier.platform.svr_platform.client.AsyncCallRunner;
import org.soldier.platform.svr_platform.client.IMethodCallback;
import org.soldier.platform.svr_platform.client.SvrContainer;
import org.soldier.platform.svr_platform.client.TRequestOption;
import org.soldier.platform.svr_platform.client.TServiceCall;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import org.soldier.platform.svr_platform.client.BaseStub;
import java.util.List;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LinkState;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.LoginReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.SignUpReq;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XueQiaoAppSession;

public class XiaohaChartTerminalAoAsyncStub extends BaseStub { 
  public XiaohaChartTerminalAoAsyncStub() {
    super(XiaohaChartTerminalAoVariable.serviceKey);
  }
  public void send_login(int routeKey, int timeout, LoginReq loginReq) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_loginServiceCall(routeKey, timeout, platformArgs, loginReq), new TRequestOption());
  }

  public void send_login(int routeKey, int timeout, LoginReq loginReq,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_loginServiceCall(routeKey, timeout, platformArgs, loginReq), requestOption);
  }

  public long login(int routeKey, int timeout, LoginReq loginReq, IMethodCallback<XiaohaChartTerminalAo.login_args, XiaohaChartTerminalAo.login_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_loginServiceCall(routeKey, timeout, platformArgs, loginReq), callback);
  }

  public long add_loginCall(AsyncCallRunner runner, int routeKey, int timeout, LoginReq loginReq, IMethodCallback<XiaohaChartTerminalAo.login_args, XiaohaChartTerminalAo.login_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_loginServiceCall(routeKey, timeout, platformArgs, loginReq), callback);
  }

  protected TServiceCall create_loginServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, LoginReq loginReq){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.login_args request = new XiaohaChartTerminalAo.login_args();
    request.setPlatformArgs(platformArgs);
    request.setLoginReq(loginReq);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("login");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.login_result.class);
    return serviceCall;
  }

  public void send_logout(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_logoutServiceCall(routeKey, timeout, platformArgs, landingInfo), new TRequestOption());
  }

  public void send_logout(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_logoutServiceCall(routeKey, timeout, platformArgs, landingInfo), requestOption);
  }

  public long logout(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, IMethodCallback<XiaohaChartTerminalAo.logout_args, XiaohaChartTerminalAo.logout_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_logoutServiceCall(routeKey, timeout, platformArgs, landingInfo), callback);
  }

  public long add_logoutCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, IMethodCallback<XiaohaChartTerminalAo.logout_args, XiaohaChartTerminalAo.logout_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_logoutServiceCall(routeKey, timeout, platformArgs, landingInfo), callback);
  }

  protected TServiceCall create_logoutServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.logout_args request = new XiaohaChartTerminalAo.logout_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("logout");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.logout_result.class);
    return serviceCall;
  }

  public void send_authorizeXueQiaoApp(int routeKey, int timeout, XueQiaoAppSession appSession) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_authorizeXueQiaoAppServiceCall(routeKey, timeout, platformArgs, appSession), new TRequestOption());
  }

  public void send_authorizeXueQiaoApp(int routeKey, int timeout, XueQiaoAppSession appSession,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_authorizeXueQiaoAppServiceCall(routeKey, timeout, platformArgs, appSession), requestOption);
  }

  public long authorizeXueQiaoApp(int routeKey, int timeout, XueQiaoAppSession appSession, IMethodCallback<XiaohaChartTerminalAo.authorizeXueQiaoApp_args, XiaohaChartTerminalAo.authorizeXueQiaoApp_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_authorizeXueQiaoAppServiceCall(routeKey, timeout, platformArgs, appSession), callback);
  }

  public long add_authorizeXueQiaoAppCall(AsyncCallRunner runner, int routeKey, int timeout, XueQiaoAppSession appSession, IMethodCallback<XiaohaChartTerminalAo.authorizeXueQiaoApp_args, XiaohaChartTerminalAo.authorizeXueQiaoApp_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_authorizeXueQiaoAppServiceCall(routeKey, timeout, platformArgs, appSession), callback);
  }

  protected TServiceCall create_authorizeXueQiaoAppServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XueQiaoAppSession appSession){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.authorizeXueQiaoApp_args request = new XiaohaChartTerminalAo.authorizeXueQiaoApp_args();
    request.setPlatformArgs(platformArgs);
    request.setAppSession(appSession);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("authorizeXueQiaoApp");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.authorizeXueQiaoApp_result.class);
    return serviceCall;
  }

  public void send_signUp(int routeKey, int timeout, SignUpReq signUpReq) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_signUpServiceCall(routeKey, timeout, platformArgs, signUpReq), new TRequestOption());
  }

  public void send_signUp(int routeKey, int timeout, SignUpReq signUpReq,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_signUpServiceCall(routeKey, timeout, platformArgs, signUpReq), requestOption);
  }

  public long signUp(int routeKey, int timeout, SignUpReq signUpReq, IMethodCallback<XiaohaChartTerminalAo.signUp_args, XiaohaChartTerminalAo.signUp_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_signUpServiceCall(routeKey, timeout, platformArgs, signUpReq), callback);
  }

  public long add_signUpCall(AsyncCallRunner runner, int routeKey, int timeout, SignUpReq signUpReq, IMethodCallback<XiaohaChartTerminalAo.signUp_args, XiaohaChartTerminalAo.signUp_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_signUpServiceCall(routeKey, timeout, platformArgs, signUpReq), callback);
  }

  protected TServiceCall create_signUpServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, SignUpReq signUpReq){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.signUp_args request = new XiaohaChartTerminalAo.signUp_args();
    request.setPlatformArgs(platformArgs);
    request.setSignUpReq(signUpReq);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("signUp");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.signUp_result.class);
    return serviceCall;
  }

  public void send_sendVerifyCode(int routeKey, int timeout, String tel) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_sendVerifyCodeServiceCall(routeKey, timeout, platformArgs, tel), new TRequestOption());
  }

  public void send_sendVerifyCode(int routeKey, int timeout, String tel,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_sendVerifyCodeServiceCall(routeKey, timeout, platformArgs, tel), requestOption);
  }

  public long sendVerifyCode(int routeKey, int timeout, String tel, IMethodCallback<XiaohaChartTerminalAo.sendVerifyCode_args, XiaohaChartTerminalAo.sendVerifyCode_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_sendVerifyCodeServiceCall(routeKey, timeout, platformArgs, tel), callback);
  }

  public long add_sendVerifyCodeCall(AsyncCallRunner runner, int routeKey, int timeout, String tel, IMethodCallback<XiaohaChartTerminalAo.sendVerifyCode_args, XiaohaChartTerminalAo.sendVerifyCode_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_sendVerifyCodeServiceCall(routeKey, timeout, platformArgs, tel), callback);
  }

  protected TServiceCall create_sendVerifyCodeServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, String tel){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.sendVerifyCode_args request = new XiaohaChartTerminalAo.sendVerifyCode_args();
    request.setPlatformArgs(platformArgs);
    request.setTel(tel);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("sendVerifyCode");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.sendVerifyCode_result.class);
    return serviceCall;
  }

  public void send_reqChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqChartFolderServiceCall(routeKey, timeout, platformArgs, option, pageOption), new TRequestOption());
  }

  public void send_reqChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqChartFolderServiceCall(routeKey, timeout, platformArgs, option, pageOption), requestOption);
  }

  public long reqChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartTerminalAo.reqChartFolder_args, XiaohaChartTerminalAo.reqChartFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_reqChartFolderServiceCall(routeKey, timeout, platformArgs, option, pageOption), callback);
  }

  public long add_reqChartFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartTerminalAo.reqChartFolder_args, XiaohaChartTerminalAo.reqChartFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_reqChartFolderServiceCall(routeKey, timeout, platformArgs, option, pageOption), callback);
  }

  protected TServiceCall create_reqChartFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.reqChartFolder_args request = new XiaohaChartTerminalAo.reqChartFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    request.setPageOption(pageOption);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqChartFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.reqChartFolder_result.class);
    return serviceCall;
  }

  public void send_reqChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqChartServiceCall(routeKey, timeout, platformArgs, option, pageOption), new TRequestOption());
  }

  public void send_reqChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqChartServiceCall(routeKey, timeout, platformArgs, option, pageOption), requestOption);
  }

  public long reqChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartTerminalAo.reqChart_args, XiaohaChartTerminalAo.reqChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_reqChartServiceCall(routeKey, timeout, platformArgs, option, pageOption), callback);
  }

  public long add_reqChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartTerminalAo.reqChart_args, XiaohaChartTerminalAo.reqChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_reqChartServiceCall(routeKey, timeout, platformArgs, option, pageOption), callback);
  }

  protected TServiceCall create_reqChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.reqChart_args request = new XiaohaChartTerminalAo.reqChart_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    request.setPageOption(pageOption);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.reqChart_result.class);
    return serviceCall;
  }

  public void send_addFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteFolder), new TRequestOption());
  }

  public void send_addFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteFolder), requestOption);
  }

  public long addFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder, IMethodCallback<XiaohaChartTerminalAo.addFavoriteFolder_args, XiaohaChartTerminalAo.addFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteFolder), callback);
  }

  public long add_addFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder, IMethodCallback<XiaohaChartTerminalAo.addFavoriteFolder_args, XiaohaChartTerminalAo.addFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteFolder), callback);
  }

  protected TServiceCall create_addFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.addFavoriteFolder_args request = new XiaohaChartTerminalAo.addFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFavoriteFolder(favoriteFolder);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.addFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_reqFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, option), new TRequestOption());
  }

  public void send_reqFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, option), requestOption);
  }

  public long reqFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option, IMethodCallback<XiaohaChartTerminalAo.reqFavoriteFolder_args, XiaohaChartTerminalAo.reqFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, option), callback);
  }

  public long add_reqFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option, IMethodCallback<XiaohaChartTerminalAo.reqFavoriteFolder_args, XiaohaChartTerminalAo.reqFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, option), callback);
  }

  protected TServiceCall create_reqFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.reqFavoriteFolder_args request = new XiaohaChartTerminalAo.reqFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.reqFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_removeFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId), new TRequestOption());
  }

  public void send_removeFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId), requestOption);
  }

  public long removeFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, IMethodCallback<XiaohaChartTerminalAo.removeFavoriteFolder_args, XiaohaChartTerminalAo.removeFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId), callback);
  }

  public long add_removeFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, IMethodCallback<XiaohaChartTerminalAo.removeFavoriteFolder_args, XiaohaChartTerminalAo.removeFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId), callback);
  }

  protected TServiceCall create_removeFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long folderId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.removeFavoriteFolder_args request = new XiaohaChartTerminalAo.removeFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFolderId(folderId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("removeFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.removeFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_renameFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, String newName) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_renameFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, newName), new TRequestOption());
  }

  public void send_renameFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, String newName,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_renameFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, newName), requestOption);
  }

  public long renameFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, String newName, IMethodCallback<XiaohaChartTerminalAo.renameFavoriteFolder_args, XiaohaChartTerminalAo.renameFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_renameFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, newName), callback);
  }

  public long add_renameFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, String newName, IMethodCallback<XiaohaChartTerminalAo.renameFavoriteFolder_args, XiaohaChartTerminalAo.renameFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_renameFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, newName), callback);
  }

  protected TServiceCall create_renameFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long folderId, String newName){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.renameFavoriteFolder_args request = new XiaohaChartTerminalAo.renameFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFolderId(folderId);
    request.setNewName(newName);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("renameFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.renameFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_moveFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_moveFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, parentFolderId), new TRequestOption());
  }

  public void send_moveFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_moveFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, parentFolderId), requestOption);
  }

  public long moveFavoriteFolder(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId, IMethodCallback<XiaohaChartTerminalAo.moveFavoriteFolder_args, XiaohaChartTerminalAo.moveFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_moveFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, parentFolderId), callback);
  }

  public long add_moveFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId, IMethodCallback<XiaohaChartTerminalAo.moveFavoriteFolder_args, XiaohaChartTerminalAo.moveFavoriteFolder_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_moveFavoriteFolderServiceCall(routeKey, timeout, platformArgs, landingInfo, folderId, parentFolderId), callback);
  }

  protected TServiceCall create_moveFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.moveFavoriteFolder_args request = new XiaohaChartTerminalAo.moveFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFolderId(folderId);
    request.setParentFolderId(parentFolderId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("moveFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.moveFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_addFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChart), new TRequestOption());
  }

  public void send_addFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChart), requestOption);
  }

  public long addFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart, IMethodCallback<XiaohaChartTerminalAo.addFavoriteChart_args, XiaohaChartTerminalAo.addFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChart), callback);
  }

  public long add_addFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart, IMethodCallback<XiaohaChartTerminalAo.addFavoriteChart_args, XiaohaChartTerminalAo.addFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChart), callback);
  }

  protected TServiceCall create_addFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.addFavoriteChart_args request = new XiaohaChartTerminalAo.addFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFavoriteChart(favoriteChart);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.addFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_reqFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, option), new TRequestOption());
  }

  public void send_reqFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, option), requestOption);
  }

  public long reqFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option, IMethodCallback<XiaohaChartTerminalAo.reqFavoriteChart_args, XiaohaChartTerminalAo.reqFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, option), callback);
  }

  public long add_reqFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option, IMethodCallback<XiaohaChartTerminalAo.reqFavoriteChart_args, XiaohaChartTerminalAo.reqFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, option), callback);
  }

  protected TServiceCall create_reqFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.reqFavoriteChart_args request = new XiaohaChartTerminalAo.reqFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.reqFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_removeFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId), new TRequestOption());
  }

  public void send_removeFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId), requestOption);
  }

  public long removeFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId, IMethodCallback<XiaohaChartTerminalAo.removeFavoriteChart_args, XiaohaChartTerminalAo.removeFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId), callback);
  }

  public long add_removeFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId, IMethodCallback<XiaohaChartTerminalAo.removeFavoriteChart_args, XiaohaChartTerminalAo.removeFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId), callback);
  }

  protected TServiceCall create_removeFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long favoriteChartId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.removeFavoriteChart_args request = new XiaohaChartTerminalAo.removeFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFavoriteChartId(favoriteChartId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("removeFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.removeFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_moveFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_moveFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId, parentFolderId), new TRequestOption());
  }

  public void send_moveFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_moveFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId, parentFolderId), requestOption);
  }

  public long moveFavoriteChart(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId, IMethodCallback<XiaohaChartTerminalAo.moveFavoriteChart_args, XiaohaChartTerminalAo.moveFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_moveFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId, parentFolderId), callback);
  }

  public long add_moveFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId, IMethodCallback<XiaohaChartTerminalAo.moveFavoriteChart_args, XiaohaChartTerminalAo.moveFavoriteChart_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_moveFavoriteChartServiceCall(routeKey, timeout, platformArgs, landingInfo, favoriteChartId, parentFolderId), callback);
  }

  protected TServiceCall create_moveFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.moveFavoriteChart_args request = new XiaohaChartTerminalAo.moveFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setFavoriteChartId(favoriteChartId);
    request.setParentFolderId(parentFolderId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("moveFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.moveFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_linkExistAccount(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_linkExistAccountServiceCall(routeKey, timeout, platformArgs, landingInfo, tel, verifyCode), new TRequestOption());
  }

  public void send_linkExistAccount(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_linkExistAccountServiceCall(routeKey, timeout, platformArgs, landingInfo, tel, verifyCode), requestOption);
  }

  public long linkExistAccount(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode, IMethodCallback<XiaohaChartTerminalAo.linkExistAccount_args, XiaohaChartTerminalAo.linkExistAccount_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_linkExistAccountServiceCall(routeKey, timeout, platformArgs, landingInfo, tel, verifyCode), callback);
  }

  public long add_linkExistAccountCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode, IMethodCallback<XiaohaChartTerminalAo.linkExistAccount_args, XiaohaChartTerminalAo.linkExistAccount_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_linkExistAccountServiceCall(routeKey, timeout, platformArgs, landingInfo, tel, verifyCode), callback);
  }

  protected TServiceCall create_linkExistAccountServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.linkExistAccount_args request = new XiaohaChartTerminalAo.linkExistAccount_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    request.setTel(tel);
    request.setVerifyCode(verifyCode);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("linkExistAccount");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.linkExistAccount_result.class);
    return serviceCall;
  }

  public void send_getLinkState(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo) throws TException {
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_getLinkStateServiceCall(routeKey, timeout, platformArgs, landingInfo), new TRequestOption());
  }

  public void send_getLinkState(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo,TRequestOption requestOption) throws TException { 
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    SvrContainer.getInstance().sendRequest(
        create_getLinkStateServiceCall(routeKey, timeout, platformArgs, landingInfo), requestOption);
  }

  public long getLinkState(int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, IMethodCallback<XiaohaChartTerminalAo.getLinkState_args, XiaohaChartTerminalAo.getLinkState_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":"
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return SvrContainer.getInstance().sendRequest(
            create_getLinkStateServiceCall(routeKey, timeout, platformArgs, landingInfo), callback);
  }

  public long add_getLinkStateCall(AsyncCallRunner runner, int routeKey, int timeout, XiaohaChartLandingInfo landingInfo, IMethodCallback<XiaohaChartTerminalAo.getLinkState_args, XiaohaChartTerminalAo.getLinkState_result> callback) throws TException{
    PlatformArgs platformArgs = new PlatformArgs();
    platformArgs.setTimeoutMs(timeout);
    StackTraceElement callStackElement = Thread.currentThread().getStackTrace()[2];
    platformArgs.setSourceDesc(
        callStackElement.getClassName() + "[" + callStackElement.getMethodName() + ":" 
        + callStackElement.getLineNumber() + "]");
    try {
      platformArgs.setSourceIp(InetAddress.getLocalHost().getHostAddress());
    } catch (UnknownHostException e) {
      AppLog.w(e.getMessage(), e);
    }
    return runner.addAsyncCall(
            create_getLinkStateServiceCall(routeKey, timeout, platformArgs, landingInfo), callback);
  }

  protected TServiceCall create_getLinkStateServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, XiaohaChartLandingInfo landingInfo){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartTerminalAoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartTerminalAo.getLinkState_args request = new XiaohaChartTerminalAo.getLinkState_args();
    request.setPlatformArgs(platformArgs);
    request.setLandingInfo(landingInfo);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("getLinkState");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartTerminalAo.getLinkState_result.class);
    return serviceCall;
  }

}
