<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead form</title>
</head>
<body>
<h1>Create | Lead</h1>
<form action="saveLead">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="mobile"/>
Source:<select name="source">
<option value="News paper">News paper</option>
<option value="Social Media">Social Media</option>
<option value="Linked in">Linked in</option>
<option value="Other">Other</option>
</select >
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>