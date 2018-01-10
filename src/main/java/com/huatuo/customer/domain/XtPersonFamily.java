package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtPersonFamily implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家庭成员id
	 */
	private Long personFamilyId;

	/**
	 * 用户id
	 */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private String birthdate;

    /**
     * 婚姻
     */
    private Integer marry;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 民族
     */
    private String nation;

    /**
     * 籍贯
     */
    private String birthPlace;

    /**
     * 家庭住址(到镇、区)
     */
    private Long addressId;

    /**
     * 职业
     */
    private Integer occupationId;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 家庭电话
     */
    private String homeTel;

    /**
     * 身份证件类型，0居民身份证
     */
    private Integer socialIdType;

    /**
     * 身份证号
     */
    private String socialId;

    /**
     * 过敏史
     */
    private String allergicHistory;

    /**
     * 相对userid的关系
     */
    private Integer relationId;
    
    private Long relatedUserId;
    /**
     * 体重
     */
    private Double weight;    
    
    private String relation; //家庭成员对应关系名字    
    
    /**
     * 家庭成员里面的地址对象
     */
    private XtAddress xtAddress;
    
    public XtAddress getXtAddress() {
		return xtAddress;
	}

	public void setXtAddress(XtAddress xtAddress) {
		this.xtAddress = xtAddress;
	}

	private Long birthdateFormat;

    /**
     * 就医患者id
     */
    private Long patientId;
    
    public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Long getPersonFamilyId() {
		return personFamilyId;
	}

	public void setPersonFamilyId(Long personFamilyId) {
		this.personFamilyId = personFamilyId;
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
        this.name = name == null ? null : name.trim();
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public Integer getMarry() {
        return marry;
    }

    public void setMarry(Integer marry) {
        this.marry = marry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel == null ? null : homeTel.trim();
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
        this.socialId = socialId == null ? null : socialId.trim();
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory == null ? null : allergicHistory.trim();
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Long getRelatedUserId() {
        return relatedUserId;
    }

    public void setRelatedUserId(Long relatedUserId) {
        this.relatedUserId = relatedUserId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

	public Long getBirthdateFormat() {
		return birthdateFormat;
	}

	public void setBirthdateFormat(Long birthdateFormat) {
		this.birthdateFormat = birthdateFormat;
	}

}