package com.ronnyalfonso.nursereports.patientvisit;

import java.util.Date;

import com.ronnyalfonso.nursereports.patient.Patient;

public class PatientVisit {
	
	private Long id;
	private Patient patient;
	private User user;
	private Date date;
	private Integer timeSpan;
	private Boolean printed;
	private Boolean paid;
	
	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getTimeSpan() {
		return timeSpan;
	}
	public void setTimeSpan(Integer timeSpan) {
		this.timeSpan = timeSpan;
	}
	public Boolean getPrinted() {
		return printed;
	}
	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	
	
	
	

}
