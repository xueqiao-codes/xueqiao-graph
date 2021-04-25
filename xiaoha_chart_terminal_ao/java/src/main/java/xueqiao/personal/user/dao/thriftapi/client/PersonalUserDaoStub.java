package xueqiao.personal.user.dao.thriftapi.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.soldier.platform.svr_platform.client.BaseStub;
import org.soldier.platform.svr_platform.client.TStubOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import java.util.List;
import xueqiao.personal.user.dao.thriftapi.PersonalUserDao;
import xueqiao.personal.user.dao.thriftapi.PersonalUserDaoVariable;

public class PersonalUserDaoStub extends BaseStub {

  public PersonalUserDaoStub() {
    super(PersonalUserDaoVariable.serviceKey);
  }

  public long  addPersonalUser(xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addPersonalUser(personalUserEntry, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public long  addPersonalUser(xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addPersonalUser").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<Long>(){
    @Override
    public Long call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).addPersonalUser(platformArgs, personalUserEntry);
      }
    }, invokeInfo);
  }

  public long  addPersonalUser(int routeKey, int timeout,xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addPersonalUser(personalUserEntry, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updatePersonalUser(xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updatePersonalUser(personalUserEntry, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updatePersonalUser(xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updatePersonalUser").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).updatePersonalUser(platformArgs, personalUserEntry);
      return null;
      }
    }, invokeInfo);
  }

  public void  updatePersonalUser(int routeKey, int timeout,xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updatePersonalUser(personalUserEntry, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.PersonalUserEntry>  reqPersonalUser(xueqiao.personal.user.thriftapi.ReqPersonalUserOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqPersonalUser(option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.PersonalUserEntry>  reqPersonalUser(xueqiao.personal.user.thriftapi.ReqPersonalUserOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqPersonalUser").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.personal.user.thriftapi.PersonalUserEntry>>(){
    @Override
    public List<xueqiao.personal.user.thriftapi.PersonalUserEntry> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).reqPersonalUser(platformArgs, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.personal.user.thriftapi.PersonalUserEntry>  reqPersonalUser(int routeKey, int timeout,xueqiao.personal.user.thriftapi.ReqPersonalUserOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqPersonalUser(option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addUserRelateInfo(xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addUserRelateInfo(userRelateInfo, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  addUserRelateInfo(xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addUserRelateInfo").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).addUserRelateInfo(platformArgs, userRelateInfo);
      return null;
      }
    }, invokeInfo);
  }

  public void  addUserRelateInfo(int routeKey, int timeout,xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    addUserRelateInfo(userRelateInfo, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.UserRelateInfo>  reqUserRelateInfo(xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqUserRelateInfo(option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.UserRelateInfo>  reqUserRelateInfo(xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqUserRelateInfo").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.personal.user.thriftapi.UserRelateInfo>>(){
    @Override
    public List<xueqiao.personal.user.thriftapi.UserRelateInfo> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).reqUserRelateInfo(platformArgs, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.personal.user.thriftapi.UserRelateInfo>  reqUserRelateInfo(int routeKey, int timeout,xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqUserRelateInfo(option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public long  addFavoriteFolder(xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteFolder(favoriteFolder, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public long  addFavoriteFolder(xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<Long>(){
    @Override
    public Long call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).addFavoriteFolder(platformArgs, favoriteFolder);
      }
    }, invokeInfo);
  }

  public long  addFavoriteFolder(int routeKey, int timeout,xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteFolder(favoriteFolder, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateFavoriteFolder(xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateFavoriteFolder(favoriteFolder, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateFavoriteFolder(xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).updateFavoriteFolder(platformArgs, favoriteFolder);
      return null;
      }
    }, invokeInfo);
  }

  public void  updateFavoriteFolder(int routeKey, int timeout,xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateFavoriteFolder(favoriteFolder, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteFolder>  reqFavoriteFolder(xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteFolder(option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteFolder>  reqFavoriteFolder(xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.personal.user.thriftapi.FavoriteFolder>>(){
    @Override
    public List<xueqiao.personal.user.thriftapi.FavoriteFolder> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).reqFavoriteFolder(platformArgs, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteFolder>  reqFavoriteFolder(int routeKey, int timeout,xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteFolder(option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteFolder(long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteFolder(folderId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteFolder(long folderId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("removeFavoriteFolder").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).removeFavoriteFolder(platformArgs, folderId);
      return null;
      }
    }, invokeInfo);
  }

  public void  removeFavoriteFolder(int routeKey, int timeout,long folderId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteFolder(folderId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public long  addFavoriteChart(xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteChart(favoriteChart, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public long  addFavoriteChart(xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("addFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<Long>(){
    @Override
    public Long call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).addFavoriteChart(platformArgs, favoriteChart);
      }
    }, invokeInfo);
  }

  public long  addFavoriteChart(int routeKey, int timeout,xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return addFavoriteChart(favoriteChart, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateFavoriteChart(xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateFavoriteChart(favoriteChart, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  updateFavoriteChart(xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("updateFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).updateFavoriteChart(platformArgs, favoriteChart);
      return null;
      }
    }, invokeInfo);
  }

  public void  updateFavoriteChart(int routeKey, int timeout,xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    updateFavoriteChart(favoriteChart, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteChart>  reqFavoriteChart(xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteChart(option, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteChart>  reqFavoriteChart(xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("reqFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<List<xueqiao.personal.user.thriftapi.FavoriteChart>>(){
    @Override
    public List<xueqiao.personal.user.thriftapi.FavoriteChart> call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).reqFavoriteChart(platformArgs, option);
      }
    }, invokeInfo);
  }

  public List<xueqiao.personal.user.thriftapi.FavoriteChart>  reqFavoriteChart(int routeKey, int timeout,xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return reqFavoriteChart(option, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteChart(long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteChart(favoriteChartId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  removeFavoriteChart(long favoriteChartId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("removeFavoriteChart").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).removeFavoriteChart(platformArgs, favoriteChartId);
      return null;
      }
    }, invokeInfo);
  }

  public void  removeFavoriteChart(int routeKey, int timeout,long favoriteChartId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    removeFavoriteChart(favoriteChartId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  mergeUserRelateInfo(long companyUserRelatePersonalUserId, long forMergePersonalUserId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    mergeUserRelateInfo(companyUserRelatePersonalUserId, forMergePersonalUserId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public void  mergeUserRelateInfo(long companyUserRelatePersonalUserId, long forMergePersonalUserId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("mergeUserRelateInfo").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    super.runSync(new ThriftCallable<Void>(){
    @Override
    public Void call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      new PersonalUserDao.Client(protocol).mergeUserRelateInfo(platformArgs, companyUserRelatePersonalUserId, forMergePersonalUserId);
      return null;
      }
    }, invokeInfo);
  }

  public void  mergeUserRelateInfo(int routeKey, int timeout,long companyUserRelatePersonalUserId, long forMergePersonalUserId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    mergeUserRelateInfo(companyUserRelatePersonalUserId, forMergePersonalUserId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public boolean  isUserRelate(long companyUserRelatePersonalUserId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return isUserRelate(companyUserRelatePersonalUserId, new TStubOption().setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

  public boolean  isUserRelate(long companyUserRelatePersonalUserId,TStubOption platformStubOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException {
    InvokeMethodInfo invokeInfo = new InvokeMethodInfo("isUserRelate").setRouteKey(platformStubOption.getRouteKey()).setTimeoutMs(platformStubOption.getTimeoutMs());
    if (platformStubOption.getCallTrace() != null) { 
      invokeInfo.setSourceCallTrace(platformStubOption.getCallTrace());
    } else {
      invokeInfo.setSourceCallTrace(Thread.currentThread().getStackTrace()[2]);
    }
    return super.runSync(new ThriftCallable<Boolean>(){
    @Override
    public Boolean call(TProtocol protocol, PlatformArgs platformArgs) throws ErrorInfo, TException {
      return new PersonalUserDao.Client(protocol).isUserRelate(platformArgs, companyUserRelatePersonalUserId);
      }
    }, invokeInfo);
  }

  public boolean  isUserRelate(int routeKey, int timeout,long companyUserRelatePersonalUserId)throws org.soldier.platform.svr_platform.comm.ErrorInfo, TException{
    return isUserRelate(companyUserRelatePersonalUserId, new TStubOption().setRouteKey(routeKey).setTimeoutMs(timeout).setCallTrace(Thread.currentThread().getStackTrace()[2]));
  }

}
