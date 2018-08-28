package com.ronnyalfonso.nursereports.patienttherapy;

import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;
import com.ronnyalfonso.nursereports.therapyorder.TherapyOrder;

public class PatientTherapy {
	
	private Long id;
	private TherapyOrder therapyOrder;
	private PatientVisit patientVisit;
	private Integer painLevel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TherapyOrder getTherapyOrder() {
		return therapyOrder;
	}
	public void setTherapyOrder(TherapyOrder therapyOrder) {
		this.therapyOrder = therapyOrder;
	}
	public PatientVisit getPatientVisit() {
		return patientVisit;
	}
	public void setPatientVisit(PatientVisit patientVisit) {
		this.patientVisit = patientVisit;
	}
	public Integer getPainLevel() {
		return painLevel;
	}
	public void setPainLevel(Integer painLevel) {
		this.painLevel = painLevel;
	}
	
	

}
