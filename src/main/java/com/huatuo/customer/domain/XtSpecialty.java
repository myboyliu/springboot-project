package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtSpecialty implements Serializable{
	private static final long serialVersionUID = 6929147800718440947L;

	private Integer id;

    private String code;

    private String name;

    private String aliasName;

    private Integer grade;

    private Integer parentId;

    private Integer mzActivated;

    private String pyCode;

    private String dCode;

    private Integer sortNo;

    private Integer delFlag;

    private Integer openFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getMzActivated() {
        return mzActivated;
    }

    public void setMzActivated(Integer mzActivated) {
        this.mzActivated = mzActivated;
    }

    public String getPyCode() {
        return pyCode;
    }

    public void setPyCode(String pyCode) {
        this.pyCode = pyCode == null ? null : pyCode.trim();
    }

    public String getdCode() {
        return dCode;
    }

    public void setdCode(String dCode) {
        this.dCode = dCode == null ? null : dCode.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(Integer openFlag) {
        this.openFlag = openFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", aliasName=").append(aliasName);
        sb.append(", grade=").append(grade);
        sb.append(", parentId=").append(parentId);
        sb.append(", mzActivated=").append(mzActivated);
        sb.append(", pyCode=").append(pyCode);
        sb.append(", dCode=").append(dCode);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", openFlag=").append(openFlag);
        sb.append("]");
        return sb.toString();
    }
}