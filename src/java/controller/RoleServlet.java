package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.roleBean;
import dao.roleDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana
 */
public class RoleServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String roleNum = request.getParameter("roleNum");
        String roleName = request.getParameter("roleName");
        
        roleBean addRole = new roleBean();
        
        addRole.setRoleNum(roleNum);
        addRole.setRoleName(roleName);
        
        roleDao addRoleDao = new roleDao();
        
        String roleRegister = addRoleDao.registerRole(addRole);
        
        if (roleRegister.equals("SUCCESS")){
            
            request.getRequestDispatcher("viewRole.jsp").forward(request, response);
        }
        else {
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed to add Role.');");
            out.println("location='viewRole.jsp';");
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
