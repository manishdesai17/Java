/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author jigne
 */
public class pro3Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         Connection con=null;
        try (PrintWriter out = response.getWriter()) {
             String firstName=request.getParameter("firstName");
             String lastName =request.getParameter("lastName");
             String password=request.getParameter("password");
             String email=request.getParameter("email");
             String mobile=request.getParameter("mobile");
             String address=request.getParameter("address");
             String role=request.getParameter("role");
          
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicledatabase","root","");
            
             PreparedStatement ps = con.prepareStatement("select * from user_role where email=?");
             ps.setString(1,email);
             ResultSet rs = ps.executeQuery();
             
             if(rs.next())
             {
                 RequestDispatcher rd =request.getRequestDispatcher("programme3.html");
                 rd.include(request, response);
                 
                 out.print("<script>var error = document.getElementsByClassName('error');");
                 out.print("error[4].textContent='this email already registered';</script>");
             }
             else
             {
             ps = con.prepareStatement("insert into user_role(email,role) values(?,?)");
             ps.setString(1,email);
             ps.setString(2, role);
             ps.execute();
             
             ps = con.prepareStatement("select id from user_role where email=?");
             ps.setString(1,email);
             rs = ps.executeQuery();
             rs.next();
             ps = con.prepareStatement("insert into user values(?,?,?,?,?,?)");
             
             ps.setString(1,firstName);
             ps.setString(2,lastName);
             ps.setString(3,password);
             ps.setString(4,mobile);
             ps.setString(5,address);
             ps.setInt(6,rs.getInt("id"));
             ps.executeUpdate();
             ps.close();
           
             RequestDispatcher rd =request.getRequestDispatcher("programme4.html");
                 rd.forward(request, response);
             }
    }
        
        catch(Exception e){
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
   