package com.huatuo.customer.domain;

import com.huatuo.register.base.domain.AbstractEntity;

public class DtType extends AbstractEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dtTypeId;

    private String dtTeamId;

    private String serviceAddressId;

    private String typeName;

    private String serviceAddressName;

    private Integer delFlg;

    private String createTime;

    private String syncTime;

    public String getDtTypeId() {
        return dtTypeId;
    }

    public void setDtTypeId(String dtTypeId) {
        this.dtTypeId = dtTypeId == null ? null : dtTypeId.trim();
    }

    public String getDtTeamId() {
        return dtTeamId;
    }

    public void setDtTeamId(String dtTeamId) {
        this.dtTeamId = dtTeamId == null ? null : dtTeamId.trim();
    }

    public String getServiceAddressId() {
        return serviceAddressId;
    }

    public void setServiceAddressId(String serviceAddressId) {
        this.serviceAddressId = serviceAddressId == null ? null : serviceAddressId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getServiceAddressName() {
        return serviceAddressName;
    }

    public void setServiceAddressName(String serviceAddressName) {
        this.serviceAddressName = serviceAddressName == null ? null : serviceAddressName.trim();
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
        this.syncTime = syncTime == null ? null : syncTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dtTypeId=").append(dtTypeId);
        sb.append(", dtTeamId=").append(dtTeamId);
        sb.append(", serviceAddressId=").append(serviceAddressId);
        sb.append(", typeName=").append(typeName);
        sb.append(", serviceAddressName=").append(serviceAddressName);
        sb.append(", delFlg=").append(delFlg);
        sb.append(", createTime=").append(createTime);
        sb.append(", syncTime=").append(syncTime);
        sb.append("]");
        return sb.toString();
    }
}