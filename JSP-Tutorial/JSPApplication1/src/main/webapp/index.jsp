<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Intro to JSP</title>
</head>
<body>
	<%
		String name="Saif Ansari";
		out.print(name.length());
	%>
	<%= name %>
	<%= name.length() %>
	<%= LocalTime.now() %>
	<%= LocalDate.now() %>
	
</body>
</html>