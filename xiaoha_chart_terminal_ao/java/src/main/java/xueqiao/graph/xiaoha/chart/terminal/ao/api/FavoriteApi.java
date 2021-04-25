package xueqiao.graph.xiaoha.chart.terminal.ao.api;

import org.apache.thrift.TException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi.XiaohaChartLandingInfo;
import xueqiao.graph.xiaoha.chart.thriftapi.ChartPage;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption;
import xueqiao.graph.xiaoha.chart.thriftapi.XiaoHaChartErrorCode;
import xueqiao.personal.user.dao.thriftapi.client.PersonalUserDaoStub;
import xueqiao.personal.user.thriftapi.*;

import java.util.List;

public class FavoriteApi extends AuthorizeApi {

    private PersonalUserDaoStub stub = new PersonalUserDaoStub();

    private long personalUserId;

    public FavoriteApi(XiaohaChartLandingInfo landingInfo) throws TException {
        super(landingInfo);
        this.personalUserId = landingInfo.getPersonalUserId();
    }

    public FavoriteFolder addFavoriteFolder(FavoriteFolder favoriteFolder) throws TException {
        favoriteFolder.setPersonalUserId(this.personalUserId);
        long id = stub.addFavoriteFolder(favoriteFolder);
        ReqFavoriteFolderOption option = new ReqFavoriteFolderOption();
        option.addToFolderIds(id);
        return stub.reqFavoriteFolder(option).get(0);
    }

    public List<FavoriteFolder> reqFavoriteFolder(ReqFavoriteFolderOption option) throws TException {
        if (option == null) {
            option = new ReqFavoriteFolderOption();
        }
        option.setPersonUserId(this.personalUserId);
        return stub.reqFavoriteFolder(option);
    }

    public void removeFavoriteFolder(long folderId) throws TException {
        checkPermit(folderId);
        stub.removeFavoriteFolder(folderId);
    }

    public void renameFavoriteFolder(long folderId, String newName) throws TException {
        checkPermit(folderId);
        FavoriteFolder favoriteFolder = new FavoriteFolder();
        favoriteFolder.setFolderId(folderId);
        favoriteFolder.setFolderName(newName);
        stub.updateFavoriteFolder(favoriteFolder);
    }

    private void checkPermit(long folderId) throws TException {
        ReqFavoriteFolderOption option = new ReqFavoriteFolderOption();
        option.setPersonUserId(this.personalUserId);
        option.addToFolderIds(folderId);
        List<FavoriteFolder> list = stub.reqFavoriteFolder(option);
        if (list.size() == 0) {
            throw new ErrorInfo(PersonalUserErrorCode.FAVORITE_FOLDER_NOT_FOUND.getValue(), "Folder not found.");
        }
    }


    public void moveFavoriteFolder(long folderId, long parentFolderId) throws TException {
        checkPermit(folderId);
        checkPermit(parentFolderId);
        FavoriteFolder favoriteFolder = new FavoriteFolder();
        favoriteFolder.setFolderId(folderId);
        favoriteFolder.setParentFolderId(parentFolderId);
        stub.updateFavoriteFolder(favoriteFolder);
    }


    public FavoriteChart addFavoriteChart(FavoriteChart favoriteChart) throws TException {
        if (isFavoriteChartExists(favoriteChart.getXiaohaChartId())) {
            throw new ErrorInfo(PersonalUserErrorCode.FAVORITE_CHART_EXISTS.getValue(), "Favorite chart exists.");
        }
        checkPermit(favoriteChart.getParentFolderId());
        favoriteChart.setPersonalUserId(this.personalUserId);
        ReqChartOption option = new ReqChartOption();
        option.addToChartIds(favoriteChart.getXiaohaChartId());
        ChartPage page = new ChartFolderApi().reqChart(option, null);
        if (page.getPageSize() > 0) {
            if (!favoriteChart.isSetName()) {
                favoriteChart.setName(page.getPage().get(0).getChartName());
            }
        } else {
            throw new ErrorInfo(XiaoHaChartErrorCode.CHART_NOT_FOUND.getValue(), "Chart not found.");
        }

        long id = stub.addFavoriteChart(favoriteChart);
        ReqFavoriteChartOption newReqOption = new ReqFavoriteChartOption();
        newReqOption.addToFavoriteChartIds(id);
        return stub.reqFavoriteChart(newReqOption).get(0);
    }

    private boolean isFavoriteChartExists(long xiaohaChartId) throws TException {
        ReqFavoriteChartOption option = new ReqFavoriteChartOption();
        option.setXiaohaChartId(xiaohaChartId);
        option.setPersonUserId(this.personalUserId);
        List<FavoriteChart> items = stub.reqFavoriteChart(option);
        return items.size() > 0;
    }


    public List<FavoriteChart> reqFavoriteChart(ReqFavoriteChartOption option) throws TException {
        if (option == null) {
            option = new ReqFavoriteChartOption();
        }
        option.setPersonUserId(this.personalUserId);
        return stub.reqFavoriteChart(option);
    }


    public void removeFavoriteChart(long favoriteChartId) throws TException {
        checkFavoriteChartExists(favoriteChartId);
        stub.removeFavoriteChart(favoriteChartId);
    }

    private void checkFavoriteChartExists(long favoriteChartId) throws TException {
        ReqFavoriteChartOption option = new ReqFavoriteChartOption();
        option.addToFavoriteChartIds(favoriteChartId);
        option.setPersonUserId(this.personalUserId);
        List<FavoriteChart> items = stub.reqFavoriteChart(option);
        if (items.size() == 0) {
            throw new ErrorInfo(PersonalUserErrorCode.FAVORITE_CHART_NOT_FOUND.getValue(), "Favorite chart not found.");
        }
    }


    public void moveFavoriteChart(long favoriteChartId, long parentFolderId) throws TException {
        checkFavoriteChartExists(favoriteChartId);
        checkPermit(parentFolderId);
        FavoriteChart favoriteChart = new FavoriteChart();
        favoriteChart.setFavoriteChartId(favoriteChartId);
        favoriteChart.setParentFolderId(parentFolderId);
        stub.updateFavoriteChart(favoriteChart);
    }
}
