<html>
<head>
<title>Home Page</title>
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
	<nav class="navbar navbar-expand-lg">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1 text-white">GoCheeta</span>
			<form class="d-flex mb-3">
				<input class="form-control me-2 " id="search-bar" type="search"
					placeholder="Search Vehicle" aria-label="Search">
				<button class="btn-search" type="submit">Search</button>
			</form>
			<ul class="nav">
				<li class="nav-item"><a class="nav-link" href="#">User Name</a>
				</li>
				<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Bookings</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">Booking Prices</a></li>
						<li><a class="dropdown-item" href="add-booking.jsp">Create New Booking</a></li>
						<li><a class="dropdown-item" href="#">Booking Details</a></li>
					</ul>
				</li>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Logout</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>
