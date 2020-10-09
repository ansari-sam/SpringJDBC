package com.springMVC.entities;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Customer {

	private String customerName;
	private String customerEmail;
	private String password;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private String customerType;
	private List<String> language;
	private String gender;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String customerEmail, String password, Date dob, String customerType,
			List<String> language, String gender) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.password = password;
		this.dob = dob;
		this.customerType = customerType;
		this.language = language;
		this.gender = gender;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public List<String> getLanguage() {
		return language;
	}
	public void setLanguage(List<String> language) {
		this.language = language;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerEmail=" + customerEmail + ", password=" + password
				+ ", dob=" + dob + ", customerType=" + customerType + ", language=" + language + ", gender=" + gender
				+ "]";
	}
	
	
}
