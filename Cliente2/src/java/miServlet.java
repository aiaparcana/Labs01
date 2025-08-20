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

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Servicio/ServicioWeb.wsdl")
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
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Resultados - miServlet</title>");
                out.println("<style>");
                out.println("body { font-family: Arial, sans-serif; background: #f5f6fa; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
                out.println(".container { background: #fff; padding: 30px; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); width: 400px; text-align: center; }");
                out.println("h1 { color: #2f3640; margin-bottom: 20px; font-size: 22px; }");
                out.println(".resultado { margin: 10px 0; padding: 12px; background: #dfe6e9; border-radius: 8px; font-size: 16px; color: #2d3436; }");
                out.println("a { display: inline-block; margin-top: 20px; padding: 10px 15px; background: #0984e3; color: #fff; text-decoration: none; border-radius: 8px; transition: background 0.3s; }");
                out.println("a:hover { background: #74b9ff; }");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class='container'>");
                out.println("<h1>📊 Resultados</h1>");

                try {
                    String op = request.getParameter("operacion");
                    int n1 = Integer.parseInt(request.getParameter("n1"));
                    int n2 = Integer.parseInt(request.getParameter("n2"));
                    int resultado = 0;

                    switch (op) {
                        case "suma":
                            resultado = suma(n1, n2);
                            out.println("<div class='resultado'>SUMA: " + resultado + "</div>");
                            break;
                        case "resta":
                            resultado = resta(n1, n2);
                            out.println("<div class='resultado'>RESTA: " + resultado + "</div>");
                            break;
                        case "multiplicacion":
                            resultado = multiplicacion(n1, n2);
                            out.println("<div class='resultado'>MULTIPLICACIÓN: " + resultado + "</div>");
                            break;
                        case "division":
                            double resDiv = division(n1, n2);
                            out.println("<div class='resultado'>DIVISIÓN: " + resDiv + "</div>");
                            break;
                        default:
                            out.println("<div class='resultado'>⚠️ Operación no reconocida.</div>");
                    }

                } catch (NumberFormatException e) {
                    out.println("<div class='resultado'>⚠️ Error: ingresa solo números válidos.</div>");
                }

                out.println("<a href='mipagina.jsp'>⬅ Volver</a>");
                out.println("</div>");
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

    private Integer suma(int numero1, int numero2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        paqueteservicio.ServicioWeb port = service.getServicioWebPort();
        return port.suma(numero1, numero2);
    }

    private Integer resta(int numero1, int numero2) {
        paqueteservicio.ServicioWeb port = service.getServicioWebPort();
        return port.resta(numero1, numero2);
    }

    private Integer multiplicacion(int numero1, int numero2) {
        paqueteservicio.ServicioWeb port = service.getServicioWebPort();
        return port.multiplicacion(numero1, numero2);
    }

    private Double division(int numero1, int numero2) {
        paqueteservicio.ServicioWeb port = service.getServicioWebPort();
        return port.division(numero1, numero2);
    }

}
