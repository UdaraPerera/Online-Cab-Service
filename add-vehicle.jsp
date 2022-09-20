<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Registration</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
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
						<h3>Vehicle Registration</h3>
					</div>

					<div class="card-body">
						<form action="" method="post">

							<div class="form-group  mb-2">
								<label for="InputUsername"> Vehicle Model</label> <input
									type="text" class="form-control" id="vModal" name="vmodal">
							</div>

							<div class="form-group mb-2">
								<label for="InputAge">Vehicle Number</label> <input type="text"
									class="form-control" id="vNo" name="vno">
							</div>

							<div class="form-group mb-2">
								<label for="Select-Seats">Number of Seats</label><br> <select
									id="seats">
									<option value="selected" class="selected">Choose Number of Seats</option>
									<option value="4 seats">4 seats</option>
									<option value="5 seats">5 seats</option>
									<option value="7 seats">7 seats</option>
									<option value="8 seats">8 seats</option>
								</select><br>
							</div>

							<div class="form-group mb-2">
								<label for="Select-Category">Vehicle Category</label><br> <select
									id="category">
									<option value="selected" class="selected">Choose Vehicle Category</option>
									<option value="mini car">Mini Car</option>
									<option value="mini van">Mini Van</option>
									<option value="normal car">Normal Car</option>
									<option value="normal van">Normal Van</option>
								</select><br>
							</div>
							
							<div class="form-group mb-4">
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

							<div class="container mb-4  text-center">
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