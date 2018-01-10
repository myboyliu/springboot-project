package com.huatuo.customer.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class XtPregnantMomDetail implements Serializable{
    private Long id;

    private String pregnantMomId;

    private String createTime;

    private String recordTime;

    private String content;
    
    private String antenatalExplain;

    private String antenatalCareDate;

    private String antenatalCareOrgName;

    private String antenatalCareProjectIds;

    private Integer isLookedByDoctor;

    private Integer hasNewReply;

    private Integer isDel;
    
	/**
     * 是否为补录，1、不是，2、是
     */
    private Integer isAdditional;
    
    /**
     * 医生团队id
     */
    private String doctorTeamId;

	/**
     * 文件列表对象
     */
    private List<XtServiceFile> xtServiceFiles;
    
    /**
     * 心情回复详情
     */
    private List<XtPregnantMomDetailReply>xtPregnantMomDetailReplys = new  ArrayList<XtPregnantMomDetailReply>();
    
    /**
     * 孕期检查项目名
     */
    private List<String> projectNames = new ArrayList<String>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregnantMomId() {
        return pregnantMomId;
    }

    public void setPregnantMomId(String pregnantMomId) {
        this.pregnantMomId = pregnantMomId == null ? null : pregnantMomId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    
    public String getAntenatalExplain() {
		return antenatalExplain;
	}

	public void setAntenatalExplain(String antenatalExplain) {
		this.antenatalExplain = antenatalExplain;
	}

	public String getAntenatalCareDate() {
        return antenatalCareDate;
    }

    public void setAntenatalCareDate(String antenatalCareDate) {
        this.antenatalCareDate = antenatalCareDate == null ? null : antenatalCareDate.trim();
    }

    public String getAntenatalCareOrgName() {
        return antenatalCareOrgName;
    }

    public void setAntenatalCareOrgName(String antenatalCareOrgName) {
        this.antenatalCareOrgName = antenatalCareOrgName == null ? null : antenatalCareOrgName.trim();
    }

    public String getAntenatalCareProjectIds() {
        return antenatalCareProjectIds;
    }

    public void setAntenatalCareProjectIds(String antenatalCareProjectIds) {
        this.antenatalCareProjectIds = antenatalCareProjectIds;
    }

    public Integer getIsLookedByDoctor() {
        return isLookedByDoctor;
    }

    public void setIsLookedByDoctor(Integer isLookedByDoctor) {
        this.isLookedByDoctor = isLookedByDoctor;
    }

    public Integer getHasNewReply() {
        return hasNewReply;
    }

    public void setHasNewReply(Integer hasNewReply) {
        this.hasNewReply = hasNewReply;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public List<XtServiceFile> getXtServiceFiles() {
		return xtServiceFiles;
	}

	public void setXtServiceFiles(List<XtServiceFile> xtServiceFiles) {
		this.xtServiceFiles = xtServiceFiles;
	}

	public List<XtPregnantMomDetailReply> getXtPregnantMomDetailReplys() {
		return xtPregnantMomDetailReplys;
	}

	public void setXtPregnantMomDetailReplys(
			List<XtPregnantMomDetailReply> xtPregnantMomDetailReplys) {
		this.xtPregnantMomDetailReplys = xtPregnantMomDetailReplys;
	}

	public List<String> getProjectNames() {
		return projectNames;
	}

	public void setProjectNames(List<String> projectNames) {
		this.projectNames = projectNames;
	}

	public Integer getIsAdditional() {
		return isAdditional;
	}

	public void setIsAdditional(Integer isAdditional) {
		this.isAdditional = isAdditional;
	}
	
	public String getDoctorTeamId() {
		return doctorTeamId;
	}

	public void setDoctorTeamId(String doctorTeamId) {
		this.doctorTeamId = doctorTeamId;
	}

@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pregnantMomId=").append(pregnantMomId);
        sb.append(", createTime=").append(createTime);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", content=").append(content);
        sb.append(", antenatalExplain=").append(antenatalExplain);
        sb.append(", antenatalCareDate=").append(antenatalCareDate);
        sb.append(", antenatalCareOrgName=").append(antenatalCareOrgName);
        sb.append(", antenatalCareProjectIds=").append(antenatalCareProjectIds);
        sb.append(", isLookedByDoctor=").append(isLookedByDoctor);
        sb.append(", hasNewReply=").append(hasNewReply);
        sb.append(", isDel=").append(isDel);
        sb.append(", isAdditional=").append(isAdditional);
        sb.append(", doctorTeamId=").append(doctorTeamId);
        sb.append("]");
        return sb.toString();
    }
}