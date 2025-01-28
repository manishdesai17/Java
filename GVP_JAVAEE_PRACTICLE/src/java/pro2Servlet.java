
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class pro2Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            ServletConfig sc = getServletConfig();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet pro2Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Init Parameter Name with Value</h2>");
            Enumeration<String> e=sc.getInitParameterNames();
            while(e.hasMoreElements())
            {
             String parameter = e.nextElement();
            out.print("<p>Parameter Name :"+parameter+"       -> value :"+sc.getInitParameter(parameter)+"</p>");
            
            }
            out.println("<h2>Header information : </h2>");
            e=request.getHeaderNames();      
            while(e.hasMoreElements())
            {
                String headerName  = e.nextElement();
                out.println("<p>Header Name : "+headerName+"   -> value : "+request.getHeader(headerName)+" Content Lenght -> "+request.getIntHeader("Content-Length"));
                out.println("Client Accept languag ->"+request.getHeader("Accept-Language")+"</p>");
            }
            
            out.println("<h2>Client Information : </h2>");
        // User-Agent
        String userAgent = request.getHeader("User-Agent");
        out.println("<p>User-Agent: " + userAgent+"</p>");

        // Client IP
        String clientIp = request.getRemoteAddr();
        out.println("<p>Client IP: " + clientIp+"</p>");
        
             // Request Method
        String method = request.getMethod();
        out.println("<p>Request Method: " + method+"</p>");
           
        out.println("<h2>Server Information : </h2>");
        out.println("<p>Servar Name : "+request.getServerName()+"</p>");
        out.println("<p>Server Ip Address : "+request.getLocalAddr()+"</p>");
        out.println("<p>Server Port No : "+request.getLocalPort()+"</p>");
        
        
            out.println("</body>");
            out.println("</html>");
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
