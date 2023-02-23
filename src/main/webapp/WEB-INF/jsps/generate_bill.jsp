<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Bill</title>
</head>
<body>
<h1>Generate Bill</h1>
<form action="generateBill">
<pre>
First Name<input type="text" value="${contact.firstName}" name="firstName"/>
Last Name<input type="text" value="${contact.lastName}" name="lastName"/>
Email<input type="text" value="${contact.email}" name="email"/>
Mobile<input type="text" value="${contact.mobile}" name="mobile"/>
Source<input type="text" value="${contact.source}" name="source">
Product<input type="text" name="product">
Quantity<input type="text" name="quantity"/>
Amount<input type="text" name="amount"/>
<input type="submit" value="generate"/>
</pre>
</form>
</body>
</html>