package xueqiao.personal.user.dao.thriftapi.server;

import java.util.Properties;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import xueqiao.personal.user.dao.thriftapi.PersonalUserDao;
import xueqiao.personal.user.dao.thriftapi.PersonalUserDaoVariable;


public abstract class PersonalUserDaoAdaptor implements PersonalUserDao.Iface{
  // unmodified map, so we do not need lock for this 
  private final Map<String, String[]> methodParameterNameMap = new HashMap<String, String[]>(); 

  public String[] getMethodParameterName(String methodName) {
    return methodParameterNameMap.get(methodName);
  }

  @Override
  public long addPersonalUser(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"addPersonalUser",platformArgs);
    return addPersonalUser(oCntl, personalUserEntry);
  }

  protected abstract long addPersonalUser(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void updatePersonalUser(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"updatePersonalUser",platformArgs);
updatePersonalUser(oCntl, personalUserEntry);
  }

  protected abstract void updatePersonalUser(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.personal.user.thriftapi.PersonalUserEntry> reqPersonalUser(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"reqPersonalUser",platformArgs);
    return reqPersonalUser(oCntl, option);
  }

  protected abstract List<xueqiao.personal.user.thriftapi.PersonalUserEntry> reqPersonalUser(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void addUserRelateInfo(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"addUserRelateInfo",platformArgs);
addUserRelateInfo(oCntl, userRelateInfo);
  }

  protected abstract void addUserRelateInfo(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.personal.user.thriftapi.UserRelateInfo> reqUserRelateInfo(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"reqUserRelateInfo",platformArgs);
    return reqUserRelateInfo(oCntl, option);
  }

  protected abstract List<xueqiao.personal.user.thriftapi.UserRelateInfo> reqUserRelateInfo(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public long addFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"addFavoriteFolder",platformArgs);
    return addFavoriteFolder(oCntl, favoriteFolder);
  }

  protected abstract long addFavoriteFolder(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void updateFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"updateFavoriteFolder",platformArgs);
updateFavoriteFolder(oCntl, favoriteFolder);
  }

  protected abstract void updateFavoriteFolder(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.personal.user.thriftapi.FavoriteFolder> reqFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"reqFavoriteFolder",platformArgs);
    return reqFavoriteFolder(oCntl, option);
  }

  protected abstract List<xueqiao.personal.user.thriftapi.FavoriteFolder> reqFavoriteFolder(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void removeFavoriteFolder(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"removeFavoriteFolder",platformArgs);
removeFavoriteFolder(oCntl, folderId);
  }

  protected abstract void removeFavoriteFolder(TServiceCntl oCntl, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public long addFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"addFavoriteChart",platformArgs);
    return addFavoriteChart(oCntl, favoriteChart);
  }

  protected abstract long addFavoriteChart(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void updateFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"updateFavoriteChart",platformArgs);
updateFavoriteChart(oCntl, favoriteChart);
  }

  protected abstract void updateFavoriteChart(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public List<xueqiao.personal.user.thriftapi.FavoriteChart> reqFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"reqFavoriteChart",platformArgs);
    return reqFavoriteChart(oCntl, option);
  }

  protected abstract List<xueqiao.personal.user.thriftapi.FavoriteChart> reqFavoriteChart(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void removeFavoriteChart(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"removeFavoriteChart",platformArgs);
removeFavoriteChart(oCntl, favoriteChartId);
  }

  protected abstract void removeFavoriteChart(TServiceCntl oCntl, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public void mergeUserRelateInfo(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long companyUserRelatePersonalUserId, long forMergePersonalUserId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"mergeUserRelateInfo",platformArgs);
mergeUserRelateInfo(oCntl, companyUserRelatePersonalUserId, forMergePersonalUserId);
  }

  protected abstract void mergeUserRelateInfo(TServiceCntl oCntl, long companyUserRelatePersonalUserId, long forMergePersonalUserId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  @Override
  public boolean isUserRelate(org.soldier.platform.svr_platform.comm.PlatformArgs platformArgs, long companyUserRelatePersonalUserId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException{
    TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey,"isUserRelate",platformArgs);
    return isUserRelate(oCntl, companyUserRelatePersonalUserId);
  }

  protected abstract boolean isUserRelate(TServiceCntl oCntl, long companyUserRelatePersonalUserId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException;

  protected PersonalUserDaoAdaptor(){
    methodParameterNameMap.put("addPersonalUser",new String[]{"platformArgs", "personalUserEntry"});
    methodParameterNameMap.put("updatePersonalUser",new String[]{"platformArgs", "personalUserEntry"});
    methodParameterNameMap.put("reqPersonalUser",new String[]{"platformArgs", "option"});
    methodParameterNameMap.put("addUserRelateInfo",new String[]{"platformArgs", "userRelateInfo"});
    methodParameterNameMap.put("reqUserRelateInfo",new String[]{"platformArgs", "option"});
    methodParameterNameMap.put("addFavoriteFolder",new String[]{"platformArgs", "favoriteFolder"});
    methodParameterNameMap.put("updateFavoriteFolder",new String[]{"platformArgs", "favoriteFolder"});
    methodParameterNameMap.put("reqFavoriteFolder",new String[]{"platformArgs", "option"});
    methodParameterNameMap.put("removeFavoriteFolder",new String[]{"platformArgs", "folderId"});
    methodParameterNameMap.put("addFavoriteChart",new String[]{"platformArgs", "favoriteChart"});
    methodParameterNameMap.put("updateFavoriteChart",new String[]{"platformArgs", "favoriteChart"});
    methodParameterNameMap.put("reqFavoriteChart",new String[]{"platformArgs", "option"});
    methodParameterNameMap.put("removeFavoriteChart",new String[]{"platformArgs", "favoriteChartId"});
    methodParameterNameMap.put("mergeUserRelateInfo",new String[]{"platformArgs", "companyUserRelatePersonalUserId", "forMergePersonalUserId"});
    methodParameterNameMap.put("isUserRelate",new String[]{"platformArgs", "companyUserRelatePersonalUserId"});
  }
  protected abstract int InitApp(final Properties props);

  protected abstract void destroy();

}
