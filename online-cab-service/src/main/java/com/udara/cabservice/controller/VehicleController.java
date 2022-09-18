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
import com.udara.cabservice.model.Vehicle;
import com.udara.cabservice.service.VehicleService;


public class VehicleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VehicleService service;
	String message;

	public VehicleController() {
		service = VehicleService.getVehicleServiceInstance();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String vehicleId = request.getParameter("v-id");

		if(vehicleId != null) {
			viewSpecificVehicle(request,response);
		}else {
			viewAllVehicles(request,response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
	private void viewSpecificVehicle(HttpServletRequest request, HttpServletResponse response) {

	} 
	private void viewAllVehicles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Vehicle> vehicleList;
		try {
			vehicleList=service.getVehicles();
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
			vehicleList = new ArrayList<Vehicle>();
		}
		
		request.setAttribute("vehicleList", vehicleList);
		request.setAttribute("message", message);

		RequestDispatcher rd = request.getRequestDispatcher("vehicle.jsp");
		rd.forward(request, response);
	} 

}


 
 

	

    
  

	
   

	
  
     
	

	

