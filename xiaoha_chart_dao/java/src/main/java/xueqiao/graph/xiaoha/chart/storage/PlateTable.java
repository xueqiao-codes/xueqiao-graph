package xueqiao.graph.xiaoha.chart.storage;

import com.google.common.base.Preconditions;
import org.soldier.base.sql.PreparedFields;
import org.soldier.base.sql.SqlQueryBuilder;
import org.soldier.platform.db_helper.TableHelper;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PlateTable extends TableHelper<XueQiaoPlate> {

    private static final String TABLE_NAME = "txueqiao_plate";
    private static final String FPLATE_ID = "Fplate_id";
    private static final String FCN_NAME = "Fcn_name";
    private static final String FCREATE_TIMESTAMP = "Fcreate_timestamp";
    private static final String FLAST_MODIFY_TIMESTAMP = "Flast_modify_timestamp";

    public PlateTable(Connection conn) {
        super(conn);
    }

    @Override
    protected String getTableName() throws SQLException {
        return TABLE_NAME;
    }

    @Override
    public XueQiaoPlate fromResultSet(ResultSet resultSet) throws Exception {
        XueQiaoPlate plate = new XueQiaoPlate();
        plate.setPlateId(resultSet.getLong(FPLATE_ID));
        plate.setCnName(resultSet.getString(FCN_NAME));
        plate.setCreateTimestamp(resultSet.getLong(FCREATE_TIMESTAMP));
        plate.setLastModifyTimestamp(resultSet.getLong(FLAST_MODIFY_TIMESTAMP));
        return plate;
    }

    public void add(XueQiaoPlate plate) throws SQLException {
        Preconditions.checkNotNull(plate);
        Preconditions.checkArgument(plate.isSetCnName());

        PreparedFields fields = new PreparedFields();
        fields.addString(FCN_NAME, plate.getCnName());
        long now = System.currentTimeMillis() / 1000l;
        fields.addLong(FCREATE_TIMESTAMP, now);
        fields.addLong(FLAST_MODIFY_TIMESTAMP, now);
        super.insert(fields);
    }

    public XueQiaoPlate query(String tagName) throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        builder.addFieldCondition(SqlQueryBuilder.ConditionType.AND, FCN_NAME + "=?", tagName);
        return super.getItem(builder);
    }

    public List<XueQiaoPlate> query() throws SQLException {
        SqlQueryBuilder builder = super.prepareSqlQueryBuilder();
        return super.getItemList(builder);
    }
}
