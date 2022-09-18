package com.udara.cabservice.dao;

import java.sql.SQLException;
import java.util.List;
import com.udara.cabservice.model.Vehicle;

public interface VehicleManager {
	
	public boolean addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException;
	public Vehicle getVehicle(int vehicleId) throws ClassNotFoundException, SQLException;
	public List<Vehicle> getVehicles() throws ClassNotFoundException, SQLException;
	public boolean updateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException;
	public boolean deleteVehicle(int vehicleId) throws ClassNotFoundException, SQLException;

}
