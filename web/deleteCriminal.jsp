<%-- 
    Document   : deleteCriminal
    Created on : Feb 4, 2021, 8:08:08 PM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="util.DBConnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Criminal | Crime Record Management System</title>
    </head>
    <body>
        <%
        if (request.getParameter("deleteCriminal_id")!=null){
            
            int deleteCriminal_id = Integer.parseInt(request.getParameter("deleteCriminal_id"));
            
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            
            try{
                
                conn = DBConnection.createConnection();
                String query = "delete from CRIMINALS where CRIMINAL_ID=?";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, deleteCriminal_id);
                preparedStatement.executeUpdate();
                
                request.getRequestDispatcher("/viewCriminal.jsp").forward(request, response);
                
                preparedStatement.close();
                conn.close();
                
            } catch (Exception e){
                
                e.printStackTrace();
            }
        }
        %>
    </body>
</html>
