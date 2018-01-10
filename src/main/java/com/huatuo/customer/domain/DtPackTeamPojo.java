package com.huatuo.customer.domain;

import java.math.BigDecimal;

import com.huatuo.register.base.domain.AbstractEntity;

/**
 * 孕妈套餐信息
 * @author Administrator
 *
 */
public class DtPackTeamPojo extends AbstractEntity {
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
	 * 医生团队负责人（xt_doctor）
	 */
    private String adminDoctorId;
    
    /**
     * 医生团队负责人姓名（xt_doctor）
     */
    private String adminDoctorName;

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
	 * 团队套餐id
	 */
	private String teamPackageId;
	
	/**
	 * 套餐名称
	 */
    private String packageName;
    
    /**
	 * 总价
	 */
    private BigDecimal packagePrice;
    
    /**
	 * 有效期: 0无限，1月，2年
	 */
    private Integer packageCycle;
    
    /**
     * 有效期: 0无限，1月，2年
     */
    private String packageCycleName;
    
    /**
	 * 临床职称 1.住院医师 2.主治医师 3.副主任医师 4 主任医师 5.初级职称 6.中级职称 7.高级职称
	 */
	private Integer titlesClinical;
	
	/**
	 * 临床职称 1.住院医师 2.主治医师 3.副主任医师 4 主任医师 5.初级职称 6.中级职称 7.高级职称
	 */
	private String titlesClinicalName;

	public String getDtTeamId() {
		return dtTeamId;
	}

	public void setDtTeamId(String dtTeamId) {
		this.dtTeamId = dtTeamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getAdminDoctorId() {
		return adminDoctorId;
	}

	public void setAdminDoctorId(String adminDoctorId) {
		this.adminDoctorId = adminDoctorId;
	}

	public String getAdminDoctorName() {
		return adminDoctorName;
	}

	public void setAdminDoctorName(String adminDoctorName) {
		this.adminDoctorName = adminDoctorName;
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

	public String getTeamPackageId() {
		return teamPackageId;
	}

	public void setTeamPackageId(String teamPackageId) {
		this.teamPackageId = teamPackageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public BigDecimal getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(BigDecimal packagePrice) {
		this.packagePrice = packagePrice;
	}

	public Integer getPackageCycle() {
		return packageCycle;
	}

	public void setPackageCycle(Integer packageCycle) {
		this.packageCycle = packageCycle;
	}

	public Integer getTitlesClinical() {
		return titlesClinical;
	}

	public void setTitlesClinical(Integer titlesClinical) {
		this.titlesClinical = titlesClinical;
	}

	public String getTitlesClinicalName() {
		return titlesClinicalName;
	}

	public void setTitlesClinicalName(String titlesClinicalName) {
		this.titlesClinicalName = titlesClinicalName;
	}

	public String getPackageCycleName() {
		return packageCycleName;
	}

	public void setPackageCycleName(String packageCycleName) {
		this.packageCycleName = packageCycleName;
	}

	@Override
	public String toString() {
		return "DtPackTeamPojo [dtTeamId=" + dtTeamId + ", teamName="
				+ teamName + ", adminDoctorId=" + adminDoctorId
				+ ", adminDoctorName=" + adminDoctorName + ", zdOrgId="
				+ zdOrgId + ", dept=" + dept + ", orgName=" + orgName
				+ ", picture=" + picture + ", teamPackageId=" + teamPackageId
				+ ", packageName=" + packageName + ", packagePrice="
				+ packagePrice + ", packageCycle=" + packageCycle
				+ ", packageCycleName=" + packageCycleName
				+ ", titlesClinical=" + titlesClinical
				+ ", titlesClinicalName=" + titlesClinicalName + "]";
	}

}