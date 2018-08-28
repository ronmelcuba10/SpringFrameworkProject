package com.ronnyalfonso.nursereports.patientlimitation;

import com.ronnyalfonso.nursereports.limitation.Limitation;
import com.ronnyalfonso.nursereports.patient.Patient;

public class PatientLimitation {
	
	private Limitation limitation;
	private Patient patient;
	
	public Limitation getLimitation() {
		return limitation;
	}
	public void setLimitation(Limitation limitation) {
		this.limitation = limitation;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	

}
