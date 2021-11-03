<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Status</title>
</head>
<body >
${m1}


      <h2>Programs</h2>
   <table>
         		<th>
         			<tr>
                	<td>Program Name</td>
                	<td>Won</td>
                	
                	</tr>
                </th>
            <c:forEach var="col" items="${m2}">
                <tr>
                	<td>${col.pname}</td>
                	<td>${col.won}</td>
                	
                	
                	
                </tr>
            </c:forEach>
    </table>   
    
<button><a href="/getaddprogram">Add Programs</button>
</body>
</body>
</html>