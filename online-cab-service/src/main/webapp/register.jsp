<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel ="stylesheet" href="css/style.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto&display=swap" rel="stylesheet">
<script>

function validate(){
	
	var fullname = document.form.fullname.value;
	var contactno = document.form.contactno.value;
	var email = document.form.email.value;
	var address = document.form.address.value;
	var password = document.form.password.value;
	var conpassword = document.form.conpassword.value;
	
	if(fullname == null || fullname == ""){
		alert("please enter your full name");
		return false;	
	}else if(contactno == null || contactno ==""){
		alert("please enter your contact number");
		return false;
	}else if(email == null || email == ""){
		alert("please enter your email");
		return false;
	}else if(address == null || address==""){
		alert("please enter your address");
		return false;
	}else if(password == null || password==""){
		alert("please enter your password");
		return false;
	}else if(password != conpassword){
		alert("passwords are not matched");
		return false;
	}
}
</script>
</head>
<body style="background-image:url('./img/new background.jpg');
   background-repeat:no-repeat">
<div class="container mt-3">
  <div class ="row">
    <div class ="col-md-6 offset-md-3">
    
    <div class="card mt-6">
       <div class="card-header text-white text-center">
       <h3>User Registration</h3>
       </div>
         
  <div class="card-body">
   <form action="" method="post ">
   
    <div class= "form-group  mb-2">
     <label for ="InputUsername" >Full Name</label>
      <input type ="text" class="form-control" id="Fname" name="fullname" placeholder="Enter your Name">
   </div>
   
  <div class= "form-group mb-2">
    <label for ="InputContactNumber">Contact Number</label>
     <input type ="text" class="form-control" id="Cno" name="contactno" placeholder="Enter your Contact Number">
  </div>
  
    <div class= "form-group mb-2">
    <label for ="InputEmail">Email</label>
     <input type ="email" class="form-control" id="Email" name="email" placeholder="Enter your Email">
  </div>
  
  <div class= "form-group mb-2">
    <label for ="InputAdd">Address</label>
    <input type ="text" class="form-control" id="Address" name="address" placeholder="Enter your Address">
  </div>
  
   <div class= "form-group mb-4">
    <label for ="InputPassword">Password</label>
     <input type ="password" class="form-control" id="Password" name="password">
  </div>
  
  <div class= "form-group mb-4">
    <label for ="InputPassword2">Confirm Password</label>
     <input type ="password" class="form-control" id="conPassword" name="conpassword">
  </div>
 
  <div class="container mb-1 text-center">
  <button type="button" class="btn-register">Register</button>
  </div><br>
  
 <div class="container text-center">
  <p>Already Registered User? <a href="login.jsp">Login Now</a></p>
  </div>
  </form>
  </div>
  </div>
    </div>
  </div>
</div>
</body>
</html>
