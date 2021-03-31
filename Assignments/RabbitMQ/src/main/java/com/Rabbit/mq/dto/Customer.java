package com.Rabbit.mq.dto;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Configuration
@Document(collection="customer")
public class Customer {
	
	@Id
	private String customerid;
	private String customerName;
	public Customer(String customerid, String customerName) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
