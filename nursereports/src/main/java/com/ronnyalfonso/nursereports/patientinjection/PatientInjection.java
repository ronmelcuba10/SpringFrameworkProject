package com.ronnyalfonso.nursereports.patientinjection;

import com.ronnyalfonso.nursereports.injectionlocation.InjectionLocation;
import com.ronnyalfonso.nursereports.injectionorder.InjectionOrder;
import com.ronnyalfonso.nursereports.patientvisit.PatientVisit;

public class PatientInjection {
	
	private PatientVisit visit;
	private InjectionOrder injectionOrder;
	private Float amount;
	private InjectionLocation injectionLocation;
	
	
	public PatientVisit getVisit() {
		return visit;
	}
	public void setVisit(PatientVisit visit) {
		this.visit = visit;
	}
	public InjectionOrder getInjectionOrder() {
		return injectionOrder;
	}
	public void setInjectionOrder(InjectionOrder injectionOrder) {
		this.injectionOrder = injectionOrder;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public InjectionLocation getInjectionLocation() {
		return injectionLocation;
	}
	public void setInjectionLocation(InjectionLocation injectionLocation) {
		this.injectionLocation = injectionLocation;
	}
	
	

}
