<%-- 
    Document   : viewCriminal
    Created on : Feb 1, 2021, 10:11:03 PM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "util.DBConnection"%>
<%@page import = "java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <script src="https://kit.fontawesome.com/1b3b6e3bb4.js" crossorigin="anonymous"></script>
        <title>List of Criminal | Crime Record Management System</title>
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
        table{
            margin-left: 270px;
            border-collapse: collapse;
            width: 800px;
            height: 200px;
            border: 1px solid #b0adad;
            box-shadow: 2px 2px 12px rgba(0,0,0,0.2), -1px -1px 8px rgba(0,0,0,0.2);
        }
        th,td{
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        #header2{
            background-color: #b0adad;
            color: #fff;
        }
        @media only screen and (max-width: 768px){
            table{
                width: 90%;
            }
        }
        .wrapper table .btn{
            width: 300px;
            height: 34px;
            border: none;
            outline: none;
            background: #003366;
            cursor: pointer;
            font-size: 16px;
            color: white;
            border-radius: 4px;
            transition: .3s;
        }
        .wrapper table .btn:hover{
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
            <table>
                <tr id="header2">
                    <th colspan="14"><h2>Criminal List</h2></th>
                </tr>
                <tr id="header2">
                    <th>ID</th>
                    <th>Criminal Number</th>
                    <th>Name</th>
                    <th>Date of Birth</th>
                    <th>Phone Number</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Postcode</th>
                    <th>Family Phone Number</th>
                    <th>Employee Number</th>
                    <th>Commit</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <%
                    Connection conn = null;
                    PreparedStatement preparedStatement = null;
                    
                    try{
                    
                        conn = DBConnection.createConnection();
                        preparedStatement = conn.prepareStatement("select * from CRIMINALS");
                        ResultSet resultSet = preparedStatement.executeQuery();
                
                        while(resultSet.next()){
                %>
                <tr>
                    <td><%=resultSet.getInt("CRIMINAL_ID")%></td>
                    <td><%=resultSet.getString("CRIMINAL_NUM")%></td>
                    <td><%=resultSet.getString("CRIMINAL_NAME")%></td>
                    <td><%=resultSet.getString("CRIMINAL_DOB")%></td>
                    <td><%=resultSet.getString("CRIMINAL_PHONE")%></td>
                    <td><%=resultSet.getString("CRIMINAL_ADD")%></td>
                    <td><%=resultSet.getString("CRIMINAL_CITY")%></td>
                    <td><%=resultSet.getString("CRIMINAL_STATE")%></td>
                    <td><%=resultSet.getString("CRIMINAL_POSTCODE")%></td>
                    <td><%=resultSet.getString("FAMILY_PHONE")%></td>
                    <td><%=resultSet.getInt("USER_ID")%></td>
            
                    <td><a href="viewCommit.jsp?viewCommit_id=<%=resultSet.getInt("CRIMINAL_ID")%>">Commit</a></td>
                    <td><a href="editCriminal.jsp?editCriminal_id=<%=resultSet.getInt("CRIMINAL_ID")%>">Edit</a></td>
                    <td><a href="deleteCriminal.jsp?deleteCriminal_id=<%=resultSet.getInt("CRIMINAL_ID")%>">Delete</a></td>
                </tr>
                <%
                        }
                
                    preparedStatement.close();
                    conn.close();

                    } catch(Exception e){
                
                        e.printStackTrace();

                    }
                %>
                <tr>
                    <td colspan="14">
                            <a href="registerCriminal.jsp"><button class="btn">Register New Criminal</button></a>
                    </td>
                </tr>
            </table>
    </body>
</html>
