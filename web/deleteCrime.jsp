<%-- 
    Document   : deleteCrime
    Created on : Feb 4, 2021, 8:08:39 PM
    Author     : Siti Alieana Shahda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="util.DBConnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Crime | Crime Record Management System</title>
    </head>
    <body>
        <%
        if (request.getParameter("deleteCrime_id")!=null){
            
            int deleteCrime_id = Integer.parseInt(request.getParameter("deleteCrime_id"));
            
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            
            try{
                
                conn = DBConnection.createConnection();
                String query = "delete from CRIME where CRIME_ID=?";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, deleteCrime_id);
                preparedStatement.executeUpdate();
                
                request.getRequestDispatcher("/viewCrime.jsp").forward(request, response);
                
                preparedStatement.close();
                conn.close();
                
            } catch (Exception e){
                
                e.printStackTrace();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to delete Crime.');");
                out.println("location='viewCrime.jsp';");
                out.println("</script>");
            }
        }
        %>
    </body>
</html>
