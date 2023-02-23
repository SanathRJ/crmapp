<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Contacts</title>
</head>
<body>
<h1>List Contacts</h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
<th>Billings</th>
</tr>
<c:forEach var="contact" items="${contacts}">
<tr>
<td>${contact.firstName}</td>
<td>${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.mobile}</td>
<td>${contact.source}</td>
<td><a href=createBill?id=${contact.id}>Bill</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>