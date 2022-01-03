<%-- 
    Document   : deleteUser
    Created on : Feb 2, 2021, 12:36:01 AM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="util.DBConnection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete User | Crime Record Management System</title>
    </head>
    <body>
        <%
        if (request.getParameter("deleteUser_id")!=null){
            
            int deleteUser_id = Integer.parseInt(request.getParameter("deleteUser_id"));
            
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            
            try{
                
                conn = DBConnection.createConnection();
                String query = "delete from USERS where USER_ID=?";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, deleteUser_id);
                preparedStatement.executeUpdate();
                
                request.getRequestDispatcher("/viewUser.jsp").forward(request, response);
                
                preparedStatement.close();
                conn.close();
                
            } catch (Exception e){
                
                e.printStackTrace();
            }
        }
        %>
    </body>
</html>
