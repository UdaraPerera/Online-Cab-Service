package com.udara.cabservice.model;

public class Driver {
	
	private int driverId;
	private String driverName;
	private int age;
	private String branch;
	private int contactNumber;
	private String email;
	private String address;
	

	public Driver(int driverId, String driverName, int age, String branch, int contactNumber,String email, String address) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.age = age;
		this.branch = branch;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
	}


	public Driver() {
		
	}


	public Driver(String driverName, int age, String branch, int contactNumber, String email,String address) {
		this.driverName = driverName;
		this.age = age;
		this.branch = branch;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	

}
