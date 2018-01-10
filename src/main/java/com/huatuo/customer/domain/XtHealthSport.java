package com.huatuo.customer.domain;

import java.io.Serializable;
import java.util.UUID;

public class XtHealthSport implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id = UUID.randomUUID().toString();

    /**
     * 步数量
     */
    private String steps;

    /**
     * 距离
     */
    private Double distance;

    /**
     * 用户
     */
    private String userId;

    /**
     * 记录时间
     */
    private String recordTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps == null ? null : steps.trim();
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        sb.append(", id=").append(id);
        sb.append(", steps=").append(steps);
        sb.append(", distance=").append(distance);
        sb.append(", userId=").append(userId);
        sb.append(", recordTime=").append(recordTime);
        sb.append("]");
        return sb.toString();
    }
}