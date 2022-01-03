package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.editCriminalBean;
import dao.editCriminalDao;

/**
 *
 * @author Siti Alieana Shahda
 */
public class EditCriminalServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
        String criminalNum_up = request.getParameter("criminalNum_up");
        String criminalName_up = request.getParameter("criminalName_up");
        String criminalDOB_up = request.getParameter("criminalDOB_up");
        String criminalPhone_up = request.getParameter("criminalPhone_up");
        String criminalAdd_up = request.getParameter("criminalAdd_up");
        String criminalCity_up = request.getParameter("city_up");
        String criminalState_up = request.getParameter("state_up");
        String criminalPostcode_up = request.getParameter("postcode_up");
        String famPhone_up = request.getParameter("famPhone_up");
        int user_id_up = Integer.parseInt(request.getParameter("user_id_up"));
        int criminal_id = Integer.parseInt(request.getParameter("criminal_id"));
        
        editCriminalBean updateCriminal = new editCriminalBean();
            
            updateCriminal.setCriminalNum_up(criminalNum_up);
            updateCriminal.setCriminalName_up(criminalName_up);
            updateCriminal.setCriminalDOB_up(criminalDOB_up);
            updateCriminal.setCriminalphone_up(criminalPhone_up);
            updateCriminal.setCity_up(criminalAdd_up);
            updateCriminal.setState_up(criminalCity_up);
            updateCriminal.setPostcode_up(criminalState_up);
            updateCriminal.setFamPhone_up(criminalPostcode_up);
            updateCriminal.setCriminalDOB_up(famPhone_up);
            updateCriminal.setUser_id_up(user_id_up);
            updateCriminal.setCriminal_id(criminal_id);
            
            editCriminalDao updateCriminalDao = new editCriminalDao();
            
            String updateCriminalCheck = updateCriminalDao.updateCriminalCheck(updateCriminal);
            
            if (updateCriminalCheck.equals("SUCCESS")){
            
                request.getRequestDispatcher("/viewCriminal.jsp").forward(request, response);
            }
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to update Criminal.');");
                out.println("location='viewCriminal.jsp';");
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
