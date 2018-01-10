package com.huatuo.customer.base.enums;


public enum FmsHostStatus {

	/**
	 * 运行
	 */
	RUNNING(1,"running"),	
	/**
	 * 关闭
	 */
	DOWN(2,"down");
	
	private int index;
	private String name;
    
	 // 构造方法
    private FmsHostStatus(int index, String name) {
    	this.index = index;
        this.name = name;
    }

    // 普通方法
    public static String getName(int index) {
        for (FmsHostStatus c : FmsHostStatus.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
