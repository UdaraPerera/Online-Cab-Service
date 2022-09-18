package com.udara.cabservice.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.udara.cabservice.model.Driver;
import com.udara.cabservice.service.DriverService;

public class DriverController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DriverService service;
	String message;
	
   
    public DriverController() {
    	service = DriverService.getDriverServiceInstance();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String driverId = request.getParameter("d-id");

		if(driverId != null) {
			viewSpecificDriver(request,response);
		}else {
			viewAllDrivers(request,response);
		}
		
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	private void viewSpecificDriver(HttpServletRequest request, HttpServletResponse response) {
	
		
	}

	
	private void viewAllDrivers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Driver> driverList;
		try {
			driverList=service.getDrivers();
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
			driverList = new ArrayList<Driver>();
		}
		
		request.setAttribute("driverList",driverList);
		request.setAttribute("message", message);

		RequestDispatcher rd = request.getRequestDispatcher("driver.jsp");
		rd.forward(request, response);
		
	}
	
}


	


	
	
   

	

	
