package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.editCommitBean;
import dao.editCommitDao;
import java.io.PrintWriter;

/**
 *
 * @author USER
 */
public class EditCommitServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
            String commitPlace_up = request.getParameter("commitPlace_up");
            String commitDate_up = request.getParameter("commitDate_up");
            String commitTime_up = request.getParameter("commitTime_up");
            int criminal_id_up = Integer.parseInt(request.getParameter("criminal_id_up"));
            int crime_id_up = Integer.parseInt(request.getParameter("crime_id_up"));
            int commit_id = Integer.parseInt(request.getParameter("commit_id"));
            
            editCommitBean updateCommit = new editCommitBean();
            
            updateCommit.setCommitPlace_up(commitPlace_up);
            updateCommit.setCommitDate_up(commitDate_up);
            updateCommit.setCommitTime_up(commitTime_up);
            updateCommit.setCriminal_id_up(criminal_id_up);
            updateCommit.setCrime_id_up(crime_id_up);
            updateCommit.setCommit_id(commit_id);
            
            editCommitDao updateCommitDao = new editCommitDao();
            
            String checkCommitUpdate = updateCommitDao.checkCommitUpdate(updateCommit);
            
            if (checkCommitUpdate.equals("SUCCESS")){
            
                request.getRequestDispatcher("/viewCriminal.jsp").forward(request, response);
            }
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Failed to update Commit.');");
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
