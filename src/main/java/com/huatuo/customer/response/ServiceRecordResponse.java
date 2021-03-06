package com.huatuo.customer.response;

import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.MzOrder;
import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.domain.MzVisitDiagnosis;
import com.huatuo.customer.domain.TwConsultQuestion;
import com.huatuo.customer.domain.XtDrugstore;
/**
 * 服务记录返回
 * @author 河南华佗在线
 *
 */
public class ServiceRecordResponse extends BaseResponse{
	private static final long serialVersionUID = 1L;
	private List<MzPatient> patients;//患者列表
	private Page<MzVisit> page;//服务记录列表分页数据
	
	//服务详情记录所需数据
	private MzVisit visit;
	private MzPatient patient;
	private List<MzVisitDiagnosis> mzVisitDiagnosiss;//诊断信息
	private List<MzOrder> orders;//处方+处方详情
	private TwConsultQuestion twConsultQuestion;//图文信息
	
	private List<XtDrugstore> drugstores;//药店
	/**
	 *	患者分页对象
	 */
	private Page<MzPatient> patientPage;
	
	
	
	public Page<MzPatient> getPatientPage() {
		return patientPage;
	}
	public void setPatientPage(Page<MzPatient> patientPage) {
		this.patientPage = patientPage;
	}
	public List<XtDrugstore> getDrugstores() {
		return drugstores;
	}
	public void setDrugstores(List<XtDrugstore> drugstores) {
		this.drugstores = drugstores;
	}
	public List<MzPatient> getPatients() {
		return patients;
	}
	public void setPatients(List<MzPatient> patients) {
		this.patients = patients;
	}
	public Page<MzVisit> getPage() {
		return page;
	}
	public void setPage(Page<MzVisit> page) {
		this.page = page;
	}
	public MzVisit getVisit() {
		return visit;
	}
	public void setVisit(MzVisit visit) {
		this.visit = visit;
	}
	public MzPatient getPatient() {
		return patient;
	}
	public void setPatient(MzPatient patient) {
		this.patient = patient;
	}
	public List<MzVisitDiagnosis> getMzVisitDiagnosiss() {
		return mzVisitDiagnosiss;
	}
	public void setMzVisitDiagnosiss(List<MzVisitDiagnosis> mzVisitDiagnosiss) {
		this.mzVisitDiagnosiss = mzVisitDiagnosiss;
	}
	public List<MzOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<MzOrder> orders) {
		this.orders = orders;
	}
	public TwConsultQuestion getTwConsultQuestion() {
		return twConsultQuestion;
	}
	public void setTwConsultQuestion(TwConsultQuestion twConsultQuestion) {
		this.twConsultQuestion = twConsultQuestion;
	}
}
