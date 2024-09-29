<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
        body 
        {
            background-color: #e0f7fa; 
            font-family: Arial, sans-serif;
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .box {
            background-color: #ffffff;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 300px;
        }

        .box a {
            display: block;
            margin: 15px 0;
            padding: 10px;
            text-decoration: none;
            font-size: 18px;
            color: #00796b;
            border: 2px solid #00796b;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }

        .box a:hover {
            background-color: #00796b;
            color: #ffffff;
        }

        .box h2 {
            margin-bottom: 20px;
            color: #333333;
        }
    </style>
</head>
<body>

    <div class="box">
        <h2>Welcome</h2>
        <a href="login.jsp">Login here</a>
        <a href="register.jsp">Register</a>
    </div>
</body>
</html>