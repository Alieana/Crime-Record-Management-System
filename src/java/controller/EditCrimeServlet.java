package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.editCrimeBean;
import dao.editCrimeDao;

/**
 *
 * @author Siti Alieana Shahda
 */
public class EditCrimeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
            String crimeNum_up = request.getParameter("crimeNum_up");
            String crimeName_up = request.getParameter("crimeName_up");
            String crimeType_up = request.getParameter("crimeType_up");
            int user_id_up = Integer.parseInt(request.getParameter("user_id_up"));
            int crime_id = Integer.parseInt(request.getParameter("crime_id"));
            
            editCrimeBean updateCrime = new editCrimeBean();
            
            updateCrime.setCrimeNum_up(crimeNum_up);
            updateCrime.setCrimeName_up(crimeName_up);
            updateCrime.setCrimeType_up(crimeType_up);
            updateCrime.setUser_id_up(user_id_up);
            updateCrime.setCrime_id(crime_id);
            
            editCrimeDao updateCrimeDao = new editCrimeDao();
            
            String checkCrimeUpdate = updateCrimeDao.checkCrimeUpdate(updateCrime);
            
            if (checkCrimeUpdate.equals("SUCCESS")){
            
                request.getRequestDispatcher("/viewCrime.jsp").forward(request, response);
            }
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to update Crime.');");
                out.println("location='viewCrime.jsp';");
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
