<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
        body {
            background-color: #f0e68c; /* Bright background color */
            font-family: Arial, sans-serif;
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .profile-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 350px;
            text-align: center;
        }

        .profile-container h2 {
            color: #333333;
            font-size: 24px;
        }

        .profile-container p {
            color: #555555;
            font-size: 18px;
            margin: 10px 0;
        }

        .profile-container .label {
            font-weight: bold;
            color: #000000;
        }
    </style>
</head>
<body>

    <div class="profile-container">
       <h2>Student Profile</h2>
	    <p><span class="label">Name:</span> <%= request.getAttribute("name") %></p>
	    <p><span class="label">PRN No:</span> <%= request.getAttribute("prn") %></p>
	    <p><span class="label">Address:</span> <%= request.getAttribute("address") %></p>
	    <p><span class="label">Email:</span> <%= request.getAttribute("email") %></p>
	    <p><span class="label">College Name:</span> <%= request.getAttribute("college") %></p>
    </div>

</body>
</html>