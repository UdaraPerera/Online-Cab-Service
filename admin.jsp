<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" 
integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto&display=swap"rel="stylesheet">
</head>
<body>
<div class ="d-flex" id="wrapper">
<div class = "bg-white">
<div class="sidebar-heading text-center py-4 primary-text fs-4 fw-bold ">
<i class="fa-solid fa-taxi"></i> GoCheeta
</div>

<!-- -----------------------------side bar--------------------------- ---------->

<div class="list-group list-group-flush my-3">
	<a href="#" class="list-group-item list-group-item-action bg-transparent second-text fx-bold ">
		<i class="fa-solid fa-user-group"></i> Driver
   </a>
   <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fx-bold ">
		<i class="fa-solid fa-car-side"></i>  Vehicles
   </a>
    <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fx-bold ">
    	<i class="fa-solid fa-wrench"></i>  Categories
   </a>
    <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fx-bold ">
		<i class="fa-solid fa-address-book"></i> Bookings
	</a>
	 <a href="#" class="list-group-item list-group-item-action bg-transparent second-text fx-bold ">
		<i class="fa-solid fa-file-circle-check"></i> Reports
	</a>
</div>
</div>

<!--------------------------navigation bar---------------------------------------->

		<div id="page-content-wrapper">

			<nav class="navbar navbar-expand-lg navbar-light bg-transparent py-4 px-4">
				<div class="d-flex algin-items-center">
					<i class="fas fa-align-left primary-text fs-4 me-3"
						id="menu-toggle"></i>
					<h2 class="fs-2 m-0">Dashboard</h2>
				</div>

				<button class="navbar-toggler" type="button"data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"aria-controls="navbarSupportedContent" aria-expanded="false"aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item-dropdown">
						<a href="#"class="nav-link dropdown-toggle second-text fw-bold"id="navbarDropdown" role="button" data-bs-toggle="dropdown"aria-expanded="false"> 
						<i class="fas fa-user me-2"></i>Udara Perera
						</a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a href="#" class="dropdown-item">Profile</a></li>
								<li><a href="#" class="dropdown-item">Logout</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
</body>
</html>
