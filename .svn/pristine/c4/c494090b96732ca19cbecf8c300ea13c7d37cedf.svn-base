package com.huatuo.customer.controller;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.enums.MessageCenterState;
import com.huatuo.customer.base.enums.MessageCenterType;
import com.huatuo.customer.base.enums.TitlesClinicalType;
import com.huatuo.customer.base.enums.TitlesTeachType;
import com.huatuo.customer.base.redis.RedisSupport;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.XtMessageCenter;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.DoctorService;
import com.huatuo.customer.service.LoginService;
import com.huatuo.customer.service.MzVisitService;
import com.huatuo.customer.service.PatientService;
import com.huatuo.customer.service.PersonService;
import com.huatuo.register.domain.XtPerson;
import com.huatuo.register.domain.XtUser;
import com.huatuo.register.domain.response.LoginDataResponse;
import com.huatuo.register.domain.response.SyncResponse;

/**
 * 登录后信息保存
 * 以后与register项目不用同一个redis的时候再对登录信息进行封装扩展
 * @author master
 */
@RequestMapping(value = "index")
@RestController
public class IndexController {
	
	@Autowired
	private RedisSupport redisSupport;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private MzVisitService mzVisitService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	
//	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	/**
	 *登陆后获取登录用户信息
	 * @return
	 * @throws Exception 
	 */
	@PostMapping(value = "setUserInfoByLogin")
	public Object setUserInfoByLogin(String jsonStr) throws Exception{
			SyncResponse syncResponse = Utils.jsonStrToObject(jsonStr, SyncResponse.class);
			Serializable serializable = redisSupport.get(syncResponse.getToken());
			LoginDataResponse loginDataResponse = null;
			if(serializable == null){
				loginDataResponse = new LoginDataResponse();
				XtUser xtUser = syncResponse.getXtUser();
				loginDataResponse.setXtUser(xtUser);
				loginDataResponse.setXtDoctor(syncResponse.getXtDoctor());
				loginDataResponse.setDoctorMenus(syncResponse.getDoctorMenus());
				XtPerson xtPerson = personService.selectByUserIdForLogin(Long.parseLong(xtUser.getUserId()));
				loginDataResponse.setXtPerson(xtPerson);
				loginDataResponse.setXtAddress(addressService.selectByPrimaryKeyForLogin(Long.parseLong(xtPerson.getAddressId())));
			}else{
				loginDataResponse = (LoginDataResponse) serializable;
				XtUser xtUser = syncResponse.getXtUser();
				XtPerson xtPerson = personService.selectByUserIdForLogin(Long.parseLong(xtUser.getUserId()));
				loginDataResponse.setXtPerson(xtPerson);
				loginDataResponse.setXtAddress(addressService.selectByPrimaryKeyForLogin(Long.parseLong(xtPerson.getAddressId())));
			}
			/**
			 * 当天预约订单发送消息
			 */
			XtUser xtUser = loginDataResponse.getXtUser();
			List<MzVisit> visitList = mzVisitService.selectReservationVisitCountForTay(Utils.getNowDate(), 
					xtUser.getUserId());
			for (MzVisit mzVisit : visitList) {
				XtMessageCenter xtMessageCenter = new XtMessageCenter();
				xtMessageCenter.setMessageCenterId(UUID.randomUUID().toString());
				xtMessageCenter.setTitle("");
				xtMessageCenter.setType(MessageCenterType.BESPEAK.getIndex());
				xtMessageCenter.setState(MessageCenterState.A.getIndex());
				Doctor doctor = doctorService.selectDoctorById(mzVisit.getDoctorId());
				MzPatient mzPatient = patientService.selectPatientById(mzVisit.getPatientId());
				xtMessageCenter.setContent("{\"titles_teach\":" + "\"" +TitlesTeachType.getName(doctor.getTitlesTeach())+"\"" +
						",\"patientId\":" + "\"" + mzVisit.getPatientId() + "\"" +
						",\"titles_clinical\":" + "\"" +TitlesClinicalType.getName(doctor.getTitlesClinical()) + "\"" + 
						",\"visitId\":" +"\"" + mzVisit.getVisitId().toString() + "\"" +
						",\"img\":" + "\"" + doctor.getPicture() + "\"" +
						",\"content\":" + "\"" +mzPatient.getName()+"\"" + 
						",\"r_start_time\":" + "\"" +mzVisit.getrStartTime()+"\"" + 
						"}");
				xtMessageCenter.setSponsorUserId(doctor.getUserId().toString());
				xtMessageCenter.setSponsorUserName(doctor.getName());
				xtMessageCenter.setReceiveUserId(xtUser.getUserId());
				xtMessageCenter.setReceiveUserName(xtUser.getName());
				xtMessageCenter.setCreateTime(Utils.getNowTime());
				NsqWebSocket.push(Utils.objectToJsonStr(xtMessageCenter));
			}
			return redisSupport.set(syncResponse.getToken(), loginDataResponse, LoginService.LOGIN_USER_CACHE_TIME);
	}
}
