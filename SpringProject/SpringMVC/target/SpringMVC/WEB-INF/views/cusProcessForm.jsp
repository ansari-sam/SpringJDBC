<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>MVC : Customer Successfully Registered</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h5 style="color: green;">Customer Successfully Registered</h5>
		<div class="card text-center">
			<div class="card-header">Account Details</div>
			<div class="card-body">
				<h5 class="card-title">${customer.customerName}</h5>
				<p class="card-text">Email : ${customer.customerEmail}</p>
				<p class="card-text">D.O.B : ${customer.dob}</p>
				<p class="card-text">Customer Type : ${customer.customerType}</p>
				<p class="card-text">Language Known : ${customer.language}</p>
				<p class="card-text">Gender : ${customer.gender}</p>
				<a href="#" class="btn btn-outline-secondary mr-3">Add Address</a>
				<a href="#" class="btn btn-outline-secondary">save card</a>
			</div>
			<div class="card-footer text-right"><a href="#" class="btn btn-outline-success">Edit</a></div>
		</div>
	</div>



	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>