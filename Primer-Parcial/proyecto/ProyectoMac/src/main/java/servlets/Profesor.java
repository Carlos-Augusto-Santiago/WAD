/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CASP_
 */
@WebServlet(name = "Profesor", urlPatterns = { "/registro-profesor" })
public class Profesor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Profesor</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro para profesores</h1>");
            out.println("<a href='index.html'>Inicio</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<section>");
            out.println("<form action='login'>");
            out.println("<label for='name'>Nombre: </label>");
            out.println("<input type='text' id='name' name='name'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label for='user-name'>Nombre de usuario: </label>");
            out.println("<input type='text' id='user-name' name='user-name'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label for='matricula'>Matricula: </label>");
            out.println("<input type='text' id='matricula' name='matricula'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label for='password'>Contraseña: </label>");
            out.println("<input type='password' id='password' name='password'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<button type='submit'>Registrar</button>");
            out.println("</form>");
            out.println("</section>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
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
