<%-- 
    Document   : home
    Created on : Feb 2, 2021, 5:36:44 PM
    Author     : Siti Alieana Shahda
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <script src="https://kit.fontawesome.com/1b3b6e3bb4.js" crossorigin="anonymous"></script>
        <title>Home Page | Crime Record Management System</title>
        <style>
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                list-style: none;
                text-decoration: none;
                font-family: sans-serif;
            }
            body{
                background: #ddd;
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
                background-color: #b0adad;
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
            .wrapper{
                display: flex;
                position: relative;
            }
            .wrapper .sidebar{
                position: fixed;
                width: 270px;
                height: 100%;
                background: #666666;
                padding: 30px 0;
            }
            .wrapper .sidebar h2{
                color: #fff;
                text-transform: uppercase;
                text-align: center;
                margin-bottom: 30px;
            }
            .wrapper .sidebar ul li{
             padding: 15px;
             border-bottom: 1px solid rgba(0,0,0,0.05);
             border-top: 1px solid rgba(225,225,225,0.05);
            }
            .wrapper .sidebar ul li a{
                color: #fff;
                display: block;
            }
            .wrapper .sidebar ul li a .fas{
                color: #fff;
                width: 25px;
            }
            .wrapper .sidebar ul li:hover{
                background: #b0adad;
            }
            .wrapper .sidebar ul li:hover a{
                color: #fff;
            }
            .wrapper .main_content{
                width: 100%;
                margin-left: 300px;
                padding-top: 30px;
            }
            .wrapper .main_content .header2{
                padding: 20px;
                background: #fff;
                color: #717171;
                border-bottom: 1px solid #e0e4e8;
            }
            .wrapper .main_content .info{
                margin: 20px;
                color: #717171;
                line-height: 25px;
            }
            .wrapper .main_content .info div{
                margin-bottom: 20px;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <a href="" class="logo">CRIME RECORD MANAGEMENT SYSTEM</a>
            <div class="header-right">
                <a class="active" href="LogoutServlet">Log Out</a>
            </div>
        </div>
        <div class="wrapper">
            <div class="sidebar">
                <h2>Home</h2>
                <ul>
                    <li><a href="home.jsp"><i class="fas fa-home"></i>Home</a></li>
                    <li><a href="viewUser.jsp"><i class="fas fa-user"></i>User</a></li>
                    <li><a href="viewCriminal.jsp"><i class="fas fa-users"></i>Criminal</a></li>
                    <li><a href="viewRole.jsp"><i class="fas fa-briefcase"></i>Role</a></li>
                    <li><a href="viewCrime.jsp"><i class="fas fa-exclamation"></i>Crime</a></li>
                    <li><a href="LogoutServlet"><i class="fas fa-sign-out-alt"></i>Log Out</a></li>
                </ul>
            </div>
            <div class="main_content">
                <div class="header2">Welcome to Crime Record Management System</div>
    </body>
</html>

