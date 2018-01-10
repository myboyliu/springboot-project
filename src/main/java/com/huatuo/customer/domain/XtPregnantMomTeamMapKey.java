package com.huatuo.customer.domain;

public class XtPregnantMomTeamMapKey {
    private String pregnantMomId;

    private String teamId;

    public String getPregnantMomId() {
        return pregnantMomId;
    }

    public void setPregnantMomId(String pregnantMomId) {
        this.pregnantMomId = pregnantMomId == null ? null : pregnantMomId.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pregnantMomId=").append(pregnantMomId);
        sb.append(", teamId=").append(teamId);
        sb.append("]");
        return sb.toString();
    }
}