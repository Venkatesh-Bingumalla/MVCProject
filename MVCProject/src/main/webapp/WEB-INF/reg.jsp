


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guru Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="/reg1" method="post">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" required /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" required /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="uname" required /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="pass" required /></td>
				</tr>
				
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="num" required /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>