package com.xueqiao.job.bean;

public class XiaohaId {

    private String $oid;

    public String get$oid() {
        return $oid;
    }

    public void set$oid(String $oid) {
        this.$oid = $oid;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(128);
        builder.append(" {").append("$oid: ").append(this.$oid).append("}");
        return builder.toString();
    }
}
