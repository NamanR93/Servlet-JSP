<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About-Us</title>
</head>
<body>

<%
    String myName = (String)session.getAttribute("name_key");
%>

<h3>Welcome, <%= myName %> !</h3>

<a href="Home.jsp">Home</a> &nbsp; &nbsp;
<a href="Profile.jsp">Profile</a>

</body>
</html>