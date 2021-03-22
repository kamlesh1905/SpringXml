package com.kamleshit.Entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	
	private Integer customerId;
	private int customerAge;
	private String customerName;
	private String customerEmail;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int i) {
		this.customerAge = i;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerAge=" + customerAge + ", customerName=" + customerName
				+ ", customerEmail=" + customerEmail + "]";
	}
	
	
	

}
