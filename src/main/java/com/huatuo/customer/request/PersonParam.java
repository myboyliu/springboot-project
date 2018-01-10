package com.huatuo.customer.request;

import java.util.ArrayList;
import java.util.List;

import com.huatuo.customer.base.request.BaseForm;

/**
 * 个人信息提交对象
 * @author master
 *
 */
public class PersonParam extends BaseForm{

	private static final long serialVersionUID = -2231458470689349364L;
	
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 真实姓名
	 */
	private String name;
	/**
	 * 电话号码
	 */
	private String mobile;
	/**
	 * 出生日期
	 */
	private String birthdate;
	/**
	 * 地址id
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
	 * 性别
	 */
	private Integer sex;
	/**
	 * 身份证号
	 */
	private String socialId;
	/**
	 * 籍贯
	 */
	private String birthPlace;
	/**
	 * 民族
	 */
	private String nation;
	/**
	 * 婚姻状况
	 */
	private Integer marry;
	/**
	 * 职业id
	 */
	private Integer occupationId;
	/**
	 * 过敏史
	 */
	private String allergicHistory;
	
	/**
	 * 文件字符串流集合
	 */
	private List<String> files = new ArrayList<String>();
	/**
	 * 用户联系信息
	 */
	private String relationInfo;
	/**
	 * 用户提交建议
	 */
	private String suggestions;
	/**
	 * 家庭成员id
	 */
	private Long personFamilyId;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 相对userId的关系
	 */
	private Integer relationId;
	/**
	 * 体重
	 */
	private Double weight;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 电话号码
	 */
	private String homeTel;
	
	public String getHomeTel() {
		return homeTel;
	}
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getRelationId() {
		return relationId;
	}
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPersonFamilyId() {
		return personFamilyId;
	}
	public void setPersonFamilyId(Long personFamilyId) {
		this.personFamilyId = personFamilyId;
	}
	public List<String> getFiles() {
		return files;
	}
	public void setFiles(List<String> files) {
		this.files = files;
	}
	public String getRelationInfo() {
		return relationInfo;
	}
	public void setRelationInfo(String relationInfo) {
		this.relationInfo = relationInfo;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
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
	public Integer getCityCode() {
		return cityCode;
	}
	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}
	public Integer getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(Integer countyCode) {
		this.countyCode = countyCode;
	}
	public Integer getRoadCode() {
		return roadCode;
	}
	public void setRoadCode(Integer roadCode) {
		this.roadCode = roadCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getSocialId() {
		return socialId;
	}
	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public Integer getMarry() {
		return marry;
	}
	public void setMarry(Integer marry) {
		this.marry = marry;
	}
	public Integer getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(Integer occupationId) {
		this.occupationId = occupationId;
	}
	public String getAllergicHistory() {
		return allergicHistory;
	}
	public void setAllergicHistory(String allergicHistory) {
		this.allergicHistory = allergicHistory;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	
}
