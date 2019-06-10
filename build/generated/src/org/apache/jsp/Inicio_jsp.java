package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import util.Conexion;
import bean.Problemas;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        Connection cn = null;
        PreparedStatement pt = null;
        ResultSet rs = null;
        Problemas p = null;
        String motf, fecf, horf;
    
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    response.setHeader("Pragma", "no-cache");
    response.addHeader("Cache-control", "must-revalidate");
    response.addHeader("Cache-control", "no-cache");
    response.addHeader("Cache-control", "no-store");
    response.setDateHeader("Expires", 0);

    try {
        if (session.getAttribute("user") == null) {
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }
    } catch (Exception e) {

    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Manternimiento de Camiones CMATRUCKS</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Inicio.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--Primera Pag-->\n");
      out.write("\n");
      out.write("        <div class=\"fondo\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"dashadminprueba.jsp\">Logo</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo02\"\n");
      out.write("                        aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto mt-2 mt-lg-0\">\n");
      out.write("                        <li class=\"nav-item active \">\n");
      out.write("                            <a class=\"nav-link\" href=\"Inicio.jsp\">Inicio<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a class=\"nav-link\" href=\"QuienesSomos.jsp\">Quienes Somos</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a class=\"nav-link\" href=\"Ubiquenos.jsp\">Ubiquenos</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        ");
if (session.getAttribute("user") != null) {
      out.write("\n");
      out.write("                        <!--Nav experimental-->\n");
      out.write("                        <!--<li class=\"nav-item \">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"dropdown show\">\n");
      out.write("                            <a class=\"btn btn-success dropdown-toggle \" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <img  class=\"user\" src=\"img/user_1.png\"  width=\"40px\" heigth=\"40px\">");
out.print(session.getAttribute("user"));
      out.write("\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"DashboardUsuario.jsp\" style=\"color:black !important;\">Editar Perfil</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"ReservasCliente.jsp\" style=\"color:black !important;\">Mis Reservas</a>\n");
      out.write("                                <div class=\"dropdown-divider\" style=\"color:black !important;\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"salirCliente\"  style=\"color:black !important;\">Cerrar Sesión</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--</li>-->\n");
      out.write("                        <!--Fin Nav experimental-->\n");
      out.write("\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <!--Nav principal-->\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a class=\"nav-link\" href=\"RegistrarCliente.jsp\">Registrate</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a class=\"nav-link\" href=\"loginCliente.jsp\">Iniciar Sesión</a>\n");
      out.write("                        </li>\n");
      out.write("                        <!--Fin Nav Principal-->\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-12 col-xs-12 cold-lg-3 carta \">\n");
      out.write("                        <h3>¿Tu camión presenta alguna falla?\n");
      out.write("                            Reserva una cita con nosotros.\n");
      out.write("\n");
      out.write("                        </h3>\n");
      out.write("                        <br>\n");
      out.write("                        <form action=\"Inicio.jsp\" method=\"get\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"motivo\"><strong>Motivo</strong></label>\n");
      out.write("                                <select name=\"motivo\" id=\"\" class=\"form-control\" ");
if (p != null) {
      out.write(" value=\"");
      out.print(p.getNom_prob());
      out.write('"');
      out.write(' ');
}
      out.write("/>\n");
      out.write("\n");
      out.write("                                ");

                                    try {
                                        cn = Conexion.getConnection();
                                        pt = cn.prepareStatement("SELECT  * FROM PROBLEMA");
                                        rs = pt.executeQuery();
                                        while (rs.next()) {
                                            out.println("<option>" + rs.getString(2) + "</option>");
                                        }
                                    } catch (Exception e) {

                                    }

                                
      out.write("\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"dia\"><strong>Fecha de Reserva</strong></label>\n");
      out.write("                                <input type=\"date\" name=\"dia\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"hora\"><strong>Hora de Reserva</strong></label>\n");
      out.write("                                <input type=\"time\" name=\"hora\" class=\"form-control\"></input>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"alinea\">\n");
      out.write("                                <!--modificando-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
if (session.getAttribute("user") != null) {
      out.write("\n");
      out.write("                                <button type=\"submit\" value=\"Buscar\" name=\"btnBuscar\"  class=\"btn boton btn-success \">Reservar</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    
                                    motf = request.getParameter("motivo");
                                    fecf = request.getParameter("dia");
                                    horf = request.getParameter("hora");
                                    
                                        try {
                                           
                                            if (request.getParameter("btnBuscar") != null) {
                                                cn = Conexion.getConnection();
                                                pt = cn.prepareStatement("INSERT INTO RESERVA_CLIENTE(CLI_FK,PROB_FK,FEC_RES,HORA_RES,ESTADO) VALUES((SELECT IDCLIENTE FROM CLIENTE WHERE EMAIL = '" + session.getAttribute("user") + "'), (SELECT IDPROB FROM PROBLEMA WHERE NOM_PROB='"+motf+"'),'"+fecf+"','"+horf+"','PENDIENTE')");
                                                pt.execute();
                                                response.encodeURL("Inicio.jsp");
                                            }
                                        } catch (Exception e) {

                                        }

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </form>                        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
if (session.getAttribute("user") == null) {
      out.write("\n");
      out.write("                        <button type=\"button\" value=\"Buscar\" class=\"btn boton btn-success \" data-toggle=\"modal\" data-target=\"#exampleModal\">Reservar</button>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Modal -->\n");
      out.write("                        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <h5 class=\"modal-title\" id=\"exampleModalLabel\" style=\"text-align: justify;\">Al parecer no tienes una cuenta, Por favor regístrate primero antes de hacer una reserva en el taller</h5>\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form action=\"servletCliente\" method=\"get\">\n");
      out.write("\n");
      out.write("                                            <div class=\"container\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Nombre: </label>\n");
      out.write("                                                            <input type=\"text\" name=\"nomre\" class=\"form-control\" required>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Apepat: </label>\n");
      out.write("                                                            <input type=\"text\" name=\"apepatre\" class=\"form-control\"required>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Apemat: </label>\n");
      out.write("                                                            <input type=\"text\" name=\"apematre\" class=\"form-control\" required>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Fecnac: </label>\n");
      out.write("                                                            <input type=\"date\" name=\"fecnacre\" class=\"form-control\" required>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Email: </label>\n");
      out.write("                                                            <input type=\"text\" name=\"emailre\" class=\"form-control\" required>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Contraseña: </label>\n");
      out.write("                                                            <input type=\"password\" name=\"passre\" class=\"form-control\" required>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div> \n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                        <button type=\"submit\" name=\"btnRegistrar\" class=\"btn btn-primary\">Registrar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                 </form>\n");
      out.write("                                        </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Fin parte 1-->\n");
      out.write("\n");
      out.write("        <!--Inicio parte 2 - Servicios-->\n");
      out.write("\n");
      out.write("        <div class=\"container parte2\">\n");
      out.write("            <h3>Conoce nuestros servicios</h3>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-5\">\n");
      out.write("                                <img class=\"d-block w-100 imgc\" src=\"img/1.jpg\" alt=\"First slide\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-7\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h4>Título del servicio</h3>\n");
      out.write("                                </center>\n");
      out.write("                                <br>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus\n");
      out.write("                                    aut non consequuntur dolorem quia, nemo, natus dolore quam vitae aperiam placeat\n");
      out.write("                                    beatae illum commodi ipsam deserunt fugiat accusantium, ab est\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-5\">\n");
      out.write("                                <img class=\"d-block w-100 imgc\" src=\"img/fondo.jpg\" alt=\"First slide\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-7\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h4>Título del servicio</h3>\n");
      out.write("                                </center>\n");
      out.write("                                <br>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus\n");
      out.write("                                    aut non consequuntur dolorem quia, nemo, natus dolore quam vitae aperiam placeat\n");
      out.write("                                    beatae illum commodi ipsam deserunt fugiat accusantium, ab est.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-5\">\n");
      out.write("                                <img class=\"d-block w-100 imgc\" src=\"img/3slider.jpeg\" alt=\"First slide\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-7\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h4>Título del servicio</h3>\n");
      out.write("                                </center>\n");
      out.write("                                <br>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus\n");
      out.write("                                    aut non consequuntur dolorem quia, nemo, natus dolore quam vitae aperiam placeat\n");
      out.write("                                    beatae illum commodi ipsam deserunt fugiat accusantium, ab est.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!--Fin parte 2 - Servicios-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Inicio parte 3 - Distribuidores-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Nuestros distribuidores son</h3>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"idC\" class=\"carousel slide carouselbot\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <img class=\"d-block w-50 cat\" src=\"img/logo1.png\" alt=\"1 slide\" height=\"100px\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <img class=\"d-block w-50 cu\" src=\"img/logo2.png\" alt=\"2 slide\" height=\"100px\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <img class=\"d-block w-50 spi\" src=\"img/logo5.jpg\" alt=\"5 slide\" height=\"80px\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col\">\n");
      out.write("\n");
      out.write("                                <img class=\"d-block w-100 imgm\" src=\"img/logo6.png\" alt=\"6 slide\" height=\"90px\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <img class=\"d-block w-40 imgm rocket\" src=\"img/logo3.png\" alt=\"3 slide\" height=\"100px\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <img class=\"d-block w-100 imgm\" src=\"img/logo4.png\" alt=\"4 slide\" height=\"90px\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#idC\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#idC\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!--Fin parte 3 - Distribuidores-->\n");
      out.write("\n");
      out.write("        <!--Inicio parte 4 - Comentarios de Usuarios-->\n");
      out.write("\n");
      out.write("        <div class=\"opinion\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center><h3>Opiniones de los clientes</h3></center>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-1\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--editable1-->\n");
      out.write("                    <div class=\"col-4 cartaopinion\">\n");
      out.write("                        <center><img src=\"img/user.png\" alt=\"\"></center>\n");
      out.write("                        <center>Nombre Apellido</center>\n");
      out.write("                        <br>\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Asperiores quas placeat beatae tenetur maiores\n");
      out.write("                            nostrum!\n");
      out.write("                            Velit, cumque voluptas minima, inventore, obcaec\n");
      out.write("                            ati doloremque labore architecto sit quam veritatis laborum fugiat voluptatum!</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--fin editable1-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--editable2-->\n");
      out.write("                    <div class=\"col-4 cartaopinion\">\n");
      out.write("                        <center><img src=\"img/user.png\" alt=\"\"></center>\n");
      out.write("                        <center>Nombre Apellido</center>\n");
      out.write("                        <br>\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Asperiores quas placeat beatae tenetur maiores\n");
      out.write("                            nostrum!\n");
      out.write("                            Velit, cumque voluptas minima, inventore, obcaec\n");
      out.write("                            ati doloremque labore architecto sit quam veritatis laborum fugiat voluptatum!</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--fin editable2-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-1\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Fin parte 4 - Comentarios de de Usuarios-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Inicio parte 5 -Footer-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <h2>Logo</h2>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        Central: \n");
      out.write("                        <li>Calle la Calera N°270 - Ate</li>\n");
      out.write("                        <li>Cel. +51 985632665</li>\n");
      out.write("                        <li>RPM. *358299</li>\n");
      out.write("                        <li>Email.   cmatrucks@mail.com</li> \n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!--Fin parte 5 -Footer-->\n");
      out.write("        <!--Fin primera pag-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
