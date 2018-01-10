package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;

public class UserQuery extends BaseQuery{
	
	private static final long serialVersionUID = -7295210343947462811L;

	/**
	 * 用户id
	 */
    private Long id;
    
    /**
     * 家庭成员id
     */
    private Long personFamilyId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPersonFamilyId() {
		return personFamilyId;
	}

	public void setPersonFamilyId(Long personFamilyId) {
		this.personFamilyId = personFamilyId;
	}
    
}
