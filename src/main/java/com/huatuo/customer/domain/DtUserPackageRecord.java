package com.huatuo.customer.domain;

public class DtUserPackageRecord {
    private String userPackageRecordId;

    private String packageName;

    private String description;

    private String residueDegree;

    private String startTime;

    private String endTime;

    private Integer state;

    private String userId;

    private String dtTeamId;

    private Integer packageType;

    private String teamPackageId;

    private String teamPackageDtlId;

    private String recordTime;

    public String getUserPackageRecordId() {
        return userPackageRecordId;
    }

    public void setUserPackageRecordId(String userPackageRecordId) {
        this.userPackageRecordId = userPackageRecordId == null ? null : userPackageRecordId.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getResidueDegree() {
        return residueDegree;
    }

    public void setResidueDegree(String residueDegree) {
        this.residueDegree = residueDegree == null ? null : residueDegree.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDtTeamId() {
        return dtTeamId;
    }

    public void setDtTeamId(String dtTeamId) {
        this.dtTeamId = dtTeamId == null ? null : dtTeamId.trim();
    }

    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public String getTeamPackageId() {
        return teamPackageId;
    }

    public void setTeamPackageId(String teamPackageId) {
        this.teamPackageId = teamPackageId == null ? null : teamPackageId.trim();
    }

    public String getTeamPackageDtlId() {
        return teamPackageDtlId;
    }

    public void setTeamPackageDtlId(String teamPackageDtlId) {
        this.teamPackageDtlId = teamPackageDtlId == null ? null : teamPackageDtlId.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPackageRecordId=").append(userPackageRecordId);
        sb.append(", packageName=").append(packageName);
        sb.append(", description=").append(description);
        sb.append(", residueDegree=").append(residueDegree);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", state=").append(state);
        sb.append(", userId=").append(userId);
        sb.append(", dtTeamId=").append(dtTeamId);
        sb.append(", packageType=").append(packageType);
        sb.append(", teamPackageId=").append(teamPackageId);
        sb.append(", teamPackageDtlId=").append(teamPackageDtlId);
        sb.append(", recordTime=").append(recordTime);
        sb.append("]");
        return sb.toString();
    }
}