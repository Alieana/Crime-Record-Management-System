package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.loginBean;
import dao.loginDao;

/**
 *
 * @author Siti Alieana Shahda
 */
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        loginBean LoginBean = new loginBean();
        
        LoginBean.setUsername(username);
        LoginBean.setPassword(password);
        
        loginDao LoginDao = new loginDao();
        
        String userValidate = LoginDao.authenticateUser(LoginBean);
        
        if(userValidate.equals("SUCCESS")){
            
            request.setAttribute("username",username);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        
        } else {
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("location='login.jsp';");
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
