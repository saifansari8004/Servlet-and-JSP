<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Student</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #fff176;
            margin: 0;
            padding: 0;
        }

        .welcome-container {
            text-align: center;
            margin-top: 100px;
        }

        .welcome-container h1 {
            font-size: 36px;
            color: #333;
        }

        .welcome-container p {
            font-size: 20px;
            color: #555;
            margin: 20px 0;
        }
    </style>
</head>
<body>
	<% String name = (String)request.getAttribute("email"); %>

    <div class="welcome-container">
        <h1>Welcome, <%= name  %>!</h1>
        <p>We're glad to have you with us.</p>
    </div>
</body>
</html>