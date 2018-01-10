package com.huatuo.customer.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.huatuo.customer.base.util.ConfigProperites;

public class XtDrugstore implements Serializable{
	private static final long serialVersionUID = -6490220367518320157L;

	private String id;

    private Long orgId;

    private Double longitude;

    private Double latitude;

    private Long userId;

    private String userName;

    private BigDecimal orderPrice;

    private Integer isOpen;

    private Double distance;//距离
    private String orgImg;//头像
    private String orgName;//药店名
    private Long addressId;//地址id
    private String telephone;//联系电话
    private XtAddress xtAddress;//地址信息
    /**
     * 机构别名
     */
    private String aliasName;
    
    public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	//确认距离单位
    public String getDistance() {
    	NumberFormat nf=new DecimalFormat( "0.0 "); 
    	if (distance != null) {
    		return distance >= 1 ?  nf.format(distance) + "km":nf.format(distance*1000)+"m";
		}
    	return null;
	}
    //图片加前缀
    public String getOrgImg() {
    	return ConfigProperites.getImageUrl() + orgImg;
    }
    
    
    public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public XtAddress getXtAddress() {
		return xtAddress;
	}
	public void setXtAddress(XtAddress xtAddress) {
		this.xtAddress = xtAddress;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public void setOrgImg(String orgImg) {
		this.orgImg = orgImg;
	}
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgId=").append(orgId);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", isOpen=").append(isOpen);
        sb.append("]");
        return sb.toString();
    }
}