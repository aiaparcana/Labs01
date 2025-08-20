package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mipagina_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \r\n");
      out.write("        <title>Numero Mayor o Menor</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("                background: #f4f4f9;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                height: 100vh;\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("            }\r\n");
      out.write("            form {\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 0 4px 6px rgba(0,0,0,0.1);\r\n");
      out.write("                width: 300px;\r\n");
      out.write("            }\r\n");
      out.write("            h1 {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                color: #333;\r\n");
      out.write("            }\r\n");
      out.write("            label {\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: #555;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=\"text\"] {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("                margin-top: 5px;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("            .botones {\r\n");
      out.write("                margin-top: 15px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                gap: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=\"submit\"] {\r\n");
      out.write("                flex: 1;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=\"submit\"]:hover {\r\n");
      out.write("                background-color: #45a049;\r\n");
      out.write("            }\r\n");
      out.write("            .resultado {\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                background: #e8f5e9;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                box-shadow: 0 4px 6px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"miServlet\" method=\"post\">\r\n");
      out.write("            <h1>NUMERO MAYOR O MENOR</h1>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"var1\">Número 1:</label>\r\n");
      out.write("            <input type=\"text\" id=\"var1\" name=\"variable1\" placeholder=\"Ingrese el primer número\">\r\n");
      out.write("\r\n");
      out.write("            <label for=\"var2\">Número 2:</label>\r\n");
      out.write("            <input type=\"text\" id=\"var2\" name=\"variable2\" placeholder=\"Ingrese el segundo número\">\r\n");
      out.write("\r\n");
      out.write("            <label for=\"var3\">Número 3:</label>\r\n");
      out.write("            <input type=\"text\" id=\"var3\" name=\"variable3\" placeholder=\"Ingrese el tercer número\">\r\n");
      out.write("\r\n");
      out.write("            <label for=\"var4\">Número 4:</label>\r\n");
      out.write("            <input type=\"text\" id=\"var4\" name=\"variable4\" placeholder=\"Ingrese el cuarto número\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"botones\">\r\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Mayor\">\r\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Menor\">\r\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Promedio\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <!-- Aquí se muestra el resultado cuando el servlet reenvía -->\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty resultado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"resultado\">\r\n");
        out.write("                <strong>Resultado:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resultado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("            </div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
