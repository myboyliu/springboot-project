package com.huatuo.customer.response;

import java.util.ArrayList;
import java.util.List;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtPregnantMom;
import com.huatuo.customer.domain.XtPregnantMomDetail;
import com.huatuo.customer.domain.XtZdPregnantCheckProject;

/**
 * 孕妈怀孕期间信息返回对象
 * @author Administrator
 *
 */
public class PregnantMomResponse extends BaseResponse{
	
	private static final long serialVersionUID = -2931562922965898868L;
	
	/**
	 * 孕妈状态
	 */
	private XtPregnantMom pregnantMom;
	/**
	 * 怀孕周数
	 */
	private String pregnantWeek;
	/**
	 * 怀孕周数零天数
	 */
	private String pregnantSpotDay;
	/**
	 * 距离宝宝出生的天数
	 */
	private String birthDistanceDay;
	/**
	 * 孕妈心情记录详情列表
	 */
	private List<XtPregnantMomDetail>xtPregnantMomDetails = new ArrayList<XtPregnantMomDetail>();
	/**
	 * 孕期检查项目
	 */
	private List<XtZdPregnantCheckProject>xtZdPregnantCheckProjects = new ArrayList<XtZdPregnantCheckProject>();
	/**
	 * 是否已填写孕妈基本信息1、未填写，2、已填写
	 */
	private Integer isDredgePregnantMom;
	/**
	 * 怀孕阶段建议
	 */
	private String pregnantingSuggestion;
	
	/**
	 * 今日是否已填写心情1、未填写，2、已填写
	 */
	private Integer isWriteTodayContent;
	
	/**
	 * 是否签约家庭医生套餐,1、未签约，2、已签约
	 */
	private Integer isSignFamilyDoctor;
	
	public Integer getIsSignFamilyDoctor() {
		return isSignFamilyDoctor;
	}

	public void setIsSignFamilyDoctor(Integer isSignFamilyDoctor) {
		this.isSignFamilyDoctor = isSignFamilyDoctor;
	}

	public Integer getIsWriteTodayContent() {
		return isWriteTodayContent;
	}

	public void setIsWriteTodayContent(Integer isWriteTodayContent) {
		this.isWriteTodayContent = isWriteTodayContent;
	}

	public String getPregnantingSuggestion() {
		return pregnantingSuggestion;
	}

	public void setPregnantingSuggestion(String pregnantingSuggestion) {
		this.pregnantingSuggestion = pregnantingSuggestion;
	}

	public Integer getIsDredgePregnantMom() {
		return isDredgePregnantMom;
	}

	public void setIsDredgePregnantMom(Integer isDredgePregnantMom) {
		this.isDredgePregnantMom = isDredgePregnantMom;
	}

	public List<XtPregnantMomDetail> getXtPregnantMomDetails() {
		return xtPregnantMomDetails;
	}

	public void setXtPregnantMomDetails(
			List<XtPregnantMomDetail> xtPregnantMomDetails) {
		this.xtPregnantMomDetails = xtPregnantMomDetails;
	}

	public List<XtZdPregnantCheckProject> getXtZdPregnantCheckProjects() {
		return xtZdPregnantCheckProjects;
	}

	public void setXtZdPregnantCheckProjects(
			List<XtZdPregnantCheckProject> xtZdPregnantCheckProjects) {
		this.xtZdPregnantCheckProjects = xtZdPregnantCheckProjects;
	}

	public String getPregnantWeek() {
		return pregnantWeek;
	}

	public void setPregnantWeek(String pregnantWeek) {
		this.pregnantWeek = pregnantWeek;
	}

	public String getPregnantSpotDay() {
		return pregnantSpotDay;
	}

	public void setPregnantSpotDay(String pregnantSpotDay) {
		this.pregnantSpotDay = pregnantSpotDay;
	}

	public String getBirthDistanceDay() {
		return birthDistanceDay;
	}

	public void setBirthDistanceDay(String birthDistanceDay) {
		this.birthDistanceDay = birthDistanceDay;
	}

	public XtPregnantMom getPregnantMom() {
		return pregnantMom;
	}

	public void setPregnantMom(XtPregnantMom pregnantMom) {
		this.pregnantMom = pregnantMom;
	}
	
}
