package xueqiao.graph.xiaoha.chart.api;

import com.antiy.error_code.ErrorCodeOuter;
import com.google.common.base.Preconditions;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.db_helper.DBTransactionHelper;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.storage.ChartFolderTable;
import xueqiao.graph.xiaoha.chart.thriftapi.ChartFolder;
import xueqiao.graph.xiaoha.chart.thriftapi.ChartFolderPage;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqChartFolderOption;

import javax.sql.DataSource;
import java.sql.Connection;

public class ChartFolderHandler {

    public void addFolder(DataSource dataSource, ChartFolder chartFolder) throws ErrorInfo {
        Preconditions.checkNotNull(chartFolder);
        Preconditions.checkArgument(chartFolder.isSetXiaohaObjId());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ChartFolderTable table = new ChartFolderTable(getConnection());
                ChartFolder item = table.queryForUpdate(chartFolder.getXiaohaObjId(), false);
                if (item != null) {
                    throw new ErrorInfo(ErrorCodeOuter.PARAM_ERROR.getErrorCode(), "Chart Folder exists.");
                }

                table.add(chartFolder);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();

    }

    public void updateFolder(DataSource dataSource, ChartFolder chartFolder) throws ErrorInfo {
        Preconditions.checkNotNull(chartFolder);
        Preconditions.checkArgument(chartFolder.isSetFolderId());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ChartFolderTable table = new ChartFolderTable(getConnection());
                table.update(chartFolder);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();

    }

    public ChartFolderPage queryFolder(DataSource dataSource, ReqChartFolderOption option, IndexedPageOption pageOption) throws ErrorInfo {
        return new DBQueryHelper<ChartFolderPage>(dataSource) {
            @Override
            protected ChartFolderPage onQuery(Connection connection) throws Exception {
                return new ChartFolderTable(connection).query(option, pageOption);
            }
        }.query();
    }
}
