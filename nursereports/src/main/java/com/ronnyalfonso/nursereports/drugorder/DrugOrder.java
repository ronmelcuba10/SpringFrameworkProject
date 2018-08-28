package com.ronnyalfonso.nursereports.drugorder;

import com.ronnyalfonso.nursereports.drug.Drug;
import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;

public class DrugOrder {

	private Long id;
	private Drug drug;
	private PatientVisit visit;
	private String description;
	private Float amount;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	
	
	
	
}
