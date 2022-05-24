<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">
Enter User name<Input type="text" name="txtName">
Enter User age<Input type="text" name="txtAge">
<input type="submit" value="Click">

</form>
<%
String name=request.getParameter("txtName");
String age=request.getParameter("txtAge");
if(name!=null){
Cookie cookie=new Cookie("UserName",name);
Cookie cookie1=new Cookie("UserAge",age);
cookie.setMaxAge(24*60*60);
cookie1.setMaxAge(24*60*60);
response.addCookie(cookie);
response.addCookie(cookie1);
}

%>
<a href="display.jsp">display Cookie</a>
</body>
</html>