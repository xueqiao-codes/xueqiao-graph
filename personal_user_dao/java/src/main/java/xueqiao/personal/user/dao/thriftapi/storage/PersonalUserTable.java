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
import xueqiao.personal.user.thriftapi.PersonalUserEntry;
import xueqiao.personal.user.thriftapi.ReqPersonalUserOption;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonalUserTable extends TableHelper<PersonalUserEntry> {

    private static final String TABLE_NAME = "tpersonal_user";
    private static final String FUSER_ID = "FuserId";
    private static final String FTEL = "Ftel";
    private static final String FPASSWORD = "Fpassword";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";


    public PersonalUserTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public PersonalUserEntry fromResultSet(ResultSet resultSet) throws Exception {
        PersonalUserEntry entry = new PersonalUserEntry();
        entry.setUserId(resultSet.getLong(FUSER_ID));
        entry.setTel(getReal(entry.getUserId(), resultSet.getString(FTEL)));
        entry.setPassword(getReal(entry.getUserId(), resultSet.getString(FPASSWORD)));
        entry.setCreateTimestamp(resultSet.getLong(FCREATE_TIMESTAMP));
        entry.setLastModifyTimestamp(resultSet.getLong(FLAST_MODIFY_TIMESTAMP));
        return entry;
    }

    private String getReal(long userId, String content) {
        String defaultStr = getDefault(userId);
        if (defaultStr.equals(content)) {
            return "";
        }
        return content;
    }

    private String getDefault(long userId) {
        return "#" + userId + "#";
    }

    public long add(PersonalUserEntry entry) throws ErrorInfo, SQLException {
        Preconditions.checkNotNull(entry);

        long userId;
        try {
            userId = ConfigurationProperty.instance().getUserIdMaker().createId();
        } catch (IdException e) {
            AppLog.e(e.getMessage(), e);
            throw new ErrorInfo(ErrorCodeOuter.SERVER_BUSY.getErrorCode(), "User id maker create id fail.");
        }
        PreparedFields fields = new PreparedFields();
        if (entry.isSetPassword()) {
            fields.addString(FPASSWORD, entry.getPassword());
        } else {
            fields.addString(FPASSWORD, getDefault(userId));
        }
        if (entry.isSetTel()) {
            fields.addString(FTEL, entry.getTel());
        } else {
            fields.addString(FTEL, getDefault(userId));
        }
        fields.addLong(FUSER_ID, userId);
        long now = System.currentTimeMillis() / 1000;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
        return userId;
    }

    public List<PersonalUserEntry> query(ReqPersonalUserOption option) throws SQLException {
        Preconditions.checkNotNull(option);
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option.isSetPersonalUserIds() && option.getPersonalUserIdsSize() > 0) {
            builder.addInFieldCondition(SqlQueryBuilder.ConditionType.AND, FUSER_ID, option.getPersonalUserIds());
        }
        if (option.isSetTel()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FTEL + "=?", option.getTel());
        }
        return super.getItemList(builder);
    }

    public void delete(long personalUserId) throws SQLException {
        super.delete(FUSER_ID + "=?", personalUserId);
    }
}
