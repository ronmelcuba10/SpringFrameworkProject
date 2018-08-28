package com.ronnyalfonso.nursereports.patientreport;

import com.ronnyalfonso.nursereports.agencypoint.AgencyPoint;
import com.ronnyalfonso.nursereports.patientreporthistory.PatientReportHistory;

public class PatientReport {
	
	private Long id;
	private PatientReportHistory patientReportHistory;
	private AgencyPoint agencyPoint;
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PatientReportHistory getPatientReportHistory() {
		return patientReportHistory;
	}
	public void setPatientReportHistory(PatientReportHistory patientReportHistory) {
		this.patientReportHistory = patientReportHistory;
	}
	public AgencyPoint getAgencyPoint() {
		return agencyPoint;
	}
	public void setAgencyPoint(AgencyPoint agencyPoint) {
		this.agencyPoint = agencyPoint;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
