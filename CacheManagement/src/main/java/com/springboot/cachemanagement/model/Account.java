package com.springboot.cachemanagement.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long accountId;
	private String customerFirstName;
	private String customerLastName;
	private String city;
	private String state;
	
	public Account()
	{
		
	}
	
	public Account(Long accountId,String customerFirstName,String customerLastName,String city, String state)
	{
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.city = city;
		this.state = state;
		this.accountId = accountId;
	}
	
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString()
	{
		return "Customer Account Id :"+this.accountId+" Fist Name:"+this.customerFirstName+" Last Name:"+this.customerLastName+" City:"+this.city+" State:"+this.state;
	}
	
	

}
