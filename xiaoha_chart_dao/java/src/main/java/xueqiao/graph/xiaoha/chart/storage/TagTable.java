package xueqiao.graph.xiaoha.chart.storage;

import com.google.common.base.Preconditions;
import org.soldier.base.sql.PreparedFields;
import org.soldier.base.sql.SqlQueryBuilder;
import org.soldier.platform.db_helper.TableHelper;
import org.soldier.platform.page.IndexedPageOption;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagTable extends TableHelper<XueQiaoTag> {

    private static final String TABLE_NAME = "txueqiao_tag";
    private static final String FTAG_ID = "Ftag_id";
    private static final String FCN_NAME = "Fcn_name";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    public TagTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public XueQiaoTag fromResultSet(ResultSet resultSet) throws Exception {
        XueQiaoTag tag = new XueQiaoTag();
        tag.setTagId(resultSet.getLong(FTAG_ID));
        tag.setCnName(resultSet.getString(FCN_NAME));
        tag.setCreateTimestamp(resultSet.getLong(FCREATE_TIMESTAMP));
        tag.setLastModifyTimestamp(resultSet.getLong(FLAST_MODIFY_TIMESTAMP));
        return tag;
    }

    public void add(XueQiaoTag tag) throws SQLException {
        Preconditions.checkNotNull(tag);
        Preconditions.checkArgument(tag.isSetCnName());

        PreparedFields fields = new PreparedFields();
        fields.addString(FCN_NAME, tag.getCnName());
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
    }

    public void update(XueQiaoTag tag) throws SQLException {
        Preconditions.checkNotNull(tag);
        Preconditions.checkArgument(tag.isSetCnName());
        Preconditions.checkArgument(tag.isSetTagId());

        PreparedFields fields = new PreparedFields();
        fields.addString(FCN_NAME, tag.getCnName());
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.update(fields, FTAG_ID + "=?", tag.getTagId());
    }

    public void remove(long tagId) throws SQLException {
        super.delete(FTAG_ID + "=?", tagId);
    }

    public XueQiaoTag query(long tagId, boolean forUpdate) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FTAG_ID + "=?", tagId);
        return super.getItem(builder, forUpdate);
    }

    public XueQiaoTag query(String tagName) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCN_NAME + "=?", tagName);
        return super.getItem(builder);
    }

    public XueQiaoTagPage query(ReqTagOption option, IndexedPageOption pageOption) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option != null) {
            if (option.isSetTagId()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FTAG_ID + "=?", option.getTagId());
            }
            if (option.isSetCnName()) {
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCN_NAME + "=?", option.getCnName());
            }
            if (option.isSetNamePartical()){
                builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCN_NAME+" like ?","%"+option.getNamePartical()+"%");
            }
        }
        XueQiaoTagPage page = new XueQiaoTagPage();
        if (pageOption != null) {
            if (pageOption.isNeedTotalCount()) {
                page.setTotal(super.getTotalNum(builder));
            }
            if (pageOption.getPageIndex() >= 0 && pageOption.getPageSize() > 0) {
                builder.setPage(pageOption.getPageIndex(), pageOption.getPageSize());
            }
        }

        builder.setOrder(SqlQueryBuilder.OrderType.DESC, FLAST_MODIFY_TIMESTAMP);
        page.setPage(super.getItemList(builder));
        return page;
    }
}
