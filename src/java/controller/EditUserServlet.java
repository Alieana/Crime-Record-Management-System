package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.editUserBean;
import dao.editUserDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana Shahda
 */
public class EditUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
        if (request.getParameter("submit")!=null){
            
            String fullname_up = request.getParameter("fullName_up");
            String username_up = request.getParameter("username_up");
            String password_up = request.getParameter("password_up");
            String phone_up = request.getParameter("phone_up");
            String add_line_up = request.getParameter("add_line_up");
            String city_up = request.getParameter("city_up");
            String state_up = request.getParameter("state_up");
            String postcode_up = request.getParameter("postcode_up");
            int role_id_up = Integer.parseInt(request.getParameter("role_id_up"));
            int user_id = Integer.parseInt(request.getParameter("user_id"));
            
            editUserBean updateUser = new editUserBean();
            
            updateUser.setFullname_up(fullname_up);
            updateUser.setUsername_up(username_up);
            updateUser.setPassword_up(password_up);
            updateUser.setPhone_up(phone_up);
            updateUser.setAdd_line_up(add_line_up);
            updateUser.setCity_up(city_up);
            updateUser.setState_up(state_up);
            updateUser.setPostcode_up(postcode_up);
            updateUser.setRole_id_up(role_id_up);
            updateUser.setUser_id(user_id);
            
            editUserDao updateUserDao = new editUserDao();
            
            String updateUserValidate = updateUserDao.checkUserUpdate(updateUser);
            
            if (updateUserValidate.equals("SUCCESS")){
            
                request.getRequestDispatcher("/viewUser.jsp").forward(request, response);
            }
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to update User');");
                out.println("location='viewUser.jsp';");
                out.println("</script>");
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
