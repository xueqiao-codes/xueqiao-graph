package xueqiao.graph.xiaoha.chart.api;

import com.antiy.error_code.ErrorCodeOuter;
import com.google.common.base.Preconditions;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.db_helper.DBTransactionHelper;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.storage.PlateTable;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

public class PlateHandler {
    public void addXueQiaoPlate(DataSource dataSource, XueQiaoPlate tag) throws ErrorInfo {
        Preconditions.checkNotNull(tag);
        Preconditions.checkArgument(tag.isSetCnName());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                PlateTable tagTable = new PlateTable(getConnection());
                XueQiaoPlate item = tagTable.query(tag.getCnName());
                if (item != null) {
                    throw new ErrorInfo(ErrorCodeOuter.PARAM_ERROR.getErrorCode(), "Plate exists.");
                }
                tagTable.add(tag);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();

    }

    public List<XueQiaoPlate> query(DataSource dataSource) throws ErrorInfo {

        return new DBQueryHelper<List<XueQiaoPlate>>(dataSource) {
            @Override
            protected List<XueQiaoPlate> onQuery(Connection connection) throws Exception {
                return new PlateTable(connection).query();
            }
        }.query();
    }
}
