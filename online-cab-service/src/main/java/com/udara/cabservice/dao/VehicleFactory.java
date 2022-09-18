package com.udara.cabservice.dao;

public class VehicleFactory {
	
	public static VehicleManager getVehicleManagerInstance() {
		return new VehicleManagerImpl();
	}

}
