package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarEmpleadosAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    /*response.setHeader("Pragma", "no-cache");
    response.addHeader("Cache-control", "must-revalidate");
    response.addHeader("Cache-control", "no-cache");
    response.addHeader("Cache-control", "no-store");
    response.setDateHeader("Expires", 0);

    try {
        if (session.getAttribute("user") == null) {
          //request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }
    } catch (Exception e) {

    }*/

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/dashboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\" integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <!-- Sidebar  -->\n");
      out.write("        <nav id=\"sidebar\">\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <h3>Logo</h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled components\">\n");
      out.write("                <p>Bienvenido&nbsp ");
out.println(session.getAttribute("userA"));
      out.write("</p>\n");
      out.write("               \n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"#\">Inicio</a>\n");
      out.write("                \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#reservas\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Reservas</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"reservas\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ReservaAdmin.jsp\">Ver Reservas</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Actualizar Reserva</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Registrar Reserva</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("                 <li>\n");
      out.write("                    <a href=\"#empleados\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Empleados</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"empleados\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Ver Empleados</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"RegistrarEmpleadosAdmin.jsp\">Registrar Empleados</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Actualizar Empleados</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#clientes\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Clientes</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"clientes\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Ver Clientes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"RegistrarClienteAdmin.jsp\">Registrar Clientes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Actualizar Clientes</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                       <li>\n");
      out.write("                    <a href=\"#problemas\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Problemas</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"problemas\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"VerProblemasAdminReserva.jsp\">Ver Problemas</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"RegistrarProbAdmin.jsp\">Registrar Problemas</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Actualizar Problemas</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                      \n");
      out.write("                 <li>\n");
      out.write("                    <a href=\"#\">Aprobar opiniones</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Content  -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\n");
      out.write("                        <i class=\"fas fa-align-left\"></i>\n");
      out.write("                       \n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                            \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">");
out.println(session.getAttribute("userA"));
      out.write("</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"salirAdmin\">Salir</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("          \n");
      out.write("                            \n");
      out.write("                            <h5>Registro de Clientes </h5>\n");
      out.write("                            <form action=\"servletAdmin\" method=\"post\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Nombre del Empleado</label>\n");
      out.write("                                        <input type=\"text\" name=\"nomfe\" class=\"form-control\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Apellido Paterno</label>\n");
      out.write("                                        <input type=\"text\" name=\"apepatfe\" class=\"form-control\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>    \n");
      out.write("                            \n");
      out.write("                               <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Apellido Materno</label>\n");
      out.write("                                        <input type=\"text\" name=\"apematfe\" class=\"form-control\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Fecha de Nacimiento</label>\n");
      out.write("                                        <input type=\"date\" name=\"fecnacfe\" class=\"form-control\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                               <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Email</label>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" name=\"emailfe\" class=\"form-control\" required>\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <div class=\"input-group-text\">@</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <fieldset disabled>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"cmatrucks.com\">\n");
      out.write("                                                </fieldset>\n");
      out.write("                                             </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Contraseña</label>\n");
      out.write("                                        <input type=\"password\" name=\"passfe\" class=\"form-control\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                  <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Documento de Identificación</label>\n");
      out.write("                                        <input type=\"text\" name=\"dnife\" class=\"form-control\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                 <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Rango</label>\n");
      out.write("                                        <select name=\"rangofe\" class=\"form-control\" required> \n");
      out.write("                                               <option value=\"Administrador\">Administrador</option>\n");
      out.write("                                               <option value=\"Secretaria\">Secretaria</option>\n");
      out.write("                                               <option value=\"Mecánico\">Mecánico</option>\n");
      out.write("                                           </select>\n");
      out.write("                                        \n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                       <div class=\"form-group\">\n");
      out.write("                                           <label>Estado</label>\n");
      out.write("                                           <select name=\"obserfe\" class=\"form-control\" required> \n");
      out.write("                                               <option value=\"Activo\">Activo</option>\n");
      out.write("                                               <option value=\"Espera\">Espera</option>\n");
      out.write("                                           </select>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <button type=\"submit\" name=\"btnRegistrarEmpleado\" class=\"btn btn-primary\">Registrar</button>\n");
      out.write("                                    \n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
