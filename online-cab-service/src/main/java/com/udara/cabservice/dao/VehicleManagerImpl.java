package com.udara.cabservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.udara.cabservice.model.Vehicle;

public class VehicleManagerImpl implements VehicleManager {
	
	private Connection getconnection() throws ClassNotFoundException, SQLException {
		
		DbConnector mysql = new MySqlDbConnectorImpl();
		return mysql.getConnection();
		
	}
	
	
	public boolean addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		Connection connection = getconnection();
		
		String query ="INSERT INTO vehicle(vehicleModel,vehicleNumber,seats,vehicleCategory,branch) VALUES(?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, vehicle.getVehicleModel());
		ps.setString(2, vehicle.getVehicleNumber());
		ps.setInt(3, vehicle.getSeats());
		ps.setString(4, vehicle.getVehicleCategory());
		ps.setString(5, vehicle.getBranch());
		
		int result= ps.executeUpdate();
		ps.close();
		connection.close();
		
		return result > 0;
	}

	public Vehicle getVehicle(int vehicleId) throws ClassNotFoundException, SQLException {
		Connection connection = getconnection();
		
		String query = "SELECT * FROM vehicle WHERE vehicleId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, vehicleId);
	    ResultSet rs = ps.executeQuery();
	    
	    Vehicle vehicle = new Vehicle();
	    
	    while(rs.next()) {
	    	vehicle.setVehicleId(rs.getInt("vehicleId"));
	    	vehicle.setVehicleModel(rs.getString("vehicleModel"));
	    	vehicle.setVehicleNumber(rs.getString("vehicleNumber"));
	    	vehicle.setSeats(rs.getInt("seats"));
	    	vehicle.setVehicleCategory(rs.getString("vehicleCategory"));
	    	vehicle.setBranch(rs.getString("branch"));
	    }
	    ps.close();
	    connection.close();
	    
		return vehicle;
	}

	public List<Vehicle> getVehicles() throws ClassNotFoundException, SQLException {
		Connection connection = getconnection();
		String query = "SELECT * FROM vehicle";
		
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<Vehicle> vehicleList = new ArrayList<>();
		
		while(rs.next()) {
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleId(rs.getInt("vehicleId"));
			vehicle.setVehicleModel(rs.getString("vehicleModel"));
	    	vehicle.setVehicleNumber(rs.getString("vehicleNumber"));
	    	vehicle.setSeats(rs.getInt("seats"));
	    	vehicle.setVehicleCategory(rs.getString("vehicleCategory"));
	    	vehicle.setBranch(rs.getString("branch"));
	    	
	    	vehicleList.add(vehicle);
			
		}
		st.close();
		connection.close();
		
		return vehicleList;
	}

	public boolean updateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		
		Connection connection = getconnection();
		String query = "UPDATE vehicle SET vehicleModel = ?, vehicleNumber= ?, seats = ?,vehicleCategory = ? ,branch = ? WHERE vehicleId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, vehicle.getVehicleModel());
		ps.setString(2, vehicle.getVehicleNumber());
		ps.setInt(3, vehicle.getSeats());
		ps.setString(4, vehicle.getVehicleCategory());
		ps.setString(5, vehicle.getBranch());
		ps.setInt(6, vehicle.getVehicleId());
		
		int result = ps.executeUpdate();
		
		ps.close();
		connection.close();
		
		return result > 0;
		
	}

	public boolean deleteVehicle(int vehicleId) throws ClassNotFoundException, SQLException {

		Connection connection = getconnection();
		String query = "DELETE FROM vehicle WHERE vehicleId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, vehicleId);

		int result= ps.executeUpdate();
		ps.close();
		connection.close();

		return result > 0;
	}

}
