<%-- 
    Document   : admin
    Created on : 19/05/2019, 08:34:11 PM
    Author     : PC
--%>


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
String dni,nomprof,apepatprof,apematprof,sueldo,fecnac,fecing,sexo,email,contraseña;
String idR,clifk,probfk,fec,hora,estado;
String idP,nomP;
Problemas p=null;
Problemas objP=new Problemas();
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
                            <a href="ReservaEmpleado.jsp">Ver Reservas</a>
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
                            <a href="#">Ver Empleados</a>
                        </li>
                        <li>
                            <a href="#">Registrar Empleados</a>
                        </li>
                        <li>
                            <a href="#">Actualizar Empleados</a>
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
                            <a href="#.jsp">Actualizar Problemas</a>
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
                            
                                    
                                            
                                            
                                            <form action="servletProblema" method="post">
                                                
                                                    
                                                        <div class="form-group">
                                                       
                                                            <label>Id del Problema</label>
                                                            <input type="text" name="idprobf" class="form-control" required>
                                                       
                                                    </div>
                                                        
                                                         <div class="form-group">
                                                        
                                                            <label>Nombre del Problema</label>
                                                            <input type="text" name="nomprobf" class="form-control" required>
                                                        
                                                    </div>
                                                      
                                                        <button type="submit" name="btnRegistrarProb" class="btn btn-primary">Registrar Problema</button>
                                                        
                                                        
                                                
                                                
                                                
                                                
                                                
                                            </form>
                                            
                                            
                                            
                                            
                     
                                            
                                            
                                        
                               
                            
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

  
</body>

</html>