<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int id=Integer.parseInt(request.getParameter("uid"));
	String uname=request.getParameter("uname");


%>


<jsp:useBean id="obj1" class="beans.User" scope="session">
</jsp:useBean>
<jsp:setProperty property="userid" name="obj1" value="<%=id %>"/>
<jsp:setProperty property="username" name="obj1" value="<%=uname%>"/>


<a href="DisplayUser.jsp"> click</a> 

</body>
</html>