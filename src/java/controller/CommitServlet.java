package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.commitBean;
import dao.commitDao;
import java.io.PrintWriter;

/**
 *
 * @author Siti Alieana Shahda
 */
public class CommitServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
        String commitPlace = request.getParameter("commitPlace");
        String commitDate = request.getParameter("commitDate");
        String commitTime = request.getParameter("commitTime");
        int criminal_id = Integer.parseInt(request.getParameter("criminal_id"));
        int crime_id = Integer.parseInt(request.getParameter("crime_id"));
        
        commitBean addCommit = new commitBean();
        
        addCommit.setCommitPlace(commitPlace);
        addCommit.setCommitDate(commitDate);
        addCommit.setCommitTime(commitTime);
        addCommit.setCriminalID(criminal_id);
        addCommit.setCrimeID(crime_id);
        
        commitDao addCommitDao = new commitDao();
        
        String commitRegister = addCommitDao.registerCommit(addCommit);
        
        if (commitRegister.equals("SUCCESS")){
            
            request.getRequestDispatcher("viewCriminal.jsp").forward(request, response);
        }
        else {
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed to add Commit.');");
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
