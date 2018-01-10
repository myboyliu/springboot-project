package com.huatuo.customer.domain;

import java.io.Serializable;

/**
 * 临时存取用户和家医团队以及套餐包的id和购买时间
 * @author Administrator
 *
 */
public class UserPTIdPojo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家医团队id
	 */
	private String dtTeamId;

	/**
	 * 用户id
	 */
    private String userId;

    /**
     * 套餐id
     */
    private String teamPackageId;

    /**
     * 购买月份数
     */
    private Integer num;

	public String getDtTeamId() {
		return dtTeamId;
	}

	public void setDtTeamId(String dtTeamId) {
		this.dtTeamId = dtTeamId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTeamPackageId() {
		return teamPackageId;
	}

	public void setTeamPackageId(String teamPackageId) {
		this.teamPackageId = teamPackageId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserPTIdPojo [dtTeamId=" + dtTeamId + ", userId=" + userId
				+ ", teamPackageId=" + teamPackageId + ", num=" + num + "]";
	}

}