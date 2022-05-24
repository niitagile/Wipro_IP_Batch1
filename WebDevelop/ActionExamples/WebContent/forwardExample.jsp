<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <jsp:forward page="display.jsp">
<jsp:param name="url" value="localhost:8080/hello.jsp"/>
</jsp:forward> -->
<h1> starting of page</h1>
<jsp:include page="display.jsp">
<jsp:param name="url" value="localhost:8080/hello.jsp"/>
</jsp:include>
<h1> ending of page</h1>
</body>
</html>