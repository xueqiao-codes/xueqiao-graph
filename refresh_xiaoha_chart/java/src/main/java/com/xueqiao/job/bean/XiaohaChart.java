package com.xueqiao.job.bean;

public class XiaohaChart {

    private XiaohaId _id;
    private String thumb;
    private String ownerUid;
    private String chartName;
    private String parentFolderId;
    private long createdTime;
    private String shareKey;

    public XiaohaId get_id() {
        return _id;
    }

    public void set_id(XiaohaId _id) {
        this._id = _id;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public String getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public String getShareKey() {
        return shareKey;
    }

    public void setShareKey(String shareKey) {
        this.shareKey = shareKey;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(128);
        builder.append("{ ").append("_id").append(":").append(this._id.toString()).append(",")
                .append(" ").append("ownerUid: ").append(this.ownerUid).append(",")
                .append(" ").append("chartName: ").append(this.chartName).append(",")
                .append(" ").append("parentFolderId: ").append(this.parentFolderId).append(",")
                .append(" ").append("shareKey: ").append(this.shareKey).append(",")
                .append(" ").append("createdTime: ").append(this.createdTime).append("}");
        return builder.toString();
    }
}
