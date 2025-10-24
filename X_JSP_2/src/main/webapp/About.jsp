<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>output</title>
</head>
<body>



<!-- ----This is about the implicit objects in JSP ------>


<%-- <%

    String name = request.getParameter("name");
    out.print("Hello " + name);
%>

<br/><br/>
<%
	String cname = session.getAttribute("session_name").toString();
    out.print("Welcome to About Page " + cname);
%> --%>

<!-- Now we will see EL expression language -->

	<%
	request.setAttribute("name", "John Doe");
	// out.print("Hello " + request.getAttribute("name"));
	%>
	<h3> hello: ${requestScope.name}</h3>
	
	<%
		session.setAttribute("session_name", "Jane Smith");
		//out.print("Welcome to About Page " + session.getAttribute("session_name"));
	%>
	<h3> ${session_name} </h3>

</body>
</html>