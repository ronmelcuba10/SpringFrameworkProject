package com.ronnyalfonso.nursereports.patientdrughistory;

import java.util.Date;

import com.ronnyalfonso.nursereports.drug.Drug;
import com.ronnyalfonso.nursereports.patient.Patient;

public class PatientDrugHistory {
	
	private Long id;
	private Patient patient;
	private Drug drug;
	private Date startDate;
	private Date endDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

}
