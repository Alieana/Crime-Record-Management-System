package CrimeRecordController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import CrimeRecord.bean.userBean;
import CrimeRecordDAO.userDao;

/**
 *
 * @author Siti Alieana Shahda
 */
public class UserServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fullname = request.getParameter("fullName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String add_line = request.getParameter("add_line");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String postcode = request.getParameter("postcode");
        
        userBean addUser = new userBean();
        
        addUser.setFullname(fullname);
        addUser.setUsername(username);
        addUser.setPassword(password);
        addUser.setPhone(phone);
        addUser.setAdd_line(add_line);
        addUser.setCity(city);
        addUser.setState(state);
        addUser.setPostcode(postcode);
        
        userDao addUserDao = new userDao();
        
        String userRegister = addUserDao.registerCheck(addUser);
        
        if (userRegister.equals("SUCCESS")){
            
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        else {
            
            request.setAttribute("errMessage", userRegister);
            request.getRequestDispatcher("/register_user.jsp").forward(request, response);
        }
    }

}
