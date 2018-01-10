package com.huatuo.customer.base.enums;

/**
 * 消息中心消息状态
 * @author huzhihui
 *
 */
public enum MessageCenterState {

	/**
	 * 未读消息
	 */
	A(1, "未读消息"),  
	/**
	 * 已读消息
	 */
	B(2, "已读消息"),
	/**
	 * 未发送消息
	 */
	C(3, "未发送消息"),
	/**
	 * 未发送消息
	 */
	D(4, "作废消息");
	private Integer index;
	private String name;

	// 构造方法
	private MessageCenterState(Integer index, String name) {
		this.index = index;
		this.name = name;
	}
	
	// 普通方法
    public static String getName(Integer index) {
        for (MessageCenterState c : MessageCenterState.values()) {
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
