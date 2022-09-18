<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored= "false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cab Service</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg mb-3">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1 text-white">GoCheeta</span>
			<form class="d-flex">
				<input class="form-control me-2 mb-3" id="search-bar" type="search" placeholder="Search Vehicle" aria-label="Search" name="d-id">
				<button class="btn-search mb-3" type="submit">Search</button>
			</form>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="add-driver.jsp">Add Driver</a></li>
			</ul>
		</div>
	</nav>
	<br/>
	<br/>
	
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Driver Id</th>
					<th scope="col">Driver Name</th>
					<th scope="col">Age</th>
					<th scope="col">Branch</th>
					<th scope="col">Contact No</th>
					<th scope="col">Email</th>
					<th scope="col">Address</th>
				</tr>
			</thead>
			<tbody>
				<tr>
				<tag:forEach var="driver" items="${driverList}">
						<td>${driver.driverId}</td>
						<td>${driver.driverName}</td>
						<td>${driver.age}</td>
						<td>${driver.branch}</td>
						<td>${driver.contactNumber}</td>
						<td>${driver.email}</td>
						<td>${driver.address}</td>
				</tag:forEach>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>