<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<title>MVC : Registration</title>

<style type="text/css">
body {
	background-color: #e2e2e2;
}
</style>
</head>
<body>
	<div class="container text-center text-black mt-3">
		<h3>Register here !!</h3>
		<div class="alert alert-secondary" role="alert"><form:errors path="customer.*"/></div>
		<hr>
		<form action="cusProcessForm" method="post">
			<div class="form-group row">
				<label for="customerName" class="col-sm-2 col-form-label">Name
					:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="customerName"
						name="customerName" placeholder="Enter name">
				</div>
			</div>
			<div class="form-group row">
				<label for="customerEmail" class="col-sm-2 col-form-label">Email
					:</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="customerEmail"
						name="customerEmail" placeholder="Enter email">
				</div>
			</div>
			<div class="form-group row">
				<label for="password" class="col-sm-2 col-form-label">Password
					:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password"
						name="password" placeholder="password">
				</div>
			</div>
			<div class="form-group row">
				<label for="dob" class="col-sm-2 col-form-label">D.O.B :</label>
				<div class="col-sm-10">
					<input type="text" placeholder="dd/mm/yyyy" class="form-control"
						id="dob" name="dob">
				</div>
			</div>
			<div class="form-group row">
				<label for="customerType" class="col-sm-2 col-form-label">Select
					Type :</label>

				<div class="col-sm-10">
					<select class="form-control" id="customerType" name="customerType">
						<option>Old customer</option>
						<option>New Customer</option>
					</select>

				</div>

			</div>

			<div class="form-group row">
				<label for="language" class="col-sm-2 col-form-label">Select
					Language :</label>

				<div class="col-sm-10">
					<select multiple class="form-control" id="language" name="language">
						<option>English</option>
						<option>French</option>
						<option>German</option>
						<option>Hindi</option>
					</select>

				</div>

			</div>

			<div class="form-group row">
				<label for="gender" class="col-sm-2 col-form-label">Select
					Gender : </label>
				<div class="col-sm-10">
					<div class="form-check text-left">
						<input class="form-check-input" type="radio" name="gender"
							id="gender" value="Male" checked> <label
							class="form-check-label" for="gender"> Male </label>
					</div>
					<div class="form-check text-left">
						<input class="form-check-input" type="radio" name="gender"
							id="gender" value="female" checked> <label
							class="form-check-label" for="gender"> Female </label>
					</div>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary">Register</button>
				</div>
			</div>
		</form>


	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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