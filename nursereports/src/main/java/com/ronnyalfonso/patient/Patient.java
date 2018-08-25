package com.ronnyalfonso.patient;

public class Patient {
	
	
	private Integer id;
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
	private Integer maxPulse;
	private Integer minPulse;
	private Integer maxTemperature;
	private Integer minTemperature;
	private Integer maxRespiration;
	private Integer minRespiration;
	private Boolean active;
	private Boolean deleted;
	
	private Integer user;
	private Integer assistantType;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(Integer maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public Integer getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(Integer minTemperature) {
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
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public Integer getAssistantType() {
		return assistantType;
	}
	public void setAssistantType(Integer assistantType) {
		this.assistantType = assistantType;
	}
	
	
	
	
}
