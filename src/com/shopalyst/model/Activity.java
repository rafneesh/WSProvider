package com.shopalyst.model;

import java.sql.Timestamp;

/**
 * @author Rafne [Email: rafneesh@gmail.com]
 *
 */
public class Activity {
	
	Timestamp timestamp;
	
	String action;
	
	String productId;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

}
