package com.udara.cabservice.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.udara.cabservice.dao.RegisterDao;
import com.udara.cabservice.model.Registration;

public class RegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RegisterDao registerDao = new RegisterDao(); 
    
    public RegisterControl() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullName = request.getParameter("fullName");
		String contactNumber = request.getParameter("contactNumber");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		Registration registration = new Registration();
		
		registration.setFullName(fullName);
		registration.setContactNumber(contactNumber);
		registration.setEmail(email);
		registration.setAddress(address);
		registration.setPassword(password);
		
		
		
		
	
	}

}
