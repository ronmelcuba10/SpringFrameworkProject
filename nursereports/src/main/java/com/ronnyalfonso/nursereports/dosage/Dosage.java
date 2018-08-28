package com.ronnyalfonso.nursereports.dosage;

import com.ronnyalfonso.nursereports.injectionorder.InjectionOrder;

public class Dosage {
	
	private Long id;
	private InjectionOrder injectionOrder;
	private Float amount;
	private Integer lowerLimit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(Integer lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	public InjectionOrder getInjectionOrder() {
		return injectionOrder;
	}
	public void setInjectionOrder(InjectionOrder injectionOrder) {
		this.injectionOrder = injectionOrder;
	}
	
	
	
	
	
	
}
