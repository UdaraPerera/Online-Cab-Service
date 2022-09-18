package com.udara.cabservice.service;

import java.sql.SQLException;
import java.util.List;
import com.udara.cabservice.dao.VehicleFactory;
import com.udara.cabservice.dao.VehicleManager;
import com.udara.cabservice.model.Vehicle;

public class VehicleService {

	private static VehicleService vehicleServiceObj;

	private VehicleService() {

	}

	public static synchronized VehicleService getVehicleServiceInstance() {
		if(vehicleServiceObj == null) {
			vehicleServiceObj = new VehicleService();
		}
		return vehicleServiceObj;
	}
	
	//--------------CRUD Operations in Vehicle Class------------//
	
	public boolean addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();
		
		return vehicleManager.addVehicle(vehicle);
	}
	
	public Vehicle getVehicle(int vehicleId) throws ClassNotFoundException, SQLException {
		
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();

		return vehicleManager.getVehicle(vehicleId);
	}
	
	public List<Vehicle> getVehicles() throws ClassNotFoundException, SQLException{
		
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();

		return vehicleManager.getVehicles();
	}
	
	public boolean updateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();

		return vehicleManager.updateVehicle(vehicle);
	}
	
	public boolean deleteVehicle(int vehicleId) throws ClassNotFoundException, SQLException {
		
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();

	   return vehicleManager.deleteVehicle(vehicleId);
	}
		
}
	
	