<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learning</title>
</head>
<body>

<h1>Welcome to JSP Learning Page</h1>

<%
    String name = "John Doe";
    int length = name.length();

%>

<p>The length of the name "<%= name %>" is <%= length %> characters.</p>

</body>
</html>