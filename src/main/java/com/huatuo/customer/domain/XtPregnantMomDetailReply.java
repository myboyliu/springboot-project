package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtPregnantMomDetailReply implements Serializable{
	
	private static final long serialVersionUID = -7824463532940262304L;

	private String id;

    private Long pregnantMomDetailId;

    private String replyId;

    private Integer replyType;

    private String replyTeamId;

    private String replyContent;

    private String createTime;

    private Integer isDel;

    /**
     * 医生名字
     */
    private String doctorName;
    
    public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getPregnantMomDetailId() {
		return pregnantMomDetailId;
	}

	public void setPregnantMomDetailId(Long pregnantMomDetailId) {
		this.pregnantMomDetailId = pregnantMomDetailId;
	}

	public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    public String getReplyTeamId() {
        return replyTeamId;
    }

    public void setReplyTeamId(String replyTeamId) {
        this.replyTeamId = replyTeamId == null ? null : replyTeamId.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pregnantMomDetailId=").append(pregnantMomDetailId);
        sb.append(", replyId=").append(replyId);
        sb.append(", replyType=").append(replyType);
        sb.append(", replyTeamId=").append(replyTeamId);
        sb.append(", replyContent=").append(replyContent);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }
}