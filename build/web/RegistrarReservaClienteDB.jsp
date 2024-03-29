<%-- 
    Document   : admin
    Created on : 19/05/2019, 08:34:11 PM
    Author     : PC
--%>

<%@page import="java.sql.*"%>
<%@page import="util.Conexion"%>
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
<html>
    <%!
        Connection cn = null;
        PreparedStatement pt = null;
        ResultSet rs = null;
        Problemas p = null;
        String motf, fecf, horf;
        String test;
    %>
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
                    <p>Bienvenido&nbsp <%out.println(session.getAttribute("user"));%></p>

                    <li class="active">
                        <a href="DashboardAdmin">Inicio</a>

                    </li>

                    <li>
                        <a href="#reservas" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Reservas</a>
                        <ul class="collapse list-unstyled" id="reservas">
                            <li>
                                <a href="ReservasCliente.jsp">Ver Reservas</a>
                            </li>
                            <li>
                                <a href="#">Actualizar Reserva</a>
                            </li>
                            <li>
                                <a href="">Registrar Nueva Reserva</a>
                            </li>
                        </ul>
                    </li>


                    <li>
                        <a href="#">Dar una opinión</a>
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
                                    <a class="nav-link" href="#"><%out.println(session.getAttribute("user"));%></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="salirCliente">Salir</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <h5>Registrar Nueva Reserva</h5>
                <div class="line"></div>
                <div class="row">
                    <div class="col-6">
                        <div class="card">
                            <div class="card-body">
                                <div class="card-tittle">Edita tu perfil</div>

                                <form action="" method="">

                                        
                                    <div class="row">
                                       
                                        <div class="col-6">
                                            <div class="form-group">
                                                <label>Problema</label>
                                                <select name="prob" class="form-control">
                                                    <%
                                                        try {
                                                            cn = Conexion.getConnection();
                                                            pt = cn.prepareStatement("SELECT  * FROM PROBLEMA");
                                                            rs = pt.executeQuery();
                                                            while (rs.next()) {
                                                                out.println("<option>" + rs.getString(2) + "</option>");
                                                            }
                                                        } catch (Exception e) {

                                                        }

                                                    %>
                                                    <option name="nom" value="Otro Motivo">Otro Motivo</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-6">
                                            <div class="form-group">
                                                <label>Otro Motivo</label>
                                                <input type="date" name="fecr" class="form-control">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-6">
                                            <div class="form-group">
                                                <label>Hora de Reserva</label>
                                                <input type="time" name="horar" class="form-control">
                                            </div>
                                        </div>

                                        <div class="col-6">
                                            <div class="form-gruop">
                                                <label>Fecha de Reserva</label>
                                                <input type="date" name="fecr" class="form-control">
                                            </div>

                                            <button  type="button" class="btn btn-primary">Registrar</button>
                                        </div>

                                </form>
                            </div>
                        </div>   
                    </div>
                    <div class="col-6">

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