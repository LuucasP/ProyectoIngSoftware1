package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Login Cliente</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("        crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">CMATRUCKS</a>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("            </div>\n");
      out.write("            <!--área-->\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-6 login\">\n");
      out.write("                <div class=\"imag\">\n");
      out.write("                    <img src=\"img/1.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <center><h2>Iniciar Sesión</h2></center>\n");
      out.write("                    <br>\n");
      out.write("                    <form action=\"servletCliente\" method=\"post\">\n");
      out.write("                    <label for=\"user\">Usuario: </label>\n");
      out.write("                    <input type=\"text\" name=\"user\" id=\"usuario\" class=\"form-control\" onkeyup=\"validacion('user');\" required>\n");
      out.write("                    <!--experimental-->\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <!--fin-->\n");
      out.write("                    <label for=\"pass\">Contraseña: </label>\n");
      out.write("                    <input type=\"password\" name=\"pass\" id=\"contra\" class=\"form-control\" onkeyup=\"validacion('pass');\" required>\n");
      out.write("                    <br>\n");
      out.write("                    <!--experimental2-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--fin2-->\n");
      out.write("                    <!--experimental3\n");
      out.write("                    <div class=\"d-flex\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          \n");
      out.write("                    <a href=\"loginMecanico.html\">Soy un mecánico</a> \n");
      out.write("                     <br>\n");
      out.write("                     <a href=\"registroUsuario.html\">No tengo una cuenta</a>  \n");
      out.write("                        \n");
      out.write("                    <button type=\"button\" name=\"btnEnviar\"  class=\"btn btn-success  ml-auto\">Enviar</button> \n");
      out.write("                    </div>  \n");
      out.write("                    </div>  -->\n");
      out.write("\n");
      out.write("                    <!--experimental4\n");
      out.write("                    <div class=\"bot\">\n");
      out.write("                       <a href=\"loginMecanico.html\">Soy un mecánico</a>  <br>\n");
      out.write("                        <a href=\"registroUsuario.html\">No tengo una cuenta</a> \n");
      out.write("                         <button type=\"button\" name=\"btnEnviar\"  class=\"btn btn-success\">Enviar</button>\n");
      out.write("                    </div>-->\n");
      out.write("                    <div class=\"row texto\">\n");
      out.write("                        <div class=\"col-6\">\n");
      out.write("                            <a href=\"loginEmpleado.jsp\">Soy un Mecánico</a> <br>\n");
      out.write("                            <a href=\"registroUsuario.jsp\">No tengo una cuenta</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-3 \">\n");
      out.write("                            <input type=\"submit\" name=\"btnEnviar\" value=\"Enviar\" class=\"btn btn-success form-control\"></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--fin-->\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"js/validacion.js\">\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
