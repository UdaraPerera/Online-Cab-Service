package com.udara.cabservice.model;

public class Vehicle {
	
	private int vehicleId;
	private String vehicleModel;
	private String vehicleNumber;
	private int seats;
	private String vehicleCategory;
	private String branch;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String vehicleModel, String vehicleNumber, int seats, String vehicleCategory, String branch) {
		this.vehicleModel = vehicleModel;
		this.vehicleNumber = vehicleNumber;
		this.seats = seats;
		this.vehicleCategory = vehicleCategory;
		this.branch = branch;
	}

	public Vehicle(int vehicleId, String vehicleModel, String vehicleNumber, int seats, String vehicleCategory,String branch) {
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		this.vehicleNumber = vehicleNumber;
		this.seats = seats;
		this.vehicleCategory = vehicleCategory;
		this.branch = branch;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}


