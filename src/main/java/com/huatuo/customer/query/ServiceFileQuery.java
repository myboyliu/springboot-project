package com.huatuo.customer.query;

import com.huatuo.customer.base.query.BaseQuery;

/**
 * 文件查询对象
 * @author Administrator
 *
 */
public class ServiceFileQuery extends BaseQuery{

	private static final long serialVersionUID = 6472786509050091725L;
	
	/**
	 * 业务id
	 */
	private Long typeId;
	
	/**
	 * 业务类型
	 */
	private Integer serviceType;

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}
	
}
