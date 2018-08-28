package com.ronnyalfonso.nursereports.patientcategory;

import com.ronnyalfonso.nursereports.category.Category;
import com.ronnyalfonso.nursereports.patient.Patient;

public class PatientCategory {
	
	private Patient patient;
	private Category category;
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
