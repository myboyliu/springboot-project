package com.huatuo.customer.base.enums;


/**
 * 各种枚举
 * 			
 * @author 
 * 
 */
public enum EnumUtilsTow {
	
	/**==================例子==================**/
//	/**
//	 * theClassName值为实体类的SimpleName(如: SmCliAreaCover.class.getSimpleName())
//	 */
//	//诊所医疗能力覆盖区域表(数据类型(0 日, 1 月, 2 年))
//	SmCliAreaCover_areaFlag_0(0, "日", "SmCliAreaCover"),
//	SmCliAreaCover_areaFlag_1(1, "月", "SmCliAreaCover"),
//	SmCliAreaCover_areaFlag_2(2, "年", "SmCliAreaCover");
	/**==================例子==================**/
	
	//有效期: 0无限，1月，2年(DtPackTeamPojo)
	DtPackage_package_cycle_0(0, "无限", "DtPackTeamPojo"),
	DtPackage_package_cycle_1(1, "月", "DtPackTeamPojo"),
	DtPackage_package_cycle_2(2, "年", "DtPackTeamPojo"),
	
	//套餐服务类型: 1.按时间段; 2.按次
	DtService_charging_type_1(1, "按时间段", "DtService"),
	DtService_charging_type_2(2, "按次", "DtService");

	private Integer index;
	private String name;
	private String theClassName;
	
	private EnumUtilsTow(Integer index, String name, String theClassName) {
		this.index = index;
		this.name = name;
		this.theClassName = theClassName;
	}
	
	public static String getName(Integer index, String theClassName) {
        for (EnumUtilsTow c : EnumUtilsTow.values()) {
            if (c.getIndex() == index && c.getTheClassName().equals(theClassName)) {
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

	public String getTheClassName() {
		return theClassName;
	}

	public void setTheClassName(String theClassName) {
		this.theClassName = theClassName;
	}


}
