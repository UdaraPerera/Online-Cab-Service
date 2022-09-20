<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver Registration</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<div class="card mt-6">
					<div class="card-header text-white text-center">
						<h3>Driver Registration</h3>
					</div>

					<div class="card-body">
						<form action="" method="post">

							<div class="form-group  mb-2">
								<label for="InputUsername">Driver Name</label> <input
									type="text" class="form-control" id="Dname" name="dname"
									placeholder="Enter the Name">
							</div>

							<div class="form-group mb-2">
								<label for="InputAge">Age</label> <input type="text"
									class="form-control" id="Dage" name="dage"
									placeholder="Enter the Age">
							</div>

							<div class="form-group mb-2">
								<label for="SelectGender">Gender</label><br> <select
									id="gender">
									<option value="selected" class="selected">Choose Gender</option>
									<option value="Male">Male</option>
									<option value="Female">Female</option>
								</select><br>
							</div>

							<div class="form-group mb-3">
								<label for="SelectBranch">Branch</label><br> <select
									id="branch">
									<option value="selected" class="selected">Choose Branch</option>
									<option value="Nugegoda">Nugegoda</option>
									<option value="Gampaha">Gampaha</option>
									<option value="Kandy">Kandy</option>
									<option value="Galle">Galle</option>
									<option value="Kurunegala">Kurunegala</option>
									<option value="Jaffna">Jaffna</option>
								</select><br>
							</div>

							<div class="form-group mb-2">
								<label for="InputContactNumber">Contact Number</label> <input
									type="text" class="form-control" id="Dno" name="dno"
									placeholder="Enter the Contact Number">
							</div>

							<div class="form-group mb-2">
								<label for="InputEmail">Email</label> <input type="email"
									class="form-control" id="Demail" name="demail"
									placeholder="Enter the Email Address">
							</div>

							<div class="form-group mb-3">
								<label for="InputAdd">Address</label>
								<textarea></textarea>
							</div>

							<div class="container mb-5 text-center">
								<button type="button" class="btn-register">Register</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>





