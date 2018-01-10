package com.huatuo.customer.base.enums;

/**
 * 临床职称 1.住院医师 2.主治医师 3.副主任医师 4 主任医师 5.初级职称 6.中级职称 7.高级职称
 * @author ys
 *
 */
public enum TitlesClinicalType {
	/**
	 * 住院医师
	 */
	RESIDENT						(1, "住院医师"), 
	/**
	 * 主治医师
	 */
	ATTENDING_DOCTOR				(2, "主治医师"), 
	/**
	 * 副主任医师
	 */
	ASSOCIATE_CHIEF_PHYSICIAN		(3, "副主任医师"), 
	/**
	 * 主任医师
	 */
	CHIEF_PHYSICIAN					(4, "主任医师"),
	/**
	 * 初级职称
	 */
	PRIMARY_TITLE					(5, "初级职称"),
	/**
	 * 中级职称
	 */
	INTERMEDIATE					(6, "中级职称"),
	/**
	 * 高级职称
	 */
	SENIOR							(7, "高级职称");
	
	private Integer index;
	private String name;
    
	 // 构造方法
    private TitlesClinicalType(Integer index, String name) {
    	this.index = index;
        this.name = name;
    }

    // 普通方法
    public static String getName(Integer index) {
        for (TitlesClinicalType c : TitlesClinicalType.values()) {
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
