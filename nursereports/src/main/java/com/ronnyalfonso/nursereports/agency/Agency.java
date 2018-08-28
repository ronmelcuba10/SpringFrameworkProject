package com.ronnyalfonso.nursereports.agency;

import com.ronnyalfonso.nursereports.named.Named;

public class Agency extends Named{
	
	private String description;
	private Boolean tested;
	private Boolean active;
	private String reportUrl;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getTested() {
		return tested;
	}
	public void setTested(Boolean tested) {
		this.tested = tested;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getReportUrl() {
		return reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}
	
	
	

}
