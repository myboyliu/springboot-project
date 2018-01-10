package com.huatuo.customer.controller;

import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.XtPregnantMom;
import com.huatuo.customer.domain.XtPregnantMomDetail;
import com.huatuo.customer.query.PregnantMomQuery;
import com.huatuo.customer.request.PregnantMomParam;
import com.huatuo.customer.response.PregnantMomResponse;
import com.huatuo.customer.service.PregnantCheckProjectService;
import com.huatuo.customer.service.XtPregnantMomDetailService;
import com.huatuo.customer.service.XtPregnantMomService;

/**
 * 孕妈模块控制层
 * @author Administrator
 *
 */
@RequestMapping(value = "pregnantMom")
@RestController
public class PregnantMomController {

	@Autowired
	private XtPregnantMomService pregnantMomService;
	
	@Autowired
	private XtPregnantMomDetailService xtPregnantMomDetailService;
	
	@Autowired
	private PregnantCheckProjectService pregnantCheckProjectService;
	
//	@Autowired
//	private XtZdPregnantingStageSuggestionMapper xtZdPregnantingStageSuggestionMapper;
	
//	@Autowired
//	private XtZdPregnantCheckProjectMapper xtZdPregnantCheckProjectMapper;
	
	/**
	 * 查询当前登录用户是否已填写孕妈基本信息和今天是否已编辑过心情
	 * @param request
	 * @return
	 */
	@GetMapping(value = "checkUserTakeNotesBasicInfoAndTodayInfo")
	public Object checkUserTakeNotesBasicInfoAndTodayInfo(HttpServletRequest request){
		PregnantMomResponse pregnantMomResponse = pregnantMomService.checkUserTakeNotesBasicInfoAndTodayInfo(Utils.getUserIdByToken(request));
		pregnantMomResponse.setCode(BaseResponse.SUCCESS_CODE);
		pregnantMomResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return pregnantMomResponse;
	}
	
	/**
	 * 获取孕妈记首页数据
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@GetMapping(value = "selectPregnantMomIndexData")
	public Object selectPregnantMomIndexData(HttpServletRequest request) throws Exception{
		PregnantMomResponse pregnantMomResponse = pregnantMomService.selectPregnantMomIndexData(Utils.getUserIdByToken(request));
		pregnantMomResponse.setCode(BaseResponse.SUCCESS_CODE);
		pregnantMomResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return pregnantMomResponse;
	}
	
	/**
	 * 查询,通过id拿到当前有效的状态信息
	 */
	@GetMapping(value = "selectRecordByUid")
	public Object getOrgsByPage(HttpServletRequest request){
		PregnantMomResponse resp = new PregnantMomResponse();
		
		//拿到登录用户对象id
		String userId = Utils.getUserIdByToken(request);
		//通过id拿到有效的孕妈状态信息
		XtPregnantMom xtPregnantMom = pregnantMomService.selectByUid(userId);
		resp.setPregnantMom(xtPregnantMom);
		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return resp;
	}
	
	/**
	 * 新增或者修改
	 * @throws ParseException 
	 */
	@PostMapping(value = "saveRecord")
	public Object saveRecord(HttpServletRequest request,
			@RequestBody XtPregnantMom pregnantMom) throws ParseException{
		PregnantMomResponse resp = new PregnantMomResponse();
		
		//拿到登录用户对象id
		String userId = Utils.getUserIdByToken(request);
		//放入userId
		pregnantMom.setUserId(Long.parseLong(userId));
		//通过id拿到有效的孕妈状态信息
		XtPregnantMom xtPregnantMom = pregnantMomService.selectByUid(userId);
		//判断新增还是修改
		int saveNum = 0;
		if(xtPregnantMom!=null){
			//修改
			pregnantMom.setPregnantMomId(xtPregnantMom.getPregnantMomId());//主键不更改
			saveNum = pregnantMomService.updateRecord(pregnantMom);
		}else{
			//新增
			saveNum = pregnantMomService.saveRecord(pregnantMom);
		}
		if(saveNum!=0){
			resp.setCode(BaseResponse.SUCCESS_CODE);
			resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		}else{
			resp.setCode(BaseResponse.ERROR_CODE);
			resp.setMessage(BaseResponse.ERROR_MESSAGE);
		}
		return resp;
	}
	
	
	/**
	 * 查询孕期心情记录详情列表
	 * @return
	 * @throws Exception 
	 */
	@PostMapping(value = "selectPregnantMomDetails")
	public Object selectPregnantMomDetails(
			@RequestBody PregnantMomQuery pregnantMomQuery, 
			HttpServletRequest request) throws Exception{
		pregnantMomQuery.setUserId(Utils.getUserIdByToken(request));
		if(StringUtils.isEmpty(pregnantMomQuery.getNowDate())){
			pregnantMomQuery.setNowDate(Utils.getNowDate());
		}
		if(StringUtils.isEmpty(pregnantMomQuery.getSeachDate())){
			pregnantMomQuery.setSeachDate(Utils.getNowDate());
		}
		PregnantMomResponse pregnantMomResponse = xtPregnantMomDetailService.selectregnantMomDetailsByUserId(pregnantMomQuery);
		pregnantMomResponse.setCode(BaseResponse.SUCCESS_CODE);
		pregnantMomResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return pregnantMomResponse;
	}
	
	/**
	 * 孕期检查项目列表返回
	 * @return
	 */
	@GetMapping(value = "selectPregnantCheckProjects")
	public Object selectPregnantCheckProjects(){
		PregnantMomResponse pregnantMomResponse = new PregnantMomResponse();
		pregnantMomResponse.setXtZdPregnantCheckProjects(pregnantCheckProjectService.selectPregnantCheckProjects());
		pregnantMomResponse.setCode(BaseResponse.SUCCESS_CODE);
		pregnantMomResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return pregnantMomResponse;
	}
	
	/**
	 * 保存一条孕妈详情记录
	 * @return
	 * @throws Exception 
	 */
	@PostMapping(value = "insertPregnantMomDetail")
	public Object insertPregnantMomDetail(
			@RequestBody PregnantMomParam pregnantMomParam, 
			HttpServletRequest request) throws Exception{
		PregnantMomResponse pregnantMomResponse = new PregnantMomResponse();
		String userId = Utils.getUserIdByToken(request);
		pregnantMomParam.setUserId(userId);
		XtPregnantMom xtPregnantMom = pregnantMomService.selectByUid(userId);
		XtPregnantMomDetail xtPregnantMomDetail = pregnantMomParam.getXtPregnantMomDetail();
		xtPregnantMomDetail.setPregnantMomId(xtPregnantMom.getPregnantMomId());
		xtPregnantMomDetail.setCreateTime(Utils.getNowTime());
		Integer insertCode = xtPregnantMomDetailService.insertPregnantMomDetail(pregnantMomParam);
		if(insertCode > 0){
			pregnantMomResponse.setCode(BaseResponse.SUCCESS_CODE);
			pregnantMomResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		}else{
			pregnantMomResponse.setCode(BaseResponse.ERROR_CODE);
			pregnantMomResponse.setMessage(BaseResponse.ERROR_MESSAGE);
		}
		return pregnantMomResponse;
	}
	
//	@GetMapping(value = "test")
//	public void test(){
////		常规检查、唐氏症筛检、四维彩超胎儿畸形筛查、妊娠糖尿病筛检、乙型肝炎抗原、骨盆测量、胎位检查、B 超、无创DNA、、查血凝四项、B 超、心电图、胎心监测
//		String[] test1 = {"常规检查","唐氏症筛检", "四维彩超胎儿畸形筛查","妊娠糖尿病筛检","乙型肝炎抗原","骨盆测量","胎位检查","B 超","无创DNA","查血凝四项","心电图","胎心监测"};
//		String[] test2 = {"怀孕1月末-2月初，查HCG及孕酮确定妊娠以及胚胎是否发育良好","满8周后可做B超，确定胎儿是否存活及生长发育是否良好",
//				"11-13周 NT检查 孕中期4周产检一次", "15-21周 可做唐氏筛查或无创DNA,必要时羊水穿刺", "常规产检", "常规产检 24-28周 做四维彩超，糖尿病筛查",
//				"常规产检", "常规产检，复查B超血尿常规，28-37周两周产检一次","常规产检 胎儿监护 复查肝功，胆汁酸，血尿常规及心电图", 
//				"常规产检，37周后每周产检一次，每周一次胎儿监护，两周一次B超，根据情况增加", "预产期 若41周后未临产需入院催产"};
//		for (int i = 0; i < test1.length; i++) {
//			XtZdPregnantCheckProject xtZdPregnantCheckProject = new XtZdPregnantCheckProject();
//			xtZdPregnantCheckProject.setId(UUID.randomUUID().toString());
//			xtZdPregnantCheckProject.setProjectName(test1[i]);
//			xtZdPregnantCheckProjectMapper.insertSelective(xtZdPregnantCheckProject);
//		}
//		for (int i = 0; i < test2.length; i++) {
//			XtZdPregnantingStageSuggestion xtZdPregnantingStageSuggestion = new XtZdPregnantingStageSuggestion();
//			xtZdPregnantingStageSuggestion.setContentGread(i + 1);
//			xtZdPregnantingStageSuggestion.setId(UUID.randomUUID().toString());
//			xtZdPregnantingStageSuggestion.setContent(test2[i]);
//			xtZdPregnantingStageSuggestionMapper.insertSelective(xtZdPregnantingStageSuggestion);
//		}
//	}
	
}
