<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting tag</title>
</head>
<body>
	<h2 style>JSP Tags</h2>
		<ol>
			<li><h3 style="color:blue">Scripting Tags</h3></li>
			<ul>
				<li><h4 style="color:green">Declarations Tags</h4></li>
				<li><h4 style="color:green">Scriptlet Tags</h4></li>
				<li><h4 style="color:green">Expression Tags</h4></li>
			</ul>
			<li><h3 style="color:blue">Directive Tags</h3></li>
			<ul>
				<li><h4 style="color:green">Page Directive</h4></li>
				<li><h4 style="color:green">Include Directive</h4></li>
				<li><h4 style="color:green">taglib Directive</h4></li>
			</ul>
			<li><h3 style="color:blue">Action Tags</h3></li>
			<ul>
				<li><h4 style="color:green">jsp:include.... %</h4></li>
				<li><h4 style="color:green">jsp:forward.... %</h4></li>
				<li><h4 style="color:green">jsp:useBean.... %</h4></li>
			</ul>
		</ol>
	<%! //Declaration tag(only for variable,method etc declaration)
		int num=10;
		String str = "This is a String";
		int square()
		{
			return num*num;
		}
	%>
	
	<%
		int x=12;
		//session.getAttribute("name");
		if(x>10)
		{
			out.println("X > 10");
		}
		else
		{
			out.println("X > 10");
		}
		out.print(str);
		for(int i=1;i<=5;i++)
		{
			out.println(i);
		}
	%>
	<%= square()%>
	<%= str %>
	<%= LocalDate.now() %>
	

</body>
</html>