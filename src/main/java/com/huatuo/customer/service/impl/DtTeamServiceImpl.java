package com.huatuo.customer.service.impl;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.huatuo.customer.base.enums.EnumUtils;
import com.huatuo.customer.base.enums.EnumUtilsTow;
import com.huatuo.customer.base.enums.PayOrderState;
import com.huatuo.customer.base.enums.ServiceState;
import com.huatuo.customer.base.enums.ServiceType;
import com.huatuo.customer.base.enums.TitlesClinicalType;
import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.redis.CommonDao;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.DoctorMapper;
import com.huatuo.customer.dao.DtMemberMapper;
import com.huatuo.customer.dao.DtPackageDtlMapper;
import com.huatuo.customer.dao.DtPackageMapper;
import com.huatuo.customer.dao.DtServiceMapper;
import com.huatuo.customer.dao.DtTeamMapper;
import com.huatuo.customer.dao.DtUserPackageMapper;
import com.huatuo.customer.dao.DtUserPackageRecordMapper;
import com.huatuo.customer.dao.DtUserTeamMapper;
import com.huatuo.customer.dao.MzPatientMapper;
import com.huatuo.customer.dao.MzVisitMapper;
import com.huatuo.customer.dao.PayOrderMapper;
import com.huatuo.customer.dao.XtMessageCenterMapper;
import com.huatuo.customer.dao.XtPersonFamilyMapper;
import com.huatuo.customer.dao.XtPersonMapper;
import com.huatuo.customer.dao.XtReservationMapper;
import com.huatuo.customer.dao.XtUserMapper;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.DoctorNumTablePojo;
import com.huatuo.customer.domain.DtPackTeamPojo;
import com.huatuo.customer.domain.DtPackage;
import com.huatuo.customer.domain.DtPackageDtl;
import com.huatuo.customer.domain.DtPackagePojo;
import com.huatuo.customer.domain.DtService;
import com.huatuo.customer.domain.DtTeam;
import com.huatuo.customer.domain.DtTeamPojo;
import com.huatuo.customer.domain.DtUserPackage;
import com.huatuo.customer.domain.DtUserPackageRecord;
import com.huatuo.customer.domain.DtUserTeam;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.NumTablePojo;
import com.huatuo.customer.domain.PayOrder;
import com.huatuo.customer.domain.PaymentInfoPojo;
import com.huatuo.customer.domain.UserPTIdPojo;
import com.huatuo.customer.domain.XtMessageCenter;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.response.OrderResponse;
import com.huatuo.customer.service.DtTeamService;
import com.huatuo.db.pojo.FlexVisitQueuePojo;

@Service
@Transactional
public class DtTeamServiceImpl implements DtTeamService{

	@Autowired
	private DtTeamMapper dtTeamMapper;
	
	@Autowired
	private DtPackageMapper dtPackageMapper; 
	
	@Autowired
	private DoctorMapper doctorMapper; 
	
	@Autowired
	private DtUserTeamMapper dtUserTeamMapper; 
	
	@Autowired
	private DtUserPackageMapper dtUserPackageMapper; 
	
	@Autowired
	private MzVisitMapper mzVisitMapper;
	
	@Autowired
	private XtPersonMapper xtPersonMapper;
	
	@Autowired
	private MzPatientMapper mzPatientMapper;
	
	@Autowired
	private XtMessageCenterMapper xtMessageCenterMapper;
	
	@Autowired
	private DtPackageDtlMapper dtPackageDtlMapper;
	
	@Autowired
	private DtUserPackageRecordMapper recordMapper;
	
	@Autowired
	private XtPersonFamilyMapper familyMapper;
	
	@Autowired
	private XtUserMapper userMapper;
	
	@Autowired
	private DtServiceMapper serviceMapper;
	
	@Autowired
	private PayOrderMapper payOrderMapper;
	
	@Autowired
	private DtMemberMapper memberMapper;
	
	@Autowired
	private XtReservationMapper reservationMapper;
	
	@Autowired
	private CommonDao commonDao;
	
	private static final Logger logger = LoggerFactory.getLogger(DtTeamServiceImpl.class);
	
	@Override
	public Page<DtTeam> getDtTeamByAddressId(Integer currentPage,Long addressId,Integer pageSize){
	    Map<String,Object> map = new HashMap<String,Object>();
	    map.put("addressId", addressId);
	    int total = dtTeamMapper.countByAddressId(map);
	    Page<DtTeam> pageBean = null;
	    if(total>0){
	    	pageBean = new Page<DtTeam>(total,currentPage,pageSize);	    	
			map.put("pageSize", pageSize);
			map.put("start", pageBean.getStart());
	    	List<DtTeam> dtTeamList = dtTeamMapper.selectByaddressId(map);
	    	pageBean.setList(dtTeamList);
	    }
	    return pageBean;
	}
	@Override
	public List<DtTeamPojo> listDtTeams(Integer provinceCode, Integer cityCode,
								Integer countyCode, Integer currentPage, Integer pageSize) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("provinceCode", provinceCode);
		map.put("cityCode", cityCode);
		map.put("countyCode", countyCode);
		
		List<DtTeamPojo> beansList = new ArrayList<>();
		// 查询总数
		int total = dtTeamMapper.countDtTeams(map);
		Page<DtTeamPojo> pageBack = new Page<DtTeamPojo>(total, currentPage, pageSize);

		if (total > 0) {
			map.put("start", pageBack.getStart());
			map.put("pageSize", pageSize);
			// 查询团队信息
			beansList = dtTeamMapper.listDtTeams(map);
			// 遍历查询出套餐包
			for (DtTeamPojo dtTeamPojo : beansList) {

				map.put("dtTeamId", dtTeamPojo.getDtTeamId());
				List<DtPackage> packages = dtPackageMapper.listByDtTeamId(map);
				dtTeamPojo.setPackages(packages);
			}
		}
		return beansList;
	}

	@Override
	public DtTeamPojo getDtTeamByDtTeamId(String dtTeamId) {
		DtTeamPojo dtTeamPojo = new DtTeamPojo();
		if(dtTeamId != null && dtTeamId != ""){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("dtTeamId", dtTeamId);
			List<DtTeamPojo> listDtTeams = dtTeamMapper.listDtTeams(map);
			if(listDtTeams != null && listDtTeams.size() > 0){
				//根据团队id获取团队信息
				dtTeamPojo = listDtTeams.get(0);
				
				//查询出套餐包
				List<DtPackage> packages = dtPackageMapper.listByDtTeamId(map);
				dtTeamPojo.setPackages(packages);
				
				//查询出团队医生成员信息
				List<Doctor> doctors = doctorMapper.listDoctorsByDtTeamId(map);
				
				List<Doctor> list = new ArrayList<>();
				
				for (Doctor doctor : doctors) {
					if(String.valueOf(doctor.getId()).equals(dtTeamPojo.getAdminDoctorId())){
						list.add(doctor);
					}
				}
				for (Doctor doctor : doctors) {
					if(!String.valueOf(doctor.getId()).equals(dtTeamPojo.getAdminDoctorId())){
						list.add(doctor);
					}
				}
				dtTeamPojo.setDoctors(list);
			}
		}
		return dtTeamPojo;
	}

	@Override
	public List<DtTeamPojo> getMyDoctorTeam(String userId) {
		List<DtTeamPojo> beansList = new ArrayList<>();
		if(userId != null && userId != ""){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("userId", userId);
			
			//根据用户id查询我的医生团队
			beansList = dtTeamMapper.getMyDoctorTeam(map);
		}
		return beansList;
	}

	@Override
	public List<Doctor> getTeamDoctrors(String dtTeamId, String userId) {
		List<Doctor> list = new ArrayList<>();
		if(dtTeamId != null && dtTeamId != ""){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("dtTeamId", dtTeamId);
			
			//查询出团队医生成员信息
			List<Doctor> doctors = doctorMapper.listDoctorsByDtTeamId(map);
			
			/**
			 * 判断是否有团队成员，如果有就按正常流程，没有就把负责人强制add进去.保证团队至少有负责人自己
			 */
			if(doctors.size() == 0){//
				DtTeamPojo teamPojo = this.getDtTeamByDtTeamId(dtTeamId);
				Doctor doctor=doctorMapper.selectDoctorById(Long.valueOf(teamPojo.getAdminDoctorId()));
				doctors.add(doctor);
				
			}
			for (Doctor doctor : doctors) {
				doctor.setDtTeamId(dtTeamId);
				FlexVisitQueuePojo queue = (FlexVisitQueuePojo) commonDao.getFlexVisitQueuePojo(doctor.getId());
				if (queue != null) {
					doctor.setOnline(queue.isOnline());
				}

				map.clear();
				map.put("sponsorUserId", doctor.getUserId());
				map.put("receiveUserId", userId);
				// 获取咨询消息内容
				List<XtMessageCenter> messageCenters = xtMessageCenterMapper
						.listXtMessageCenter(map);
				if (messageCenters != null && messageCenters.size() > 0) {
					XtMessageCenter xtMessageCenter = messageCenters.get(0);
					doctor.setMessageCenterId(xtMessageCenter
							.getMessageCenterId());
					doctor.setChatMessage(xtMessageCenter.getContent());
					doctor.setChatMessageTime(xtMessageCenter
							.getCreateTime());
				}
				list.add(doctor);
			}
		}
		return list;
	}

	@Override
	@Transactional
	public int saveSign(String orderNo) throws ParseException {
		int row = 0;
		//保存签约信息, 从redis中获取信息
		if(!StringUtils.isEmpty(orderNo)){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("orderNo", orderNo);
			PayOrder payOrder = payOrderMapper.getPayOrderByOrderNo(map);
			
			if(payOrder != null 
					&& payOrder.getServiceType() == ServiceType.FAMILYDOCTOR.getIndex()
					&& payOrder.getOrderState() == PayOrderState.PAID.getIndex()){
				
				logger.warn("家庭已审支付完成, 生成团队契约开始");
				//从redis取出数据
				UserPTIdPojo userPTIdPojo = commonDao.getUserPTIdPojo(orderNo);
				if(userPTIdPojo != null){
					logger.warn("契约用户id" + userPTIdPojo.getUserId());
				}
				if(userPTIdPojo != null){
					String dtTeamId = userPTIdPojo.getDtTeamId();
					String userId = userPTIdPojo.getUserId();
					String teamPackageId = userPTIdPojo.getTeamPackageId();
					Integer num = userPTIdPojo.getNum();
					
					//开始保存签约信息
					String nowTime = Utils.getNowTime();
					String startOrEndTime = nowTime;
					// 保存用户和家医团队的签约信息
					map.clear();
					map.put("dtTeamId", dtTeamId);
					map.put("userId", userId);
					map.put("teamPackageId", teamPackageId);
					
					//查询套餐信息
					DtPackagePojo packagePojo = dtPackageMapper.getDtPackageByTeamPackageId(map);
					
					//叠加套餐时间不连续, 每次都叠加
					if(packagePojo != null && packagePojo.getPackageType() != EnumUtils.DtPackage_package_type_1.getIndex()){
						// 查询用户和套餐的关系
						List<DtUserPackage> list = dtUserPackageMapper.getDtUserPackage(map);
						// 获取套餐开始时间
						if (list != null && list.size() > 0) {
							DtUserPackage dtUserPackage = list.get(0);
							String theEndTime = dtUserPackage.getEndTime();
							// 取开始时间大的
							startOrEndTime = startOrEndTime.compareTo(theEndTime) > 0 ? startOrEndTime
									: theEndTime;
						}
					}
					String endTime = Utils.getBeforeDate(startOrEndTime, -num);
					
					// 保存用户和套餐的签约信息
					DtUserPackage userPackage = new DtUserPackage();
					userPackage.setUserPackageId(UUID.randomUUID().toString());
					userPackage.setBuyTime(nowTime);
					userPackage.setDoctorTeamId(dtTeamId);
					userPackage.setStartTime(startOrEndTime); // 时间往后推
					userPackage.setEndTime(endTime);
					userPackage.setSyncTime(nowTime);
					userPackage.setTeamPackageId(teamPackageId);
					userPackage.setUserId(userId);
					userPackage.setDelFlag(0);
					userPackage.setOrderNo(orderNo);
					
					dtUserPackageMapper.saveDtUserPackage(userPackage);
					
					// 保存用户签约套餐记录表信息
					// 套餐子项信息
					List<DtPackageDtl> dtPackageDtls = dtPackageDtlMapper.listDtPackageDtls(map);
					if (dtPackageDtls != null && dtPackageDtls.size() > 0) {
						for (DtPackageDtl dtPackageDtl : dtPackageDtls) {
							// 将用户签约套餐记录放入list
							DtUserPackageRecord record = new DtUserPackageRecord();
							
							record.setUserPackageRecordId(UUID.randomUUID().toString());
							record.setPackageName(packagePojo.getPackageName());
							record.setDescription(dtPackageDtl.getDescription());
							//按时间段就是(该时间段总共多少次), 按次的就是(每个月(年)多少次)
							DtService dtService = serviceMapper.selectByPrimaryKey(dtPackageDtl.getServiceId());
							// 判断是否为null
							//按时间段就是(该时间段总共多少次)
							Integer amount = dtPackageDtl.getAmount() == null ? 0: dtPackageDtl.getAmount();
							//按次的就是(每个月(年)多少次)
							if(dtService != null && dtService.getChargingType() == EnumUtilsTow.DtService_charging_type_2.getIndex()){
								amount = amount * num;
							}
							
							record.setResidueDegree(amount.toString());
							record.setStartTime(startOrEndTime); // 时间往后推
							record.setEndTime(endTime);
							record.setState(EnumUtils.DtUserPackageRecord_state_0.getIndex());
							record.setUserId(userId);
							record.setDtTeamId(dtTeamId);
							record.setPackageType(packagePojo.getPackageType());
							record.setTeamPackageId(teamPackageId);
							record.setTeamPackageDtlId(dtPackageDtl.getTeamPackageDtlId());
							record.setRecordTime(nowTime);
							
							// 保存
							recordMapper.saveDtUserPackageRecord(record);
						}
					}
					
					// 先查询该家庭医生团队是否已签约
					DtUserTeam userTeam = dtUserTeamMapper.getDtUserTean(map);
					
					if (userTeam == null) {
						XtUser xtUser = userMapper.selectByPrimaryKey(Long.valueOf(userId));
						
						userTeam = new DtUserTeam();
						userTeam.setUserTeamId(UUID.randomUUID().toString());
						userTeam.setDoctorTeamId(dtTeamId);
						userTeam.setStartTime(nowTime);
						userTeam.setUserId(userId);
						userTeam.setUserName(xtUser.getUserName());
						userTeam.setEndTime(endTime);
						userTeam.setSyncTime(nowTime);
						userTeam.setDelFlag(0);
						
						row = dtUserTeamMapper.saveDtUserTeam(userTeam);
						
						// 查询医生团队(修改医生团队签约人数和服务人数)
						DtTeam dtTeam = dtTeamMapper.selectByPrimaryKey(dtTeamId);
						
						// 查询新用户的本人加上家庭人数
						int count = familyMapper.countFamilyByUserId(map);
						// 修改医生团队签约人数和服务人数
						dtTeam.setAlreadySignedNumber(dtTeam.getAlreadySignedNumber() + 1);
						dtTeam.setAlreadyServeNumber(dtTeam.getAlreadyServeNumber() + count + 1);
						
						dtTeamMapper.updateByPrimaryKey(dtTeam);
					} else {
						String utEndtime = userTeam.getEndTime();
						// 取结束时间大的
						endTime = endTime.compareTo(utEndtime) > 0 ? endTime : utEndtime;
						userTeam.setEndTime(endTime);
						userTeam.setSyncTime(nowTime);
						userTeam.setDelFlag(0);
						
						row = dtUserTeamMapper.updateByPrimaryKeySelective(userTeam);
					}
					if(row > 0){
						//成功后清redis
						commonDao.deleteUserPTIdPojo(orderNo);
						logger.warn("生成团队契约完成");
					}
				}
			}
		}
		return row;
	}
	
	@Override
	public int hasDoctorTeam(String userId) {
		if(!StringUtils.isEmpty(userId)){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("userId", userId);
			return dtTeamMapper.hasDoctorTeam(map);
		}
		return 0;
	}

	private MzVisit saveMzVisit(String userId, String nowTime, Doctor doctor, BigDecimal packagePrice, 
								Long patientId, String memberId, String dtTeamId){
		//生成mz_visit业务信息
		MzVisit mzVisit = new MzVisit();
		mzVisit.setMzCode("0");
		mzVisit.setUserId(Long.valueOf(userId));
		mzVisit.setMemberId(Long.valueOf(memberId));	//暂时传自己
		mzVisit.setSelfFlag(0);
		mzVisit.setPatientId(patientId);	
		mzVisit.setTimes(0);
		mzVisit.setVisitTime(nowTime);
		mzVisit.setDoctorId(doctor.getId());	//等待确认
		mzVisit.setServiceCost(packagePrice);
		mzVisit.setStatus(ServiceState.WAITSERVICE.getIndex());
		mzVisit.setVisitDept(doctor.getDept());	//等待确认
		mzVisit.setVisitType(ServiceType.FAMILYDOCTOR.getIndex());
		mzVisit.setCreateTime(nowTime);
		mzVisit.setIllnessDescribe("无");	//待定
		mzVisit.setDtTeamId(dtTeamId);
		mzVisit.setAge("0");				//暂时的
		
		mzVisitMapper.insert(mzVisit);
		return mzVisit;
	}
	
	@Override
	@Transactional
	public OrderResponse askADoctor(String dtTeamId, String userId, String memberId, String doctorId) {
		OrderResponse resp = new OrderResponse();
		
		String nowTime = Utils.getNowTime();
		Doctor doctor = doctorMapper.selectDoctorById(Long.valueOf(doctorId));
		resp.setDoctor(doctor);
		BigDecimal packagePrice = new BigDecimal(0);
		
		//生成patient患者信息
		XtPerson xtPerson = xtPersonMapper.selectPersonByUserId(Long.valueOf(userId));
		MzPatient mzPatient = Utils.exchangeObject(xtPerson, MzPatient.class);
		mzPatient.setBirthDate(xtPerson.getBirthdate());
		mzPatient.setRelateTel(xtPerson.getHomeTel());
		mzPatient.setDoctorId(Long.valueOf(doctorId));
		
		mzPatientMapper.insert(mzPatient);
		resp.setPatient(mzPatient);
		
		//生成visit, 业务订单
//		MzVisit mzVisit = this.saveMzVisit(userId, nowTime, doctor, packagePrice, patientId);
		MzVisit mzVisit = this.saveMzVisit(userId, nowTime, doctor, packagePrice, mzPatient.getPatientId(), memberId, dtTeamId);
		resp.setVisitId(mzVisit.getVisitId());
		
		return resp;
	}
	
	@Override
	@Transactional
	public void updateToDelflag(String userId, String dtTeamId, String teamPackageId) {
		
		String nowTime = Utils.getNowTime();
		
		//查询出结束时间小于当前时间的订单
		List<PayOrder> payOrders = payOrderMapper.getOrderByDtUserPackage(userId, dtTeamId, teamPackageId, nowTime);
		if(payOrders != null && payOrders.size() > 0){
			//订单集合
			List<String> orderNos = new ArrayList<>();
			//业务id集合
			List<Long> visitIds = new ArrayList<>();
			for (PayOrder payOrder : payOrders) {
				orderNos.add(payOrder.getOrderNo());
				visitIds.add(payOrder.getServiceId());
			}
			//修改家医订单状态
			payOrderMapper.updateByOrderNos(orderNos, ServiceState.FINISHED.getIndex(), PayOrderState.COMPLETED.getIndex());
			//修改家医业务状态
			mzVisitMapper.updateByVisitIds(visitIds, nowTime, ServiceState.FINISHED.getIndex());
			//修改用户和套餐中间表状态
			dtUserPackageMapper.updateToDelflag(userId, dtTeamId, teamPackageId, nowTime, EnumUtils.DtUserPackage_del_flag_1.getIndex());
			//修改用户和套餐详情中间表状态
			recordMapper.updateToDelflag(userId, dtTeamId, teamPackageId, nowTime, EnumUtils.DtUserPackageRecord_state_1.getIndex());
			//修改用户和家医团队中间表状态
			dtUserTeamMapper.updateToDelflag(userId, dtTeamId, nowTime, EnumUtils.DtUserPackage_del_flag_1.getIndex());
		}
		
	}
	@Override
	public List<DtPackTeamPojo> queryPmpInfo(String packageName, Integer packageKind, Integer currentPage, int pageSize) {
		int count = dtPackageMapper.countPmpInfo(packageName, packageKind);
		if(count > 0){
			Page<DtPackTeamPojo> page = new Page<>(count, currentPage, pageSize);
			List<DtPackTeamPojo> list = dtPackageMapper.queryPmpInfo(packageName, packageKind, page.getStart(), pageSize);
			for (DtPackTeamPojo pojo : list) {
				pojo.setTitlesClinicalName(TitlesClinicalType.getName(pojo.getTitlesClinical()));
				pojo.setPackageCycleName(EnumUtilsTow.getName(pojo.getPackageCycle(), DtPackTeamPojo.class.getSimpleName()));
			}
			return list;
		}
		return null;
	}
	
	@Override
	public List<DoctorNumTablePojo> queryDoctorNumTable(String dtTeamId) {
		//1.查询和医生一个团队的医生
		List<DoctorNumTablePojo> pojos = memberMapper.listDoctors(dtTeamId);
		if(pojos != null && pojos.size() > 0){
			for (DoctorNumTablePojo doctorNumTablePojo : pojos) {
				//2.查询每个医生的号表
				List<NumTablePojo> numTablePojos =  reservationMapper.queryNumTable(doctorNumTablePojo.getDoctorUid());
				doctorNumTablePojo.setNumTablePojos(numTablePojos);
			}
		}
		return pojos;
	}
	@Override
	public PaymentInfoPojo queryPaymentInfo(String orderNo) {
		if(!StringUtils.isEmpty(orderNo)){
			PaymentInfoPojo paymentInfo = dtUserPackageMapper.queryPaymentInfo(orderNo);
			if(paymentInfo != null){
				String startTime = paymentInfo.getStartTime();
				String endTime = paymentInfo.getEndTime();
				//计算月份
				Integer start1 = Integer.valueOf(startTime.split("-")[0]);
				Integer start2 = Integer.valueOf(startTime.split("-")[1]);
				Integer end1 = Integer.valueOf(endTime.split("-")[0]);
				Integer end2 = Integer.valueOf(endTime.split("-")[1]);
				Integer num = (end1 - start1)*12 + end2 - start2;
				paymentInfo.setNum(num);
			}
			return paymentInfo;
		}
		return null;
	}
}
