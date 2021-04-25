package xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.server.impl;


import java.util.List;
import java.util.Properties;

import org.apache.thrift.TException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import xueqiao.graph.xiaoha.chart.terminal.ao.api.*;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.*;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.server.XiaohaChartTerminalAoAdaptor;

public class XiaohaChartTerminalAoHandler extends XiaohaChartTerminalAoAdaptor {
    @Override
    public int InitApp(Properties props) {
        return 0;
    }

    @Override
    protected XiaohaChartLandingInfo login(TServiceCntl oCntl, LoginReq loginReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new SignApi().signIn(loginReq);
    }

    @Override
    protected void logout(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new SignApi().signOut(landingInfo);
    }

    @Override
    protected XiaohaChartLandingInfo authorizeXueQiaoApp(TServiceCntl oCntl, XueQiaoAppSession appSession) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new RelateUserApi().authorizeXueQiaoApp(appSession);
    }

    @Override
    protected XiaohaChartLandingInfo signUp(TServiceCntl oCntl, SignUpReq signUpReq) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new SignApi().signUp(signUpReq);
    }

    @Override
    protected void sendVerifyCode(TServiceCntl oCntl, String tel) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new SmsApi().sendVerifyCode(tel);
    }

    @Override
    protected xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage reqChartFolder(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new ChartFolderApi().reqChartFolder(option, pageOption);
    }

    @Override
    protected xueqiao.graph.xiaoha.chart.thriftapi.ChartPage reqChart(TServiceCntl oCntl, xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption option, org.soldier.platform.page.IndexedPageOption pageOption) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new ChartFolderApi().reqChart(option, pageOption);
    }

    @Override
    protected xueqiao.personal.user.thriftapi.FavoriteFolder addFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteFolder favoriteFolder) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteApi(landingInfo).addFavoriteFolder(favoriteFolder);
    }

    @Override
    protected List<xueqiao.personal.user.thriftapi.FavoriteFolder> reqFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteApi(landingInfo).reqFavoriteFolder(option);
    }

    @Override
    protected void removeFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long folderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteApi(landingInfo).removeFavoriteFolder(folderId);
    }

    @Override
    protected void renameFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long folderId, String newName) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteApi(landingInfo).renameFavoriteFolder(folderId, newName);
    }

    @Override
    protected void moveFavoriteFolder(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long folderId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteApi(landingInfo).moveFavoriteFolder(folderId, parentFolderId);
    }

    @Override
    protected xueqiao.personal.user.thriftapi.FavoriteChart addFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.FavoriteChart favoriteChart) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteApi(landingInfo).addFavoriteChart(favoriteChart);
    }

    @Override
    protected List<xueqiao.personal.user.thriftapi.FavoriteChart> reqFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, xueqiao.personal.user.thriftapi.ReqFavoriteChartOption option) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        return new FavoriteApi(landingInfo).reqFavoriteChart(option);
    }

    @Override
    protected void removeFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long favoriteChartId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteApi(landingInfo).removeFavoriteChart(favoriteChartId);
    }

    @Override
    protected void moveFavoriteChart(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, long favoriteChartId, long parentFolderId) throws org.soldier.platform.svr_platform.comm.ErrorInfo, org.apache.thrift.TException {
        new FavoriteApi(landingInfo).moveFavoriteChart(favoriteChartId, parentFolderId);
    }

    @Override
    protected void linkExistAccount(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo, String tel, String verifyCode) throws ErrorInfo, TException {
        new LinkApi(landingInfo).link(tel, verifyCode);
    }

    @Override
    protected LinkState getLinkState(TServiceCntl oCntl, XiaohaChartLandingInfo landingInfo) throws ErrorInfo, TException {
        return new LinkApi(landingInfo).getState();
    }

    @Override
    public void destroy() {
    }
}
