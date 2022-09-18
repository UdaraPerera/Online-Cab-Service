package com.udara.cabservice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.udara.cabservice.model.Registration;


public class RegisterDao {

 public int addUser(Registration registration) throws ClassNotFoundException, SQLException {
	 String query = "INSERT INTO register(fullname,contactnumber,email,address,password) VALUES(?,?,?,?,?)";
	 
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/onlinecabservice";
		String user = "root";
		String password = "1234";
		Connection connection = DriverManager.getConnection(url,user,password);
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,registration.getFullName());
		ps.setString(2,registration.getContactNumber());
		ps.setString(3,registration.getEmail());
		ps.setString(4,registration.getAddress());
		ps.setString(5,registration.getPassword());
		
		int result= ps.executeUpdate();
		ps.close();
		connection.close();
		
		return result;
		
		 
 }

}
