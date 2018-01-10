package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;


/**
 * 个人信息查询对象
 * @author master
 *
 */
public class PersonQuery extends BaseQuery{

	private static final long serialVersionUID = 6399225143705238963L;

	/**
	 * 用户id
	 */
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
