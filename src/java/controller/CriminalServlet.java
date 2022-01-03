package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.criminalBean;
import dao.criminalDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana Shahda
 */
public class CriminalServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
        String criminalNum = request.getParameter("criminalNum");
        String criminalName = request.getParameter("criminalName");
        String criminalDOB = request.getParameter("criminalDOB");
        String criminalPhone = request.getParameter("phone");
        String criminalAdd = request.getParameter("add_line");
        String criminalCity = request.getParameter("city");
        String criminalState = request.getParameter("state");
        String criminalPostcode = request.getParameter("postcode");
        String familyPhone = request.getParameter("famPhone");
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        
        criminalBean addCriminal = new criminalBean();
        
        addCriminal.setCriminalNum(criminalNum);
        addCriminal.setCriminalName(criminalName);
        addCriminal.setCriminalDOB(criminalDOB);
        addCriminal.setCriminalphone(criminalPhone);
        addCriminal.setCriminalAdd(criminalAdd);
        addCriminal.setCity(criminalCity);
        addCriminal.setState(criminalState);
        addCriminal.setPostcode(criminalPostcode);
        addCriminal.setFamPhone(familyPhone);
        addCriminal.setUser_id(user_id);
        
        criminalDao addCriminalDao = new criminalDao();
        
        String criminalRegister = addCriminalDao.criminalCheck(addCriminal);
        
        if (criminalRegister.equals("SUCCESS")){
            
            request.getRequestDispatcher("/viewCriminal.jsp").forward(request, response);
        }
        else {
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed to add Criminal.');");
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
