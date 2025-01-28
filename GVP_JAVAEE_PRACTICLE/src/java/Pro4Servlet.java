
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;


public class Pro4Servlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String role= request.getParameter("role");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicledatabase","root","");
            
             PreparedStatement ps = con.prepareStatement("select * from user_role,user where user_role.email=? and user_role.role=? and user_role.id=user.email_id and user.password=?");
             
             ps.setString(1,email);
             ps.setString(2, role);
             ps.setString(3,password);
             ResultSet rs =ps.executeQuery();
             if(rs.next())
             {
                 response.sendRedirect("home.html");
             }
             else
             {
                 RequestDispatcher rd = request.getRequestDispatcher("programme4.html");
                 rd.include(request, response);
                 out.println("<script> var error = document.getElementsByClassName('error');");
                 out.println("error[0].textContent = 'invalid credentials';</script>");
             }
             con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
