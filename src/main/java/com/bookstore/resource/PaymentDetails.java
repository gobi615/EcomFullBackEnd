package com.bookstore.resource;

import java.math.BigDecimal;


public class PaymentDetails {

	private String name ;
	private String email ;
	private String currency ;
	private double amount ;
	private String phno;
	private String redirectedTo;
	
	
	public String getRedirectedTo() {
		return redirectedTo;
	}
	public void setRedirectedTo(String redirectedTo) {
		this.redirectedTo = redirectedTo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	} 
	
	
	
}
