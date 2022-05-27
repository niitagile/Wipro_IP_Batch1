<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Id</th>
<th>Name</th>  
<th>Designation</th>
<th>Salary</th>
</tr>
<c:forEach var="emp" items="${empList}">
<tr>
<td>${emp.eid}</td>
<td>${emp.name}</td>
<td>${emp.designation}</td>
<td>${emp.salary}</td>
<td><a href="editemp/${emp.eid}">Edit</a></td>
<td><a href="deleteemp/${emp.eid}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>