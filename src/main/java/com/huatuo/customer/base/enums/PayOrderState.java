package com.huatuo.customer.base.enums;

/**
 * 订单状态
 * 
 * @author lshaci
 * @since 2016-5-16
 * @version v2016-5-16
 */
public enum PayOrderState {

	/**
	 * 待付款
	 */
	WAITPAY		(0, "待付款"),
	/**
	 * 已支付
	 */
	PAID		(1, "已支付"),
	/**
	 * 已关闭
	 */
	CLOSED		(2, "已关闭"),
	/**
	 * 已取消
	 */
	CANCELED	(3, "已取消"),
	/**
	 * 待退款
	 */
	WAITREFUND	(4, "待退款"),
	/**
	 * 已退款
	 */
	REFUNDED	(5, "已退款"),
	/**
	 * 已完成
	 */
	COMPLETED	(6, "已完成")
	;
	
	private Integer index;	// 索引
	private String name;	// 名称
	
	/**
	 * 私有化构造方法
	 * 
	 * @param index	索引
	 * @param name	名称
	 */
	private PayOrderState(Integer index, String name) {
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
		for (PayOrderState o : PayOrderState.values()) {
			if(o.getIndex().equals(index)){
				return o.getName();
			}
		}
		return null;
	}
	
}
