package xueqiao.personal.user.dao.thriftapi.server.impl;


import java.util.List;
import java.util.Properties;

import org.apache.thrift.TException;
import org.soldier.base.logger.AppLog;
import org.soldier.platform.dal_set.DalSetProxy;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import xueqiao.personal.user.api.FavoriteHandler;
import xueqiao.personal.user.api.PersonalUserHandler;
import xueqiao.personal.user.config.ConfigurationProperty;
import xueqiao.personal.user.dao.thriftapi.server.PersonalUserDaoAdaptor;
import xueqiao.personal.user.thriftapi.ReqPersonalUserOption;
import xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption;
import xueqiao.personal.user.thriftapi.UserRelateInfo;

import javax.sql.DataSource;

public class PersonalUserDaoHandler extends PersonalUserDaoAdaptor {
    @Override
    public int InitApp(Properties props) {
        try {
            DalSetProxy.getInstance().loadFromXml();
        } catch (Exception e) {
            AppLog.e("DAL init fail.", e);
            e.printStackTrace();
            return -1;
        }
        try {
            ConfigurationProperty.instance().init(props);

        } catch (Exception e) {
            e.printStackTrace();
            AppLog.e("Config init fail.", e);
            return -1;
        }
        AppLog.e("======= SERVICE START =======");
        return 0;
    }

    @Override
    protected long addPersonalUser(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new PersonalUserHandler().addPersonalUser(getDataSource(oCntl), personalUserEntry);
    }

    @Override
    protected void updatePersonalUser(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.PersonalUserEntry personalUserEntry) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
    }

    @Override
    protected List<xueqiao.personal.user.thriftapi.PersonalUserEntry> reqPersonalUser(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqPersonalUserOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new PersonalUserHandler().reqPersonalUser(getDataSource(oCntl), option);
    }

    @Override
    protected void addUserRelateInfo(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.UserRelateInfo userRelateInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new PersonalUserHandler().addUserRelateInfo(getDataSource(oCntl), userRelateInfo);
    }

    @Override
    protected List<xueqiao.personal.user.thriftapi.UserRelateInfo> reqUserRelateInfo(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new PersonalUserHandler().reqUserRelateInfo(getDataSource(oCntl), option);
    }

    @Override
    protected long addFavoriteFolder(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteHandler().addFavoriteFolder(getDataSource(oCntl), favoriteFolder);
    }

    @Override
    protected void updateFavoriteFolder(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteHandler().updateFavoriteFolder(getDataSource(oCntl), favoriteFolder);
    }

    @Override
    protected List<xueqiao.personal.user.thriftapi.FavoriteFolder> reqFavoriteFolder(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteHandler().reqFavoriteFolder(getDataSource(oCntl), option);
    }

    @Override
    protected void removeFavoriteFolder(TServiceCntl oCntl, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteHandler().removeFavoriteFolder(getDataSource(oCntl), folderId);
    }

    @Override
    protected long addFavoriteChart(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteHandler().addFavoriteChart(getDataSource(oCntl), favoriteChart);
    }

    @Override
    protected void updateFavoriteChart(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteHandler().updateFavoriteChart(getDataSource(oCntl), favoriteChart);
    }

    @Override
    protected List<xueqiao.personal.user.thriftapi.FavoriteChart> reqFavoriteChart(TServiceCntl oCntl, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteHandler().reqFavoriteChart(getDataSource(oCntl), option);
    }

    @Override
    protected void removeFavoriteChart(TServiceCntl oCntl, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteHandler().removeFavoriteChart(getDataSource(oCntl), favoriteChartId);
    }

    @Override
    protected boolean isUserRelate(TServiceCntl oCntl, long companyUserRelatePersonalUserId) throws ErrorInfo {
        ReqUserRelateInfoOption option = new ReqUserRelateInfoOption();
        option.setPersonUserId(companyUserRelatePersonalUserId);
        PersonalUserHandler handler = new PersonalUserHandler();
        List<UserRelateInfo> items = handler.reqUserRelateInfo(getDataSource(oCntl), option);
        if (items.size() > 0) {
            UserRelateInfo relateInfo = items.get(0);
            return relateInfo.isLinked();
        }
        return false;
    }

    @Override
    protected void mergeUserRelateInfo(TServiceCntl oCntl, long companyUserRelatePersonalUserId, long forMergePersonalUserId) throws ErrorInfo {
        new PersonalUserHandler().mergeUserRelateInfo(getDataSource(oCntl), companyUserRelatePersonalUserId, forMergePersonalUserId);
    }

    @Override
    public void destroy() {
    }

    private DataSource getDataSource(TServiceCntl oCntl) {
        return ConfigurationProperty.instance().getDataSource(oCntl.getDalSetServiceName());
    }
}
