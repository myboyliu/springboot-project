package com.huatuo.customer.base.enums;

/**
 * 
 * 支付方式(1:华佗币,2:支付宝,3:微信)
 * @author xh
 *
 */
public enum PayType {
	HUATUOCURRENCY(1, "华佗币"), ALIPAY(2, "支付宝"), WECHAT(3, "微信"),CHENGEFU(4,"橙e付");
	
	private Integer index;
	private String name;
    
	 // 构造方法
    private PayType(Integer index, String name) {
    	this.index = index;
        this.name = name;
    }

    // 普通方法
    public static String getName(Integer index) {
        for (PayType c : PayType.values()) {
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

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
