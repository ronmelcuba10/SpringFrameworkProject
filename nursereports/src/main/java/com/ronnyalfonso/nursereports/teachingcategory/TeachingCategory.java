package com.ronnyalfonso.nursereports.teachingcategory;

import com.ronnyalfonso.nursereports.category.Category;
import com.ronnyalfonso.nursereports.teaching.Teaching;

public class TeachingCategory {
	
	private Teaching teaching;
	private Category category;
	
	public Teaching getTeaching() {
		return teaching;
	}
	public void setTeaching(Teaching teaching) {
		this.teaching = teaching;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
