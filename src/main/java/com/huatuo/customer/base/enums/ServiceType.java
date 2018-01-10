package com.huatuo.customer.base.enums;

/**
 * 服务类型
 * 
 * @author lshaci
 * @since 2016-5-18
 * @version v2016-5-18
 */
public enum ServiceType {
	
	/**
	 * 视频问诊
	 */
	VIDEOINTERROGATION		(0, "视频问诊"),
	/**
	 * 图文咨询
	 */
	PICTURECONSULTING		(1, "图文咨询"),
	/**
	 * 上门服务
	 */
	HOMESERVICE				(2, "上门服务"),
	/**
	 * 家庭医生
	 */
	FAMILYDOCTOR			(3, "家庭医生"),
	/**
	 * 免费咨询
	 */
	CONSULTING          (4, "免费咨询"),
	/**
	 * 快速提问
	 */
	QKASKING          (7, "快速提问"),
	/**
	 * 处方提取
	 */
	PRESCRIPTIONEXTRACTING(8, "处方提取");
	
	private Integer index;	// 索引
	private String name;	// 名称
	
	/**
	 * 私有化构造方法
	 * 
	 * @param index	索引
	 * @param name	名称
	 */
	private ServiceType(Integer index, String name) {
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
		for (ServiceType o : ServiceType.values()) {
			if(o.getIndex().equals(index)){
				return o.getName();
			}
		}
		return null;
	}
	
	/**
	 * 根据枚举的名称，获取索引
	 * 
	 * @param name	枚举名称
	 * @return		返回索引对应的索引(index)
	 */
	public static Integer getIndex(String name){
		for (ServiceType c : ServiceType.values()) {
			if(c.getName().equals(name)){
				return c.index;
			}
		}
		return null;
	}

}
