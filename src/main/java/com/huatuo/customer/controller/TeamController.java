package com.huatuo.customer.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.enums.EnumUtils;
import com.huatuo.customer.base.redis.CommonDao;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.sms.SendMessage;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.DoctorNumTablePojo;
import com.huatuo.customer.domain.DtPackTeamPojo;
import com.huatuo.customer.domain.DtPackagePojo;
import com.huatuo.customer.domain.DtTeamPojo;
import com.huatuo.customer.domain.PayOrder;
import com.huatuo.customer.domain.PaymentInfoPojo;
import com.huatuo.customer.domain.TeamOrderPojo;
import com.huatuo.customer.domain.UserPTIdPojo;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.domain.XtPregnantMom;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.request.VisitForm;
import com.huatuo.customer.response.OrderResponse;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.DoctorService;
import com.huatuo.customer.service.DtPackageService;
import com.huatuo.customer.service.DtTeamService;
import com.huatuo.customer.service.DtUserPackageRecordService;
import com.huatuo.customer.service.PayOrderService;
import com.huatuo.customer.service.PersonService;
import com.huatuo.customer.service.UserService;
import com.huatuo.db.pojo.FlexVisitQueuePojo;

@RestController
@RequestMapping(value = "team")
public class TeamController {
	
	@Autowired
	private DtTeamService dtTeamService;
	
	@Autowired
	private DtPackageService dtPackageService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PayOrderService payOrderService;
	
	@Autowired
	private DtUserPackageRecordService recordService;
	
	@Autowired
	private CommonDao commonDao;
	
	private static final int pageSize = 15;//每页15条数据
	
	private static final Logger logger = LoggerFactory.getLogger(TeamController.class);
	
	/**
	 * 查询团队信息集合
	 * @param provinceCode
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "listTeams")
	public BaseResponse listTeams(HttpServletRequest request,
			@RequestParam(value = "provinceCode") Integer provinceCode,
			@RequestParam(value = "currentPage") Integer currentPage ){
		BaseResponse resp = new BaseResponse();
		//地区为全国时, 设置为null
		provinceCode = provinceCode == 1? null: provinceCode;
		List<DtTeamPojo> list = dtTeamService.listDtTeams(provinceCode, null, null, currentPage, pageSize);
		if(list != null && list.size() > 0){
			resp.setObject(list);
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.SUCCESS_MESSAGE);
		}else{
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.NULL_MESSAGE);
		}
		return resp;
	}
	
	/**
	 * 根据团队id获取团队信息
	 * @param request
	 * @param dtTeamId
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "getTeam")
	public BaseResponse getTeam(HttpServletRequest request, String dtTeamId){
		BaseResponse resp = new BaseResponse();
		DtTeamPojo pojo = dtTeamService.getDtTeamByDtTeamId(dtTeamId);
		if(pojo != null){
			resp.setObject(pojo);
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.SUCCESS_MESSAGE);
		}else{
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.NULL_MESSAGE);
		}
		return resp;
	}
	
	/**
	 * 根据套餐id查询套餐子项信息
	 * @param request
	 * @param teamPackageId
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "getPackage")
	public BaseResponse getPackage(HttpServletRequest request, String teamPackageId){
		BaseResponse resp = new BaseResponse();
		DtPackagePojo pojo = dtPackageService.getDtPackageByTeamPackageId(teamPackageId);
		if(pojo != null){
			resp.setObject(pojo);
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.SUCCESS_MESSAGE);
		}else{
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.NULL_MESSAGE);
		}
		return resp;
	}
	
	/**
	 * 根据用户id查询我的医生团队
	 * @param request
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "getMyDoctorTeam")
	public BaseResponse getMyDoctorTeam(HttpServletRequest request){
		BaseResponse resp = new BaseResponse();
		//获取用户id
		String userId = Utils.getUserIdByToken(request);
		
		List<DtTeamPojo> pojo = dtTeamService.getMyDoctorTeam(userId);
		if(pojo != null && pojo.size() > 0){
			resp.setObject(pojo);
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.SUCCESS_MESSAGE);
		}else{
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.NULL_MESSAGE);
		}
		return resp;
	}
	
	/**
	 * 根据团队id获取团队成员信息
	 * @param request
	 * @param dtTeamId
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "getTeamDoctrors")
	public BaseResponse getTeamDoctrors(HttpServletRequest request, String dtTeamId){
		BaseResponse resp = new BaseResponse();
		
		//获取用户id
		String userId = Utils.getUserIdByToken(request);
		
		List<Doctor> pojo = dtTeamService.getTeamDoctrors(dtTeamId, userId);
		List<Doctor> list = new ArrayList<Doctor>();
		
		DtTeamPojo teamPojo = dtTeamService.getDtTeamByDtTeamId(dtTeamId);
		if(pojo != null && pojo.size() > 0 && teamPojo != null){
			//将负责人排在第一位
			for (Doctor doctor : pojo) {
				
//				logger.warn("getTeamDoctrors: doctor的值:	" + doctor.getName());
				
				if(String.valueOf(doctor.getId()).equals(teamPojo.getAdminDoctorId())){
					list.add(0, doctor);
				}else{
					list.add(doctor);
				}
			}
			resp.setObject(list);
			resp.setObject2(teamPojo.getTeamName());
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.SUCCESS_MESSAGE);
		}else{
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.NULL_MESSAGE);
		}
		return resp;
	}
	
	/**
	 * 保存签约信息到redis
	 * @param request
	 * @param dtTeamId
	 * @param userId
	 * @param teamPackageId
	 * @param num
	 * @param orderNo
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "saveSignToRedis")
	public BaseResponse saveSignToRedis(HttpServletRequest request, String dtTeamId, 
										String teamPackageId, Integer num, String orderNo) throws ParseException{
		BaseResponse resp = new BaseResponse();
		
		//获取用户id
		String userId = Utils.getUserIdByToken(request);
		logger.warn("签约信息暂存redis: orderNo = " + orderNo );
		DtTeamPojo teamPojo = dtTeamService.getDtTeamByDtTeamId(dtTeamId);
		
		if(!StringUtils.isEmpty(orderNo) && teamPojo != null){
			UserPTIdPojo pojo = new UserPTIdPojo();
			pojo.setDtTeamId(dtTeamId);
			pojo.setNum(num);
			pojo.setTeamPackageId(teamPackageId);
			pojo.setUserId(userId);
			//存入redis
			commonDao.setUserPTIdPojo(orderNo, pojo);
			
			//判断是否为0元订单
			PayOrder payOrder = payOrderService.getPayOrderByOrderNo(orderNo);
			if(payOrder != null && payOrder.getPrice().compareTo(new BigDecimal(0)) == 0){
				//保存签约信息
				int row = dtTeamService.saveSign(orderNo);
				if(row <= 0){
					resp.setCode(resp.ERROR_CODE);
					resp.setMessage(resp.ERROR_MESSAGE);
				}
				logger.warn("生成团队契约完成: 0元家医订单: = " + (row > 0? "成功" : "失败"));
			}
			
			//填充返回值
			TeamOrderPojo teamOrderPojo = new TeamOrderPojo();
			teamOrderPojo.setDtTeamId(dtTeamId);
			teamOrderPojo.setTeamName(teamPojo.getTeamName());
			teamOrderPojo.setNum(num);
			
			resp.setObject(teamOrderPojo);
			resp.setCode(resp.SUCCESS_CODE);
			resp.setMessage(resp.SUCCESS_MESSAGE);
		}else{
			resp.setCode(resp.ERROR_CODE);
			resp.setMessage(resp.ERROR_MESSAGE);
		}
		return resp;
	}
	
	/**
	 * 保存签约信息
	 * @param request
	 * @param orderNo
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "saveSign")
	public BaseResponse saveSign(HttpServletRequest request, String orderNo) throws ParseException{
		
		BaseResponse resp = new BaseResponse();
		resp.setCode(resp.ERROR_CODE);
		resp.setMessage(resp.ERROR_MESSAGE);
		
			logger.warn("家庭已审支付完成, 生成团队契约开始");
			//从redis取出数据
				//保存签约信息
				int row = dtTeamService.saveSign(orderNo);
				if(row > 0){
					//成功后清redis
					commonDao.deleteUserPTIdPojo(orderNo);
					resp.setCode(resp.SUCCESS_CODE);
					resp.setMessage(resp.SUCCESS_MESSAGE);
					logger.warn("生成团队契约完成");
				}
		return resp;
	}
	
	/**
	 * 查询用户地址
	 * @param request
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "getAddress")
	public BaseResponse getAddress(HttpServletRequest request){
		BaseResponse resp = new BaseResponse();
		
		//获取用户id
		String userId = Utils.getUserIdByToken(request);
		
		resp.setCode(resp.SUCCESS_CODE);
		resp.setMessage(resp.NULL_MESSAGE);
		
		XtPerson xtPerson = personService.getPersonByUserId(userId);
		if(xtPerson != null){
			XtAddress xtAddress = addressService.getAddressInfo(xtPerson.getAddressId());
			if(xtAddress != null){
				resp.setObject(xtAddress);
				resp.setMessage(resp.SUCCESS_MESSAGE);
			}
		}
		return resp;
	}
	
	/**
	 * 给离线医生发送短信
	 * @param request
	 * @param doctorId
	 * @return
	 */
	@SuppressWarnings("static-access")
	@GetMapping(value = "sendMobile")
	public BaseResponse sendMobile(HttpServletRequest request, Long doctorId){
		BaseResponse resp = new BaseResponse();
		resp.setCode(resp.ERROR_CODE);
		resp.setMessage(resp.ERROR_MESSAGE);
		FlexVisitQueuePojo queue = (FlexVisitQueuePojo) commonDao
				.getFlexVisitQueuePojo(doctorId);
		if (queue == null || !queue.isOnline()) {
			Doctor doctor = doctorService.selectDoctorById(doctorId);
			XtUser xtUser = userService.getUserinfoById(doctor.getUserId());
			// 【华佗快线】李果医生您好，您有一个家庭医生签约对象需要您的帮助，请做好接诊准备
			String content = "【华佗快线】" + doctor.getName()
					+ "医生您好，您有一个家庭医生签约对象需要您的帮助，请做好接诊准备。";

			String reContent = SendMessage.sendMobile(xtUser.getMobile(),
					content);

			// 获得医生信息
			if (!StringUtils.isEmpty(reContent)) {
				resp.setCode(resp.SUCCESS_CODE);
				resp.setMessage(resp.SUCCESS_MESSAGE);
			}
		}
		return resp;
	}
	
	/**
	 * 进入视频问诊
	 * @param request
	 * @param visitId
	 * @return
	 */
	@GetMapping(value = "askADoctor")
	public OrderResponse askADoctor(HttpServletRequest request, String dtTeamId, 
						String memberId, String doctorId){
//		String dtTeamId = "1";
//		String userId = "1";
//		String memberId = "1";
//		String doctorId = "1";
		OrderResponse resp = new OrderResponse();
		
		// 获取用户id
		String userId = Utils.getUserIdByToken(request);
		resp = dtTeamService.askADoctor(dtTeamId, userId, memberId, doctorId);

		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return resp;
	}
	
	/**
	 * 用户的家庭医生个数
	 * @param request
	 * @param userId
	 * @return
	 */
	@GetMapping(value = "hasDoctorTeam")
	public BaseResponse hasDoctorTeam(HttpServletRequest request){
		BaseResponse resp = new BaseResponse();
		
		// 获取用户id
		String userId = Utils.getUserIdByToken(request);

		int count = dtTeamService.hasDoctorTeam(userId);
		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		resp.setObject(count);
		return resp;
	}
	
	/**
	 * 家庭医生业务（视频或图文剩余次数判断）
	 * @param request
	 * @param dtTeamId
	 * @param serviceType
	 * @return
	 */
	@GetMapping(value = "residueDegree")
	public BaseResponse residueDegree(HttpServletRequest request, String dtTeamId, Integer serviceType){
		BaseResponse resp = new BaseResponse();
		
		// 获取用户id
		String userId = Utils.getUserIdByToken(request);
		
		//改变签约信息过时与否和订单的状态
		dtTeamService.updateToDelflag(userId, dtTeamId, null);
		
		//视频或图文问诊次数
		int num = recordService.residueDegree(userId, dtTeamId, serviceType);
		resp.setObject(num);
		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return resp;
	}
	
	/**
	 * 孕妈套餐信息
	 * @param request
	 * @param packageName
	 * @param currentPage
	 * @return
	 */
	@GetMapping(value = "pmpInfo")
	public BaseResponse pmpInfo(HttpServletRequest request, String packageName, Integer currentPage){
		BaseResponse resp = new BaseResponse();
		
		//改变签约信息过时与否和订单的状态
		List<DtPackTeamPojo> packTeamPojo = dtTeamService.queryPmpInfo(packageName, EnumUtils.DtPackage_package_kind_1.getIndex(), currentPage, pageSize);
		
		resp.setObject(packTeamPojo);
		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return resp;
	}
	
	/**
	 * 医生号表查询
	 * @param request
	 * @param doctorId
	 * @return
	 */
	@PostMapping(value = "doctorNumTable")
	public BaseResponse doctorNumTable(HttpServletRequest request, 
			@RequestBody VisitForm visitForm){
		BaseResponse resp = new BaseResponse();
		
		String dtTeamId = visitForm.getTeamPackageId();
		if(dtTeamId ==null){
			resp.setCode(BaseResponse.SUCCESS_CODE);
			resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
			return resp;
		}
		//医生号表查询
		List<DoctorNumTablePojo> numTablePojos = dtTeamService.queryDoctorNumTable(dtTeamId);
		
		resp.setObject(numTablePojos);
		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return resp;
	}
	
	/**
	 * 孕妈套餐付款信息
	 * @param request
	 * @param orderNo
	 * @return
	 */
	@GetMapping(value = "paymentInfo")
	public BaseResponse paymentInfo(HttpServletRequest request, String orderNo){
		BaseResponse resp = new BaseResponse();
		
		//孕妈套餐付款信息
		PaymentInfoPojo infoPojo = dtTeamService.queryPaymentInfo(orderNo);
		
		resp.setObject(infoPojo);
		resp.setCode(BaseResponse.SUCCESS_CODE);
		resp.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return resp;
	}
	
}
