<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>User Login Interface</h1>
<form action="/status" method="post">
<p>User Name: <input type="text" name="userName"/></p>
<p>Password: <input type="password" name="password"/></p>
<input type="submit" value="LogIn"/>
</form>
</body>
</html>