


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="/reg1" method="post">
			<table style="with: 50%">
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empname" required /></td>
				</tr>
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="empid" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password" required /></td>
				
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" required /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>