package com.ronnyalfonso.nursereports.agencypoint;

import com.ronnyalfonso.nursereports.agency.Agency;
import com.ronnyalfonso.nursereports.named.Named;

public class AgencyPoint extends Named{
	
	private Long id;
	private Agency agency;
	private String pointType;
	private Integer x;
	private Integer y;
	private Integer width;
	private Integer height;
	private AgencyPoint preceding;
	private Boolean autoFillable;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Agency getAgency() {
		return agency;
	}
	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	public String getPointType() {
		return pointType;
	}
	public void setPointType(String pointType) {
		this.pointType = pointType;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public AgencyPoint getPreceding() {
		return preceding;
	}
	public void setPreceding(AgencyPoint preceding) {
		this.preceding = preceding;
	}
	public Boolean getAutoFillable() {
		return autoFillable;
	}
	public void setAutoFillable(Boolean autoFillable) {
		this.autoFillable = autoFillable;
	}
	
	
	
	

}
