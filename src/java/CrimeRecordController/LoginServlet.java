package CrimeRecordController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import CrimeRecord.bean.loginBean;
import CrimeRecordDAO.loginDao;

/**
 *
 * @author Siti Alieana Shahda
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        loginBean loginBean = new loginBean();

        loginBean.setUsername(username);
        loginBean.setPassword(password);
        
        loginDao loginDao = new loginDao();
        
        String userValidate = loginDao.authenticateUser(loginBean);
        
        if(userValidate.equals("SUCCESS")) {
            
            request.setAttribute("username",username);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        
        } else {
            
            request.setAttribute("errMessage", userValidate);
            request.getRequestDispatcher("/register_user.jsp").forward(request, response);
        }
    }
}
