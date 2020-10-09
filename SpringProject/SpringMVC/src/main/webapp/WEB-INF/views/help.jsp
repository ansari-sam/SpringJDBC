<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC : Help</title>
</head>
<body>
<h1>Help page</h1>
<%
/* String name=(String)request.getAttribute("name");
Integer roll=(Integer)request.getAttribute("roll");
 */
%>
<h3>Name : ${name}</h3>
<h3>Roll Number :${roll}</h3>
<h3>Marks Obtained :</h3>
<c:forEach var="item" items="${marks}">
<h4>${item}</h4>
</c:forEach>
<h3>Date And Time : ${time}</h3>
</body>
</html>