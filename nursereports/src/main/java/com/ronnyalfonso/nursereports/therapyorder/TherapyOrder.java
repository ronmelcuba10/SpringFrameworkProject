package com.ronnyalfonso.nursereports.therapyorder;

import java.util.Date;

import com.ronnyalfonso.nursereports.patient.Patient;

public class TherapyOrder {
	
	private Long id;
	private Patient patient;
	private Date startDate;
	private Date endDate;
	private Integer initialPainLevel;
	private Integer finalPainLevel;
	private String painLocation;
	private String painManagement;
	
	
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
	public Integer getInitialPainLevel() {
		return initialPainLevel;
	}
	public void setInitialPainLevel(Integer initialPainLevel) {
		this.initialPainLevel = initialPainLevel;
	}
	public Integer getFinalPainLevel() {
		return finalPainLevel;
	}
	public void setFinalPainLevel(Integer finalPainLevel) {
		this.finalPainLevel = finalPainLevel;
	}
	public String getPainLocation() {
		return painLocation;
	}
	public void setPainLocation(String painLocation) {
		this.painLocation = painLocation;
	}
	public String getPainManagement() {
		return painManagement;
	}
	public void setPainManagement(String painManagement) {
		this.painManagement = painManagement;
	}
	
	

}
