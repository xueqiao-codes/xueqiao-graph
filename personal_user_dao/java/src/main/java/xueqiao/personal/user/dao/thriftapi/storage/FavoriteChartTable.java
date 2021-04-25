package xueqiao.personal.user.dao.thriftapi.storage;

import com.antiy.error_code.ErrorCodeOuter;
import com.google.common.base.Preconditions;
import org.soldier.base.logger.AppLog;
import org.soldier.base.sql.PreparedFields;
import org.soldier.base.sql.SqlQueryBuilder;
import org.soldier.platform.db_helper.TableHelper;
import org.soldier.platform.id_maker.IdException;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.personal.user.config.ConfigurationProperty;
import xueqiao.personal.user.thriftapi.FavoriteChart;
import xueqiao.personal.user.thriftapi.ReqFavoriteChartOption;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FavoriteChartTable extends TableHelper<FavoriteChart> {

    private static final String TABLE_NAME = "tfavorite_chart";
    private static final String FFAVORITE_CHART_ID = "Ffavorite_chart_id";
    private static final String FXIAOHA_CHART_ID = "Fxiaoha_chart_id";
    private static final String FPARENT_FOLDER_ID = "Fparent_folder_id";
    private static final String FPERSONAL_USER_ID = "Fpersonal_user_id";
    private static final String FNAME = "Fname";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    public FavoriteChartTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public FavoriteChart fromResultSet(ResultSet resultSet) throws Exception {
        FavoriteChart chart = new FavoriteChart();
        chart.setFavoriteChartId(resultSet.getLong(FFAVORITE_CHART_ID));
        chart.setXiaohaChartId(resultSet.getLong(FXIAOHA_CHART_ID));
        chart.setParentFolderId(resultSet.getLong(FPARENT_FOLDER_ID));
        chart.setPersonalUserId(resultSet.getLong(FPERSONAL_USER_ID));
        chart.setName(resultSet.getString(FNAME));
        return chart;
    }

    public long add(FavoriteChart favoriteChart) throws ErrorInfo, SQLException {
        Preconditions.checkNotNull(favoriteChart);
        Preconditions.checkArgument(favoriteChart.isSetParentFolderId());
        Preconditions.checkArgument(favoriteChart.isSetPersonalUserId());
        Preconditions.checkArgument(favoriteChart.isSetXiaohaChartId());
        Preconditions.checkArgument(favoriteChart.isSetName());
        long favoriteChartId;
        try {
            favoriteChartId = ConfigurationProperty.instance().getFavoriteChartIdMaker().createId();
        } catch (IdException e) {
            AppLog.e(e.getMessage(), e);
            throw new ErrorInfo(ErrorCodeOuter.SERVER_BUSY.getErrorCode(), "Id maker create id fail.");
        }
        PreparedFields fields = new PreparedFields();
        fields.addLong(FFAVORITE_CHART_ID, favoriteChartId);
        fields.addLong(FXIAOHA_CHART_ID, favoriteChart.getXiaohaChartId());
        fields.addLong(FPARENT_FOLDER_ID, favoriteChart.getParentFolderId());
        fields.addLong(FPERSONAL_USER_ID, favoriteChart.getPersonalUserId());
        fields.addString(FNAME, favoriteChart.getName());
        long now = System.currentTimeMillis() / 1000;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
        return favoriteChartId;
    }

    public void update(FavoriteChart favoriteChart) throws SQLException {
        Preconditions.checkNotNull(favoriteChart);
        Preconditions.checkArgument(favoriteChart.isSetFavoriteChartId());
        PreparedFields fields = new PreparedFields();
        if (favoriteChart.isSetParentFolderId()) {
            fields.addLong(FPARENT_FOLDER_ID, favoriteChart.getParentFolderId());
        }
        if (favoriteChart.isSetPersonalUserId()) {
            fields.addLong(FPERSONAL_USER_ID, favoriteChart.getPersonalUserId());
        }
        if (favoriteChart.isSetName()) {
            fields.addString(FNAME, favoriteChart.getName());
        }
        long now = System.currentTimeMillis() / 1000;
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.update(fields, FFAVORITE_CHART_ID + "=?", favoriteChart.getFavoriteChartId());
    }

    public List<FavoriteChart> query(ReqFavoriteChartOption option) throws SQLException {
        Preconditions.checkNotNull(option);
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option.isSetFavoriteChartIds() && option.getFavoriteChartIdsSize() > 0) {
            builder.addInFieldCondition(SqlQueryBuilder.ConditionType.AND, FFAVORITE_CHART_ID, option.getFavoriteChartIds());
        }
        if (option.isSetParentFolderId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPARENT_FOLDER_ID + "=?", option.getParentFolderId());
        }
        if (option.isSetPersonUserId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPERSONAL_USER_ID + "=?", option.getPersonUserId());
        }
        if (option.isSetXiaohaChartId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FXIAOHA_CHART_ID + "=?", option.getXiaohaChartId());
        }
        builder.setOrder(SqlQueryBuilder.OrderType.ASC, FCREATE_TIMESTAMP);
        return super.getItemList(builder);
    }

    public void delete(long favoriteChartId) throws SQLException {
        super.delete(FFAVORITE_CHART_ID + "=?", favoriteChartId);
    }

    public void deleteChildCharts(long parentFolderId) throws SQLException {
        super.delete(FPARENT_FOLDER_ID + "=?", parentFolderId);
    }

    public void batModifyOwner(long oldPersonalUserId, long newPersonalUserId) throws SQLException {
        PreparedFields fields = new PreparedFields();
        fields.addLong(FPERSONAL_USER_ID, newPersonalUserId);
        super.update(fields, FPERSONAL_USER_ID + "=? ", oldPersonalUserId);
    }
}
