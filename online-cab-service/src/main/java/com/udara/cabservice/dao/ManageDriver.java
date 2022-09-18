package com.udara.cabservice.dao;


import java.sql.SQLException;
import java.util.List;
import com.udara.cabservice.model.Driver;
public interface ManageDriver {
	
	public boolean addDriver(Driver driver)throws ClassNotFoundException, SQLException ;
	public Driver getDriver(int driverId)throws ClassNotFoundException, SQLException;
	public List<Driver> getDrivers()throws ClassNotFoundException, SQLException;
	public boolean updateDriver(Driver driver)throws ClassNotFoundException, SQLException;
	public boolean deleteDriver(int driverId)throws ClassNotFoundException, SQLException;

}
