/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import paqueteservicio.ServicioWeb_Service;

/**
 *
 * @author antho
 */
@WebServlet(urlPatterns = {"/miServlet"})
public class miServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/S1_ServicioNumero/ServicioWeb.wsdl")
    private ServicioWeb_Service service;

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

    String accion = request.getParameter("accion"); // "Mayor" o "Menor"

    try (PrintWriter out = response.getWriter()) {
        int n1 = Integer.parseInt(request.getParameter("variable1"));
        int n2 = Integer.parseInt(request.getParameter("variable2"));
        int n3 = Integer.parseInt(request.getParameter("variable3"));
        int n4 = Integer.parseInt(request.getParameter("variable4"));

        Integer resultado;
        if ("Menor".equalsIgnoreCase(accion)) {
            resultado = menor(n1, n2, n3, n4); // NUEVO
            out.println("<!DOCTYPE html><html><head><title>Resultado</title></head><body>");
            out.println("<h2>El número menor es: " + resultado + "</h2>");
            out.println("</body></html>");
        } else {
            // Por defecto o si presionan "Mayor"
            resultado = mayor(n1, n2, n3, n4);
            out.println("<!DOCTYPE html><html><head><title>Resultado</title></head><body>");
            out.println("<h2>El número mayor es: " + resultado + "</h2>");
            out.println("</body></html>");
        }
    } catch (NumberFormatException e) {
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><title>Error</title></head><body>");
            out.println("<h3>Ingresa solo números válidos.</h3>");
            out.println("</body></html>");
        }
    } catch (Exception e) {
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><title>Error</title></head><body>");
            out.println("<h3>Ocurrió un problema al consultar el servicio.</h3>");
            out.println("</body></html>");
        }
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

    private Integer mayor(int numero1, int numero2, int numero3, int numero4) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        paqueteservicio.ServicioWeb port = service.getServicioWebPort();
        return port.mayor(numero1, numero2, numero3, numero4);
    }
    private Integer menor(int numero1, int numero2, int numero3, int numero4) {
    paqueteservicio.ServicioWeb port = service.getServicioWebPort();
    return port.menor(numero1, numero2, numero3, numero4);
}


}
