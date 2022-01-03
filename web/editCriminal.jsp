<%-- 
    Document   : editCriminal
    Created on : Feb 4, 2021, 8:07:20 PM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "util.DBConnection"%>
<%@page import = "java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <script src="https://kit.fontawesome.com/1b3b6e3bb4.js" crossorigin="anonymous"></script>
        <title>Update Criminal | Crime Record Management System</title>
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
            color: black;
            text-transform: uppercase;
            font-size: 20px;
            font-family: sans-serif;
        }
        .container{
            margin-left: 570px;
            padding-top: 30px;
            width: 500px;
            max-width: 90%;
        }
        .container form{
            width: 100%;
            height: 500px;
            overflow-y:auto;
            padding: 20px;
            background: white;
            border-radius: 5px;
            box-shadow: 0 8px 16px rgba(0,0,0,.3);
        }
        .container form h3{
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
            width: 200px;
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
        <div class="header">
            <a href="" class="logo">CRIME RECORD MANAGEMENT SYSTEM</a>
            <div class="header-right">
                <a class="active" href="LogoutServlet">Log Out</a>
            </div>
        </div>
        <div class="wrapper">
            <div class="sidebar">
                <h2>Criminal</h2>
                <ul>
                    <li><a href="home.jsp"><i class="fas fa-home"></i>Home</a></li>
                    <li><a href="viewUser.jsp"><i class="fas fa-user"></i>User</a></li>
                    <li><a href="viewCriminal.jsp"><i class="fas fa-users"></i>Criminal</a></li>
                    <li><a href="viewRole.jsp"><i class="fas fa-briefcase"></i>Role</a></li>
                    <li><a href="viewCrime.jsp"><i class="fas fa-exclamation"></i>Crime</a></li>
                    <li><a href="LogoutServlet"><i class="fas fa-sign-out-alt"></i>Log Out</a></li>
                </ul>
            </div>
            <div class="container">
                <form method="POST" action="EditCriminalServlet">
                    <h3>Update Criminal</h3><br>
                        <%
                            if (request.getParameter("editCriminal_id")!=null){
                                
                                int criminal_id = Integer.parseInt(request.getParameter("editCriminal_id"));
                                Connection conn = null;
                                PreparedStatement preparedStatement = null;
                                
                                try{
                                    
                                    conn = DBConnection.createConnection();
                                    preparedStatement = conn.prepareStatement("select * from CRIMINALS where CRIMINAL_ID=?");
                                    preparedStatement.setInt(1, criminal_id);
                                    ResultSet resultSet = preparedStatement.executeQuery();
                                    
                                    while(resultSet.next()){
                        %>
                        <div class="form-group">
                            <label for="criminalNum_up">Criminal Number</label>
                            <input type="text" name="criminalNum_up" value="<%=resultSet.getString("CRIMINAL_NUM")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="criminalName_up">Criminal Name</label>
                            <input type="text" name="criminalName_up" value="<%=resultSet.getString("CRIMINAL_NAME")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="criminalDOB_up">Criminal Date of Birth</label>
                            <input type="date" name="criminalDOB_up" value="<%=resultSet.getString("CRIMINAL_DOB")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="criminalPhone_up">Criminal Phone Number</label>
                            <input type="text" name="criminalPhone_up" value="<%=resultSet.getString("CRIMINAL_PHONE")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="criminalAdd_up">Criminal Address</label>
                            <input type="text" name="criminalAdd_up" value="<%=resultSet.getString("CRIMINAL_ADD")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="city_up">City</label>
                            <input type="text" name="city_up" value="<%=resultSet.getString("CRIMINAL_CITY")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="state_up">State</label>
                            <input type="text" name="state_up" value="<%=resultSet.getString("CRIMINAL_STATE")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="postcode_up">Postcode</label>
                            <input type="text" name="postcode_up" value="<%=resultSet.getString("CRIMINAL_POSTCODE")%>" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="famPhone_up">Family Phone Number</label>
                            <input type="text" name="famPhone_up" value="<%=resultSet.getString("FAMILY_PHONE")%>" class="form-control" required>
                        </div>
                            <input type="submit" class="btn" value="Update Criminal">
                            <input type="hidden" name="user_id_up" value="<%=resultSet.getInt("USER_ID")%>">
                            <input type="hidden" name="criminal_id" value="<%=resultSet.getInt("CRIMINAL_ID")%>">
                        <%
                                    }
                    
                                    preparedStatement.close();
                                    conn.close();

                                } catch(Exception e){

                                    e.printStackTrace();
                                }
                            }
                        %>
                </form>
            </div>
        </div>
    </body>
</html>
