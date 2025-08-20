package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mipagina_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Operaciones Matemáticas</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("                background: #f5f6fa;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                height: 100vh;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .container {\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                padding: 30px;\r\n");
      out.write("                border-radius: 12px;\r\n");
      out.write("                box-shadow: 0 4px 12px rgba(0,0,0,0.1);\r\n");
      out.write("                width: 400px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h1 {\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                color: #2f3640;\r\n");
      out.write("                font-size: 22px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            form {\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input[type=\"number\"] {\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                margin: 8px 0;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                transition: border 0.3s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input[type=\"number\"]:focus {\r\n");
      out.write("                border-color: #0984e3;\r\n");
      out.write("                outline: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            select {\r\n");
      out.write("                width: 85%;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                margin: 10px 0;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input[type=\"submit\"] {\r\n");
      out.write("                background: #0984e3;\r\n");
      out.write("                color: white;\r\n");
      out.write("                border: none;\r\n");
      out.write("                padding: 10px 20px;\r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                transition: background 0.3s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input[type=\"submit\"]:hover {\r\n");
      out.write("                background: #74b9ff;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>OPERACIONES MATEMÁTICAS</h1>\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"miServlet\" method=\"post\">\r\n");
      out.write("                <input type=\"number\" name=\"n1\" placeholder=\"Número 1\" required />\r\n");
      out.write("                <input type=\"number\" name=\"n2\" placeholder=\"Número 2\" required />\r\n");
      out.write("\r\n");
      out.write("                <select name=\"operacion\" required>\r\n");
      out.write("                    <option value=\"suma\">Suma</option>\r\n");
      out.write("                    <option value=\"resta\">Resta</option>\r\n");
      out.write("                    <option value=\"multiplicacion\">Multiplicación</option>\r\n");
      out.write("                    <option value=\"division\">División</option>\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <input type=\"submit\" value=\"Calcular\" />\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
