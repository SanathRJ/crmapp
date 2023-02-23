<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>email Compose</title>
</head>
<body>
<h1>Compose Email</h1>
${message}
<form action="sendEmail">
<pre>
To <input type="text" name="to" value="${email}"/>
Subject <input type="text" name="sub"/>
Message <textarea name="msg" rows="10" cols="50"></textarea>
<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>