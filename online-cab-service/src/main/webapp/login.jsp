<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GoCheeta Cab Service</title>

<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto&display=swap"rel="stylesheet">
</head>
<body style="background-image:url('./img/new background.jpg');
   background-repeat:no-repeat">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<div class="card-login mt-6">
					<div class="card-header text-white text-center">
						<h3>User Login</h3>
					</div>

					<div class="card-body">
						<form action="" method="post">
							<div class="form-group mb-3">
								<label for="InputEmail">Email Address</label> <input
									type="email" class="form-control" id="Email" name="email"
									placeholder="Enter your Email Address" required>
							</div>
							<div class="form-group mb-3">
								<label for="InputPassword">Password</label> <input
									type="password" class="form-control" id="Pass" name="pass"
									placeholder="Enter your Password" required>
							</div>

							<div class="container mb-3 text-center">
								<p>
									<a href="" class="forgot">Forgot Password?</a>
								<p>
							</div>
							<br/>

							<div class="container mb-4 text-center">
								<input type="submit" class="btn-login" value="Submit">
							</div>

							<div class="container mt-3 mb-3 text-center">
								<p>
									Need an Account? <a href="register.jsp">Sign-Up Now</a>
								</p>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>