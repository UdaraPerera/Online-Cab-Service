package com.udara.cabservice.dao;

public class DriverFactory {

	public static ManageDriver getDriverManagerInstance() {
		return new DriverMangerImpl();
	}

}
