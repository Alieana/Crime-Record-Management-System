package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.editRoleBean;
import dao.editRoleDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana Shahda
 */
public class EditRoleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            String roleNum_up = request.getParameter("roleNum_up");
            String roleName_up = request.getParameter("roleName_up");
            int role_id = Integer.parseInt(request.getParameter("role_id"));
            
            editRoleBean updateRole = new editRoleBean();
            
            updateRole.setRoleNum_up(roleNum_up);
            updateRole.setRoleName_up(roleName_up);
            updateRole.setRole_id(role_id);
            
            editRoleDao updateRoleDao = new editRoleDao();
            
            String checkRoleUpdate = updateRoleDao.checkRoleUpdate(updateRole);
            
            if (checkRoleUpdate.equals("SUCCESS")){
            
                request.getRequestDispatcher("/viewRole.jsp").forward(request, response);
            }
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to update Role.');");
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
