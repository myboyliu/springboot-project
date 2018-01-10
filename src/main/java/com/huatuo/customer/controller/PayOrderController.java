package com.huatuo.customer.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.huatuo.customer.base.enums.ServiceState;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.OrderResult;
import com.huatuo.customer.domain.PayOrder;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.query.OrderQuery;
import com.huatuo.customer.response.AlipayResponse;
import com.huatuo.customer.response.OrderResponse;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.DoctorService;
import com.huatuo.customer.service.DtTeamService;
import com.huatuo.customer.service.MzVisitService;
import com.huatuo.customer.service.PatientService;
import com.huatuo.customer.service.PayOrderService;

@RequestMapping(value = "order")
@RestController
/**
 * 支付订单模块
 * @author master
 *
 */
public class PayOrderController {
	
	@Autowired
	private PayOrderService payOrderService;
	
	@Autowired
	private MzVisitService mzVisitService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private DtTeamService dtTeamService;
	
	@Autowired
	private AddressService addressService;
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PayOrderController.class);
	/**
	 * 分页查询订单
	 * @return
	 */
	@PostMapping(value = "selectOrders")
	public Object selectOrders(
			@RequestBody OrderQuery orderQuery, HttpServletRequest request){
		OrderResponse orderResponse= new OrderResponse();
		String userId = Utils.getUserIdByToken(request);
		orderQuery.setUserId(Long.parseLong(userId));
		orderResponse.setPage(payOrderService.selectOrdersByPage(orderQuery));
		orderResponse.setCode(BaseResponse.SUCCESS_CODE);
		orderResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return orderResponse;
	}
	
	/**
	 * 根据订单号查询订单详情
	 * @param orderQuery
	 * @return
	 */
	@PostMapping(value = "searchOrderDetailsByOrderNo")
	public Object seachOrderDetailsByOrderNo(
			@RequestBody OrderQuery orderQuery){
		OrderResponse orderResponse= new OrderResponse();
		OrderResult orderResult = payOrderService.selectOrderDetailsByOrderNo(orderQuery);
		if(orderResult != null){
			orderResponse.setOrderResult(orderResult);
			orderResponse.setCode(BaseResponse.SUCCESS_CODE);
			orderResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		}else{
			orderResponse.setCode(BaseResponse.ERROR_CODE);
			orderResponse.setMessage(BaseResponse.ERROR_MESSAGE);
		}
		return orderResponse;
	}
	
	/**
	 * 患者从订单列表点击进入门诊
	 * @return
	 * @throws Exception 
	 */	
	@PostMapping(value = "takePartInVisit")
	public Object takePartInVisit(
			@RequestBody OrderQuery orderQuery) throws Exception{
		OrderResponse orderResponse = new OrderResponse();
		MzVisit mzVisit = mzVisitService.selectVisitById(orderQuery.getVisitId());
		MzPatient mzPatient = patientService.selectPatientAndAddressDetail(mzVisit.getPatientId());
		mzPatient.setAge(Utils.getAge(mzPatient.getBirthDate()) + "");
		XtAddress xtAddress = addressService.getAddressInfo(mzPatient.getAddressId());
		mzPatient.setLocation(xtAddress.getProvince() + xtAddress.getCity() + xtAddress.getCounty() + xtAddress.getRoad() + xtAddress.getAddress());
		orderResponse.setMzVisit(mzVisit);
		mzPatient.setFormType(mzVisit.getReservationId() == null ? 1 : 2);
		orderResponse.setPatient(mzPatient);
		orderResponse.setVisitId(mzVisit.getVisitId());
		orderResponse.setDoctor(doctorService.selectDoctorById(mzVisit.getDoctorId()));
		orderResponse.setCode(BaseResponse.SUCCESS_CODE);
		orderResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return orderResponse;
	}
	
	/**
	 * 创建支付参数信息
	 * @param orderQuery
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@PostMapping(value = "createPayTrandInfo")
	public Object createPayTrandInfo(
			@RequestBody OrderQuery orderQuery) throws JsonParseException, JsonMappingException, IOException{
		AlipayResponse alipayResponse = null;
		String orderNo = orderQuery.getOrderNo();
		PayOrder payOrder = payOrderService.getPayOrderByOrderNo(orderNo);
		if(!payOrder.getServiceState().equals(ServiceState.NOTPAY.getIndex())){
			alipayResponse = new AlipayResponse();
			alipayResponse.setServiceState(payOrder.getServiceState());
			return alipayResponse;
		}
		String payTrandInfo = payOrderService.createPayTrandInfo(orderNo,orderQuery.getPaySource(), orderQuery.getPayType());
		alipayResponse = Utils.jsonStrToObject(payTrandInfo, AlipayResponse.class);
		alipayResponse.setIsZeroOrder(0);
		alipayResponse.setServiceState(payOrder.getServiceState());
		return alipayResponse;
	}
	
	/**
	 * 支付完成之后order项目的回调方法
	 * 调此方法推送给前台支付结果信息
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unused")
	@GetMapping(value = "payReturnInfoSend")
	public Object payReturnInfoSend(String orderNo, String tradeStatus,String userId, HttpServletRequest request, HttpServletResponse response) throws Exception{
		if(tradeStatus.equals("TRADE_SUCCESS")){
			dtTeamService.saveSign(orderNo);
		}
		String send = payOrderService.payReturnInfoSend(orderNo, tradeStatus, userId);
		return null;
	}
	
	/**
	 * 取消订单
	 * @param orderQuery
	 * @return
	 */
	@PostMapping(value = "cacheOrderByOrderNo")
	public Object cacheOrderByOrderNo(
			@RequestBody OrderQuery orderQuery){
		OrderResponse orderResponse = new OrderResponse();
		if(payOrderService.cacelOrderByOrderNo(orderQuery.getOrderNo()) > 0){
			orderResponse.setCode(BaseResponse.SUCCESS_CODE);
			orderResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		}else{
			orderResponse.setCode(BaseResponse.ERROR_CODE);
			orderResponse.setMessage(BaseResponse.ERROR_MESSAGE);
		}
		return orderResponse;
	}
}
