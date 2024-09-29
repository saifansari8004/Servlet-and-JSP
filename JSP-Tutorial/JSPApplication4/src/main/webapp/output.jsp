<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>output</title>
</head>
<body>

	<%
		String myname = (String)request.getParameter("name");
		String myclg = (String)request.getParameter("college");
	%>
	<h3>Welcome : <%= myname %>  print by Expression Tag</h3>
	<h3>College : <%= myclg %>  print by Expression Tag</h3>
	<h1>=====================================================</h1>
	<h3>Welcome : ${param.name}  print by EL</h3>
	<h3>college : ${param.college}  print by EL</h3>
</body>
</html>