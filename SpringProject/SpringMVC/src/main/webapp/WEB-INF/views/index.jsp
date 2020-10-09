<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<link href="<c:url value="/resources/css/style.css"/>">
	<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
	<style type="text/css">
	/* body{
	marging:0px;
	padding:0px;
	background-image:url("/resources/img/nat.jpg") !important;
} */
	</style>

<title>MVC : Home!</title>
</head>
<body>

	<div class="container text-center">
	<div class="text-right">
	<span><a href="login"> login</a></span>	<span><a href="registration"> Registration</a></span>
	</div>
	<div class="card mx-auto mt-2 bg-warning" style="width:80% ;">
	<div class="card-header">
	<h3>MY SEARCH</h3>
	</div>
		<div class="card-body">
		<form action="search">
		<div class="form-group"><input type="text" name="search" placeholder="search your query" style="width:70%"></input></div>
		<div class="form-group"><button type="submit">Search</button></div>
		</form>
		</div>
		
		
		</div>
	</div>
	<%-- <img alt="my image" src="<c:url value="/resources/img/nat.jpg"/>"> --%>
	
	
	
	
	</div>








	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>