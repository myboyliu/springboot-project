package com.huatuo.customer.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.github.pagehelper.StringUtil;
import com.huatuo.customer.base.enums.TitlesClinicalType;
import com.huatuo.customer.base.enums.TitlesTeachType;

public class Doctor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 464458309308134758L;
	/**
	 * 主键Id
	 */
	private Long id;
	
	/**
	 * 医生团队id
	 */
	private String dtTeamId;
	
	/**
	 * 所属用户id
	 */
	private Long userId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 性别，0男，1女
	 */
	private Integer sex;
	/**
	 * 民族	
	 */
	private String nation;
	/**
	 * 出生日期
	 */
	private String birthdate;
	/**
	 * 籍贯
	 */
	private String birthPlace;
	/**
	 * 语言( 汉语,英语 ,维语)
	 */
	private String language;
	/**
	 * 语言拼音码
	 */
	private String languageCn;
	/**
	 * 专科id
	 */
	private Integer specialtyId;
	/**
	 * 所属医院
	 */
	private Integer zdOrgId;
	/**
	 * 医生类型(1:西医 2:中医)
	 */
	private Integer doctorType;
	/**
	 * 所属科室
	 */
	private String dept;
	/**
	 * 科室拼音码
	 */
	private String deptCn;
	/**
	 * 临床职称
	 */
	private Integer titlesClinical;
	/**
	 * 教学职称
	 */
	private Integer titlesTeach;
	/**
	 * 擅长
	 */
	private String goodAt;
	/**
	 * 平均就诊时间
	 */
	private String avgTime;
	/**
	 * 身份证件类型，0居民身份证
	 */
	private Integer socialIdType;
	/**
	 * 身份证件号
	 */
	private String socialId;
	/**
	 * 医生角色
	 */
	private String roleId;
	/**
	 * 头像
	 */
	private String picture;
	/**
	 * 点赞
	 */
	private Integer praise;
	/**
	 * 医生评价
	 */
	private Float appraise;
	/**
	 * 图文咨询价格
	 */
	private BigDecimal twPrice;
	/**
	 * 视频门诊价格
	 */
	private BigDecimal spPrice;
	/**
	 * 上门服务价格
	 */
	private BigDecimal smPrice;
	/**
	 * 预约服务价格
	 */
	private BigDecimal yyPrice;
	/**
	 * 是否开通图文咨询
	 */
	private Integer isTw;
	/**
	 * 是否开通视频门诊
	 */
	private Integer isSp;
	/**
	 * 是否开通上门服务
	 */
	private Integer isSm;
	/**
	 * 是否开通家庭医生
	 */
	private Integer isJt;
	/**
	 * 是否开通家庭预约功能
	 */
	private Integer isYy;
	/**
	 * 是否具备审核权限
	 */
	private Integer isCs;
	/**
	 * 入驻医生信息	
	 */
	private Long doctorApplyId;
	/**
	 * 删除标记
	 */
	private Integer delFlag;
	/**
	 * 分红比例
	 */
	private Long bonusId;
	/**
	 * 坐席类型
	 */
	private String seatType;
	/**
	 * 坐席标识
	 */
	private String seatTitle;
	/**
	 * 省份id
	 */
	private int provinceCode;
	
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市id
	 * 
	 */
	private int cityCode;
	/** 
	 * 城市
	 */
	private String city;
	/**
	 *区/县id
	 */
	private int countyCode;
	/**
	 * 区/县
	 */
	private String county;
	/**
	 * 街道id
	 */
	private int roadCode;
	/**
	 * 街道
	 */
	private String road;
	
	/**
	 * 医院名字
	 * @return
	 */
	private String orgName;
	
	/**
	 * 科室名字
	 * @return
	 */
	private String specialtyName;
	
    private  String[] seatTitleStr;
    
    private Integer currentPage;
	
/*	public String getTitlesClinicalName() {
		return this.titlesTeach == null ? "" : TitlesTeachType.getName(this.titlesTeach);
	}
	public String getTitlesTeachName() {
		return this.titlesClinical == null ? "" : TitlesClinicalType.getName(this.titlesClinical);
	}*/
	/**
	 * 排队人数
	 */
	private int queuingNumber;
	/**
	
	/**
	 * 预约状态人数
	 */
	private int subscribeNum;
	
	/**
	 * 在线
	 * @return
	 */
	private boolean isOnline;
	
	/**
	 * 服务人数
	 * @return
	 */
	private int servicePerson;
	
	/**
	 * 专家名义名字
	 * @return
	 */
	private String seatTitleName;
	
	/**
	 * 聊天信息id
	 */
	private String messageCenterId;
	
	/**
	 * 聊天信息
	 */
	private String chatMessage;
	
	/**
	 * 聊天信息时间
	 */
	private String chatMessageTime;
	
	/**
	 * 是否预约满(true已满,false没满)
	 */
	private boolean subscribeType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguageCn() {
		return languageCn;
	}
	public void setLanguageCn(String languageCn) {
		this.languageCn = languageCn;
	}
	public Integer getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}
	public Integer getZdOrgId() {
		return zdOrgId;
	}
	public void setZdOrgId(Integer zdOrgId) {
		this.zdOrgId = zdOrgId;
	}
	public Integer getDoctorType() {
		return doctorType;
	}
	public void setDoctorType(Integer doctorType) {
		this.doctorType = doctorType;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDeptCn() {
		return deptCn;
	}
	public void setDeptCn(String deptCn) {
		this.deptCn = deptCn;
	}
	public Integer getTitlesClinical() {
		return titlesClinical;
	}
	public void setTitlesClinical(Integer titlesClinical) {
		this.titlesClinical = titlesClinical;
	}
	public Integer getTitlesTeach() {
		return titlesTeach;
	}
	public void setTitlesTeach(Integer titlesTeach) {
		this.titlesTeach = titlesTeach;
	}
	public String getGoodAt() {
		return goodAt;
	}
	public void setGoodAt(String goodAt) {
		this.goodAt = goodAt;
	}
	public String getAvgTime() {
		return StringUtil.isEmpty(avgTime) ? "15" : avgTime;
	}
	public void setAvgTime(String avgTime) {
		this.avgTime = avgTime;
	}
	public Integer getSocialIdType() {
		return socialIdType;
	}
	public void setSocialIdType(Integer socialIdType) {
		this.socialIdType = socialIdType;
	}
	public String getSocialId() {
		return socialId;
	}
	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getPraise() {
		return praise;
	}
	public void setPraise(Integer praise) {
		this.praise = praise;
	}
	public Float getAppraise() {
		return appraise;
	}
	public void setAppraise(Float appraise) {
		this.appraise = appraise;
	}
	public BigDecimal getTwPrice() {
		return twPrice;
	}
	public void setTwPrice(BigDecimal twPrice) {
		this.twPrice = twPrice;
	}
	public BigDecimal getSpPrice() {
		return spPrice;
	}
	public void setSpPrice(BigDecimal spPrice) {
		this.spPrice = spPrice;
	}
	public BigDecimal getSmPrice() {
		return smPrice;
	}
	public void setSmPrice(BigDecimal smPrice) {
		this.smPrice = smPrice;
	}
	public BigDecimal getYyPrice() {
		return yyPrice;
	}
	public void setYyPrice(BigDecimal yyPrice) {
		this.yyPrice = yyPrice;
	}
	public Integer getIsTw() {
		return isTw;
	}
	public void setIsTw(Integer isTw) {
		this.isTw = isTw;
	}
	public Integer getIsSp() {
		return isSp;
	}
	public void setIsSp(Integer isSp) {
		this.isSp = isSp;
	}
	public Integer getIsSm() {
		return isSm;
	}
	public void setIsSm(Integer isSm) {
		this.isSm = isSm;
	}
	public Integer getIsJt() {
		return isJt;
	}
	public void setIsJt(Integer isJt) {
		this.isJt = isJt;
	}
	public Integer getIsYy() {
		return isYy;
	}
	public void setIsYy(Integer isYy) {
		this.isYy = isYy;
	}
	public Integer getIsCs() {
		return isCs;
	}
	public void setIsCs(Integer isCs) {
		this.isCs = isCs;
	}
	public Long getDoctorApplyId() {
		return doctorApplyId;
	}
	public void setDoctorApplyId(Long doctorApplyId) {
		this.doctorApplyId = doctorApplyId;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public Long getBonusId() {
		return bonusId;
	}
	public void setBonusId(Long bonusId) {
		this.bonusId = bonusId;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getSeatTitle() {
		return seatTitle;
	}
	public void setSeatTitle(String seatTitle) {
		this.seatTitle = seatTitle;
	}
	public int getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(int countyCode) {
		this.countyCode = countyCode;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getRoadCode() {
		return roadCode;
	}
	public void setRoadCode(int roadCode) {
		this.roadCode = roadCode;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public int getQueuingNumber() {
		return queuingNumber;
	}
	public void setQueuingNumber(int queuingNumber) {
		this.queuingNumber = queuingNumber;
	}
	public int getSubscribeNum() {
		return subscribeNum;
	}
	public void setSubscribeNum(int subscribeNum) {
		this.subscribeNum = subscribeNum;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getSpecialtyName() {
		return specialtyName;
	}
	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}
	public int getServicePerson() {
		return servicePerson;
	}
	public void setServicePerson(int servicePerson) {
		this.servicePerson = servicePerson;
	}
	public String getTitlesClinicalName() {
		return this.titlesClinical == null ? "" : TitlesClinicalType.getName(this.titlesClinical);
	}
	public String getTitlesTeachName() {
		return this.titlesTeach == null ? "" : TitlesTeachType.getName(this.titlesTeach);
	}
	public String getSeatTitleName() {
		return seatTitleName;
	}
	public void setSeatTitleName(String seatTitleName) {
		this.seatTitleName = seatTitleName;
	}
	public String[] getSeatTitleStr() {
		return seatTitleStr;
	}
	public void setSeatTitleStr(String[] seatTitleStr) {
		this.seatTitleStr = seatTitleStr;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public String getChatMessage() {
		return chatMessage;
	}
	public void setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
	}
	public String getChatMessageTime() {
		return chatMessageTime;
	}
	public void setChatMessageTime(String chatMessageTime) {
		this.chatMessageTime = chatMessageTime;
	}
	public String getMessageCenterId() {
		return messageCenterId;
	}
	public void setMessageCenterId(String messageCenterId) {
		this.messageCenterId = messageCenterId;
	}
	public String getDtTeamId() {
		return dtTeamId;
	}
	public void setDtTeamId(String dtTeamId) {
		this.dtTeamId = dtTeamId;
	}
	public boolean isSubscribeType() {
		return subscribeType;
	}
	public void setSubscribeType(boolean subscribeType) {
		this.subscribeType = subscribeType;
	}

	
}
