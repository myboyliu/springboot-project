package com.huatuo.customer.domain;

import java.io.Serializable;

public class MzPatient implements Serializable{
	
	private static final long serialVersionUID = 5016987067684882890L;
	private MzVisit visit;//就诊信息
	/**
	 * 患者主键id
	 */
    private Long patientId;
    /**
     * 患者姓名
     */
    private String name;
    /**
     * 姓名拼音
     */
    private String namePy;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 出生日期
     */
    private String birthDate;
    /**
     * 婚姻状况
     */
    private Integer marry;
    /**
     * 籍贯
     */
    private String birthPlace;
    /**
     * 民族
     */
    private String nation;
    /**
     * 地址外键
     */
    private Long addressId;
    /**
     * 职业
     */
    private Integer occupationId;
    /**
     * 联系电话
     */
    private String relateTel;
    /**
     * 证件类型
     */
    private Integer socialIdType;
    /**
     * 证件号
     */
    private String socialId;
    /**
     * 就诊医生外键
     */
    private Long doctorId;
    /**
     * 操作员
     */
    private String operator;
    /**
     * 国别
     */
    private String country;
    /**
     * 过敏史
     */
    private String allergicHistory;
    /**
     * 体重
     */
    private Double weight;	
    /**
     * 患者就诊次数
     */
    private Integer times = 0;
    /**
     * 省份名
     */
    private String province;
    /**
     * 城市名
     */
    private String city;
    /**
     * 区县名
     */
    private String county;
    /**
     * 街道名
     */
    private String road;
    /**
     * 具体地址名
     */
    private String address;
    /*
     * 患者年龄
     */
    private String age;
    /**
     * 患者地址
     */
    private String location;
    /**
     * 就诊类型
     */
    private Integer formType;
    
    public Integer getFormType() {
		return formType;
	}

	public void setFormType(Integer formType) {
		this.formType = formType;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNamePy() {
        return namePy;
    }

    public void setNamePy(String namePy) {
        this.namePy = namePy == null ? null : namePy.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public Integer getMarry() {
        return marry;
    }

    public void setMarry(Integer marry) {
        this.marry = marry;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
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

    public String getRelateTel() {
        return relateTel;
    }

    public void setRelateTel(String relateTel) {
        this.relateTel = relateTel == null ? null : relateTel.trim();
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

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory == null ? null : allergicHistory.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public MzVisit getVisit() {
		return visit;
	}

	public void setVisit(MzVisit visit) {
		this.visit = visit;
	}
    
}