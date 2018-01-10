package com.huatuo.customer.domain;

public class DtUserTeam {
    private String userTeamId;

    private String userId;

    private String userName;

    private String doctorTeamId;

    private String startTime;

    private String endTime;

    private Integer delFlag;

    private String syncTime;

    public String getUserTeamId() {
        return userTeamId;
    }

    public void setUserTeamId(String userTeamId) {
        this.userTeamId = userTeamId == null ? null : userTeamId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getDoctorTeamId() {
        return doctorTeamId;
    }

    public void setDoctorTeamId(String doctorTeamId) {
        this.doctorTeamId = doctorTeamId == null ? null : doctorTeamId.trim();
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

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime == null ? null : syncTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userTeamId=").append(userTeamId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", doctorTeamId=").append(doctorTeamId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", syncTime=").append(syncTime);
        sb.append("]");
        return sb.toString();
    }
}