package com.avdhoot.jerseyproject;

import javax.xml.bind.annotation.XmlRootElement;

public class Person {
	private String firstName;
	private String lastName;
	private String dob;
	private String city;
	private String state;
	private int pId ;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getFirstName() {
		return firstName;
	}
	public Person(String firstName, String lastName, String dob, String city, String state,int pId) {
		super();
		this.pId = pId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.city = city;
		this.state = state;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public Person() {
	}
	public void setDob(String dob) {
		this.dob = dob;
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

}
