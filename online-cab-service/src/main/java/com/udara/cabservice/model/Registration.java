package com.udara.cabservice.model;

public class Registration {
	
		private int regId;
		private String fullName;
		private String contactNumber;
		private String email;
		private String address;
		private String password;
		
	public Registration() {
			
	}
		
		
		public Registration(int regId, String fullName,String contactNumber, String email,String address, String password) {
			this.regId = regId;
			this.fullName = fullName;
			this.contactNumber = contactNumber;
			this.email = email;
			this.address = address;
			this.password = password;
		}


		public Registration(String fullName, String contactNumber, String email, String address,String password) {
			this.fullName = fullName;
			this.contactNumber = contactNumber;
			this.email = email;
			this.address = address;
			this.password = password;
		}

		public int getRegId() {
			return regId;
		}


		public void setRegId(int regId) {
			this.regId = regId;
		}


		public String getFullName() {
			return fullName;
		}


		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getContactNumber() {
			return contactNumber;
		}


		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		
		
		
		
		

}
