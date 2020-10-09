<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC : Successfully submit your query</title>
</head>
<body>
<div align="center">
<h3 class="text-center"> ${title}</h3>
 <p class="text-center">${sub}</p>

 <hr>
<h3>Thanks for contacting us, Mr. ${user.name}</h3>
 <h3 style="color: green;text-align:center">created UserId: ${user.name}-${msg}</h3>
<h4>Your email address : ${user.email}</h4>
<h4>Password : ${user.password}</h4>

</div>
</body>
</html>