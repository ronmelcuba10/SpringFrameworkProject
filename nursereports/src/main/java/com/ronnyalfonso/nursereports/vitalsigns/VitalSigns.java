package com.ronnyalfonso.nursereports.vitalsigns;

import com.ronnyalfonso.nursereports.patient.Patient;
import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;

public class VitalSigns {
	
	private Long id;
	private Patient patient;
	private PatientVisit visit;
	private Integer bloodSugarLevel;
	private Integer systolicBloodPressure;
	private Integer diastolicBloodPressure;
	private Integer pulse;
	private Boolean pulseRegular;
	private Boolean pulseRadial;
	private Integer temperature;
	private Integer respiration;
	private Boolean respirationRegular;
	private String bloodPressurePosition;
	
	
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
	public PatientVisit getVisit() {
		return visit;
	}
	public void setVisit(PatientVisit visit) {
		this.visit = visit;
	}
	public Integer getBloodSugarLevel() {
		return bloodSugarLevel;
	}
	public void setBloodSugarLevel(Integer bloodSugarLevel) {
		this.bloodSugarLevel = bloodSugarLevel;
	}
	public Integer getSystolicBloodPressure() {
		return systolicBloodPressure;
	}
	public void setSystolicBloodPressure(Integer systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}
	public Integer getDiastolicBloodPressure() {
		return diastolicBloodPressure;
	}
	public void setDiastolicBloodPressure(Integer diastolicBloodPressure) {
		this.diastolicBloodPressure = diastolicBloodPressure;
	}
	public Integer getPulse() {
		return pulse;
	}
	public void setPulse(Integer pulse) {
		this.pulse = pulse;
	}
	public Boolean getPulseRegular() {
		return pulseRegular;
	}
	public void setPulseRegular(Boolean pulseRegular) {
		this.pulseRegular = pulseRegular;
	}
	public Boolean getPulseRadial() {
		return pulseRadial;
	}
	public void setPulseRadial(Boolean pulseRadial) {
		this.pulseRadial = pulseRadial;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Integer getRespiration() {
		return respiration;
	}
	public void setRespiration(Integer respiration) {
		this.respiration = respiration;
	}
	public Boolean getRespirationRegular() {
		return respirationRegular;
	}
	public void setRespirationRegular(Boolean respirationRegular) {
		this.respirationRegular = respirationRegular;
	}
	public String getBloodPressurePosition() {
		return bloodPressurePosition;
	}
	public void setBloodPressurePosition(String bloodPressurePosition) {
		this.bloodPressurePosition = bloodPressurePosition;
	}
	
	

}
