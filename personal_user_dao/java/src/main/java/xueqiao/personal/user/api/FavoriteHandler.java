package xueqiao.personal.user.api;

import com.google.common.base.Preconditions;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.db_helper.DBTransactionHelper;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.personal.user.dao.thriftapi.storage.FavoriteChartTable;
import xueqiao.personal.user.dao.thriftapi.storage.FavoriteFolderTable;
import xueqiao.personal.user.thriftapi.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class FavoriteHandler {

    public long addFavoriteFolder(DataSource dataSource, FavoriteFolder favoriteFolder) throws ErrorInfo {
        Preconditions.checkNotNull(favoriteFolder);
        return new DBTransactionHelper<Long>(dataSource) {
            FavoriteFolderTable folderTable;
            long id;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                folderTable = new FavoriteFolderTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                if (!favoriteFolder.isSetParentFolderId()) {
                    favoriteFolder.setParentFolderId(0);
                }
                id = folderTable.add(favoriteFolder);
            }

            @Override
            public Long getResult() {
                return id;
            }
        }.execute().getResult();
    }


    public void updateFavoriteFolder(DataSource dataSource, FavoriteFolder favoriteFolder) throws ErrorInfo {
        Preconditions.checkNotNull(favoriteFolder);
        new DBTransactionHelper<Void>(dataSource) {
            FavoriteFolderTable folderTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                folderTable = new FavoriteFolderTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                folderTable.update(favoriteFolder);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }


    public List<FavoriteFolder> reqFavoriteFolder(DataSource dataSource, ReqFavoriteFolderOption option) throws ErrorInfo {
        return new DBQueryHelper<List<FavoriteFolder>>(dataSource) {
            @Override
            protected List<FavoriteFolder> onQuery(Connection connection) throws Exception {
                return new FavoriteFolderTable(connection).query(option);
            }
        }.query();
    }


    public void removeFavoriteFolder(DataSource dataSource, long folderId) throws ErrorInfo {
        new DBTransactionHelper<Void>(dataSource) {
            FavoriteFolderTable folderTable;
            FavoriteChartTable chartTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                folderTable = new FavoriteFolderTable(getConnection());
                chartTable = new FavoriteChartTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ReqFavoriteFolderOption reqFolderOption = new ReqFavoriteFolderOption();
                reqFolderOption.addToFolderIds(folderId);
                List<FavoriteFolder> targetFolders = folderTable.query(reqFolderOption);
                if (targetFolders.size() == 0) {
                    throw new ErrorInfo(PersonalUserErrorCode.FAVORITE_FOLDER_NOT_FOUND.getValue(), "favorite folder not found.");
                }
                folderTable.delete(folderId);
                deleteChildren(folderId);
            }

            private void deleteChildren(long parentId) throws SQLException {
                List<FavoriteFolder> childFolders = folderTable.query(new ReqFavoriteFolderOption().setParentFolderId(parentId));
                chartTable.deleteChildCharts(parentId);
                for (FavoriteFolder favoriteFolder : childFolders) {
                    folderTable.delete(favoriteFolder.getFolderId());
                    deleteChildren(favoriteFolder.getFolderId());
                }
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }


    public long addFavoriteChart(DataSource dataSource, FavoriteChart favoriteChart) throws ErrorInfo {
        Preconditions.checkNotNull(favoriteChart);
        return new DBTransactionHelper<Long>(dataSource) {
            FavoriteChartTable chartTable;
            long id;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                chartTable = new FavoriteChartTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ReqFavoriteChartOption option = new ReqFavoriteChartOption();
                option.setPersonUserId(favoriteChart.getPersonalUserId());
                option.setXiaohaChartId(favoriteChart.getXiaohaChartId());
                List<FavoriteChart> list = chartTable.query(option);
                if (list.size() > 0) {
                    throw new ErrorInfo(PersonalUserErrorCode.FAVORITE_CHART_EXISTS.getValue(), "Favorite chart exists.");
                }
                id = chartTable.add(favoriteChart);
            }

            @Override
            public Long getResult() {
                return id;
            }
        }.execute().getResult();
    }


    public void updateFavoriteChart(DataSource dataSource, FavoriteChart favoriteChart) throws ErrorInfo {
        Preconditions.checkNotNull(favoriteChart);
        new DBTransactionHelper<Void>(dataSource) {
            FavoriteChartTable chartTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                chartTable = new FavoriteChartTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                chartTable.update(favoriteChart);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }


    public List<FavoriteChart> reqFavoriteChart(DataSource dataSource, ReqFavoriteChartOption option) throws ErrorInfo {
        return new DBQueryHelper<List<FavoriteChart>>(dataSource) {
            @Override
            protected List<FavoriteChart> onQuery(Connection connection) throws Exception {
                return new FavoriteChartTable(connection).query(option);
            }
        }.query();
    }


    public void removeFavoriteChart(DataSource dataSource, long favoriteChartId) throws ErrorInfo {
        new DBTransactionHelper<Void>(dataSource) {
            FavoriteChartTable chartTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                chartTable = new FavoriteChartTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                chartTable.delete(favoriteChartId);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }
}
