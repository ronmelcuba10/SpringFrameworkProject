package com.ronnyalfonso.nursereports.injectionlocation;

import com.ronnyalfonso.nursereports.injectionsite.InjectionSite;

public class InjectionLocation {
	
	private Boolean rightSide;
	private InjectionSite injectionSite;
	
	
	public Boolean getRightSide() {
		return rightSide;
	}
	public void setRightSide(Boolean rightSide) {
		this.rightSide = rightSide;
	}
	public InjectionSite getInjectionSite() {
		return injectionSite;
	}
	public void setInjectionSite(InjectionSite injectionSite) {
		this.injectionSite = injectionSite;
	}
		
}
