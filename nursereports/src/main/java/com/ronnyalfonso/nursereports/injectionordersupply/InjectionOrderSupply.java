package com.ronnyalfonso.nursereports.injectionordersupply;

import com.ronnyalfonso.nursereports.injectionorder.InjectionOrder;
import com.ronnyalfonso.nursereports.supply.Supply;

public class InjectionOrderSupply {
	
	private Long id;
	private Supply supply;
	private InjectionOrder injectionOrder;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Supply getSupply() {
		return supply;
	}
	public void setSupply(Supply supply) {
		this.supply = supply;
	}
	public InjectionOrder getInjectionOrder() {
		return injectionOrder;
	}
	public void setInjectionOrder(InjectionOrder injectionOrder) {
		this.injectionOrder = injectionOrder;
	}
	
	

}
