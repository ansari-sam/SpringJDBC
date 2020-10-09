package com.springJdbc.entities;

public class UserInfo {
	private int id;
	private String name;
	private String city;
	private String street;
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(int id, String name, String city, String street) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.street = street;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", city=" + city + ", street=" + street + "]";
	}

}
