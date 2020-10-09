package com.springMVC.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="UserMVC")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_ID")
	private int Id;
	@Column(name="User_name")
	private String name;
	@Column(name="User_email")
	private String email;
	@Column(name="User_password")
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	

}
