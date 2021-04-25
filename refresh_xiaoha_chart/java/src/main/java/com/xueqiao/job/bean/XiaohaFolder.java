package com.xueqiao.job.bean;

public class XiaohaFolder {

    private XiaohaId _id;

    private String ownerUid;
    private String folderName;
    private String parentId;
    private long createdTime;

    public XiaohaId get_id() {
        return _id;
    }

    public void set_id(XiaohaId _id) {
        this._id = _id;
    }

    public String getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(128);
        builder.append("{ ").append("_id").append(":").append(this._id.toString()).append(",")
                .append(" ").append("ownerUid: ").append(this.ownerUid).append(",")
                .append(" ").append("folderName: ").append(this.folderName).append(",")
                .append(" ").append("parentId: ").append(this.parentId).append(",")
                .append(" ").append("createdTime: ").append(this.createdTime).append("}");
        return builder.toString();
    }
}
