<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String myName = (String)req.getAttribute("name");
%>

<h3>Welcome: <%= myName %></h3>

</body>
</html>