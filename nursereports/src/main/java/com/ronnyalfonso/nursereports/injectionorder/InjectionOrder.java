package com.ronnyalfonso.nursereports.injectionorder;

import com.ronnyalfonso.nursereports.drug.Drug;
import com.ronnyalfonso.nursereports.patient.Patient;
import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;

public class InjectionOrder {
	
	private Long id;
	private Drug drug;
	private PatientVisit visit;
	private Patient patien;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public PatientVisit getVisit() {
		return visit;
	}
	public void setVisit(PatientVisit visit) {
		this.visit = visit;
	}
	public Patient getPatien() {
		return patien;
	}
	public void setPatien(Patient patien) {
		this.patien = patien;
	}
	
	

}
