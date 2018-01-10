package com.huatuo.customer.base.enums;

public enum MessageCenterType {
	/**
	 * 协作消息
	 */
	A(1, "协作消息"),  
	/**
	 * 任务消息
	 */
	B(2, "任务消息"), 
	/**
	 * 系统消息
	 */
	C(3, "系统消息"), 
	/**
	 * 通知消息
	 */
	D(4, "通知消息"),
	FREE(5, "免费咨询"), FAMILY(6, "家庭医生"), VIDEO(7, "视频"),
	BESPEAK(8, "预约"), SYSTEM(9, "系统"), ORDER(10, "订单"),SERVICEORDER(11, "服务记录");
	
	private Integer index;
	private String name;

	// 构造方法
	private MessageCenterType(Integer index, String name) {
		this.index = index;
		this.name = name;
	}
	
	// 普通方法
    public static String getName(Integer index) {
        for (MessageCenterType c : MessageCenterType.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
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
