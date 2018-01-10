package com.huatuo.customer.domain;

import com.huatuo.register.base.domain.AbstractEntity;
import java.math.BigDecimal;

public class DtPackageDtl extends AbstractEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1251512511251L;

	/**
	 * 套餐明细id
	 */
	private String teamPackageDtlId;

	/**
	 * 服务项目ID
	 */
    private String serviceId;

	/**
	 * 服务项目
	 */
    private String serviceName;

	/**
	 * 价格
	 */
    private BigDecimal teamPackageDtlCharge;

	/**
	 * 数量
	 */
    private Integer amount;

	/**
	 * 描述
	 */
    private String description;

	/**
	 * 套餐ID
	 */
    private String teamPackageId;

	/**
	 * 更新时间: 格式"yyyy-MM-dd HH:mm:ss"
	 */
    private String syncTime;

	/**
	 * 是否作废: 0.否, 1.是
	 */
    private Integer delFlag;

    public String getTeamPackageDtlId() {
        return teamPackageDtlId;
    }

    public void setTeamPackageDtlId(String teamPackageDtlId) {
        this.teamPackageDtlId = teamPackageDtlId == null ? null : teamPackageDtlId.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public BigDecimal getTeamPackageDtlCharge() {
        return teamPackageDtlCharge;
    }

    public void setTeamPackageDtlCharge(BigDecimal teamPackageDtlCharge) {
        this.teamPackageDtlCharge = teamPackageDtlCharge;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTeamPackageId() {
        return teamPackageId;
    }

    public void setTeamPackageId(String teamPackageId) {
        this.teamPackageId = teamPackageId == null ? null : teamPackageId.trim();
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime == null ? null : syncTime.trim();
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teamPackageDtlId=").append(teamPackageDtlId);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", serviceName=").append(serviceName);
        sb.append(", teamPackageDtlCharge=").append(teamPackageDtlCharge);
        sb.append(", amount=").append(amount);
        sb.append(", description=").append(description);
        sb.append(", teamPackageId=").append(teamPackageId);
        sb.append(", syncTime=").append(syncTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append("]");
        return sb.toString();
    }
}