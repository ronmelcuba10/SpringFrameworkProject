package com.ronnyalfonso.nursereports.payment;

import java.math.BigDecimal;

public class Payment {
	
	private Long id;
	private Integer Month;
	private Integer Year;
	private BigDecimal Amount;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getMonth() {
		return Month;
	}
	public void setMonth(Integer month) {
		Month = month;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	
	

}
