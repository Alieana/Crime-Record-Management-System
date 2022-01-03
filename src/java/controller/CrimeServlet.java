package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.crimeBean;
import dao.crimeDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana Shahda
 */
public class CrimeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
        String crimeNum = request.getParameter("crimeNum");
        String crimeName = request.getParameter("crimeName");
        String crimeType = request.getParameter("crimeType");
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        
        crimeBean addCrime = new crimeBean();
        
        addCrime.setCrimeNum(crimeNum);
        addCrime.setCrimeName(crimeName);
        addCrime.setCrimeType(crimeType);
        addCrime.setUser_id(user_id);
        
        crimeDao addCrimeDao = new crimeDao();
        
        String crimeRegister = addCrimeDao.registerCrime(addCrime);
        
        if (crimeRegister.equals("SUCCESS")){
            
            request.getRequestDispatcher("viewCrime.jsp").forward(request, response);
        }
        else {
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed to add Crime.');");
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
