<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%
    String myName = (String)session.getAttribute("name_key");
%>

<h3>Welcome, <%= myName %> !</h3>

<a href="Profile.jsp">Profile</a> &nbsp; &nbsp;
<a href="About-us.jsp">About Us</a>

</body>
</html>