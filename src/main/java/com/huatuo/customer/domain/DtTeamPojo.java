package com.huatuo.customer.domain;

import java.util.List;

import com.huatuo.register.base.domain.AbstractEntity;

/**
 * 医生团队信息
 * @author Administrator
 *
 */
public class DtTeamPojo extends AbstractEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 医生团队id
	 */
	private String dtTeamId;

	/**
	 * 医生团队名称
	 */
    private String teamName;

	/**
	 * 团队拥有医生数量
	 */
    private Integer ownMember;

	/**
	 * 医生团队负责人（xt_doctor）
	 */
    private String adminDoctorId;

	/**
	 * 推荐指数
	 */

    private Integer recommendedIndex;
	/**
	 * 已签约用户数
	 */
    private Integer alreadySignedNumber;

	/**
	 * 已服务人数(等于已签约人数)
	 */
    private Integer alreadyServeNumber;

	/**
	 * 医生团队描述
	 */
    private String teamDesc;

	/**
	 * 是否启用: 0.否, 1.是
	 */
    private Integer uses;

	/**
	 * 是否作废: 0.否, 1.是
	 */
    private Integer delFlg;

	/**
	 * 创建时间
	 */
    private String createTime;

	/**
	 * 更新时间
	 */
    private String syncTime;
    
    /**
	 * 所属医院
	 */
	private Integer zdOrgId;
	
	/**
	 * 所属科室
	 */
	private String dept;
	
	/**
	 * 医院名字
	 * @return
	 */
	private String orgName;
	
	/**
	 * 头像
	 */
	private String picture;
	
	/**
	 * 套餐名称
	 */
	private List<DtPackage> packages;
	
	/**
	 * 团队医生成员信息
	 */
	private List<Doctor> doctors;

    public String getDtTeamId() {
        return dtTeamId;
    }

    public void setDtTeamId(String dtTeamId) {
        this.dtTeamId = dtTeamId == null ? null : dtTeamId.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public Integer getOwnMember() {
        return ownMember;
    }

    public void setOwnMember(Integer ownMember) {
        this.ownMember = ownMember;
    }

    public String getAdminDoctorId() {
        return adminDoctorId;
    }

    public void setAdminDoctorId(String adminDoctorId) {
        this.adminDoctorId = adminDoctorId == null ? null : adminDoctorId.trim();
    }

    public Integer getRecommendedIndex() {
        return recommendedIndex;
    }

    public void setRecommendedIndex(Integer recommendedIndex) {
        this.recommendedIndex = recommendedIndex;
    }

    public Integer getAlreadySignedNumber() {
        return alreadySignedNumber;
    }

    public void setAlreadySignedNumber(Integer alreadySignedNumber) {
        this.alreadySignedNumber = alreadySignedNumber;
    }

    public Integer getAlreadyServeNumber() {
        return alreadyServeNumber;
    }

    public void setAlreadyServeNumber(Integer alreadyServeNumber) {
        this.alreadyServeNumber = alreadyServeNumber;
    }

    public String getTeamDesc() {
        return teamDesc;
    }

    public void setTeamDesc(String teamDesc) {
        this.teamDesc = teamDesc == null ? null : teamDesc.trim();
    }

    public Integer getUses() {
        return uses;
    }

    public void setUses(Integer uses) {
        this.uses = uses;
    }

    public Integer getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(String syncTime) {
		this.syncTime = syncTime;
	}

	public Integer getZdOrgId() {
		return zdOrgId;
	}

	public void setZdOrgId(Integer zdOrgId) {
		this.zdOrgId = zdOrgId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<DtPackage> getPackages() {
		return packages;
	}

	public void setPackages(List<DtPackage> packages) {
		this.packages = packages;
	}


	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "DtTeamPojo [dtTeamId=" + dtTeamId + ", teamName=" + teamName
				+ ", ownMember=" + ownMember + ", adminDoctorId="
				+ adminDoctorId + ", recommendedIndex=" + recommendedIndex
				+ ", alreadySignedNumber=" + alreadySignedNumber
				+ ", alreadyServeNumber=" + alreadyServeNumber + ", teamDesc="
				+ teamDesc + ", uses=" + uses + ", delFlg=" + delFlg
				+ ", createTime=" + createTime + ", syncTime=" + syncTime
				+ ", zdOrgId=" + zdOrgId + ", dept=" + dept + ", orgName="
				+ orgName + ", picture=" + picture + ", packages=" + packages
				+ ", doctors=" + doctors + "]";
	}

}