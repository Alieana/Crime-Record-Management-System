package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Siti Alieana Shahda
 */

public class LogoutServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        HttpSession session = request.getSession(false); //Fetch session object
        
        if(session!=null) {
                
                session.invalidate();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You have successfully logout.');");
                out.println("location='login.jsp';");
                out.println("</script>");
            }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
