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
import xueqiao.personal.user.thriftapi.FavoriteFolder;
import xueqiao.personal.user.thriftapi.ReqFavoriteFolderOption;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FavoriteFolderTable extends TableHelper<FavoriteFolder> {

    private static final String TABLE_NAME = "tfavorite_folder";
    private static final String FFOLDER_ID = "Ffolder_id";
    private static final String FFOLDER_NAME = "Ffolder_name";
    private static final String FPARENT_FOLDER_ID = "Fparent_folder_id";
    private static final String FPERSONAL_USER_ID = "Fpersonal_user_id";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    public FavoriteFolderTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public FavoriteFolder fromResultSet(ResultSet resultSet) throws Exception {
        FavoriteFolder folder = new FavoriteFolder();
        folder.setFolderId(resultSet.getLong(FFOLDER_ID));
        folder.setFolderName(resultSet.getString(FFOLDER_NAME));
        folder.setParentFolderId(resultSet.getLong(FPARENT_FOLDER_ID));
        folder.setPersonalUserId(resultSet.getLong(FPERSONAL_USER_ID));
        return folder;
    }

    public long add(FavoriteFolder folder) throws SQLException, ErrorInfo {
        Preconditions.checkNotNull(folder);
        Preconditions.checkArgument(folder.isSetFolderName());
        Preconditions.checkArgument(folder.isSetParentFolderId());
        Preconditions.checkArgument(folder.isSetPersonalUserId());

        long folderId;
        try {
            folderId = ConfigurationProperty.instance().getFavoriteFolderIdMaker().createId();
        } catch (IdException e) {
            AppLog.e(e.getMessage(), e);
            throw new ErrorInfo(ErrorCodeOuter.SERVER_BUSY.getErrorCode(), "Id maker create id fail.");
        }

        PreparedFields fields = new PreparedFields();
        fields.addLong(FFOLDER_ID, folderId);
        fields.addString(FFOLDER_NAME, folder.getFolderName());
        fields.addLong(FPARENT_FOLDER_ID, folder.getParentFolderId());
        fields.addLong(FPERSONAL_USER_ID, folder.getPersonalUserId());
        long now = System.currentTimeMillis() / 1000;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
        return folderId;
    }

    public void update(FavoriteFolder folder) throws SQLException {
        Preconditions.checkNotNull(folder);
        Preconditions.checkArgument(folder.isSetFolderId());
        Preconditions.checkArgument(folder.isSetFolderName() || folder.isSetParentFolderId());

        PreparedFields fields = new PreparedFields();
        if (folder.isSetFolderName()) {
            fields.addString(FFOLDER_NAME, folder.getFolderName());
        }
        if (folder.isSetParentFolderId()) {
            fields.addLong(FPARENT_FOLDER_ID, folder.getParentFolderId());
        }
        long now = System.currentTimeMillis() / 1000;
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.update(fields, FFOLDER_ID + "=?", folder.getFolderId());
    }

    public void delete(long folderId) throws SQLException {
        super.delete(FFOLDER_ID + "=?", folderId);
    }

    public List<FavoriteFolder> query(ReqFavoriteFolderOption option) throws SQLException {
        Preconditions.checkNotNull(option);
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        if (option.isSetFolderIds() && option.getFolderIdsSize() > 0) {
            builder.addInFieldCondition(SqlQueryBuilder.ConditionType.AND, FFOLDER_ID, option.getFolderIds());
        }
        if (option.isSetParentFolderId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPARENT_FOLDER_ID + "=?", option.getParentFolderId());
        }
        if (option.isSetPersonUserId()) {
            builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPERSONAL_USER_ID + "=?", option.getPersonUserId());
        }

        return super.getItemList(builder);
    }

    public FavoriteFolder queryRootFolder(long personalUserId) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPERSONAL_USER_ID + "=?", personalUserId);
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FPARENT_FOLDER_ID + "=?", 0);
        return super.getItem(builder);
    }

    public void batModifyParent(long oldPersonalUserId, long oldParentId, long newPersonalUserId, long newParentId) throws SQLException {
        PreparedFields fields = new PreparedFields();
        fields.addLong(FPERSONAL_USER_ID, newPersonalUserId);
        fields.addLong(FPARENT_FOLDER_ID, newParentId);
        super.update(fields, FPERSONAL_USER_ID + "=? and " + FPARENT_FOLDER_ID + "=?", oldPersonalUserId, oldParentId);
    }

    public void batModifyOwner(long oldPersonalUserId, long newPersonalUserId) throws SQLException {
        PreparedFields fields = new PreparedFields();
        fields.addLong(FPERSONAL_USER_ID, newPersonalUserId);
        super.update(fields, FPERSONAL_USER_ID + "=? ", oldPersonalUserId);
    }

}
