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
import xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder;
import xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChartFolderTable extends TableHelper<ChartFolder> {

    private static final String TABLE_NAME = "txiaoha_chart_folder";
    private static final String FFOLDER_ID = "Ffolder_id";
    private static final String FXIAOHA_OBJ_ID = "Fxiaoha_obj_id";
    private static final String FFOLDER_NAME = "Ffolder_name";
    private static final String FPARENT_FOLDER_ID = "Fparent_folder_id";
    private static final String FCHILD_FOLDER_IDS = "Fchild_folder_ids";
    private static final String FTAGS = "Ftags";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    public ChartFolderTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public ChartFolder fromResultSet(ResultSet resultSet) throws Exception {
        ChartFolder folder = new ChartFolder();
        folder.setFolderId(resultSet.getLong(FFOLDER_ID));
        folder.setXiaohaObjId(resultSet.getString(FXIAOHA_OBJ_ID));
        folder.setFolderName(resultSet.getString(FFOLDER_NAME));
        folder.setParentFolderId(resultSet.getLong(FPARENT_FOLDER_ID));
        folder.setTags(Utils.strings2Set(resultSet.getString(FTAGS)));
        folder.setCreateTimestamp(resultSet.getLong(FCREATE_TIMESTAMP));
        folder.setLastModifyTimestamp(resultSet.getLong(FLAST_MODIFY_TIMESTAMP));
        return folder;
    }

    public void add(ChartFolder folder) throws SQLException, ErrorInfo {
        Preconditions.checkNotNull(folder);
        Preconditions.checkArgument(folder.isSetXiaohaObjId());

        PreparedFields fields = getPreparedFields(folder);

        long folderId;
        try {
            folderId = ConfigurationProperty.instance().getChartFolderIdMaker().createId();
        } catch (IdException e) {
            AppLog.e(e.getMessage(), e);
            throw new ErrorInfo(ErrorCodeOuter.SERVER_BUSY.getErrorCode(), "Chart folder id maker create id fail.");
        }

        fields.addLong(FFOLDER_ID, folderId);
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
    }

    private PreparedFields getPreparedFields(ChartFolder folder) {
        PreparedFields fields = new PreparedFields();
        if (folder.isSetXiaohaObjId()) {
            fields.addString(FXIAOHA_OBJ_ID, folder.getXiaohaObjId());
        }
        if (folder.isSetFolderName()) {
            fields.addString(FFOLDER_NAME, folder.getFolderName());
        }
        if (folder.isSetParentFolderId()) {
            fields.addLong(FPARENT_FOLDER_ID, folder.getParentFolderId());
        }
        if (folder.isSetTags()) {
            fields.addString(FTAGS, StringUtils.join(folder.getTags(), ","));
        }
        return fields;
    }

    public void update(ChartFolder folder) throws SQLException {
        Preconditions.checkNotNull(folder);
        Preconditions.checkArgument(folder.isSetFolderId());

        PreparedFields fields = getPreparedFields(folder);
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.update(fields, FFOLDER_ID + "=?", folder.getFolderId());
    }

    public ChartFolder queryForUpdate(String xiaohaObjId, boolean forUpdate) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FXIAOHA_OBJ_ID + "=?", xiaohaObjId);
        return super.getItem(builder, forUpdate);
    }

    public ChartFolderPage query(ReqChartFolderOption option, IndexedPageOption pageOption) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option != null) {
            if (option.isSetChartFolderIds() && option.getChartFolderIdsSize() > 0) {
                builder.addInFieldCondition(SqlQueryBuilder.ConditionType.AND, FFOLDER_ID, option.getChartFolderIds());
            }
            if (option.isSetParentFolderId()) {

            }
            if (option.isSetXiaohaObjId()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FXIAOHA_OBJ_ID + "=?", option.getXiaohaObjId());
            }
            if (option.isSetName()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FFOLDER_NAME + " like ?", "%" + option.getName() + "%");

            }
            if (option.isSetKeyWords()) {
                List<String> columns = new ArrayList<>();
                List<String> values = new ArrayList<>();
                for (String keyWord : option.getKeyWords()) {
                    columns.add(FFOLDER_NAME);
                    values.add(keyWord);
                }

                String str = Utils.getConditionORString(columns);
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, str, Utils.getConditionValues(values));
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
        builder.setOrder(SqlQueryBuilder.OrderType.DESC, FCREATE_TIMESTAMP);

        ChartFolderPage page = new ChartFolderPage();
        page.setTotal(total);
        page.setPage(super.getItemList(builder));
        return page;
    }
}
