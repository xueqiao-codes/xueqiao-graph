package xueqiao.graph.xiaoha.chart.api;

import com.antiy.error_code.ErrorCodeOuter;
import com.google.common.base.Preconditions;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.db_helper.DBTransactionHelper;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.storage.ChartTable;
import xueqiao.graph.xiaoha.chart.thriftapi.Chart;
import xueqiao.graph.xiaoha.chart.thriftapi.ChartPage;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqChartOption;

import javax.sql.DataSource;
import java.sql.Connection;

public class ChartHandler {

    public void addChart(DataSource dataSource, Chart chart) throws ErrorInfo {
        Preconditions.checkNotNull(chart);
        Preconditions.checkArgument(chart.isSetXiaohaObjId());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ChartTable table = new ChartTable(getConnection());
                Chart item = table.queryForUpdate(chart.getXiaohaObjId(), false);
                if (item != null) {
                    throw new ErrorInfo(ErrorCodeOuter.PARAM_ERROR.getErrorCode(), "Chart exists.");
                }

                table.add(chart);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }

    public void updateChart(DataSource dataSource, Chart chart) throws ErrorInfo {
        Preconditions.checkNotNull(chart);
        Preconditions.checkArgument(chart.isSetChartId());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ChartTable table = new ChartTable(getConnection());
                table.update(chart);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }

    public ChartPage queryChart(DataSource dataSource, ReqChartOption option, IndexedPageOption pageOption) throws ErrorInfo {
        return new DBQueryHelper<ChartPage>(dataSource) {
            @Override
            protected ChartPage onQuery(Connection connection) throws Exception {
                return new ChartTable(connection).query(option, pageOption);
            }
        }.query();
    }
}
