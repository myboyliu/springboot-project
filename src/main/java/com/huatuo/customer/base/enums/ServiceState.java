package com.huatuo.customer.base.enums;

/**
 * 业务状态
 * 
 * @author lshaci
 * @since 2016-5-16
 * @version v2016-5-16
 */
public enum ServiceState {

	/**
	 * 未支付
	 */
	NOTPAY			(0, "未支付"),
	/**
	 * 待确认
	 */
	WAITCONFIRM		(1, "待确认"),
	/**
	 * 待审核
	 */
	WAITAUDIT		(2, "待审核"),
	/**
	 * 待受理
	 */
	WAITACCEPT		(3, "待受理"),
	/**
	 * 待服务
	 */
	WAITSERVICE		(4, "待服务"),
	/**
	 * 预约已过期
	 */
	RESERVATIONOUTOFDATE	(5, "预约已过期"),
	/**
	 * 待发货
	 */
	SHIPMENTS		(6, "待发货"),
	/**
	 * 服务中
	 */
	SERVICING		(7, "服务中"),
	/**
	 * 待体检
	 */
	WAITHEALTHCHECK	(8, "待体检"),
	/**
	 * 已确认
	 */
	CONFIRMED		(9, "已确认"),
	/**
	 * 已改签
	 */
	CHANGED			(10, "已改签"),
	/**
	 * 待回复
	 */
	WAITREPLAY		(11, "待回复"),
	/**
	 * 已发货
	 */
	SHIPPED			(12, "已发货"),
	/**
	 * 已收货
	 */
	RECEIVED		(13, "已收货"),
	/**
	 * 准备中
	 */
	PREPARING		(14, "准备中"),
	/**
	 * 已出门
	 */
	GOOUT			(15, "已出门"),
	/**
	 * 已签约
	 */
	SIGNED			(16, "已签约"),
	/**
	 * 已体检
	 */
	HEALTHCHECKED	(17, "已体检"),
	/**
	 * 已报告
	 */
	REPORTED		(18, "已报告"),
	/**
	 * 已退订
	 */
	CANCELED		(19, "已退订"),
	/**
	 * 已结束
	 */
	FINISHED		(20, "已结束"),
	/**
	 * 已到期
	 */
	EXPIRED			(21, "已到期")
	;
	
	private Integer index;	// 索引
	private String name;	// 名称
	
	/**
	 * 私有化构造方法
	 * 
	 * @param index	索引
	 * @param name	名称
	 */
	private ServiceState(Integer index, String name) {
		this.index = index;
		this.name = name;
	}
	
	/*
	 * 提供get方法
	 */
	public Integer getIndex() {
		return index;
	}
	public String getName() {
		return name;
	}
	
	/**
	 * 根据枚举的索引，获取名称
	 * 
	 * @param index	枚举索引
	 * @return		返回索引对应的名称(name)
	 */
	public static String getName(Integer index) {
		for (ServiceState o : ServiceState.values()) {
			if(o.getIndex().equals(index)){
				return o.getName();
			}
		}
		return null;
	}
}
