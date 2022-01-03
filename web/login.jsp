<%-- 
    Document   : login
    Created on : Feb 1, 2021, 5:03:28 PM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login | Crime Record Management System Login Page</title>
    <style>
        * {
            box-sizing: border-box;
        }
        body {
            background: #ddd;
            margin: 0;
            font-family: sans-serif;
        }
        .header {
            overflow: hidden;
            background-color: #003366;
            padding: 20px 10px;
        }
        .header a {
            float: left;
            color: #fff;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px; 
            line-height: 25px;
            border-radius: 4px;
        }
        .header a.logo {
            font-size: 25px;
            font-weight: bold;
        }
        .header a.active {
            background-color: #ccccff;
            color: white;
        }
        .header-right {
            float: right;
        }
        @media screen and (max-width: 500px) {
            .header a {
                float: none;
                display: block;
                text-align: left;
            }
            .header-right {
                float: none;
            }
        }
        .container{
            margin: auto;
            padding-top: 90px;
            width: 500px;
            max-width: 90%;
        }
        .container form{
            width: 100%;
            height: 100%;
            padding: 20px;
            background: white;
            border-radius: 5px;
            box-shadow: 0 8px 16px rgba(0,0,0,.3);
        }
        .container form h2{
            text-align: center;
            margin-bottom: 24px;
            color: #222;
        }
        .container form .form-control{
            width: 100%;
            height: 40px;
            background: white;
            border-radius: 4px;
            border: 1px solid silver;
            margin: 10px 0 18px 0;
            padding: 0 10px;
        }
        .container form .btn{
            margin-left: 50%;
            transform: translateX(-50%);
            width: 120px;
            height: 34px;
            border: none;
            outline: none;
            background: #003366;
            cursor: pointer;
            font-size: 16px;
            text-transform: uppercase;
            color: white;
            border-radius: 4px;
            transition: .3s;
        }
        .container form .btn:hover{
            opacity: .7;
        }
    </style>
</head>
<body>
    </div>
    <div class="header">
        <a href="" class="logo">Crime Record Management System</a>
        <div class="header-right">
            <a class="active" href="login.jsp">Login</a>
        </div>
    </div>
    <div class="container">
        <form method="POST" action="LoginServlet">
            <h2>User Login Form</h2><br>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" name="username" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" name="password" class="form-control" required>
            </div>
            <input type="submit" class="btn" value="Login">
        </form>
    </div>
</body>
</html>

