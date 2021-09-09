<%-- 
    Document   : login
    Created on : Feb 1, 2021, 2:02:21 AM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body allign="center">
    <center><h1>Crime Record Management System Login Page</h1>
        <form method="POST" action="/LoginServlet">
            <table>
                <tr>
                    <td>Username </td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password </td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit">
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
