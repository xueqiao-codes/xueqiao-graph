package xueqiao.graph.xiaoha.chart.api;

import org.apache.thrift.TException;
import org.soldier.platform.page.IndexedPageOption;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.client.XiaohaChartDaoStub;
import xueqiao.graph.xiaoha.chart.thriftapi.ReqTagOption;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTag;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoTagPage;

import java.util.ArrayList;
import java.util.List;

public class TagApi {

    public List<String> reqTags() throws TException {
        List<XueQiaoTag> items = new XiaohaChartDaoStub().reqTag(new ReqTagOption());
        List<String> tags = new ArrayList<>();
        for (XueQiaoTag item : items) {
            tags.add(item.getCnName());
        }
        return tags;
    }


    public void removeTag(long tagId) throws ErrorInfo, TException {
        new XiaohaChartDaoStub().removeTag(tagId);
    }


    public void updateTag(XueQiaoTag tag) throws ErrorInfo, TException {
        new XiaohaChartDaoStub().updateTag(tag);
    }


    public void addTag(XueQiaoTag tag) throws ErrorInfo, TException {
        new XiaohaChartDaoStub().addTag(tag);
    }


    public XueQiaoTagPage reqTagPage(ReqTagOption option, IndexedPageOption pageOption) throws ErrorInfo, TException {
        return new XiaohaChartDaoStub().reqTagPage(option, pageOption);
    }
}
