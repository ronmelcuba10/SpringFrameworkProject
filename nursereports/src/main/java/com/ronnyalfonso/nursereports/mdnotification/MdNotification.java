package com.ronnyalfonso.nursereports.mdnotification;

import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;

public class MdNotification {
	
	private Long id;
	private PatientVisit patientVisit;
	private String description;
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
