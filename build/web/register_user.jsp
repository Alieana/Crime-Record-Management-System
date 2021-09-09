<%-- 
    Document   : register_user
    Created on : Jan 27, 2021, 2:28:18 AM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Record Management System Register User Page</title>
    </head>
    <body>
        <h2>Register New User</h2>
        <form method="POST" action="UserServlet">
            <p>Full Name:
                <input type="text" name="fullName">
            </p>
            <p>Username (Employee Number):
                <input type="text" name="username">
            </p>
            <p>Password:
                <input type="password" name="password">
            </p>
            <p>Confirm Password:
                <input type="password" name="confirmPass">
            </p>
            <p>Phone Number:
                <input type="text" name="phone">
            </p>
            <p>Address Line:
                <input type="text" name="add_line">
            </p>
            <p>City:
                <input type="text" name="city">
               State:
                <input type="text" name="state">
               Post Code:
                <input type="text" name="postcode">
            </p>
            <br><br>
            <input type="submit" value="Register">
            <input type="reset">
            <button type="submit" formaction="UserServlet.java">Back</button>
        </form>
    </body>
</html>
