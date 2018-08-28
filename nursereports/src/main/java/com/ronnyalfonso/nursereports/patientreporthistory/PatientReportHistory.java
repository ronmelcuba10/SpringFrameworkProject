package com.ronnyalfonso.nursereports.patientreporthistory;

import java.util.Date;

import com.ronnyalfonso.nursereports.agency.Agency;
import com.ronnyalfonso.nursereports.patient.Patient;

public class PatientReportHistory {
	
	private Long id;
	private Agency agency;
	private Patient patient;
	private Date startDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Agency getAgency() {
		return agency;
	}
	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	

}
