package com.huatuo.customer.base.enums;


/**
 * 各种枚举
 * 			
 * @author 
 * 
 */
public enum EnumUtils {
	
	/**==================例子==================**/
//	/**
//	 * theClassName值为实体类的SimpleName(如: SmCliAreaCover.class.getSimpleName())
//	 */
//	//诊所医疗能力覆盖区域表(数据类型(0 日, 1 月, 2 年))
//	SmCliAreaCover_areaFlag_0(0, "日", "SmCliAreaCover"),
//	SmCliAreaCover_areaFlag_1(1, "月", "SmCliAreaCover"),
//	SmCliAreaCover_areaFlag_2(2, "年", "SmCliAreaCover");
	/**==================例子==================**/
	
	//消息状态: 1.未读消息, 2.已读消息, 3.未发送消息(XtMessageCenter)
	XtMessageCenter_state_1(1, "未读消息", "XtMessageCenter"),
	XtMessageCenter_state_2(2, "已读消息", "XtMessageCenter"),
	XtMessageCenter_state_3(3, "未发送消息", "XtMessageCenter"),
	
	//服务类型: 0、视频问诊, 1、图文资讯, 2、上门咨询, 99、其他 (DtService)
	DtService_service_type_0(0, "视频问诊", "DtService"),
	DtService_service_type_1(1, "图文资讯", "DtService"),
	DtService_service_type_2(2, "上门咨询", "DtService"),
	DtService_service_type_99(99, "其他", "DtService"),
	
	//套餐类型: 0.服务套餐; 1. 叠加套餐 (DtPackage) (XtMessageCenter)
	DtPackage_package_type_0(0, "服务套餐", "DtPackage"),
	DtPackage_package_type_1(1, "叠加套餐", "DtPackage"),
	
	//套餐种类: 0.普通套餐, 1.孕妈套餐(DtPackTeamPojo)
	DtPackage_package_kind_0(0, "普通套餐", "DtPackTeamPojo"),
	DtPackage_package_kind_1(1, "孕妈套餐", "DtPackTeamPojo"),
	
	//是否过期: 0.否, 1.是	(DtUserPackage) (DtUserTeam)
	DtUserPackage_del_flag_0(0, "否", "DtUserPackage"),
	DtUserPackage_del_flag_1(1, "是", "DtUserPackage"),
	
	//服务状态:0 服务中 1已结束(DtUserPackageRecord)
	DtUserPackageRecord_state_0(0, "服务中", "DtUserPackageRecord"),
	DtUserPackageRecord_state_1(1, "已结束", "DtUserPackageRecord");

	private Integer index;
	private String name;
	private String theClassName;
	
	private EnumUtils(Integer index, String name, String theClassName) {
		this.index = index;
		this.name = name;
		this.theClassName = theClassName;
	}
	
	public static String getName(Integer index, String theClassName) {
        for (EnumUtils c : EnumUtils.values()) {
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
