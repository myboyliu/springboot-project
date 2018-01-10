package com.huatuo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.DtTeam;
import com.huatuo.customer.domain.XtHealthCenter;
import com.huatuo.customer.domain.XtHealthCenterPojo;
import com.huatuo.customer.domain.XtHealthSport;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.response.HealthCenterResponse;
import com.huatuo.customer.service.DtTeamService;
import com.huatuo.customer.service.PersonFamilyService;
import com.huatuo.customer.service.UserService;
import com.huatuo.customer.service.XtHealthCenterService;
import com.huatuo.customer.service.XtHealthSportService;

@RequestMapping(value = "healthcenter")
@RestController
public class HealthCenterController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PersonFamilyService personFamilyService;
	
	@Autowired
	private DtTeamService dtTeamService;
	
	@Autowired
	private XtHealthSportService xtHealthSportService;
	
	@Autowired
	private XtHealthCenterService xtHealthCenterService;
		
	private static final int pageSize = 5;
	
	/**
	 * 健康中心首页
	 * @param currentPage
	 * @param userId
	 * @param dateFlag
	 * @return
	 */
	@GetMapping(value = "index")
	public Object getUserInfo(@RequestParam("currentPage") Integer currentPage,
			@RequestParam("userId") Long userId,
			@RequestParam("dateFlag") Integer dateFlag
			)throws Exception{
		//Long userId = 1l;
		HealthCenterResponse healthCenterResponse = new HealthCenterResponse();
		//查询用户跟家庭成员信息
		XtUser user = userService.getUserinfoById(userId);
		List<XtPersonFamily> personFamilyList = personFamilyService.selectFamilyListByUserId(userId);
		
		//查询个人运动信息
		XtHealthSport healthSport = xtHealthSportService.getHealthSportByUserId(userId);

		//查询个人健康状态(最近一次测量选第一条数据)
		List<XtHealthCenter> healthCenterList = xtHealthCenterService.getXtHealthCenterList(userId+"",1l,dateFlag);
		
		//查询推介家庭医生
		Long addressId = 1l;//测试时先设为默认值
		Page<DtTeam> pagelist = dtTeamService.getDtTeamByAddressId(currentPage,addressId,pageSize);		
		healthCenterResponse.setXtUser(user);
		healthCenterResponse.setXtPersonFamilyList(personFamilyList);
	    healthCenterResponse.setHealthSport(healthSport);
		healthCenterResponse.setHealthCenter(healthCenterList);
		healthCenterResponse.setPage(pagelist);
		healthCenterResponse.setCode(BaseResponse.SUCCESS_CODE);
		healthCenterResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);						
		return healthCenterResponse;
	}
	
	/**
	 * 健康中心切换年月日
	 * @param userId
	 * @param dateFlag
	 * @return
	 */
	@GetMapping(value = "getHealthCenterByDate")
	public Object getHealthCenterByDate(@RequestParam("userId") Long userId,
		@RequestParam("dateFlag") Integer dateFlag,
		@RequestParam("type") Long type
			)throws Exception{
		HealthCenterResponse healthCenterResponse = new HealthCenterResponse();
		List<XtHealthCenter> healthCenterList = xtHealthCenterService.getXtHealthCenterList(userId+"",type,dateFlag);			
		//返回日期
		String array[] = Utils.getNowTime().split(" ");
		String measuringDate = array[0].trim(); 
		String[]dateArr=new String[7];
		for(int i=0;i<7;i++){
			dateArr[i] = Utils.getDayOfWeek(measuringDate,i+1).trim();
		}
		
		//返回月各个状态统计数
		if(dateFlag==3){
		 List<XtHealthCenterPojo> xtHealthCenterPojoList = xtHealthCenterService.countInMonth(userId+"", type, 3);			 
		 healthCenterResponse.setXtHealthCenterPojoList(xtHealthCenterPojoList);
		}		
		healthCenterResponse.setHealthCenter(healthCenterList);
		healthCenterResponse.setDateArr(dateArr);
		healthCenterResponse.setCode(BaseResponse.SUCCESS_CODE);
		healthCenterResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);						
		return healthCenterResponse;
	}
}
