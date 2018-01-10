package com.huatuo.customer.base.enums;

public enum FileType {
	V(1, "视频门诊"),  C(2, "图文咨询"), H(3, "远程会诊"), D(4, "资格证书、用户头像"), I(5, "即时咨询"), T(6, "双向转诊"), F(7, "意见反馈"), FC(8, "免费咨询"), PM(9, "孕妈记录");
	
	private int index;
	private String name;
    
	 // 构造方法
    private FileType(int index, String name) {
    	this.index = index;
        this.name = name;
    }

    // 普通方法
    public static String getName(int index) {
        for (FileType c : FileType.values()) {
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
