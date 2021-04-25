package xueqiao.graph.xiaoha.chart.webapi.thriftapi.client;

import xueqiao.graph.xiaoha.chart.webapi.thriftapi.XiaohaChartWebapi;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.XiaohaChartWebapiVariable;
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
import java.util.Set;
import xueqiao.graph.xiaoha.chart.webapi.thriftapi.OperateResult;

public class XiaohaChartWebapiAsyncStub extends BaseStub { 
  public XiaohaChartWebapiAsyncStub() {
    super(XiaohaChartWebapiVariable.serviceKey);
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

  public long reqChart(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartWebapi.reqChart_args, XiaohaChartWebapi.reqChart_result> callback) throws TException{
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

  public long add_reqChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartWebapi.reqChart_args, XiaohaChartWebapi.reqChart_result> callback) throws TException{
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
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.reqChart_args request = new XiaohaChartWebapi.reqChart_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    request.setPageOption(pageOption);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.reqChart_result.class);
    return serviceCall;
  }

  public void send_updateChartTags(int routeKey, int timeout, long chartId, Set<String> tags) throws TException {
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
        create_updateChartTagsServiceCall(routeKey, timeout, platformArgs, chartId, tags), new TRequestOption());
  }

  public void send_updateChartTags(int routeKey, int timeout, long chartId, Set<String> tags,TRequestOption requestOption) throws TException { 
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
        create_updateChartTagsServiceCall(routeKey, timeout, platformArgs, chartId, tags), requestOption);
  }

  public long updateChartTags(int routeKey, int timeout, long chartId, Set<String> tags, IMethodCallback<XiaohaChartWebapi.updateChartTags_args, XiaohaChartWebapi.updateChartTags_result> callback) throws TException{
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
            create_updateChartTagsServiceCall(routeKey, timeout, platformArgs, chartId, tags), callback);
  }

  public long add_updateChartTagsCall(AsyncCallRunner runner, int routeKey, int timeout, long chartId, Set<String> tags, IMethodCallback<XiaohaChartWebapi.updateChartTags_args, XiaohaChartWebapi.updateChartTags_result> callback) throws TException{
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
            create_updateChartTagsServiceCall(routeKey, timeout, platformArgs, chartId, tags), callback);
  }

  protected TServiceCall create_updateChartTagsServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long chartId, Set<String> tags){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.updateChartTags_args request = new XiaohaChartWebapi.updateChartTags_args();
    request.setPlatformArgs(platformArgs);
    request.setChartId(chartId);
    request.setTags(tags);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateChartTags");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.updateChartTags_result.class);
    return serviceCall;
  }

  public void send_updateChartState(int routeKey, int timeout, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state) throws TException {
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
        create_updateChartStateServiceCall(routeKey, timeout, platformArgs, chartId, state), new TRequestOption());
  }

  public void send_updateChartState(int routeKey, int timeout, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state,TRequestOption requestOption) throws TException { 
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
        create_updateChartStateServiceCall(routeKey, timeout, platformArgs, chartId, state), requestOption);
  }

  public long updateChartState(int routeKey, int timeout, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state, IMethodCallback<XiaohaChartWebapi.updateChartState_args, XiaohaChartWebapi.updateChartState_result> callback) throws TException{
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
            create_updateChartStateServiceCall(routeKey, timeout, platformArgs, chartId, state), callback);
  }

  public long add_updateChartStateCall(AsyncCallRunner runner, int routeKey, int timeout, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state, IMethodCallback<XiaohaChartWebapi.updateChartState_args, XiaohaChartWebapi.updateChartState_result> callback) throws TException{
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
            create_updateChartStateServiceCall(routeKey, timeout, platformArgs, chartId, state), callback);
  }

  protected TServiceCall create_updateChartStateServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long chartId, xueqiao.graph.xiaoha.chart.thriftapi.ChartState state){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.updateChartState_args request = new XiaohaChartWebapi.updateChartState_args();
    request.setPlatformArgs(platformArgs);
    request.setChartId(chartId);
    request.setState(state);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateChartState");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.updateChartState_result.class);
    return serviceCall;
  }

  public void send_reqTags(int routeKey, int timeout) throws TException {
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
        create_reqTagsServiceCall(routeKey, timeout, platformArgs), new TRequestOption());
  }

  public void send_reqTags(int routeKey, int timeout,TRequestOption requestOption) throws TException { 
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
        create_reqTagsServiceCall(routeKey, timeout, platformArgs), requestOption);
  }

  public long reqTags(int routeKey, int timeout, IMethodCallback<XiaohaChartWebapi.reqTags_args, XiaohaChartWebapi.reqTags_result> callback) throws TException{
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
            create_reqTagsServiceCall(routeKey, timeout, platformArgs), callback);
  }

  public long add_reqTagsCall(AsyncCallRunner runner, int routeKey, int timeout, IMethodCallback<XiaohaChartWebapi.reqTags_args, XiaohaChartWebapi.reqTags_result> callback) throws TException{
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
            create_reqTagsServiceCall(routeKey, timeout, platformArgs), callback);
  }

  protected TServiceCall create_reqTagsServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.reqTags_args request = new XiaohaChartWebapi.reqTags_args();
    request.setPlatformArgs(platformArgs);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqTags");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.reqTags_result.class);
    return serviceCall;
  }

  public void send_reqPlates(int routeKey, int timeout) throws TException {
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
        create_reqPlatesServiceCall(routeKey, timeout, platformArgs), new TRequestOption());
  }

  public void send_reqPlates(int routeKey, int timeout,TRequestOption requestOption) throws TException { 
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
        create_reqPlatesServiceCall(routeKey, timeout, platformArgs), requestOption);
  }

  public long reqPlates(int routeKey, int timeout, IMethodCallback<XiaohaChartWebapi.reqPlates_args, XiaohaChartWebapi.reqPlates_result> callback) throws TException{
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
            create_reqPlatesServiceCall(routeKey, timeout, platformArgs), callback);
  }

  public long add_reqPlatesCall(AsyncCallRunner runner, int routeKey, int timeout, IMethodCallback<XiaohaChartWebapi.reqPlates_args, XiaohaChartWebapi.reqPlates_result> callback) throws TException{
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
            create_reqPlatesServiceCall(routeKey, timeout, platformArgs), callback);
  }

  protected TServiceCall create_reqPlatesServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.reqPlates_args request = new XiaohaChartWebapi.reqPlates_args();
    request.setPlatformArgs(platformArgs);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqPlates");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.reqPlates_result.class);
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

  public long removeTag(int routeKey, int timeout, long tagId, IMethodCallback<XiaohaChartWebapi.removeTag_args, XiaohaChartWebapi.removeTag_result> callback) throws TException{
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

  public long add_removeTagCall(AsyncCallRunner runner, int routeKey, int timeout, long tagId, IMethodCallback<XiaohaChartWebapi.removeTag_args, XiaohaChartWebapi.removeTag_result> callback) throws TException{
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
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.removeTag_args request = new XiaohaChartWebapi.removeTag_args();
    request.setPlatformArgs(platformArgs);
    request.setTagId(tagId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("removeTag");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.removeTag_result.class);
    return serviceCall;
  }

  public void send_updateTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag) throws TException {
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
        create_updateTagServiceCall(routeKey, timeout, platformArgs, tag), new TRequestOption());
  }

  public void send_updateTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag,TRequestOption requestOption) throws TException { 
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
        create_updateTagServiceCall(routeKey, timeout, platformArgs, tag), requestOption);
  }

  public long updateTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag, IMethodCallback<XiaohaChartWebapi.updateTag_args, XiaohaChartWebapi.updateTag_result> callback) throws TException{
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
            create_updateTagServiceCall(routeKey, timeout, platformArgs, tag), callback);
  }

  public long add_updateTagCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag, IMethodCallback<XiaohaChartWebapi.updateTag_args, XiaohaChartWebapi.updateTag_result> callback) throws TException{
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
            create_updateTagServiceCall(routeKey, timeout, platformArgs, tag), callback);
  }

  protected TServiceCall create_updateTagServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.updateTag_args request = new XiaohaChartWebapi.updateTag_args();
    request.setPlatformArgs(platformArgs);
    request.setTag(tag);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateTag");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.updateTag_result.class);
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

  public long addTag(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag, IMethodCallback<XiaohaChartWebapi.addTag_args, XiaohaChartWebapi.addTag_result> callback) throws TException{
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

  public long add_addTagCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag tag, IMethodCallback<XiaohaChartWebapi.addTag_args, XiaohaChartWebapi.addTag_result> callback) throws TException{
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
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.addTag_args request = new XiaohaChartWebapi.addTag_args();
    request.setPlatformArgs(platformArgs);
    request.setTag(tag);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addTag");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.addTag_result.class);
    return serviceCall;
  }

  public void send_reqTagPage(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws TException {
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
        create_reqTagPageServiceCall(routeKey, timeout, platformArgs, option, pageOption), new TRequestOption());
  }

  public void send_reqTagPage(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption,TRequestOption requestOption) throws TException { 
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
        create_reqTagPageServiceCall(routeKey, timeout, platformArgs, option, pageOption), requestOption);
  }

  public long reqTagPage(int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartWebapi.reqTagPage_args, XiaohaChartWebapi.reqTagPage_result> callback) throws TException{
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
            create_reqTagPageServiceCall(routeKey, timeout, platformArgs, option, pageOption), callback);
  }

  public long add_reqTagPageCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption, IMethodCallback<XiaohaChartWebapi.reqTagPage_args, XiaohaChartWebapi.reqTagPage_result> callback) throws TException{
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
            create_reqTagPageServiceCall(routeKey, timeout, platformArgs, option, pageOption), callback);
  }

  protected TServiceCall create_reqTagPageServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption option, org.soldier.platform.page.IndexedPageOption pageOption){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(XiaohaChartWebapiVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    XiaohaChartWebapi.reqTagPage_args request = new XiaohaChartWebapi.reqTagPage_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    request.setPageOption(pageOption);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqTagPage");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(XiaohaChartWebapi.reqTagPage_result.class);
    return serviceCall;
  }

}
