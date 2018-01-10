package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.List;

import com.huatuo.customer.domain.DtPackageDtl;
import com.huatuo.register.base.domain.AbstractEntity;

public class DtPackagePojo extends AbstractEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 141241251251251L;

	/**
	 * 团队套餐id
	 */
	private String teamPackageId;

	/**
	 * 团队ID
	 */
    private String doctorTeamId;

	/**
	 * 套餐名称
	 */
    private String packageName;

	/**
	 * 套餐描述
	 */
    private String description;

	/**
	 * 套餐类型: 0.服务套餐; 1. 叠加套餐
	 */
    private Integer packageType;

	/**
	 * 总价
	 */
    private BigDecimal packagePrice;

	/**
	 * 0，无，1.按时间段; 2.按次
	 */
    private Integer chargeMode;

	/**
	 * 有效期: 0无限，1月，2年
	 */
    private Integer packageCycle;

	/**
	 * 启用时间: 格式"yyyy-MM-dd HH:mm:ss"
	 */
    private String startUseTime;

	/**
	 * 更新时间: 格式"yyyy-MM-dd HH:mm:ss"
	 */
    private String syncTime;

	/**
	 * 是否启用: 0.否, 1.是
	 */
    private Integer uses;

	/**
	 * 是否作废: 0.否, 1.是
	 */
    private Integer delFlag;
    
    /**
     * 套餐子项信息
     */
    private List<DtPackageDtl> dtPackageDtls;

    public List<DtPackageDtl> getDtPackageDtls() {
		return dtPackageDtls;
	}

	public void setDtPackageDtls(List<DtPackageDtl> dtPackageDtls) {
		this.dtPackageDtls = dtPackageDtls;
	}

	public String getTeamPackageId() {
        return teamPackageId;
    }

    public void setTeamPackageId(String teamPackageId) {
        this.teamPackageId = teamPackageId == null ? null : teamPackageId.trim();
    }

    public String getDoctorTeamId() {
        return doctorTeamId;
    }

    public void setDoctorTeamId(String doctorTeamId) {
        this.doctorTeamId = doctorTeamId == null ? null : doctorTeamId.trim();
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

    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public Integer getPackageCycle() {
        return packageCycle;
    }

    public void setPackageCycle(Integer packageCycle) {
        this.packageCycle = packageCycle;
    }

    public String getStartUseTime() {
        return startUseTime;
    }

    public void setStartUseTime(String startUseTime) {
        this.startUseTime = startUseTime == null ? null : startUseTime.trim();
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime == null ? null : syncTime.trim();
    }

    public Integer getUses() {
        return uses;
    }

    public void setUses(Integer uses) {
        this.uses = uses;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
	public String toString() {
		return "DtPackagePojo [teamPackageId=" + teamPackageId
				+ ", doctorTeamId=" + doctorTeamId + ", packageName="
				+ packageName + ", description=" + description
				+ ", packageType=" + packageType + ", packagePrice="
				+ packagePrice + ", chargeMode=" + chargeMode
				+ ", packageCycle=" + packageCycle + ", startUseTime="
				+ startUseTime + ", syncTime=" + syncTime + ", uses=" + uses
				+ ", delFlag=" + delFlag + ", dtPackageDtls=" + dtPackageDtls
				+ "]";
	}
}