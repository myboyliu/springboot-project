package com.huatuo.customer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.XtHealthCenter;
import com.huatuo.customer.domain.XtHealthCenterHistory;
import com.huatuo.customer.domain.XtHealthSport;
import com.huatuo.customer.domain.XtHealthStatus;
import com.huatuo.customer.query.HealthCenterQuery;
import com.huatuo.customer.query.HealthStatusQuery;
import com.huatuo.customer.response.ResultResponse;
import com.huatuo.customer.service.XtHealthCenterService;
import com.huatuo.customer.service.XtHealthSportService;
import com.huatuo.customer.service.XtHealthStatusService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 健康中心控制层
 * 
 * @author lshaci
 * @createTime 2016年10月31日 上午11:11:10
 * @modifyTime 2016年10月31日 上午11:11:10
 */
@RestController
@RequestMapping("health")
public class HealthController {

	@Autowired
	private XtHealthStatusService xtHealthStatusService;

	@Autowired
	private XtHealthCenterService xtHealthCenterService;
	
	@Autowired
	private XtHealthSportService xtHealthSportService;
	
	@ApiOperation(value = "查询当天血糖测量过的时间")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "measuringDate", value = "测量日期(yyyy-MM-dd)", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "familyId", value = "家庭成员测量人:家庭成员id", paramType = "query", required = false, dataType = "string")
	})
	@GetMapping(value = "getBsRecord")
	public ResultResponse getBsRecord(HttpServletRequest request, HealthCenterQuery healthCenterQuery) {
		healthCenterQuery.setUserId(Utils.getUserIdByToken(request));
		healthCenterQuery.setType(4);
		List<String> measuringTimes = xtHealthCenterService.getBsRecord(healthCenterQuery);
		if (measuringTimes.size() > 0) {
			return new ResultResponse(measuringTimes);
		}
		return new ResultResponse(false, "无测量数据");
	}
	
	@ApiOperation(value = "获取健康状态信息")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "type", value = "测量项目:1.血压;2.心率;3.体温;4.血糖", paramType = "query", required = true, dataType = "int", allowableValues = "1, 2, 3, 4"),
		@ApiImplicitParam(name = "value", value = "测量的值(血压为收缩压)", paramType = "query", required = true, dataType = "double"),
		@ApiImplicitParam(name = "bpValue", value = "测量血压时舒张压的测量值", paramType = "query", required = false, dataType = "double"),
		@ApiImplicitParam(name = "measuringTime", value = "测量时间(HH:mm 空腹、午餐前等)", paramType = "query", required = true, dataType = "string")
	})
	@GetMapping(value = "getHealthStatus")
	public ResultResponse getHealthStatus(HealthStatusQuery healthStatusQuery) {
		XtHealthStatus healthStatus = xtHealthStatusService.getHealthStatus(healthStatusQuery);
		if (healthStatus != null) {
			return new ResultResponse(healthStatus);
		}
		return new ResultResponse(false, "无对应数据");
	}
	
	@ApiOperation(value = "保存健康信息")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "type", value = "测量项目:1.血压;2.心率;3.体温;4.血糖", paramType = "query", required = true, dataType = "int", allowableValues = "1, 2, 3, 4"),
		@ApiImplicitParam(name = "measuringDate", value = "测量日期:yyyy-MM-dd", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "measuringTime", value = "测量时间(HH:mm 空腹、午餐前等)", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "measuringValue", value = "测量的值(血压为收缩压)", paramType = "query", required = true, dataType = "double"),
		@ApiImplicitParam(name = "diastolicPressure", value = "血压为舒张压的测量值", paramType = "query", required = false, dataType = "double"),
		@ApiImplicitParam(name = "familyId", value = "家庭成员测量人:家庭成员id", paramType = "query", required = false, dataType = "string"),
		@ApiImplicitParam(name = "healthStatusId", value = "健康状态:状态id", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "discomfort", value = "不适症状:字符串类型，多个使用英文逗号分割", paramType = "query", required = false, dataType = "string"),
		@ApiImplicitParam(name = "mark", value = "备注", paramType = "query", required = false, dataType = "string"),
		@ApiImplicitParam(name = "specialCase", value = "测量血糖时的特殊情况", paramType = "query", required = false, dataType = "string"),
		@ApiImplicitParam(name = "xinlv", value = "测量血压时的心率", paramType = "query", required = false, dataType = "double")
	})
	@PostMapping(value = "saveHealth")
	public ResultResponse saveHealth(HttpServletRequest request, XtHealthCenter xtHealthCenter) {
		xtHealthCenter.setUserId(Utils.getUserIdByToken(request));
		int flag = xtHealthCenterService.saveHealth(xtHealthCenter);
		if(flag==1){
			return new ResultResponse("保存成功");
		}
		return new ResultResponse(false, "保存失败");
	}
	
	@ApiOperation(value = "获取历史记录")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "type", value = "测量项目:1.血压;2.心率;3.体温;4.血糖", paramType = "query", required = true, dataType = "int", allowableValues = "1, 2, 3, 4"),
		@ApiImplicitParam(name = "familyId", value = "家庭成员id", paramType = "query", required = false, dataType = "string"),
		@ApiImplicitParam(name = "currentPage", value = "页码", paramType = "query", required = true, dataType = "int", defaultValue = "1"),
		@ApiImplicitParam(name = "starttime", value = "开始时间(yyyy-MM-dd)", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "endtime", value = "结束时间(yyyy-MM-dd)", paramType = "query", required = true, dataType = "string"),
	})
	@GetMapping(value = "getHistory")
	public ResultResponse getHistory(HttpServletRequest request, HealthCenterQuery healthCenterQuery) {
		healthCenterQuery.setUserId(Utils.getUserIdByToken(request));
		Page<XtHealthCenterHistory> data = xtHealthCenterService.getHistory(healthCenterQuery);
		if (data != null) {
			return new ResultResponse(data);
		}
		return new ResultResponse(false, "无历史记录");
	}
	
	@ApiOperation(value = "获取历史记录中的测量次数")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "type", value = "测量项目:1.血压;2.心率;3.体温;4.血糖", paramType = "query", required = true, dataType = "int", allowableValues = "1, 2, 3, 4"),
		@ApiImplicitParam(name = "familyId", value = "家庭成员id", paramType = "query", required = false, dataType = "string"),
		@ApiImplicitParam(name = "starttime", value = "开始时间(yyyy-MM-dd)", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "endtime", value = "结束时间(yyyy-MM-dd)", paramType = "query", required = true, dataType = "string"),
	})
	@GetMapping(value = "getStatistics")
	public ResultResponse getStatistics(HttpServletRequest request, HealthCenterQuery healthCenterQuery) {
		healthCenterQuery.setUserId(Utils.getUserIdByToken(request));
		List<?> data = xtHealthCenterService.getStatistics(healthCenterQuery);
		return new ResultResponse(data);
	}
	
	@ApiOperation(value = "保存健康运动信息")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "type", value = "步数", paramType = "query", required = true, dataType = "string"),
		@ApiImplicitParam(name = "distance", value = "距离", paramType = "query", required = true, dataType = "double")
	})
	@PostMapping(value = "saveSport")
	public ResultResponse saveSport(HttpServletRequest request, XtHealthSport xtHealthSport) {
		xtHealthSport.setUserId(Utils.getUserIdByToken(request));
		int flag = xtHealthSportService.save(xtHealthSport);
		if(flag==1){
			return new ResultResponse("保存成功");
		}
		return new ResultResponse(false, "保存失败");
	}

}
