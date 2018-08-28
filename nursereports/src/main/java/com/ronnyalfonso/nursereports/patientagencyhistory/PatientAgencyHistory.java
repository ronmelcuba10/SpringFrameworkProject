package com.ronnyalfonso.nursereports.patientagencyhistory;

import java.util.Date;

import com.ronnyalfonso.nursereports.agency.Agency;
import com.ronnyalfonso.nursereports.patient.Patient;

public class PatientAgencyHistory {
	
	private Patient patient;
	private Agency agency;
	private Date startDate;
	private String medicalRecord;
	
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Agency getAgency() {
		return agency;
	}
	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(String medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	
	

}
