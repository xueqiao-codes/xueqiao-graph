package com.xueqiao.job;

import com.google.gson.Gson;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.*;
import com.xueqiao.job.bean.Config;
import com.xueqiao.job.bean.XiaohaChart;
import com.xueqiao.job.bean.XiaohaFolder;
import org.apache.thrift.TException;
import org.bson.Document;
import org.soldier.base.logger.AppLog;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.client.XiaohaChartDaoStub;
import xueqiao.graph.xiaoha.chart.thriftapi.*;

import java.util.*;

public class XiaohaChartSync {

    private Map<String, XiaohaFolder> folderMap = new HashMap<>();

    public boolean sync() throws TException {
        MongoCredential credential = MongoCredential.createCredential(Config.USER_NAME, Config.LOGIN_DB, Config.PASSWORD.toCharArray());
        MongoClient client = MongoClients.create(
                MongoClientSettings.builder()
                        .applyToClusterSettings(builder ->
                                builder.hosts(Arrays.asList(new ServerAddress(Config.HOST, Config.PORT))))
                        .credential(credential)
                        .build());
        MongoDatabase database = client.getDatabase(Config.DB_NAME);
        MongoCollection<Document> folders = database.getCollection(Config.CHART_FOLDER);
        MongoCollection<Document> charts = database.getCollection(Config.CHART_DATA);
        Map<String, Object> options = new HashMap<>();
        options.put("ownerUid", Config.OWNER_UID);
        options.put("folderName", Config.XUEQIAO_FOLDER);

        Document filter = new Document(options);

        FindIterable<Document> docs = folders.find(filter);
        Document xueqiaoDoc = docs.first();

        if (xueqiaoDoc != null) {
            String json = xueqiaoDoc.toJson();
            System.out.println(json);
            XiaohaFolder folder = new Gson().fromJson(json, XiaohaFolder.class);
            if (folder != null) {
                folderMap.put(folder.get_id().get$oid(), folder);
                addFolder(folder);
                String parentId = folder.get_id().get$oid();
                getFolderTree(folders, parentId, charts);
            }
        }
        client.close();
        return true;
    }

    private List<XiaohaChart> getCharts(MongoCollection<Document> charts, String parentFolderId) {
        FindIterable<Document> chartDocs = charts.find(new Document("parentFolderId", parentFolderId));
        List<XiaohaChart> xiaohaCharts = new ArrayList<>();
        for (Document doc : chartDocs) {
            String json = doc.toJson();
//            System.out.println(json);
            XiaohaChart xiaohaChart = new Gson().fromJson(json, XiaohaChart.class);
            System.out.println(xiaohaChart);
            if (null != xiaohaChart.getShareKey()) {
                xiaohaCharts.add(xiaohaChart);
            }
        }
        return xiaohaCharts;
    }

    private void getFolderTree(MongoCollection<Document> folders, String parentId, MongoCollection<Document> charts) throws TException {
        if (parentId == null) {
            return;
        }

        Map<String, Object> options = new HashMap<>();
        options.put("ownerUid", Config.OWNER_UID);
        options.put("parentId", parentId);
        Document filter = new Document(options);

        FindIterable<Document> docs = folders.find(filter);
        if (null == docs.first()) {
            List<XiaohaChart> list = getCharts(charts, parentId);
            save2Xueqiao(list);
            return;
        }
        for (Document doc : docs) {
            String json = doc.toJson();
//                System.out.println(json);
            XiaohaFolder folder = new Gson().fromJson(json, XiaohaFolder.class);
            if (folder != null) {
                System.out.println(folder);
                folderMap.put(folder.get_id().get$oid(), folder);
                addFolder(folder);
                parentId = folder.get_id().get$oid();
                getFolderTree(folders, parentId, charts);
            }
        }
    }

    private void save2Xueqiao(List<XiaohaChart> list) throws TException {
        XiaohaChartDaoStub stub = new XiaohaChartDaoStub();
        ChartFolderPage folderPage = stub.reqChartFolder(null, null);
        Map<String, ChartFolder> chartFolderMap = new HashMap<>();
        for (ChartFolder chartFolder : folderPage.getPage()) {
            chartFolderMap.put(chartFolder.getXiaohaObjId(), chartFolder);
        }

        List<XueQiaoPlate> plates = stub.reqPlate();
        List<String> plateNames = new ArrayList<>();
        for (XueQiaoPlate plate :plates){
            if (!plateNames.contains(plate.getCnName())){
                plateNames.add(plate.getCnName());
            }
        }

        for (XiaohaChart xiaohaChart : list) {
            ReqChartOption option = new ReqChartOption();
            option.setXiaohaObjId(xiaohaChart.get_id().get$oid());
            try {
                ChartPage page = stub.reqChart(option, null);
                Chart chart = new Chart();
                chart.setChartName(xiaohaChart.getChartName());
                chart.setShareKey(xiaohaChart.getShareKey());
                chart.setParentFolderId(chartFolderMap.get(xiaohaChart.getParentFolderId()).getFolderId());

                XiaohaFolder parentFolder = folderMap.get(xiaohaChart.getParentFolderId());
                chart.setCommodityName(parentFolder.getFolderName());
                System.out.println("商品： " + parentFolder.getFolderName());

                parentFolder = folderMap.get(parentFolder.getParentId());
                chart.setPlate(parentFolder.getFolderName());
                System.out.println("板块： " + parentFolder.getFolderName());

                String plateName = parentFolder.getFolderName();
                if (!plateNames.contains(plateName)){
                    XueQiaoPlate plate = new XueQiaoPlate();
                    plate.setCnName(plateName);
                    stub.addPlate(plate);
                    plateNames.add(plateName);
                }

                parentFolder = folderMap.get(parentFolder.getParentId());
                ChartType type = map2ChartType(parentFolder.getFolderName());
                if (null != type) {
                    chart.setChartType(type);
                }
                System.out.println("类型： " + parentFolder.getFolderName());

                if (page.getPageSize() > 0) {
                    chart.setChartId(page.getPage().get(0).getChartId());
                    stub.updateChart(chart);
                } else {
                    chart.setXiaohaObjId(xiaohaChart.get_id().get$oid());
                    stub.addChart(chart);
                    AppLog.w("new chart: " + chart);
                }
            } catch (TException e) {
                e.printStackTrace();
                AppLog.e(e.getMessage(), e);
            }
        }
    }

    private void addFolder(XiaohaFolder xiaohaFolder) throws TException {
        XiaohaChartDaoStub stub = new XiaohaChartDaoStub();
        ChartFolder chartFolder = new ChartFolder();
        chartFolder.setXiaohaObjId(xiaohaFolder.get_id().get$oid());
        chartFolder.setFolderName(xiaohaFolder.getFolderName());
        ReqChartFolderOption option = new ReqChartFolderOption();
        option.setXiaohaObjId(xiaohaFolder.getParentId());
        ChartFolderPage page = stub.reqChartFolder(option, null);
        if (page.getPageSize() > 0) {
            chartFolder.setParentFolderId(page.getPage().get(0).getFolderId());
        }

        option.setXiaohaObjId(xiaohaFolder.get_id().get$oid());
        page = stub.reqChartFolder(option, null);
        if (page.getPageSize() > 0) {
            chartFolder.setFolderId(page.getPage().get(0).getFolderId());
            stub.updateChartFolder(chartFolder);
        } else {
            stub.addChartFolder(chartFolder);
        }
    }

    private ChartType map2ChartType(String folderName) {

        if ("跨期".equals(folderName)) {
            return ChartType.SPREAD_MONTH;
        }
        if ("跨品种".equals(folderName)) {
            return ChartType.SPREAD_COMMODITY;
        }
        if ("远期曲线".equals(folderName)) {
            return ChartType.FORWARD_CURVE;
        }
        if ("历年期货价格".equals(folderName)) {
            return ChartType.HISTORICAL_DATA;
        }
        return null;
    }
}
