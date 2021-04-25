package xueqiao.graph.xiaoha.chart.api;

import org.apache.thrift.TException;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.client.XiaohaChartDaoStub;
import xueqiao.graph.xiaoha.chart.thriftapi.XueQiaoPlate;

import java.util.ArrayList;
import java.util.List;

public class PlateApi {

    public List<String> req() throws TException {
        List<XueQiaoPlate> items = new XiaohaChartDaoStub().reqPlate();
        List<String> plates = new ArrayList<>();
        for (XueQiaoPlate item : items) {
            plates.add(item.getCnName());
        }
        return plates;
    }
}
