package com.huatuo.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.MzVisitMapper;
import com.huatuo.customer.dao.XtReservationMapper;
import com.huatuo.customer.domain.XtReservation;
import com.huatuo.customer.query.ReservationQuery;
import com.huatuo.customer.query.VisitQuery;
import com.huatuo.customer.service.XtReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements XtReservationService{

	@Autowired
	private XtReservationMapper xtReservationMapper;
	
	@Autowired
	private MzVisitMapper mzVisitMapper;
				
	@Override
	public List<XtReservation> selectReservationsByDoctorUid(ReservationQuery reservationQuery) throws Exception {
		String startDate = Utils.addAnyDay(Utils.getNowTime(), "yyyy-MM-dd", 1);
		String endDate = Utils.addAnyDay(Utils.getNowTime(), "yyyy-MM-dd", 7);
		String startTime = startDate + " 00:00:00";
		String endTime = endDate + " 23:59:59";
		String[] weekName = {" 星期一", " 星期二", " 星期三", " 星期四", " 星期五", " 星期六", " 星期日"};
		List<XtReservation> remainderList = new ArrayList<XtReservation>();
		List<Long> removeIndexs = new ArrayList<Long>();
		List<XtReservation> list = xtReservationMapper.selectReservationsByDoctorUid(
				reservationQuery.getDoctorUid());
		VisitQuery visitQuery = new VisitQuery();
		visitQuery.setStartTime(startTime);
		visitQuery.setEndTime(endTime);
		String nowDate = Utils.getTodayOrYestorday(true);
		/**
		 * 排除余号为0的服务设置
		 */
		for (XtReservation xtReservation : list) {
			visitQuery.setReservationId(xtReservation.getReservationId());
			Integer visitCount = mzVisitMapper.selectVIsitCountByReservationId(visitQuery);
			if(xtReservation.getyCount() - visitCount <= 0){
				removeIndexs.add(xtReservation.getReservationId());
			}else{
				xtReservation.setSurplusTotal(xtReservation.getyCount() - visitCount);
				String ShowDate = Utils.addAnyDay(nowDate, "yyyy-MM-dd", 
						xtReservation.getWeek() == 0 ? 7 - Utils.getIntOfWeek(nowDate) : (7 + xtReservation.getWeek() - Utils.getIntOfWeek(nowDate)) > 7 ?
								xtReservation.getWeek() - Utils.getIntOfWeek(nowDate) : 7 + xtReservation.getWeek() - Utils.getIntOfWeek(nowDate));
				xtReservation.setShowDate(ShowDate + weekName[Utils.getIntOfWeek(ShowDate) - 1 > - 1 ? Utils.getIntOfWeek(ShowDate) - 1 : 6]);
				remainderList.add(xtReservation);
			}
		}
		/**
		 * 将号表排序
		 */
		List<XtReservation> returnList = this.sortReservationsByWeek(remainderList);
		return returnList;
	}

	/**
	 * 针对预约号表进行按周几排序
	 * @return
	 * @throws Exception 
	 */
	private List<XtReservation> sortReservationsByWeek(List<XtReservation> list) throws Exception{
		List<XtReservation> tempList1 = new ArrayList<XtReservation>();
		List<XtReservation> tempList2 = new ArrayList<XtReservation>();
		List<XtReservation> tempList3 = new ArrayList<XtReservation>();
		List<XtReservation> tempList4 = new ArrayList<XtReservation>();
		List<XtReservation> tempList5 = new ArrayList<XtReservation>();
		List<XtReservation> tempList6 = new ArrayList<XtReservation>();
		List<XtReservation> tempList7 = new ArrayList<XtReservation>();
		for (XtReservation xtReservation : list) {
			switch (xtReservation.getWeek()) {
			case 1:
				tempList1.add(xtReservation);
				break;
			case 2:
				tempList2.add(xtReservation);
				break;
			case 3:
				tempList3.add(xtReservation);
				break;
			case 4:
				tempList4.add(xtReservation);
				break;
			case 5:
				tempList5.add(xtReservation);
				break;
			case 6:
				tempList6.add(xtReservation);
				break;
			default:
				tempList7.add(xtReservation);
				break;
			}
		}
		list.clear();
		switch (Utils.getIntOfWeek(Utils.getNowDayBeginOrEnd(true))) {
		case 1:
			list.addAll(this.sortReservationByInterval(tempList2));
			list.addAll(this.sortReservationByInterval(tempList3));
			list.addAll(this.sortReservationByInterval(tempList4));
			list.addAll(this.sortReservationByInterval(tempList5));
			list.addAll(this.sortReservationByInterval(tempList6));
			list.addAll(this.sortReservationByInterval(tempList7));
			list.addAll(this.sortReservationByInterval(tempList1));
			break;
		case 2:
			list.addAll(this.sortReservationByInterval(tempList3));
			list.addAll(this.sortReservationByInterval(tempList4));
			list.addAll(this.sortReservationByInterval(tempList5));
			list.addAll(this.sortReservationByInterval(tempList6));
			list.addAll(this.sortReservationByInterval(tempList7));
			list.addAll(this.sortReservationByInterval(tempList1));
			list.addAll(this.sortReservationByInterval(tempList2));
			break;
		case 3:
			list.addAll(this.sortReservationByInterval(tempList4));
			list.addAll(this.sortReservationByInterval(tempList5));
			list.addAll(this.sortReservationByInterval(tempList6));
			list.addAll(this.sortReservationByInterval(tempList7));
			list.addAll(this.sortReservationByInterval(tempList1));
			list.addAll(this.sortReservationByInterval(tempList2));
			list.addAll(this.sortReservationByInterval(tempList3));
			break;
		case 4:
			list.addAll(this.sortReservationByInterval(tempList5));
			list.addAll(this.sortReservationByInterval(tempList6));
			list.addAll(this.sortReservationByInterval(tempList7));
			list.addAll(this.sortReservationByInterval(tempList1));
			list.addAll(this.sortReservationByInterval(tempList2));
			list.addAll(this.sortReservationByInterval(tempList3));
			list.addAll(this.sortReservationByInterval(tempList4));
			break;
		case 5:
			list.addAll(this.sortReservationByInterval(tempList6));
			list.addAll(this.sortReservationByInterval(tempList7));
			list.addAll(this.sortReservationByInterval(tempList1));
			list.addAll(this.sortReservationByInterval(tempList2));
			list.addAll(this.sortReservationByInterval(tempList3));
			list.addAll(this.sortReservationByInterval(tempList4));
			list.addAll(this.sortReservationByInterval(tempList5));
			break;
		case 6:
			list.addAll(this.sortReservationByInterval(tempList7));
			list.addAll(this.sortReservationByInterval(tempList1));
			list.addAll(this.sortReservationByInterval(tempList2));
			list.addAll(this.sortReservationByInterval(tempList3));
			list.addAll(this.sortReservationByInterval(tempList4));
			list.addAll(this.sortReservationByInterval(tempList5));
			list.addAll(this.sortReservationByInterval(tempList6));
			break;

		default:
			list.addAll(this.sortReservationByInterval(tempList1));
			list.addAll(this.sortReservationByInterval(tempList2));
			list.addAll(this.sortReservationByInterval(tempList3));
			list.addAll(this.sortReservationByInterval(tempList4));
			list.addAll(this.sortReservationByInterval(tempList5));
			list.addAll(this.sortReservationByInterval(tempList6));
			list.addAll(this.sortReservationByInterval(tempList7));
			break;
		}
		return list;
	}
	
	/**
	 * 针对预约设置按照上午、下午、晚上排序
	 * @param list
	 * @return
	 */
	private List<XtReservation> sortReservationByInterval(List<XtReservation> list){
		List<XtReservation> tempList1 = new ArrayList<XtReservation>();
		List<XtReservation> tempList2 = new ArrayList<XtReservation>();
		List<XtReservation> tempList4 = new ArrayList<XtReservation>();
		for (XtReservation xtReservation : list) {
			switch (xtReservation.getInterval()) {
			case 1:
				tempList1.add(xtReservation);
				break;
			case 2:
				tempList2.add(xtReservation);
				break;
			default:
				tempList4.add(xtReservation);
				break;
			}
		}
		list.clear();
		for (XtReservation xtReservation : tempList1) {
			list.add(xtReservation);
		}
		for (XtReservation xtReservation : tempList2) {
			list.add(xtReservation);
		}
		for (XtReservation xtReservation : tempList4) {
			list.add(xtReservation);
		}
		return list;
	}
	
}
