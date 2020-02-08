/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eddie Pincay
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PokeServlets", urlPatterns=("/PokeServlets"))
public class PokeServlets extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Training Page Result</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //Obtain the value of level
            int level=Integer.parseInt(request.getParameter("level"));
            if (level > 39)
                out.println("<p>The <b>" + request.getParameter("training") + "</b> coach of the <b>" + request.getParameter("team") + "</b>  "
                        + "team is ready to place new pokeparadas. Please click on the "
                        + "<a href='https://niantic.helpshift.com/a/pokemon-go/?s=pokestops&f=submitting-a-pokestop-nomination&p=web' target='_blank'>link</a> "
                        + "to know the following steps.</p>");
            else
                out.println("<h3>Sorry you need 40 level. Your actually level is:" 
                        + request.getParameter("level") + "</h3>");
            out.println("<a href=\"trainingPage.jsp\">Return.</a>");
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
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Invalid information. Please try again");
    
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
        response.setContentType("text/html;charset=UTF-8");
       
        try (PrintWriter out = response.getWriter()) {
        
            String data[] = request.getParameterValues("data");
            //String select = request.getParameter("country");
            out.println("<h1>Result</h1>");

            processRequest(request, response);
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
