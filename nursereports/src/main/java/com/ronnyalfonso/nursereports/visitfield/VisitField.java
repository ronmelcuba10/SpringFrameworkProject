package com.ronnyalfonso.nursereports.visitfield;

import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;

public class VisitField {
	
	private Long id;
	private PatientVisit patientVisit;
	private String content;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PatientVisit getPatientVisit() {
		return patientVisit;
	}
	public void setPatientVisit(PatientVisit patientVisit) {
		this.patientVisit = patientVisit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
