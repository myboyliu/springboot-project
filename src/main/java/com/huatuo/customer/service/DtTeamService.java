package com.huatuo.customer.service;

import java.text.ParseException;
import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.domain.Doctor;
import com.huatuo.customer.domain.DoctorNumTablePojo;
import com.huatuo.customer.domain.DtPackTeamPojo;
import com.huatuo.customer.domain.DtTeam;
import com.huatuo.customer.domain.DtTeamPojo;
import com.huatuo.customer.domain.PaymentInfoPojo;
import com.huatuo.customer.response.OrderResponse;

public interface DtTeamService {
	
	/**
	 * 通过服务地址id获取团队信息
	 * @param addressId
	 * @return
	 */
	public Page<DtTeam> getDtTeamByAddressId(Integer currentPage,Long addressId,Integer pageSize);

	/**
	 * 查询医生信息
	 * @param provinceCode	省id
	 * @param cityCode		市id
	 * @param countyCode	区/县id
	 * @param currentPage	当前页
	 * @param pageSize		每页条数
	 * @return
	 */
	public List<DtTeamPojo> listDtTeams(Integer provinceCode, Integer cityCode, Integer countyCode, Integer currentPage, Integer pageSize);

	/**
	 * 根据团队id获取团队信息
	 * @param dtTeamId		团队id
	 * @return
	 */
	public DtTeamPojo getDtTeamByDtTeamId(String dtTeamId);

	/**
	 * 根据用户id查询我的医生团队
	 * @param userId		用户id
	 * @return
	 */
	public List<DtTeamPojo> getMyDoctorTeam(String userId);

	/**
	 * 根据团队id获取团队成员信息
	 * @param dtTeamId		团队id
	 * @param userId		用户id
	 * @return
	 */
	public List<Doctor> getTeamDoctrors(String dtTeamId, String userId);

	/**
	 * 保存签约信息
	 * @param orderNo			订单号
	 * @return
	 * @throws ParseException
	 */
	public int saveSign(String orderNo) throws ParseException;

	/**
	 * 用户的家庭医生个数
	 * @param userId			用户id
	 * @return
	 */
	public int hasDoctorTeam(String userId);

	/**
	 * 进入视频问诊, 生成visit和patient
	 * @param dtTeamId			团队id
	 * @param userId			用户id
	 * @param memberId			家庭成员id
	 * @param doctorId			指定医生id
	 * @return
	 */
	public OrderResponse askADoctor(String dtTeamId, String userId, String memberId, String doctorId);

	/**
	 * 改变签约信息过时与否和订单的状态
	 * @param userId			用户id
	 * @param dtTeamId			团队id
	 * @param teamPackageId		套餐id
	 */
	public void updateToDelflag(String userId, String dtTeamId, String teamPackageId);

	/**
	 * 改变签约信息过时与否和订单的状态
	 * @param packageName		套餐名称
	 * @param packageKind		套餐种类
	 * @param currentPage		当前页
	 * @param pageSize			每页条数
	 * @return
	 */
	public List<DtPackTeamPojo> queryPmpInfo(String packageName, Integer packageKind, Integer currentPage, int pageSize);

	/**
	 * 医生号表查询
	 * @param dtTeamId			家医团队id
	 * @return
	 */
	public List<DoctorNumTablePojo> queryDoctorNumTable(String dtTeamId);

	/**
	 * 孕妈套餐付款信息
	 * @param orderNo			订单号
	 * @return
	 */
	public PaymentInfoPojo queryPaymentInfo(String orderNo);

}
