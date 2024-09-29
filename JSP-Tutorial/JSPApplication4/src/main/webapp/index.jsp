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
		request.setAttribute("myname", "MOHD SAIF");
		//out.print(request.getAttribute("myname"));
		
	%>
	<h3>Welcome : ${requestScope.myname}</h3>
	
	<%
		session.setAttribute("college", "SPPU");
		//out.print(session.getAttribute("college"));
	%>
	<h3>College : ${sessionScope.college}</h3>
	<form action="output.jsp">
	Name:<input type="text" name=name placeholder="Enter Name" required></br>
	College: <input type="text" name="college" placeholder="Enter College"></br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>