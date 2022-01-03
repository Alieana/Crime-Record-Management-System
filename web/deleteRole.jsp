<%-- 
    Document   : deleteRole
    Created on : Feb 3, 2021, 1:54:52 AM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="util.DBConnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Role | Crime Record Management System</title>
    </head>
    <body>
        <%
        if (request.getParameter("deleteRole_id")!=null){
            
            int deleteRole_id = Integer.parseInt(request.getParameter("deleteRole_id"));
            
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            
            try{
                
                conn = DBConnection.createConnection();
                String query = "delete from ROLES where ROLE_ID=?";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, deleteRole_id);
                preparedStatement.executeUpdate();
                
                request.getRequestDispatcher("/viewRole.jsp").forward(request, response);
                
                preparedStatement.close();
                conn.close();
                
            } catch (Exception e){
                
                e.printStackTrace();
            }
        }
        %>
    </body>
</html>
