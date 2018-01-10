package com.huatuo.customer.base.enums;

/**
 * 教学职称 1.助教 2.讲师 3.副教授 4 教授
 * @author ys
 *
 */
public enum TitlesTeachType {
	
	/**
	 * 助教
	 */
	ASSISTANT			(1, "助教"), 
	/**
	 * 讲师
	 */
	LECTURER			(2, "讲师"), 
	/**
	 * 副教授
	 */
	ASSOCIATE_PROFESSOR	(3, "副教授"), 
	/**
	 * 教授
	 */
	PROFESSOR			(4, "教授")
	;
	
	private Integer index;
	private String name;
    
	 // 构造方法
    private TitlesTeachType(Integer index, String name) {
    	this.index = index;
        this.name = name;
    }

    // 普通方法
    public static String getName(Integer index) {
        for (TitlesTeachType c : TitlesTeachType.values()) {
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
