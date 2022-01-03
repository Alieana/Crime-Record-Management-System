package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.userBean;
import dao.userDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana Shahda
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String fullname = request.getParameter("fullName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String add_line = request.getParameter("add_line");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String postcode = request.getParameter("postcode");
        int role_id = Integer.parseInt(request.getParameter("role_id"));
        
        userBean addUser = new userBean();
        
        addUser.setFullname(fullname);
        addUser.setUsername(username);
        addUser.setPassword(password);
        addUser.setPhone(phone);
        addUser.setAdd_line(add_line);
        addUser.setCity(city);
        addUser.setState(state);
        addUser.setPostcode(postcode);
        addUser.setRole_id(role_id);
        
        userDao addUserDao = new userDao();
        
        String userRegister = addUserDao.registerCheck(addUser);
        
        if (userRegister.equals("SUCCESS")){
            
            request.getRequestDispatcher("/viewUser.jsp").forward(request, response);
        }
        else {
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed to add User.');");
            out.println("location='viewUser.jsp';");
            out.println("</script>");
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
