package xueqiao.graph.xiaoha.chart.api;

import com.antiy.error_code.ErrorCodeOuter;
import com.google.common.base.Preconditions;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.db_helper.DBTransactionHelper;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.storage.ChartTable;
import xueqiao.graph.xiaoha.chart.storage.TagTable;
import xueqiao.graph.xiaoha.chart.thriftapi.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

public class TagHandler {

    public void addXueQiaoTag(DataSource dataSource, XueQiaoTag tag) throws ErrorInfo {
        Preconditions.checkNotNull(tag);
        Preconditions.checkArgument(tag.isSetCnName());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                TagTable tagTable = new TagTable(getConnection());
                XueQiaoTag item = tagTable.query(tag.getCnName());
                if (item != null) {
                    throw new ErrorInfo(XiaoHaChartErrorCode.TAG_EXISTS.getValue(), "Tag exists.");
                }
                tagTable.add(tag);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();

    }

    public void updateTag(DataSource dataSource, XueQiaoTag tag) throws ErrorInfo {
        Preconditions.checkNotNull(tag);
        Preconditions.checkArgument(tag.isSetCnName());
        Preconditions.checkArgument(tag.isSetTagId());
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                TagTable tagTable = new TagTable(getConnection());
                XueQiaoTag item = tagTable.query(tag.getCnName());
                if (item != null) {
                    throw new ErrorInfo(XiaoHaChartErrorCode.TAG_EXISTS.getValue(), "Tag exists.");
                }

                item = tagTable.query(tag.getTagId(), true);
                if (item == null) {
                    throw new ErrorInfo(XiaoHaChartErrorCode.TAG_NOT_FOUND.getValue(), "Tag not found.");
                }
                tagTable.update(tag);

                ChartTable chartTable = new ChartTable(getConnection());
                List<Chart> charts = chartTable.queryForTagUpdate(item.getCnName());
                for (Chart chart : charts) {
                    chart.getTags().remove(item.getCnName());
                    chart.addToTags(tag.getCnName());
                    Chart newChart = new Chart();
                    newChart.setChartId(chart.getChartId());
                    newChart.setTags(chart.getTags());
                    chartTable.update(newChart);
                }
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }

    public void removeTag(DataSource dataSource, long tagId) throws ErrorInfo {
        new DBTransactionHelper<Void>(dataSource) {
            @Override
            public void onPrepareData() throws ErrorInfo, Exception {

            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                TagTable tagTable = new TagTable(getConnection());
                XueQiaoTag item = tagTable.query(tagId, true);
                if (item == null) {
                    throw new ErrorInfo(XiaoHaChartErrorCode.TAG_NOT_FOUND.getValue(), "Tag not found.");
                }
                tagTable.remove(tagId);
                ChartTable chartTable = new ChartTable(getConnection());
                List<Chart> charts = chartTable.queryForTagUpdate(item.getCnName());
                for (Chart chart : charts) {
                    chart.getTags().remove(item.getCnName());
                    Chart newChart = new Chart();
                    newChart.setChartId(chart.getChartId());
                    newChart.setTags(chart.getTags());
                    chartTable.update(newChart);
                }
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }

    public List<XueQiaoTag> query(DataSource dataSource, ReqTagOption option) throws ErrorInfo {

        return new DBQueryHelper<List<XueQiaoTag>>(dataSource) {
            @Override
            protected List<XueQiaoTag> onQuery(Connection connection) throws Exception {
                return new TagTable(connection).query(option, null).getPage();
            }
        }.query();
    }

    public XueQiaoTagPage query(DataSource dataSource, ReqTagOption option, IndexedPageOption pageOption) throws ErrorInfo {

        return new DBQueryHelper<XueQiaoTagPage>(dataSource) {
            @Override
            protected XueQiaoTagPage onQuery(Connection connection) throws Exception {
                return new TagTable(connection).query(option, pageOption);
            }
        }.query();
    }
}
