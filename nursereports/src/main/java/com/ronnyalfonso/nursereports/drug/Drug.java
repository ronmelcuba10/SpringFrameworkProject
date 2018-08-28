package com.ronnyalfonso.nursereports.drug;

import com.ronnyalfonso.nursereports.category.Category;
import com.ronnyalfonso.nursereports.named.Named;

public class Drug extends Named{
	
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
