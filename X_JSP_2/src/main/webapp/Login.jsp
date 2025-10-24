<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<%
		String name = "naman";
        out.print("Hello " + name);
%>

<%

		session.setAttribute("session_name","numun");

%>
	<form action="About.jsp" method="get">
	
	<input type="text" name="name" placeholder="Enter Name"/>
	<input type="submit" value="Submit"/>	
	
	</form>
</body>
</html>