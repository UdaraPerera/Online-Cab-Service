<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Booking</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mt-3">
					<div class="card-header text-white text-center" style=background-color:#395B64;>
					<h5>Customer Booking</h5>
					</div>
					<div class="card-body" style=background-color:#E7F6F2;>
						<form action="" method="post">
							<div class="row mb-4">
								<div class="form-group col-md-6">
									<label for="InputName mb-3 "> Name</label> 
									<input type="text"class="form-control" id="cus-name" name="Cus-name"placeholder="Enter your Name" required>
								</div>
								<div class="form-group col-md-6">
									<label for="InputNo mb-3"> Contact Number</label> 
									<input type="text" class="form-control" id="cus-no" name="Cus-no"placeholder="Enter your Contact Number" required>
								</div>
							</div>
							<div class="row mb-4">
								<div class="form-group col-md-4 ">
									<label for="SelectPickUp mb-3">Pickup Location</label> <select id="pickup">
										<option value="Selected">Choose Pick up Location</option>
										<option value="Nugegoda">Nugegoda</option>
										<option value="Gampaha">Gampaha</option>
										<option value="Kandy">Kandy</option>
										<option value="Galle">Galle</option>
										<option value="Kurunegala">Kurunegala</option>
										<option value="Jaffna">Jaffna</option>
									</select>
								</div>

								<div class="form-group col-md-4">
									<label for="SelectDestination mb-3">Destination</label> 
									<select id="destination">
										<option value="Selected">Choose Destination</option>
										<option value="Nugegoda">Nugegoda</option>
										<option value="Gampaha">Gampaha</option>
										<option value="Kandy">Kandy</option>
										<option value="Galle">Galle</option>
										<option value="Kurunegala">Kurunegala</option>
										<option value="Jaffna">Jaffna</option>
									</select>
								</div>
								
									<div class="form-group col-md-4">
									<label for="SelectPassengers mb-3">Passengers</label> 
									<select id="passenger">
										<option value="Selected">Choose Number</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="6">6</option>
										<option value="8">8</option>
									</select>
								</div>
							</div>
							<div class="row mb-4">
							<div class="form-group col-md-6">
								<label for="InputDate mb-3"> Booking Date</label>
								 <input type="Date" class="form-control" id="b-date" name="B-date">
							</div>

							<div class="form-group col-md-6">
								<label for="InputTime mb-3"> Booking Time</label> 
								<input type="time" class="form-control" id="b-time" name="B-time">
							</div>
							</div>
							<div class="form-group mb-4">
								<label for="InputVehicle mb-3"> Vehicle</label> 
								<input type="text" class="form-control" id="vehicle" name="Vehicle">
							</div>

							<div class="form-group">
								<label for="InputPrice mb-3"> Booking Price</label>
								 <input type="text" class="form-control" id="b-price" name="B-price" readonly>
							</div>
							<div class="container mt-4 text-center p-2">
								<button type="button" class="btn-register text-white p-2" style=background-color:#395B64;>Confirm</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>