package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtAddress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键id
	 */
    private Long addressId;
    /**
     * 省份id
     */
    private Integer provinceCode;
    /**
     * 省份名
     */
    private String province;
    /**
     * 城市id
     */
    private Integer cityCode;
    /**
     * 城市名
     */
    private String city;
    /**
     * 区县id
     */
    private Integer countyCode;
    /**
     * 区县名
     */
    private String county;
    /**
     * 街道id
     */
    private Integer roadCode;
    /**
     * 街道名
     */
    private String road;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 定位id
     */
    private String positionCode;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public Integer getRoadCode() {
        return roadCode;
    }

    public void setRoadCode(Integer roadCode) {
        this.roadCode = roadCode;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", province=").append(province);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", city=").append(city);
        sb.append(", countyCode=").append(countyCode);
        sb.append(", county=").append(county);
        sb.append(", roadCode=").append(roadCode);
        sb.append(", road=").append(road);
        sb.append(", address=").append(address);
        sb.append(", positionCode=").append(positionCode);
        sb.append("]");
        return sb.toString();
    }
}