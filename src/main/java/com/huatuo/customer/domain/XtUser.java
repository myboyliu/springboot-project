package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
    private Long id;
    

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 支付密码
     */
    private String payPwd;

    /**
     * 姓名
     */
    private String name;
    
    /**
     * 真实姓名（和银行先关）
     */
    private String tureName;
    
    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String mobile;
    
    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 所属单位
     */
    private Integer orgId;

    /**
     * 状态（0：启用 1：禁用）
     */
    private Integer state;

    /**
     * 账户余额
     */
    private Long amount;
    
    /**
     * 可使用余额
     */
    private Long useAmount;
    
    /**
     * 某个家庭成员id（冗余字段）
     */
    private Long personFamilyId;
    
    private String address; //详细地址
    
    private Integer personAge; //年龄
    
    private Integer age;
    
    private String birthDate; //出生日期
    
    private String birthPlace;//籍贯
    
    private String nation;//民族
    
    private Integer marry;//婚姻(0:未婚,1:已婚,2:离异,3:丧偶)
    
    private Integer occupationId; //职业id
    
    private String occupationName; //从事职业
    
    private String allergicHistory; //过敏史
    
    private String socialId;//身份证号
    
    private String province; //省份名字
    
    private Integer provinceCode; //省份编码
    
    private String city; //市名字
    
    private String county; //县/区名字
    
    private String road; //街道名字
    
    private Long addressId; //地址id
    
    private Long personId; //关联人id
    
    private Long birthDateFormat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTureName() {
        return tureName;
    }

    public void setTureName(String tureName) {
        this.tureName = tureName == null ? null : tureName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getUseAmount() {
        return useAmount;
    }

    public void setUseAmount(Long useAmount) {
        this.useAmount = useAmount;
    }
    
    public Long getPersonFamilyId() {
		return personFamilyId;
	}

	public void setPersonFamilyId(Long personFamilyId) {
		this.personFamilyId = personFamilyId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public String getAllergicHistory() {
		return allergicHistory;
	}

	public void setAllergicHistory(String allergicHistory) {
		this.allergicHistory = allergicHistory;
	}
	public String getSocialId() {
		return socialId;
	}

	public void setSocialId(String socialId) {
		this.socialId = socialId;
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
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	
	public Integer getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(Integer provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Long getBirthDateFormat() {
		return birthDateFormat;
	}

	public void setBirthDateFormat(Long birthDateFormat) {
		this.birthDateFormat = birthDateFormat;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", pwd=").append(pwd);
        sb.append(", payPwd=").append(payPwd);
        sb.append(", name=").append(name);
        sb.append(", tureName=").append(tureName);
        sb.append(", sex=").append(sex);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", userType=").append(userType);
        sb.append(", orgId=").append(orgId);
        sb.append(", state=").append(state);
        sb.append(", amount=").append(amount);
        sb.append(", useAmount=").append(useAmount);
        sb.append("]");
        return sb.toString();
    }

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}