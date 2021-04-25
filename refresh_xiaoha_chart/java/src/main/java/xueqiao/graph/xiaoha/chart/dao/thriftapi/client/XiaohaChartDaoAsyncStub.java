package xueqiao.graph.xiaoha.chart.dao.thriftapi.client;

import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDao;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDaoVariable;
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

public class XiaohaChartDaoAsyncStub extends BaseStub { 
  public XiaohaChartDaoAsyncStub() {
    super(XiaohaChartDaoVariable.serviceKey);
  }
  public void send_addChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws TException {
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
        create_addChartServiceCall(routeKey, timeout, platformArgs, chart), new TRequestOption());
  }

  public void send_addChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart,TRequestOption requestOption) throws TException { 
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
        create_addChartServiceCall(routeKey, timeout, platformArgs, chart), requestOption);
  }

  public long addChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart, IMethodCallback<XiaohaChartDao.addChart_args, XiaohaChartDao.addChart_result> callback) throws TException{
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
            create_addChartServiceCall(routeKey, timeout, platformArgs, chart), callback);
  }

  public long add_addChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart, IMethodCallback<XiaohaChartDao.addChart_args, XiaohaChartDao.addChart_result> callback) throws TException{
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
            create_addChartServiceCall(routeKey, timeout, platformArgs, chart), callback);
  }

  protected TServiceCall create_addChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.addChart_args request = new XiaohaChartDao.addChart_args();
    request.setPlatformArgs(platformArgs);
    request.setChart(chart);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.addChart_result.class);
    return serviceCall;
  }

  public void send_updateChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart) throws TException {
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
        create_updateChartServiceCall(routeKey, timeout, platformArgs, chart), new TRequestOption());
  }

  public void send_updateChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart,TRequestOption requestOption) throws TException { 
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
        create_updateChartServiceCall(routeKey, timeout, platformArgs, chart), requestOption);
  }

  public long updateChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart, IMethodCallback<XiaohaChartDao.updateChart_args, XiaohaChartDao.updateChart_result> callback) throws TException{
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
            create_updateChartServiceCall(routeKey, timeout, platformArgs, chart), callback);
  }

  public long add_updateChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart, IMethodCallback<XiaohaChartDao.updateChart_args, XiaohaChartDao.updateChart_result> callback) throws TException{
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
            create_updateChartServiceCall(routeKey, timeout, platformArgs, chart), callback);
  }

  protected TServiceCall create_updateChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.Chart chart){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.updateChart_args request = new XiaohaChartDao.updateChart_args();
    request.setPlatformArgs(platformArgs);
    request.setChart(chart);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.updateChart_result.class);
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

  public long reqChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartDao.reqChart_args, XiaohaChartDao.reqChart_result> callback) throws TException{
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

  public long add_reqChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartDao.reqChart_args, XiaohaChartDao.reqChart_result> callback) throws TException{
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
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.reqChart_args request = new XiaohaChartDao.reqChart_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    request.setPageOption(pageOption);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.reqChart_result.class);
    return serviceCall;
  }

  public void send_addChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws TException {
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
        create_addChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), new TRequestOption());
  }

  public void send_addChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder,TRequestOption requestOption) throws TException { 
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
        create_addChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), requestOption);
  }

  public long addChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder, IMethodCallback<XiaohaChartDao.addChartFolder_args, XiaohaChartDao.addChartFolder_result> callback) throws TException{
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
            create_addChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), callback);
  }

  public long add_addChartFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder, IMethodCallback<XiaohaChartDao.addChartFolder_args, XiaohaChartDao.addChartFolder_result> callback) throws TException{
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
            create_addChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), callback);
  }

  protected TServiceCall create_addChartFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.addChartFolder_args request = new XiaohaChartDao.addChartFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setChartFolder(chartFolder);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addChartFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.addChartFolder_result.class);
    return serviceCall;
  }

  public void send_updateChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder) throws TException {
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
        create_updateChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), new TRequestOption());
  }

  public void send_updateChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder,TRequestOption requestOption) throws TException { 
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
        create_updateChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), requestOption);
  }

  public long updateChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder, IMethodCallback<XiaohaChartDao.updateChartFolder_args, XiaohaChartDao.updateChartFolder_result> callback) throws TException{
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
            create_updateChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), callback);
  }

  public long add_updateChartFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder, IMethodCallback<XiaohaChartDao.updateChartFolder_args, XiaohaChartDao.updateChartFolder_result> callback) throws TException{
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
            create_updateChartFolderServiceCall(routeKey, timeout, platformArgs, chartFolder), callback);
  }

  protected TServiceCall create_updateChartFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder chartFolder){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.updateChartFolder_args request = new XiaohaChartDao.updateChartFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setChartFolder(chartFolder);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateChartFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.updateChartFolder_result.class);
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

  public long reqChartFolder(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartDao.reqChartFolder_args, XiaohaChartDao.reqChartFolder_result> callback) throws TException{
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

  public long add_reqChartFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartDao.reqChartFolder_args, XiaohaChartDao.reqChartFolder_result> callback) throws TException{
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
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.reqChartFolder_args request = new XiaohaChartDao.reqChartFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    request.setPageOption(pageOption);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqChartFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.reqChartFolder_result.class);
    return serviceCall;
  }

  public void send_addTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws TException {
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
        create_addTagServiceCall(routeKey, timeout, platformArgs, tag), new TRequestOption());
  }

  public void send_addTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag,TRequestOption requestOption) throws TException { 
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
        create_addTagServiceCall(routeKey, timeout, platformArgs, tag), requestOption);
  }

  public long addTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag, IMethodCallback<XiaohaChartDao.addTag_args, XiaohaChartDao.addTag_result> callback) throws TException{
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
            create_addTagServiceCall(routeKey, timeout, platformArgs, tag), callback);
  }

  public long add_addTagCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag, IMethodCallback<XiaohaChartDao.addTag_args, XiaohaChartDao.addTag_result> callback) throws TException{
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
            create_addTagServiceCall(routeKey, timeout, platformArgs, tag), callback);
  }

  protected TServiceCall create_addTagServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.addTag_args request = new XiaohaChartDao.addTag_args();
    request.setPlatformArgs(platformArgs);
    request.setTag(tag);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addTag");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.addTag_result.class);
    return serviceCall;
  }

  public void send_removeTag(int routeKey, int timeout, long tagId) throws TException {
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
        create_removeTagServiceCall(routeKey, timeout, platformArgs, tagId), new TRequestOption());
  }

  public void send_removeTag(int routeKey, int timeout, long tagId,TRequestOption requestOption) throws TException { 
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
        create_removeTagServiceCall(routeKey, timeout, platformArgs, tagId), requestOption);
  }

  public long removeTag(int routeKey, int timeout, long tagId, IMethodCallback<XiaohaChartDao.removeTag_args, XiaohaChartDao.removeTag_result> callback) throws TException{
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
            create_removeTagServiceCall(routeKey, timeout, platformArgs, tagId), callback);
  }

  public long add_removeTagCall(AsyncCallRunner runner, int routeKey, int timeout, long tagId, IMethodCallback<XiaohaChartDao.removeTag_args, XiaohaChartDao.removeTag_result> callback) throws TException{
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
            create_removeTagServiceCall(routeKey, timeout, platformArgs, tagId), callback);
  }

  protected TServiceCall create_removeTagServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long tagId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.removeTag_args request = new XiaohaChartDao.removeTag_args();
    request.setPlatformArgs(platformArgs);
    request.setTagId(tagId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("removeTag");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.removeTag_result.class);
    return serviceCall;
  }

  public void send_reqTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option) throws TException {
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
        create_reqTagServiceCall(routeKey, timeout, platformArgs, option), new TRequestOption());
  }

  public void send_reqTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option,TRequestOption requestOption) throws TException { 
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
        create_reqTagServiceCall(routeKey, timeout, platformArgs, option), requestOption);
  }

  public long reqTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, IMethodCallback<XiaohaChartDao.reqTag_args, XiaohaChartDao.reqTag_result> callback) throws TException{
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
            create_reqTagServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  public long add_reqTagCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, IMethodCallback<XiaohaChartDao.reqTag_args, XiaohaChartDao.reqTag_result> callback) throws TException{
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
            create_reqTagServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  protected TServiceCall create_reqTagServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.reqTag_args request = new XiaohaChartDao.reqTag_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqTag");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.reqTag_result.class);
    return serviceCall;
  }

  public void send_addPlate(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate) throws TException {
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
        create_addPlateServiceCall(routeKey, timeout, platformArgs, plate), new TRequestOption());
  }

  public void send_addPlate(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate,TRequestOption requestOption) throws TException { 
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
        create_addPlateServiceCall(routeKey, timeout, platformArgs, plate), requestOption);
  }

  public long addPlate(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate, IMethodCallback<XiaohaChartDao.addPlate_args, XiaohaChartDao.addPlate_result> callback) throws TException{
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
            create_addPlateServiceCall(routeKey, timeout, platformArgs, plate), callback);
  }

  public long add_addPlateCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate, IMethodCallback<XiaohaChartDao.addPlate_args, XiaohaChartDao.addPlate_result> callback) throws TException{
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
            create_addPlateServiceCall(routeKey, timeout, platformArgs, plate), callback);
  }

  protected TServiceCall create_addPlateServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate plate){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.addPlate_args request = new XiaohaChartDao.addPlate_args();
    request.setPlatformArgs(platformArgs);
    request.setPlate(plate);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addPlate");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.addPlate_result.class);
    return serviceCall;
  }

  public void send_reqPlate(int routeKey, int timeout) throws TException {
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
        create_reqPlateServiceCall(routeKey, timeout, platformArgs), new TRequestOption());
  }

  public void send_reqPlate(int routeKey, int timeout,TRequestOption requestOption) throws TException { 
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
        create_reqPlateServiceCall(routeKey, timeout, platformArgs), requestOption);
  }

  public long reqPlate(int routeKey, int timeout, IMethodCallback<XiaohaChartDao.reqPlate_args, XiaohaChartDao.reqPlate_result> callback) throws TException{
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
            create_reqPlateServiceCall(routeKey, timeout, platformArgs), callback);
  }

  public long add_reqPlateCall(AsyncCallRunner runner, int routeKey, int timeout, IMethodCallback<XiaohaChartDao.reqPlate_args, XiaohaChartDao.reqPlate_result> callback) throws TException{
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
            create_reqPlateServiceCall(routeKey, timeout, platformArgs), callback);
  }

  protected TServiceCall create_reqPlateServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartDao.reqPlate_args request = new XiaohaChartDao.reqPlate_args();
    request.setPlatformArgs(platformArgs);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqPlate");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartDao.reqPlate_result.class);
    return serviceCall;
  }

}
