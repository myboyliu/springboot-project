package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtPerson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 224278551297363348L;

	private Long personId;

    private Long userId;

    private String name;

    private Integer age;

    private Integer sex;

    private String birthdate;

    private Integer marry;

    private String nation;

    private String birthPlace;

    private Long addressId;

    private Integer occupationId;

    private String homeTel;

    private Integer socialIdType;

    private String socialId;

    private String allergicHistory;

    private Double weight;

    private Double height;
    
    private String occupationName;
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

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(personId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", marry=").append(marry);
        sb.append(", nation=").append(nation);
        sb.append(", birthPlace=").append(birthPlace);
        sb.append(", addressId=").append(addressId);
        sb.append(", occupationId=").append(occupationId);
        sb.append(", homeTel=").append(homeTel);
        sb.append(", socialIdType=").append(socialIdType);
        sb.append(", socialId=").append(socialId);
        sb.append(", allergicHistory=").append(allergicHistory);
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append("]");
        return sb.toString();
    }
}