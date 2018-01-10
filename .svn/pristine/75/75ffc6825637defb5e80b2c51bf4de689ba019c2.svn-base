package com.huatuo.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.query.DoctorQuery;
import com.huatuo.customer.response.DoctorResponse;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.DoctorService;
import com.huatuo.customer.service.PersonService;
import com.huatuo.register.domain.response.LoginDataResponse;


@RequestMapping(value = "doctor")
@RestController
public class DcotorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private AddressService addressService;
	
	private static final int pageSize = 15;
	
//	private static final Logger logger = LoggerFactory.getLogger(MzVisitController.class);
	
	/**
	 * 找医生点开首页
	 * @return
	 */
	@GetMapping(value="findDoctor")
	public Object findAllDoctor(
			@RequestParam(value="currentPage") Integer currentPage,
			HttpServletRequest request) throws Exception{//首页只传当前页
		Integer provinceCode = 1 ; //省份编号
//		Integer cityCode = 0 ; //城市编号
//		Integer countyCode = 0; //县/区编号
//		Integer roadCode = 0;
		Page<Doctor> page = null;
		DoctorResponse doctorResonse = new DoctorResponse();
	    //先获取登陆用户Id
		LoginDataResponse loginDataResponse = Utils.getLoginUserInfo(request);
//		LoginDataResponse loginDataResponse = loginService.getUserInfoByLogin(token);
		if( loginDataResponse!=null){//登陆用户不为空		
			String userId =	loginDataResponse.getXtUser().getUserId();
			XtPerson person = personService.getPersonByUserId(userId);			
			XtAddress address =addressService.getAddressInfo(person.getAddressId());
			if(address!=null){
				provinceCode = address.getProvinceCode();//目前只精确到登录用户注册的省份
//				cityCode = address.getCityCode();	
				if(provinceCode!=null){
					//四个直辖市
					//if(provinceCode==2 || provinceCode==345 || provinceCode==31946 ||provinceCode==10692){
						 page = doctorService.getDoctorInfo(provinceCode, null, null, null, currentPage, pageSize,null,null,null,null);				
					/*}else{
						 page = doctorService.getDoctorInfo(provinceCode, cityCode, 0, 0, currentPage, pageSize,null,null,null,null);				
					}*/
				}else{//登录用户地址不全默认查全国
					page = doctorService.getDoctorInfo(1, 0, 0, 0, currentPage, pageSize,null,null,null,null);
				}
				doctorResonse.setXtAddress(address);
				doctorResonse.setPage(page);
				doctorResonse.setCode(BaseResponse.SUCCESS_CODE);
				doctorResonse.setMessage(BaseResponse.SUCCESS_MESSAGE);
			}			
		}else{//为空，默认查全国					
			page = doctorService.getDoctorInfo(1, 0, 0, 0, currentPage, pageSize,null,null,null,null);			
			doctorResonse.setPage(page);
			doctorResonse.setCode(BaseResponse.SUCCESS_CODE);
			doctorResonse.setMessage(BaseResponse.SUCCESS_MESSAGE);
            return doctorResonse;
		}
		return doctorResonse;
	}

	
	/**
	 * 条件查询
	 * @param provinceCode
	 * @param cityCode
	 * @param countyCode
	 * @param roadCode
	 * @param currentPage 当前页
	 * @param specialtyId 科室id
	 * @param orgId 医院id
	 * @param option 1:在线 2：可预约
	 * @param queuingNumber 1：由多到少 2：由少到多
	 * @param model
	 * @return	
	 */	
	@PostMapping(value="findConditionDoctor")
	public Object findConditionDoctor(@RequestBody DoctorQuery doctoryQuery)throws Exception{
		DoctorResponse doctorResonse = new DoctorResponse();			
		Page<Doctor> page = doctorService.getDoctorInfo(doctoryQuery.getProvinceCode(),doctoryQuery.getCityCode(), 
		doctoryQuery.getCountryCode(), doctoryQuery.getRoadCode(),doctoryQuery.getCurrentPage(), pageSize,
		doctoryQuery.getOrgId(),doctoryQuery.getSpecialtyId(),doctoryQuery.getOption(),doctoryQuery.getQueuingNumber());
		doctorResonse.setPage(page);
		doctorResonse.setCode(BaseResponse.SUCCESS_CODE);
		doctorResonse.setMessage(BaseResponse.SUCCESS_MESSAGE);		
		return doctorResonse;
	}
	
	
	/**
	 * 查询在线医生
	 * @param provinceCode
	 * @param cityCode
	 * @param countyCode
	 * @param roadCode
	 * @param specialtyId
	 * @param option
	 * 
	 * @param queuingNumber
	 * @param model
	 * @return
	 */	
	@PostMapping(value="findOnlineDoctor")
	public Object getOnlineDoctorInfo(@RequestBody DoctorQuery doctoryQuery)throws Exception{
		 DoctorResponse doctorResonse = new DoctorResponse();		
		 Page<Doctor> doctorOnLineList = doctorService.getOnlineDoctorInfo(doctoryQuery.getProvinceCode(),doctoryQuery.getCityCode(), 
					doctoryQuery.getCountryCode(), doctoryQuery.getRoadCode(),doctoryQuery.getCurrentPage(), pageSize,
					doctoryQuery.getOrgId(),doctoryQuery.getSpecialtyId(),doctoryQuery.getOption(),doctoryQuery.getQueuingNumber());	
		 doctorResonse.setPage(doctorOnLineList);
		 doctorResonse.setCode(BaseResponse.SUCCESS_CODE);
		 doctorResonse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		 return doctorResonse;		
	}
	
	
	/**
	 * 查询可预约医生
	 * @param provinceCode
	 * @param cityCode
	 * @param countyCode
	 * @param roadCode
	 * @param specialtyId
	 * @param option
	 * @param queuingNumber
	 * @return
	 */	
	@PostMapping(value="findReservationDoctor")
	public Object getReservationDoctorInfo(@RequestBody DoctorQuery doctoryQuery)throws Exception{
		 DoctorResponse doctorResonse = new DoctorResponse();
		 Page<Doctor> doctorReservationList = doctorService.getReservationDoctorInfo(doctoryQuery.getProvinceCode(),doctoryQuery.getCityCode(), 
					doctoryQuery.getCountryCode(), doctoryQuery.getRoadCode(),doctoryQuery.getCurrentPage(), pageSize,
					doctoryQuery.getOrgId(),doctoryQuery.getSpecialtyId(),doctoryQuery.getOption(),doctoryQuery.getQueuingNumber());	
		 doctorResonse.setPage(doctorReservationList);
		 doctorResonse.setCode(BaseResponse.SUCCESS_CODE);
		 doctorResonse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		 return doctorResonse;		
	}

	/**
	 * 查询医生详情
	 * @return
	 */
	@GetMapping(value="findDoctorDetail")
	public Object getDoctorDetail(@RequestParam("doctorId") Long doctorId)throws Exception{
		DoctorResponse doctorResonse = new DoctorResponse();			
		Doctor doctorDetail = doctorService.getDoctorDetail(doctorId);
		doctorResonse.setDoctor(doctorDetail);
		doctorResonse.setCode(BaseResponse.SUCCESS_CODE);
		doctorResonse.setMessage(BaseResponse.SUCCESS_MESSAGE);	
		return doctorResonse;
	}
	
}
