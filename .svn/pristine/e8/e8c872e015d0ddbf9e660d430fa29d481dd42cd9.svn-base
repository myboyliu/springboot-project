package com.huatuo.customer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.MzOrder;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.MzVisitDiagnosis;
import com.huatuo.customer.domain.TwConsultQuestion;
import com.huatuo.customer.domain.XtDrugstore;
import com.huatuo.customer.query.VisitQuery;
import com.huatuo.customer.response.ServiceRecordResponse;
import com.huatuo.customer.service.DoctorService;
import com.huatuo.customer.service.MzOrderService;
import com.huatuo.customer.service.MzVisitDiagnosisService;
import com.huatuo.customer.service.MzVisitService;
import com.huatuo.customer.service.PatientService;
import com.huatuo.customer.service.TwConsultQuestionService;
import com.huatuo.customer.service.XtDrugstoreService;
/**
 * 服务记录
 * @author 河南华佗在线
 *
 */
@RequestMapping(value = "serviceRecord")
@RestController
public class ServiceRecordController {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private MzVisitService mzVisitService;
	
	@Autowired
	private MzOrderService mzOrderService;//处方服务
	
	@Autowired
	private MzVisitDiagnosisService mzVisitDiagnosisService;
	
	@Autowired
	private TwConsultQuestionService twConsultQuestionService;//图文服务
	
	@Autowired
	private XtDrugstoreService xtDrugstoreService;//药店服务
	/**
	 * 当前登录用户的患者
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="getPatientList")
	public BaseResponse getPatientList(HttpServletRequest request)throws Exception{
		String userId = Utils.getUserIdByToken(request);
		ServiceRecordResponse response = new ServiceRecordResponse();
		//查询用户下的所有患者
		List<MzPatient> patients = patientService.getPatientListByUserId(userId);
		response.setPatients(patients);
		response.setCode(BaseResponse.SUCCESS_CODE);
		response.setMessage(BaseResponse.SUCCESS_MESSAGE);										
		return response;
	}
	/**
	 * 根据患者查询就诊（服务）记录
	 * @param patientId
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="getServiceRecordByPatient")
	public BaseResponse getServiceRecordByPatient(VisitQuery query)throws Exception{
		ServiceRecordResponse response = new ServiceRecordResponse();
		//查询患者下的就诊记录
		Page<MzVisit> page = mzVisitService.getServiceRecordByPatient(query);
		MzPatient patient = patientService.selectPatientAndAddressDetail(query.getPatientId());
		response.setPage(page);
		response.setPatient(patient);
		response.setCode(BaseResponse.SUCCESS_CODE);
		response.setMessage(BaseResponse.SUCCESS_MESSAGE);										
		return response;
	}
	/**
	 * 根据就诊id查询就诊记录+患者信息+诊断信息+图文主题和询问详情
	 * @param visitId
	 * @param sign 1=查询图文
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="getDataByVisitId")
	public BaseResponse getDataByVisitId(Long visitId,Integer sign)throws Exception{
		mzVisitService.handleMzVisitForExtractedCode(visitId.toString());
		ServiceRecordResponse response = new ServiceRecordResponse();
		//查询就诊记录+患者信息+诊断信息
		MzVisit visit = mzVisitService.selectVisitById(visitId);//诊断服务信息
		Doctor doctor = doctorService.selectDoctorById(visit.getDoctorId());//医生名字
		visit.setDoctorName(doctor.getName());
		visit.setDoctorTitlesClinical(doctor.getTitlesClinicalName());
		visit.setDoctorTitlesTeach(doctor.getTitlesTeachName());
		response.setVisit(visit);
		if (visit!=null) {
			MzPatient patient = patientService.selectPatientAndAddressDetail(visit.getPatientId());//患者信息
			response.setPatient(patient);
		}
		//查询诊断
		List<MzVisitDiagnosis> isitDiagnosis = mzVisitDiagnosisService.getListByVisitId(visitId);
		response.setMzVisitDiagnosiss(isitDiagnosis);
		if (sign==1) {//图文咨询
			TwConsultQuestion tw = twConsultQuestionService.getListByVisitId(visitId);
			response.setTwConsultQuestion(tw);
		}
		response.setCode(BaseResponse.SUCCESS_CODE);
		response.setMessage(BaseResponse.SUCCESS_MESSAGE);		
		return response;
	}
	/**
	 * 根据就诊id查询处方+处方详细
	 * @param visitId
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="getOrdersByVisitId")
	public BaseResponse getOrdersByVisitId(Long visitId)throws Exception{
		ServiceRecordResponse response = new ServiceRecordResponse();
		List<MzOrder> orders = mzOrderService.getListByVisitId(visitId);
		response.setOrders(orders);
		response.setCode(BaseResponse.SUCCESS_CODE);
		response.setMessage(BaseResponse.SUCCESS_MESSAGE);		
		return response;
	}
	/**
	 * 根据坐标查询最近的n个药店
	 * @param longitude
	 * @param latitude
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="getDrugstoreByCoordinate")
	public BaseResponse getDrugstoreByCoordinate(Double longitude,Double latitude,Integer pageSize)throws Exception{
		ServiceRecordResponse response = new ServiceRecordResponse();
		List<XtDrugstore> drugstores = xtDrugstoreService.getDrugstoreByCoordinate(longitude,latitude,pageSize);
		response.setDrugstores(drugstores);
		response.setCode(BaseResponse.SUCCESS_CODE);
		response.setMessage(BaseResponse.SUCCESS_MESSAGE);		
		return response;
	}
	
}
