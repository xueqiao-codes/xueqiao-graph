package xueqiao.personal.user.dao.thriftapi.client;

import xueqiao.personal.user.dao.thriftapi.PersonalUserDao;
import xueqiao.personal.user.dao.thriftapi.PersonalUserDaoVariable;
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

public class PersonalUserDaoAsyncStub extends BaseStub { 
  public PersonalUserDaoAsyncStub() {
    super(PersonalUserDaoVariable.serviceKey);
  }
  public void send_addPersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws TException {
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
        create_addPersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), new TRequestOption());
  }

  public void send_addPersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry,TRequestOption requestOption) throws TException { 
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
        create_addPersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), requestOption);
  }

  public long addPersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry, IMethodCallback<PersonalUserDao.addPersonalUser_args, PersonalUserDao.addPersonalUser_result> callback) throws TException{
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
            create_addPersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), callback);
  }

  public long add_addPersonalUserCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry, IMethodCallback<PersonalUserDao.addPersonalUser_args, PersonalUserDao.addPersonalUser_result> callback) throws TException{
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
            create_addPersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), callback);
  }

  protected TServiceCall create_addPersonalUserServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.addPersonalUser_args request = new PersonalUserDao.addPersonalUser_args();
    request.setPlatformArgs(platformArgs);
    request.setPersonalUserEntry(personalUserEntry);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addPersonalUser");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.addPersonalUser_result.class);
    return serviceCall;
  }

  public void send_updatePersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws TException {
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
        create_updatePersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), new TRequestOption());
  }

  public void send_updatePersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry,TRequestOption requestOption) throws TException { 
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
        create_updatePersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), requestOption);
  }

  public long updatePersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry, IMethodCallback<PersonalUserDao.updatePersonalUser_args, PersonalUserDao.updatePersonalUser_result> callback) throws TException{
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
            create_updatePersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), callback);
  }

  public long add_updatePersonalUserCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry, IMethodCallback<PersonalUserDao.updatePersonalUser_args, PersonalUserDao.updatePersonalUser_result> callback) throws TException{
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
            create_updatePersonalUserServiceCall(routeKey, timeout, platformArgs, personalUserEntry), callback);
  }

  protected TServiceCall create_updatePersonalUserServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.updatePersonalUser_args request = new PersonalUserDao.updatePersonalUser_args();
    request.setPlatformArgs(platformArgs);
    request.setPersonalUserEntry(personalUserEntry);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updatePersonalUser");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.updatePersonalUser_result.class);
    return serviceCall;
  }

  public void send_reqPersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option) throws TException {
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
        create_reqPersonalUserServiceCall(routeKey, timeout, platformArgs, option), new TRequestOption());
  }

  public void send_reqPersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option,TRequestOption requestOption) throws TException { 
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
        create_reqPersonalUserServiceCall(routeKey, timeout, platformArgs, option), requestOption);
  }

  public long reqPersonalUser(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option, IMethodCallback<PersonalUserDao.reqPersonalUser_args, PersonalUserDao.reqPersonalUser_result> callback) throws TException{
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
            create_reqPersonalUserServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  public long add_reqPersonalUserCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option, IMethodCallback<PersonalUserDao.reqPersonalUser_args, PersonalUserDao.reqPersonalUser_result> callback) throws TException{
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
            create_reqPersonalUserServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  protected TServiceCall create_reqPersonalUserServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.reqPersonalUser_args request = new PersonalUserDao.reqPersonalUser_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqPersonalUser");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.reqPersonalUser_result.class);
    return serviceCall;
  }

  public void send_addUserRelateInfo(int routeKey, int timeout, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo) throws TException {
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
        create_addUserRelateInfoServiceCall(routeKey, timeout, platformArgs, userRelateInfo), new TRequestOption());
  }

  public void send_addUserRelateInfo(int routeKey, int timeout, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo,TRequestOption requestOption) throws TException { 
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
        create_addUserRelateInfoServiceCall(routeKey, timeout, platformArgs, userRelateInfo), requestOption);
  }

  public long addUserRelateInfo(int routeKey, int timeout, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo, IMethodCallback<PersonalUserDao.addUserRelateInfo_args, PersonalUserDao.addUserRelateInfo_result> callback) throws TException{
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
            create_addUserRelateInfoServiceCall(routeKey, timeout, platformArgs, userRelateInfo), callback);
  }

  public long add_addUserRelateInfoCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo, IMethodCallback<PersonalUserDao.addUserRelateInfo_args, PersonalUserDao.addUserRelateInfo_result> callback) throws TException{
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
            create_addUserRelateInfoServiceCall(routeKey, timeout, platformArgs, userRelateInfo), callback);
  }

  protected TServiceCall create_addUserRelateInfoServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.addUserRelateInfo_args request = new PersonalUserDao.addUserRelateInfo_args();
    request.setPlatformArgs(platformArgs);
    request.setUserRelateInfo(userRelateInfo);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addUserRelateInfo");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.addUserRelateInfo_result.class);
    return serviceCall;
  }

  public void send_reqUserRelateInfo(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option) throws TException {
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
        create_reqUserRelateInfoServiceCall(routeKey, timeout, platformArgs, option), new TRequestOption());
  }

  public void send_reqUserRelateInfo(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option,TRequestOption requestOption) throws TException { 
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
        create_reqUserRelateInfoServiceCall(routeKey, timeout, platformArgs, option), requestOption);
  }

  public long reqUserRelateInfo(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option, IMethodCallback<PersonalUserDao.reqUserRelateInfo_args, PersonalUserDao.reqUserRelateInfo_result> callback) throws TException{
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
            create_reqUserRelateInfoServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  public long add_reqUserRelateInfoCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option, IMethodCallback<PersonalUserDao.reqUserRelateInfo_args, PersonalUserDao.reqUserRelateInfo_result> callback) throws TException{
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
            create_reqUserRelateInfoServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  protected TServiceCall create_reqUserRelateInfoServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.reqUserRelateInfo_args request = new PersonalUserDao.reqUserRelateInfo_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqUserRelateInfo");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.reqUserRelateInfo_result.class);
    return serviceCall;
  }

  public void send_addFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws TException {
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
        create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), new TRequestOption());
  }

  public void send_addFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder,TRequestOption requestOption) throws TException { 
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
        create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), requestOption);
  }

  public long addFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder, IMethodCallback<PersonalUserDao.addFavoriteFolder_args, PersonalUserDao.addFavoriteFolder_result> callback) throws TException{
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
            create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), callback);
  }

  public long add_addFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder, IMethodCallback<PersonalUserDao.addFavoriteFolder_args, PersonalUserDao.addFavoriteFolder_result> callback) throws TException{
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
            create_addFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), callback);
  }

  protected TServiceCall create_addFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.addFavoriteFolder_args request = new PersonalUserDao.addFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setFavoriteFolder(favoriteFolder);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.addFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_updateFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws TException {
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
        create_updateFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), new TRequestOption());
  }

  public void send_updateFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder,TRequestOption requestOption) throws TException { 
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
        create_updateFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), requestOption);
  }

  public long updateFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder, IMethodCallback<PersonalUserDao.updateFavoriteFolder_args, PersonalUserDao.updateFavoriteFolder_result> callback) throws TException{
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
            create_updateFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), callback);
  }

  public long add_updateFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder, IMethodCallback<PersonalUserDao.updateFavoriteFolder_args, PersonalUserDao.updateFavoriteFolder_result> callback) throws TException{
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
            create_updateFavoriteFolderServiceCall(routeKey, timeout, platformArgs, favoriteFolder), callback);
  }

  protected TServiceCall create_updateFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.updateFavoriteFolder_args request = new PersonalUserDao.updateFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setFavoriteFolder(favoriteFolder);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.updateFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_reqFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws TException {
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
        create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, option), new TRequestOption());
  }

  public void send_reqFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option,TRequestOption requestOption) throws TException { 
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
        create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, option), requestOption);
  }

  public long reqFavoriteFolder(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option, IMethodCallback<PersonalUserDao.reqFavoriteFolder_args, PersonalUserDao.reqFavoriteFolder_result> callback) throws TException{
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
            create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  public long add_reqFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option, IMethodCallback<PersonalUserDao.reqFavoriteFolder_args, PersonalUserDao.reqFavoriteFolder_result> callback) throws TException{
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
            create_reqFavoriteFolderServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  protected TServiceCall create_reqFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.reqFavoriteFolder_args request = new PersonalUserDao.reqFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.reqFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_removeFavoriteFolder(int routeKey, int timeout, long folderId) throws TException {
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
        create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, folderId), new TRequestOption());
  }

  public void send_removeFavoriteFolder(int routeKey, int timeout, long folderId,TRequestOption requestOption) throws TException { 
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
        create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, folderId), requestOption);
  }

  public long removeFavoriteFolder(int routeKey, int timeout, long folderId, IMethodCallback<PersonalUserDao.removeFavoriteFolder_args, PersonalUserDao.removeFavoriteFolder_result> callback) throws TException{
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
            create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, folderId), callback);
  }

  public long add_removeFavoriteFolderCall(AsyncCallRunner runner, int routeKey, int timeout, long folderId, IMethodCallback<PersonalUserDao.removeFavoriteFolder_args, PersonalUserDao.removeFavoriteFolder_result> callback) throws TException{
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
            create_removeFavoriteFolderServiceCall(routeKey, timeout, platformArgs, folderId), callback);
  }

  protected TServiceCall create_removeFavoriteFolderServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long folderId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.removeFavoriteFolder_args request = new PersonalUserDao.removeFavoriteFolder_args();
    request.setPlatformArgs(platformArgs);
    request.setFolderId(folderId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("removeFavoriteFolder");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.removeFavoriteFolder_result.class);
    return serviceCall;
  }

  public void send_addFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws TException {
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
        create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), new TRequestOption());
  }

  public void send_addFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart,TRequestOption requestOption) throws TException { 
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
        create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), requestOption);
  }

  public long addFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart, IMethodCallback<PersonalUserDao.addFavoriteChart_args, PersonalUserDao.addFavoriteChart_result> callback) throws TException{
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
            create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), callback);
  }

  public long add_addFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart, IMethodCallback<PersonalUserDao.addFavoriteChart_args, PersonalUserDao.addFavoriteChart_result> callback) throws TException{
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
            create_addFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), callback);
  }

  protected TServiceCall create_addFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.addFavoriteChart_args request = new PersonalUserDao.addFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setFavoriteChart(favoriteChart);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("addFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.addFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_updateFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws TException {
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
        create_updateFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), new TRequestOption());
  }

  public void send_updateFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart,TRequestOption requestOption) throws TException { 
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
        create_updateFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), requestOption);
  }

  public long updateFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart, IMethodCallback<PersonalUserDao.updateFavoriteChart_args, PersonalUserDao.updateFavoriteChart_result> callback) throws TException{
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
            create_updateFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), callback);
  }

  public long add_updateFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart, IMethodCallback<PersonalUserDao.updateFavoriteChart_args, PersonalUserDao.updateFavoriteChart_result> callback) throws TException{
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
            create_updateFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChart), callback);
  }

  protected TServiceCall create_updateFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.updateFavoriteChart_args request = new PersonalUserDao.updateFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setFavoriteChart(favoriteChart);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("updateFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.updateFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_reqFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws TException {
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
        create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, option), new TRequestOption());
  }

  public void send_reqFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option,TRequestOption requestOption) throws TException { 
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
        create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, option), requestOption);
  }

  public long reqFavoriteChart(int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option, IMethodCallback<PersonalUserDao.reqFavoriteChart_args, PersonalUserDao.reqFavoriteChart_result> callback) throws TException{
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
            create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  public long add_reqFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option, IMethodCallback<PersonalUserDao.reqFavoriteChart_args, PersonalUserDao.reqFavoriteChart_result> callback) throws TException{
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
            create_reqFavoriteChartServiceCall(routeKey, timeout, platformArgs, option), callback);
  }

  protected TServiceCall create_reqFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.reqFavoriteChart_args request = new PersonalUserDao.reqFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setOption(option);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("reqFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.reqFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_removeFavoriteChart(int routeKey, int timeout, long favoriteChartId) throws TException {
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
        create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChartId), new TRequestOption());
  }

  public void send_removeFavoriteChart(int routeKey, int timeout, long favoriteChartId,TRequestOption requestOption) throws TException { 
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
        create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChartId), requestOption);
  }

  public long removeFavoriteChart(int routeKey, int timeout, long favoriteChartId, IMethodCallback<PersonalUserDao.removeFavoriteChart_args, PersonalUserDao.removeFavoriteChart_result> callback) throws TException{
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
            create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChartId), callback);
  }

  public long add_removeFavoriteChartCall(AsyncCallRunner runner, int routeKey, int timeout, long favoriteChartId, IMethodCallback<PersonalUserDao.removeFavoriteChart_args, PersonalUserDao.removeFavoriteChart_result> callback) throws TException{
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
            create_removeFavoriteChartServiceCall(routeKey, timeout, platformArgs, favoriteChartId), callback);
  }

  protected TServiceCall create_removeFavoriteChartServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long favoriteChartId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.removeFavoriteChart_args request = new PersonalUserDao.removeFavoriteChart_args();
    request.setPlatformArgs(platformArgs);
    request.setFavoriteChartId(favoriteChartId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("removeFavoriteChart");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.removeFavoriteChart_result.class);
    return serviceCall;
  }

  public void send_mergeUserRelateInfo(int routeKey, int timeout, long companyUserRelatePersonalUserId, long forMergePersonalUserId) throws TException {
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
        create_mergeUserRelateInfoServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId, forMergePersonalUserId), new TRequestOption());
  }

  public void send_mergeUserRelateInfo(int routeKey, int timeout, long companyUserRelatePersonalUserId, long forMergePersonalUserId,TRequestOption requestOption) throws TException { 
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
        create_mergeUserRelateInfoServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId, forMergePersonalUserId), requestOption);
  }

  public long mergeUserRelateInfo(int routeKey, int timeout, long companyUserRelatePersonalUserId, long forMergePersonalUserId, IMethodCallback<PersonalUserDao.mergeUserRelateInfo_args, PersonalUserDao.mergeUserRelateInfo_result> callback) throws TException{
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
            create_mergeUserRelateInfoServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId, forMergePersonalUserId), callback);
  }

  public long add_mergeUserRelateInfoCall(AsyncCallRunner runner, int routeKey, int timeout, long companyUserRelatePersonalUserId, long forMergePersonalUserId, IMethodCallback<PersonalUserDao.mergeUserRelateInfo_args, PersonalUserDao.mergeUserRelateInfo_result> callback) throws TException{
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
            create_mergeUserRelateInfoServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId, forMergePersonalUserId), callback);
  }

  protected TServiceCall create_mergeUserRelateInfoServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long companyUserRelatePersonalUserId, long forMergePersonalUserId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.mergeUserRelateInfo_args request = new PersonalUserDao.mergeUserRelateInfo_args();
    request.setPlatformArgs(platformArgs);
    request.setCompanyUserRelatePersonalUserId(companyUserRelatePersonalUserId);
    request.setForMergePersonalUserId(forMergePersonalUserId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("mergeUserRelateInfo");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.mergeUserRelateInfo_result.class);
    return serviceCall;
  }

  public void send_isUserRelate(int routeKey, int timeout, long companyUserRelatePersonalUserId) throws TException {
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
        create_isUserRelateServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId), new TRequestOption());
  }

  public void send_isUserRelate(int routeKey, int timeout, long companyUserRelatePersonalUserId,TRequestOption requestOption) throws TException { 
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
        create_isUserRelateServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId), requestOption);
  }

  public long isUserRelate(int routeKey, int timeout, long companyUserRelatePersonalUserId, IMethodCallback<PersonalUserDao.isUserRelate_args, PersonalUserDao.isUserRelate_result> callback) throws TException{
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
            create_isUserRelateServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId), callback);
  }

  public long add_isUserRelateCall(AsyncCallRunner runner, int routeKey, int timeout, long companyUserRelatePersonalUserId, IMethodCallback<PersonalUserDao.isUserRelate_args, PersonalUserDao.isUserRelate_result> callback) throws TException{
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
            create_isUserRelateServiceCall(routeKey, timeout, platformArgs, companyUserRelatePersonalUserId), callback);
  }

  protected TServiceCall create_isUserRelateServiceCall(int routeKey, int timeout, org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long companyUserRelatePersonalUserId){
    TServiceCall serviceCall = new TServiceCall();
    if (!getPeerAddr().isEmpty()) {
      serviceCall.setChooseServiceIp(getPeerAddr());
    }
    if (getPeerPort() != 0) {
      serviceCall.setChooseServicePort(getPeerPort());
    }
    serviceCall.setServiceKey(PersonalUserDaoVariable.serviceKey);
    serviceCall.setRouteKey(routeKey);
    serviceCall.setOneWay(false);
    PersonalUserDao.isUserRelate_args request = new PersonalUserDao.isUserRelate_args();
    request.setPlatformArgs(platformArgs);
    request.setCompanyUserRelatePersonalUserId(companyUserRelatePersonalUserId);
    serviceCall.setRequest(request);
    serviceCall.setMethodName("isUserRelate");
    serviceCall.setTimeout(timeout);
    serviceCall.setResponse(PersonalUserDao.isUserRelate_result.class);
    return serviceCall;
  }

}
