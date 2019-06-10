<%-- 
    Document   : admin
    Created on : 19/05/2019, 08:34:11 PM
    Author     : PC
--%>


<%@page import="dao.EmpleadoDAO"%>
<%@page import="bean.Empleado"%>
<%@page import="dao.ProblemaDAO"%>
<%@page import="bean.Reserva"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ReservaDAO"%>
<%@page import="bean.Problemas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>

<%
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
%>


<!DOCTYPE html>

<%!
String nom,apepat,apemat,fecnac,email,pass,dni,rango,obser;
String idR,clifk,probfk,fec,hora,estado;
String idP,nomP;
Problemas p=null;
Empleado objE = new Empleado();
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Admin</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="css/dashboard.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

</head>

<body>

    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Logo</h3>
            </div>

            <ul class="list-unstyled components">
                <p>Bienvenido&nbsp <%out.println(session.getAttribute("userA"));%></p>
               
                <li>
                    <a href="#">Inicio</a>
                
                </li>
                
                <li class="active">
                    <a href="#reservas" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Reservas</a>
                    <ul class="collapse list-unstyled" id="reservas">
                        <li >
                            <a href="#">Ver Reservas</a>
                        </li>
                        <li>
                            <a href="#">Actualizar Reserva</a>
                        </li>
                        <li>
                            <a href="#">Registrar Nueva Reserva</a>
                        </li>
                    </ul>
                </li>
              
                
                <li>
                    <a href="#empleados" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Empleados</a>
                    <ul class="collapse list-unstyled" id="empleados">
                        <li>
                            <a href="VerEmpleados.jsp">Ver Empleados</a>
                        </li>
                        <li>
                            <a href="RegistrarEmpleadosAdmin.jsp">Registrar Empleados</a>
                        </li>
                        <li>
                            <a href="#">Actualizar Empleados</a>
                        </li>
                        
                    </ul>
                </li>
                
                
                 <li>
                    <a href="#clientes" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Clientes</a>
                    <ul class="collapse list-unstyled" id="clientes">
                        <li>
                            <a href="Ver">Ver Clientes</a>
                        </li>
                        <li>
                            <a href="RegistrarClienteAdmin.jsp">Registrar Clientes</a>
                        </li>
                        <li>
                            <a href="#">Actualizar Clientes</a>
                        </li>
                        
                    </ul>
                </li>
                
                
                
                       <li>
                    <a href="#problemas" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Problemas</a>
                    <ul class="collapse list-unstyled" id="problemas">
                        <li class="active">
                            <a href="VerProblemasAdminReserva.jsp">Ver Problemas</a>
                        </li>
                        <li>
                            <a href="RegistrarProbAdmin.jsp">Registrar Problemas</a>
                        </li>
                        <li>
                            <a href="ActualizarProbAdmin.jsp">Actualizar Problemas</a>
                        </li>
                        
                
                    </ul>
                
                
                
                 <li>
                    <a href="#">Aprobar opiniones</a>
                </li>
                
                
                
                      
                
                
                
                
                
                
                
            </ul>
        </nav>

        <!-- Page Content  -->
        <div id="content">

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fas fa-align-left"></i>
                       
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                            
                            <li class="nav-item">
                                <a class="nav-link" href="#"><%out.println(session.getAttribute("userA"));%></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="salirAdmin">Salir</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
                            
                            <h5>Ver Problemas Comunes</h5>
                            <div class="line"></div>
                            <div class="row">
                                <div class="col">
                                    <div class="card">
                                        <div class="card-body">
                                              <%
	
        
        EmpleadoDAO objDAO = new EmpleadoDAO();
        ArrayList<Empleado> listaE = objDAO.listaEmpleado();
       
       
     %>
                                            <div class="card-tittle">Lista de Problemas</div>
                                            
                                            
                                            
                                            
                                            
                                                        <div class="col-lg-12">
                   
                   
                    <div class="table-responsive-sm">
                     <table class="table" id="tablaalu" class="display" style="width:100%">
                         <thead>
                 <tr> 
                     <td scope="col">Id Problema</td>                      
                        <td scope="col">Nombre del Problema</td>                      
                      
                       
                 </tr></thead>
                                    
               <%  for(Empleado objE: listaE){ 
                    nom = objE.getNom();
                    apepat = objE.getApepat();
                    apemat = objE.getApemat();
                    fecnac = objE.getFecnac();
                    email = objE.getEmail();
                    pass = objE.getPass();
                    dni = objE.getDni();
                    rango = objE.getRango();
                    obser = objE.getObser();
                    
                            
                     %>
                               
                 <tr>  
                     <td><%=nom%></td>
                     <td><%=apepat%></td>
                     <td><%=apemat%></td>
                     <td><%=fecnac%></td>
                     <td><%=email%></td>
                     <td><%=pass%></td>
                     <td><%=dni%></td>
                     <td><%=rango%></td>
                     <td><%=obser%></td>
                     
                 </tr>              
                        
	    <% }%>

                     </table>            
                </div>
                </div>
                                            
                                            
                                        </div>
                                    </div>   
                                </div>
                            </div>
                            
                            
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
</body>

</html>