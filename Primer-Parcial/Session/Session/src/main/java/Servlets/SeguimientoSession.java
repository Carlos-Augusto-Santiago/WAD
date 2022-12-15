/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CASP_
 */
@WebServlet(name = "SeguimientoSession", urlPatterns = { "/SeguimientoSession" })
public class SeguimientoSession extends HttpServlet {

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
            // OIbtenemos la sesion actual o creamos una de ser necesario.
            HttpSession session = request.getSession(true);
            // Datos de la sesion
            String idSession = session.getId();
            long fechaCreacion = session.getCreationTime();
            long fechaUltimoAccesos = session.getLastAccessedTime();
            // Incrementa el contador de la session del cliente "cuenta.session"
            Integer cuenta = (Integer) session.getAttribute("cuenta.session");
            if (cuenta == null) {
                cuenta = 1;
            } else {
                cuenta = cuenta + 1;
            }
            session.setAttribute("cuenta.session", cuenta);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SeguimientoSession</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Carlos Augusto Santiago Pérez</h1>");
            out.println("<h1>Has visitado esta página " + cuenta + ((cuenta == 1) ? " vez" : " veces.") + "</h1>");
            out.println("<h2>Datos de la sesion actual: </h2>");
            out.println("<h3>Id de la sesion:" + idSession + "</h3>");
            out.println("<h3>Fecha de creación:" + new Date(fechaCreacion) + "</h3>");
            out.println("<h3>Se accedió por última vez:" + new Date(fechaUltimoAccesos) + "</h3>");
            out.println("<h2>Atributos: </h2>");
            Enumeration nombres = session.getAttributeNames();
            while (nombres.hasMoreElements()) {
                String param = (String) nombres.nextElement();
                out.println("<h3>" + param + ": " + session.getAttribute(param) + "</h3>");
            }
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
