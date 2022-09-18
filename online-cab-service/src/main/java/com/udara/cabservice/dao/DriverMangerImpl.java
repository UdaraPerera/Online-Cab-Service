package com.udara.cabservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.udara.cabservice.model.Driver;

public class DriverMangerImpl implements ManageDriver {
	
private Connection getconnection() throws ClassNotFoundException, SQLException {
		
		DbConnector mysql = new MySqlDbConnectorImpl();
		return mysql.getConnection();
		
	}

	public boolean addDriver(Driver driver) throws ClassNotFoundException, SQLException {
		
		Connection connection = getconnection();
		
		String query ="INSERT INTO driver(driverName,age,branch,contactNumber,email,address) VALUES(?,?,?,?,?,?)";
		PreparedStatement ps =connection.prepareStatement(query);
		ps.setString(1, driver.getDriverName());
		ps.setInt(2, driver.getAge());
		ps.setString(3, driver.getBranch());
		ps.setInt(4, driver.getContactNumber());
		ps.setString(5, driver.getEmail());
		ps.setString(6, driver.getAddress());
		
		int result= ps.executeUpdate();
		ps.close();
		connection.close();
		
		return result > 0;
	}

	
	public Driver getDriver(int driverId) throws ClassNotFoundException, SQLException {
		
		Connection connection = getconnection();
		
		String query = "SELECT * FROM driver WHERE driverId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, driverId);
	    ResultSet rs = ps.executeQuery();
	    
	   Driver driver = new Driver();
	    
	    while(rs.next()) {
	    	driver.setDriverId(rs.getInt("driverId"));
	    	driver.setDriverName(rs.getString("driverName"));
	    	driver.setAge(rs.getInt("age"));
	    	driver.setBranch(rs.getString("branch"));
	    	driver.setContactNumber(rs.getInt("contactNumber"));
	    	driver.setEmail(rs.getString("email"));
	    	driver.setAddress(rs.getString("address"));
	    }
	    ps.close();
	    connection.close();
	    
		return driver;
	}


	public List<Driver> getDrivers() throws ClassNotFoundException, SQLException {
	
		Connection connection = getconnection();
		String query = "SELECT * FROM vehicle";
		
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<Driver> driverList = new ArrayList<>();
		
		while(rs.next()) {
			Driver driver = new Driver();
	    	driver.setDriverId(rs.getInt("driverId"));
	    	driver.setDriverName(rs.getString("driverName"));
	    	driver.setAge(rs.getInt("age"));
	    	driver.setBranch(rs.getString("branch"));
	    	driver.setContactNumber(rs.getInt("contactNumber"));
	    	driver.setEmail(rs.getString("email"));
	    	driver.setAddress(rs.getString("address"));
	    	
	    	driverList.add(driver);
			
		}
		st.close();
		connection.close();
		return driverList;
	}


	public boolean updateDriver(Driver driver) throws ClassNotFoundException, SQLException {
		
		Connection connection = getconnection();
		String query = "UPDATE driver SET driverName = ?, age= ?, branch = ?, contactNumber= ?, email= ?, address= ? WHERE driverId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, driver.getDriverName());
		ps.setInt(2, driver.getAge());
		ps.setString(3, driver.getBranch());
		ps.setInt(4, driver.getContactNumber());
		ps.setString(5, driver.getEmail());
		ps.setString(6, driver.getAddress());
		
		int result = ps.executeUpdate();
		
		ps.close();
		connection.close();
		
		return result > 0;
		
	}

	public boolean deleteDriver(int driverId) throws ClassNotFoundException, SQLException {
		
		Connection connection = getconnection();
		String query = "DELETE FROM driver WHERE driverId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, driverId);

		int result= ps.executeUpdate();
		ps.close();
		connection.close();

		return result > 0;
	}
	

}
