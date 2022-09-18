package com.udara.cabservice.service;

import java.sql.SQLException;
import java.util.List;
import com.udara.cabservice.dao.DriverFactory;
import com.udara.cabservice.dao.ManageDriver;
import com.udara.cabservice.model.Driver;


public class DriverService {


	private static DriverService driverServiceObj;

	private DriverService() {

	}

	public static synchronized DriverService getDriverServiceInstance() {
		if(driverServiceObj == null) {
			driverServiceObj = new DriverService();
		}
		return driverServiceObj;
	}
	
	
	public boolean addDriver(Driver driver) throws ClassNotFoundException, SQLException {
		
		ManageDriver driverManager = DriverFactory.getDriverManagerInstance();
		
		return driverManager.addDriver(driver);
	}
	
	public Driver getDriver(int driverId) throws ClassNotFoundException, SQLException {
		
		ManageDriver driverManager = DriverFactory.getDriverManagerInstance();

		return driverManager.getDriver(driverId);
	}
	
	public List<Driver> getDrivers() throws ClassNotFoundException, SQLException {
		
		ManageDriver driverManager = DriverFactory.getDriverManagerInstance();

		return driverManager.getDrivers();
	}
	
	public boolean updateDriver(Driver driver) throws ClassNotFoundException, SQLException {
		
		ManageDriver driverManager = DriverFactory.getDriverManagerInstance();

		return driverManager.updateDriver(driver);
	}
	
	public boolean deleteDriver(int driverId) throws ClassNotFoundException, SQLException {
		
		ManageDriver driverManager = DriverFactory.getDriverManagerInstance();

	   return driverManager.deleteDriver(driverId);
	}
		
}
	
	


