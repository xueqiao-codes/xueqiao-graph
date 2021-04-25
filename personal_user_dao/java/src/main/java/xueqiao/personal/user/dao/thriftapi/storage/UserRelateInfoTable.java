package xueqiao.personal.user.dao.thriftapi.storage;

import com.google.common.base.Preconditions;
import org.soldier.base.sql.PreparedFields;
import org.soldier.base.sql.SqlQueryBuilder;
import org.soldier.platform.db_helper.TableHelper;
import xueqiao.personal.user.thriftapi.ReqUserRelateInfoOption;
import xueqiao.personal.user.thriftapi.UserRelateInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserRelateInfoTable extends TableHelper<UserRelateInfo> {

    private static final String TABLE_NAME = "tuser_relate_info";
    private static final String FPERSONAL_USER_ID = "Fpersonal_user_id";
    private static final String FCOMPANY_ID = "Fcompany_id";
    private static final String FCOMPANY_USER_ID = "Fcompany_user_id";
    private static final String FIS_LINKED = "Fis_linked";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    public UserRelateInfoTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public UserRelateInfo fromResultSet(ResultSet resultSet) throws Exception {
        UserRelateInfo relateInfo = new UserRelateInfo();
        relateInfo.setPersonalUserId(resultSet.getLong(FPERSONAL_USER_ID));
        relateInfo.setCompanyId(resultSet.getLong(FCOMPANY_ID));
        relateInfo.setCompanyUserId(resultSet.getLong(FCOMPANY_USER_ID));
        relateInfo.setLinked(resultSet.getInt(FIS_LINKED) == 1 ? true : false);
        relateInfo.setCreateTimestamp(resultSet.getLong(FCREATE_TIMESTAMP));
        relateInfo.setLastModifyTimestamp(resultSet.getLong(FLAST_MODIFY_TIMESTAMP));
        return relateInfo;
    }

    public void add(UserRelateInfo relateInfo) throws SQLException {
        Preconditions.checkNotNull(relateInfo);
        Preconditions.checkArgument(relateInfo.isSetPersonalUserId());
        Preconditions.checkArgument(relateInfo.isSetCompanyId());
        Preconditions.checkArgument(relateInfo.isSetCompanyUserId());

        PreparedFields fields = new PreparedFields();
        fields.addLong(FPERSONAL_USER_ID, relateInfo.getPersonalUserId());
        fields.addLong(FCOMPANY_ID, relateInfo.getCompanyId());
        fields.addLong(FCOMPANY_USER_ID, relateInfo.getCompanyUserId());
        if (relateInfo.isSetLinked()) {
            if (relateInfo.isLinked()) {
                fields.addInt(FIS_LINKED, 1);
            } else {
                fields.addInt(FIS_LINKED, 0);
            }
        }
        long now = System.currentTimeMillis() / 1000;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
    }

    public void update(UserRelateInfo relateInfo) throws SQLException {
        Preconditions.checkNotNull(relateInfo);
        Preconditions.checkArgument(relateInfo.isSetCompanyId());
        Preconditions.checkArgument(relateInfo.isSetCompanyUserId());
        PreparedFields fields = new PreparedFields();
        if (relateInfo.isSetPersonalUserId()) {
            fields.addLong(FPERSONAL_USER_ID, relateInfo.getPersonalUserId());
        }
        if (relateInfo.isSetLinked()) {
            fields.addLong(FIS_LINKED, relateInfo.isLinked() ? 1 : 0);
        }

        super.update(fields, FCOMPANY_ID + "=? and " + FCOMPANY_USER_ID + "=?", relateInfo.getCompanyId(), relateInfo.getCompanyUserId());
    }

    public List<UserRelateInfo> query(ReqUserRelateInfoOption option) throws SQLException {
        Preconditions.checkNotNull(option);
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option.isSetPersonUserId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPERSONAL_USER_ID + "=?", option.getPersonUserId());
        }
        if (option.isSetCompanyId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCOMPANY_ID + "=?", option.getCompanyId());
        }
        if (option.isSetCompanyUserId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCOMPANY_USER_ID + "=?", option.getCompanyUserId());
        }

        return super.getItemList(builder);
    }

    public UserRelateInfo query(long personalUserId) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPERSONAL_USER_ID + "=?", personalUserId);
        return super.getItem(builder);
    }

    public void delete(long personalUserId) throws SQLException {
        super.delete(FPERSONAL_USER_ID + "=?", personalUserId);
    }
}
