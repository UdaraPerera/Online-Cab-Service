package com.udara.cabservice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnectorImpl implements DbConnector {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/onlinecabservice";
		String user = "root";
		String password = "1234";
		Connection connection = DriverManager.getConnection(url,user,password);
		return connection;
	}

}
