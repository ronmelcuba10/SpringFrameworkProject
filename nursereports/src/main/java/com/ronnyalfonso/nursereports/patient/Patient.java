package com.ronnyalfonso.nursereports.patient;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ronnyalfonso.nursereports.assistanttype.AssistantType;

@Entity
public class Patient {
	
	@Id
	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;

	// Vital Sign Ranges
	private Integer maxDiastolic;
	private Integer minDiastolic;
	private Integer maxSystolic;
	private Integer minSystolic;
	private Integer maxBloodSugarLevel;
	private Integer minBloodSugarLevel;
	private Float maxTemperature;
	private Float minTemperature;
	private Integer maxPulse;
	private Integer minPulse;
	private Integer maxRespiration;
	private Integer minRespiration;
	private Boolean isActive;
	private Boolean isDeleted;
	private Boolean paid;

	// TODO fix with classes
	private User user;
	private AssistantType assistantType;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getMaxDiastolic() {
		return maxDiastolic;
	}
	public void setMaxDiastolic(Integer maxDiastolic) {
		this.maxDiastolic = maxDiastolic;
	}
	public Integer getMinDiastolic() {
		return minDiastolic;
	}
	public void setMinDiastolic(Integer minDiastolic) {
		this.minDiastolic = minDiastolic;
	}
	public Integer getMaxSystolic() {
		return maxSystolic;
	}
	public void setMaxSystolic(Integer maxSystolic) {
		this.maxSystolic = maxSystolic;
	}
	public Integer getMinSystolic() {
		return minSystolic;
	}
	public void setMinSystolic(Integer minSystolic) {
		this.minSystolic = minSystolic;
	}
	public Integer getMaxBloodSugarLevel() {
		return maxBloodSugarLevel;
	}
	public void setMaxBloodSugarLevel(Integer maxBloodSugarLevel) {
		this.maxBloodSugarLevel = maxBloodSugarLevel;
	}
	public Integer getMinBloodSugarLevel() {
		return minBloodSugarLevel;
	}
	public void setMinBloodSugarLevel(Integer minBloodSugarLevel) {
		this.minBloodSugarLevel = minBloodSugarLevel;
	}
	public Integer getMaxPulse() {
		return maxPulse;
	}
	public void setMaxPulse(Integer maxPulse) {
		this.maxPulse = maxPulse;
	}
	public Integer getMinPulse() {
		return minPulse;
	}
	public void setMinPulse(Integer minPulse) {
		this.minPulse = minPulse;
	}
	public Float getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(Float maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public Float getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(Float minTemperature) {
		this.minTemperature = minTemperature;
	}
	public Integer getMaxRespiration() {
		return maxRespiration;
	}
	public void setMaxRespiration(Integer maxRespiration) {
		this.maxRespiration = maxRespiration;
	}
	public Integer getMinRespiration() {
		return minRespiration;
	}
	public void setMinRespiration(Integer minRespiration) {
		this.minRespiration = minRespiration;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public AssistantType getAssistantType() {
		return assistantType;
	}
	public void setAssistantType(AssistantType assistantType) {
		this.assistantType = assistantType;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	
}
