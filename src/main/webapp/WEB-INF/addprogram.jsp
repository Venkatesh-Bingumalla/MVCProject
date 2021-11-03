<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Status</title>
</head>
<body >
<form action="/postaddprogram" method="post">
		<table style="with: 50%">

			<tr>
				<td>ProgramName</td>
				<td><input type="text" name="pname" required/></td>
			</tr>
				<tr>
				<td>WON Number</td>
				<td><input type="number" name="won" required /></td>
			</tr>
		</table>
		<input type="submit" value="Add" />
		
		
		</form>
</body>
</body>
</html>