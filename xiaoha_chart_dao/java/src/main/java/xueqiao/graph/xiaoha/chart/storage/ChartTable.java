package xueqiao.graph.xiaoha.chart.storage;

import com.antiy.error_code.ErrorCodeOuter;
import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.soldier.base.logger.AppLog;
import org.soldier.base.sql.PreparedFields;
import org.soldier.base.sql.SqlQueryBuilder;
import org.soldier.platform.db_helper.TableHelper;
import org.soldier.platform.id_maker.IdException;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.config.ConfigurationProperty;
import xueqiao.graph.xiaoha.chart.thriftapi.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartTable extends TableHelper<Chart> {

    private static final String TABLE_NAME = "txiaoha_chart";
    private static final String FCHART_ID = "Fchart_id";
    private static final String FXIAOHA_OBJ_ID = "Fxiaoha_obj_id";
    private static final String FCHART_NAME = "Fchart_name";
    private static final String FSHARE_KEY = "Fshare_key";
    private static final String FPARENT_FOLDER_ID = "Fparent_folder_id";
    private static final String FTAGS = "Ftags";
    private static final String FCHART_TYPE = "Fchart_type";
    private static final String FCHART_STATE = "Fchart_state";
    private static final String FCOMMODITY_NAME = "Fcommodity_name";
    private static final String FPLATE = "Fplate";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    private static final String preUrl = "http://xiaohatu.com/chart/share/";

    private Map<Long, XueQiaoPlate> plates = new HashMap<>();

    private Map<String, XueQiaoPlate> plateNames = new HashMap<>();

    public ChartTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public Chart fromResultSet(ResultSet resultSet) throws Exception {
        Chart chart = new Chart();
        chart.setChartId(resultSet.getLong(FCHART_ID));
        chart.setXiaohaObjId(resultSet.getString(FXIAOHA_OBJ_ID));
        chart.setChartName(resultSet.getString(FCHART_NAME));
        chart.setShareKey(resultSet.getString(FSHARE_KEY));
        chart.setParentFolderId(resultSet.getLong(FPARENT_FOLDER_ID));
        chart.setTags(Utils.strings2Set(resultSet.getString(FTAGS)));
        chart.setChartType(ChartType.findByValue(resultSet.getInt(FCHART_TYPE)));
        chart.setChartState(ChartState.findByValue(resultSet.getInt(FCHART_STATE)));
        chart.setCommodityName(resultSet.getString(FCOMMODITY_NAME));
        AppLog.d("plates: " + plates.size());
        XueQiaoPlate plate = plates.get(resultSet.getLong(FPLATE));
        if (plate != null) {
            chart.setPlate(plate.getCnName());
        }
        chart.setCreateTimestamp(resultSet.getLong(FCREATE_TIMESTAMP));
        chart.setLastModifyTimestamp(resultSet.getLong(FLAST_MODIFY_TIMESTAMP));
        chart.setUrl(preUrl + chart.getShareKey());
        return chart;
    }

    public void add(Chart chart) throws SQLException, ErrorInfo {
        Preconditions.checkNotNull(chart);
        Preconditions.checkArgument(chart.isSetXiaohaObjId());
        if (chart.isSetPlate()) {
            initPlates();
        }
        PreparedFields fields = getPreparedFields(chart);

        long chartId;
        try {
            chartId = ConfigurationProperty.instance().getChartIdMaker().createId();
        } catch (IdException e) {
            AppLog.e(e.getMessage(), e);
            throw new ErrorInfo(ErrorCodeOuter.SERVER_BUSY.getErrorCode(), "Chart id maker create id fail.");
        }

        fields.addLong(FCHART_ID, chartId);
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);

        super.insert(fields);
    }

    private void initPlates() throws SQLException {
        List<XueQiaoPlate> items = new PlateTable(getConnection()).query();
        AppLog.d("init plate: " + items);
        for (XueQiaoPlate plate : items) {
            plates.put(plate.getPlateId(), plate);
            plateNames.put(plate.getCnName(), plate);
        }
    }

    private PreparedFields getPreparedFields(Chart chart) {
        PreparedFields fields = new PreparedFields();
        if (chart.isSetXiaohaObjId()) {
            fields.addString(FXIAOHA_OBJ_ID, chart.getXiaohaObjId());
        }
        if (chart.isSetChartName()) {
            fields.addString(FCHART_NAME, chart.getChartName());
        }
        if (chart.isSetShareKey()) {
            fields.addString(FSHARE_KEY, chart.getShareKey());
        }
        if (chart.isSetParentFolderId()) {
            fields.addLong(FPARENT_FOLDER_ID, chart.getParentFolderId());
        }
        if (chart.isSetTags()) {
            fields.addString(FTAGS, StringUtils.join(chart.getTags(), ","));
        }
        if (chart.isSetChartType()) {
            fields.addInt(FCHART_TYPE, chart.getChartType().getValue());
        }
        if (chart.isSetChartState()) {
            fields.addInt(FCHART_STATE, chart.getChartState().getValue());
        }
        if (chart.isSetCommodityName()) {
            fields.addString(FCOMMODITY_NAME, chart.getCommodityName());
        }
        if (chart.isSetPlate()) {
            XueQiaoPlate plate = plateNames.get(chart.getPlate());
            if (plate != null) {
                fields.addLong(FPLATE, plate.getPlateId());
            }
        }
        return fields;
    }

    public void update(Chart chart) throws SQLException {
        Preconditions.checkNotNull(chart);
        Preconditions.checkArgument(chart.isSetChartId());
        if (chart.isSetPlate()) {
            initPlates();
        }
        PreparedFields fields = getPreparedFields(chart);
        fields.addLong(FCHART_ID, chart.getChartId());
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.update(fields, FCHART_ID + "=?", chart.getChartId());

    }

    public Chart queryForUpdate(String xiaohaObjId, boolean forUpdate) throws SQLException {
        initPlates();
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FXIAOHA_OBJ_ID + "=?", xiaohaObjId);
        return super.getItem(builder, forUpdate);
    }

    public List<Chart> queryForTagUpdate(String tag) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        List<String> columns = new ArrayList<>();
        List<String> values = new ArrayList<>();
        columns.add(FTAGS);
        values.add(tag);

        String str = Utils.getConditionORString(columns);
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, str, Utils.getConditionValues(values));
        return super.getItemList(builder);
    }

    public ChartPage query(ReqChartOption option, IndexedPageOption pageOption) throws SQLException {
        initPlates();
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option != null) {
            if (option.isSetChartIds() && option.getChartIdsSize() > 0) {
                builder.addInFieldCondition(SqlQueryBuilder.ConditionType.AND, FCHART_ID, option.getChartIds());
            }
            if (option.isSetXiaohaObjId()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FXIAOHA_OBJ_ID + "=?", option.getXiaohaObjId());
            }
            if (option.isSetParentFolderId()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPARENT_FOLDER_ID + "=?", option.getParentFolderId());
            }
            if (option.isSetChartType()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCHART_TYPE + "=?", option.getChartType().getValue());
            }
            if (option.isSetCommodityName()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCOMMODITY_NAME + "=?", option.getCommodityName());
            }
            if (option.isSetState()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCHART_STATE + "=?", option.getState().getValue());
            }
            if (option.isSetPlate()) {

                XueQiaoPlate item = plateNames.get(option.getPlate());
                if (item != null) {
                    builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPLATE + "=?", item.getPlateId());
                }
            }

            if (option.isSetName() || option.getKeyWordsSize() > 0) {

                String str1 = "";
                String str2 = "";
                List<String> values = new ArrayList<>();
                if (option.isSetName()) {
                    List<String> columns = new ArrayList<>();
                    String[] nameParticals = StringUtils.split(option.getName());
                    for (String namePartical : nameParticals) {
                        columns.add(FCHART_NAME);
                        values.add(namePartical);
                    }
                    str1 = Utils.getConditionString(columns, SqlQueryBuilder.ConditionType.AND);
                }
                if (option.getKeyWordsSize() > 0) {
                    List<String> columns = new ArrayList<>();
                    for (String keyWord : option.getKeyWords()) {
                        columns.add(FTAGS);
                        values.add(keyWord);
                    }
                    str2 = Utils.getConditionString(columns, SqlQueryBuilder.ConditionType.AND);
                }
                String str;
                if (!"".equals(str1) && !"".equals(str2)) {
                    str = "((" + str1 + ") OR (" + str2 + "))";
                } else if (!"".equals(str1)) {
                    str = str1;
                } else if (!"".equals(str2)) {
                    str = str2;
                } else {
                    str = null;
                }

                if (str != null) {
                    builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, str, Utils.getConditionValues(values));
                }
            }
        }
        int total = 0;
        if (pageOption != null) {
            if (pageOption.isNeedTotalCount()) {
                total = super.getTotalNum(builder);
            }
            if (pageOption.isSetPageIndex() && pageOption.isSetPageSize()) {
                builder.setPage(pageOption.getPageIndex(), pageOption.getPageSize());
            }
        }
        builder.setOrderChinese(SqlQueryBuilder.OrderType.ASC, FCHART_NAME);
        List<Chart> page = super.getItemList(builder);
        ChartPage chartPage = new ChartPage();
        chartPage.setTotal(total);
        chartPage.setPage(page);
        return chartPage;
    }
}

