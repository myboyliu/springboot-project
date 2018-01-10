package com.huatuo.customer.base.enums;

public enum PayStae {
	OBLIGATION(0, "未支付"), REFUNDED (1, "已支付"),CANCELED (2,"取消订单"), FORREFUND(3, "已退款");
	private int index;
	private String name;
	
	// 构造方法
	private PayStae(Integer index, String name) {
		this.index = index;
		this.name = name;
	}
	
	// 普通方法
	public static String getName(Integer index){
		for (PayStae c : PayStae.values()) {
			if(c.getIndex().equals(index)){
				return c.getName();
			}
		}
		return null;
	}
	
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
