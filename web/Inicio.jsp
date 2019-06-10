<%-- 
    Document   : Inicio
    Created on : 07/05/2019, 11:18:04 AM
    Author     : PC
--%>
<%@page import="java.sql.*"%>
<%@page import="util.Conexion"%>
<%@page import="bean.Problemas"%>
<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
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
%>

<!DOCTYPE html>
<html lang="en">
    <%!
        Connection cn = null;
        PreparedStatement pt = null;
        ResultSet rs = null;
        Problemas p = null;
        String motf, fecf, horf;
    %>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Manternimiento de Camiones CMATRUCKS</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/Inicio.css">
    </head>

    <body>

        <!--Primera Pag-->

        <div class="fondo">


            <nav class="navbar navbar-expand-lg navbar-light">
                <a class="navbar-brand" href="dashadminprueba.jsp">Logo</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02"
                        aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
                    <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                        <li class="nav-item active ">
                            <a class="nav-link" href="Inicio.jsp">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="QuienesSomos.jsp">Quienes Somos</span></a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="Ubiquenos.jsp">Ubiquenos</a>
                        </li>

                        <%if (session.getAttribute("user") != null) {%>
                        <!--Nav experimental-->
                        <!--<li class="nav-item ">-->


                        <div class="dropdown show">
                            <a class="btn btn-success dropdown-toggle " href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img  class="user" src="img/user_1.png"  width="40px" heigth="40px"><%out.print(session.getAttribute("user"));%>
                            </a>

                            <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                <a class="dropdown-item" href="DashboardUsuario.jsp" style="color:black !important;">Editar Perfil</a>
                                <a class="dropdown-item" href="ReservasCliente.jsp" style="color:black !important;">Mis Reservas</a>
                                <div class="dropdown-divider" style="color:black !important;"></div>
                                <a class="dropdown-item" href="salirCliente"  style="color:black !important;">Cerrar Sesión</a>
                            </div>
                        </div>

                        <!--</li>-->
                        <!--Fin Nav experimental-->

                        <%} else {%>
                        <!--Nav principal-->
                        <li class="nav-item ">
                            <a class="nav-link" href="RegistrarCliente.jsp">Registrate</a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="loginCliente.jsp">Iniciar Sesión</a>
                        </li>
                        <!--Fin Nav Principal-->
                        <%}%>
                    </ul>
                </div>
            </nav>



            <div class="container-fluid">
                <div class="row">


                    <div class="col-3">

                    </div>




                    <div class="col-md-3 col-sm-12 col-xs-12 cold-lg-3 carta ">
                        <h3>¿Tu camión presenta alguna falla?
                            Reserva una cita con nosotros.

                        </h3>
                        <br>
                        <form action="Inicio.jsp" method="get">
                            <div class="form-group">
                                <label for="motivo"><strong>Motivo</strong></label>
                                <select name="motivo" id="" class="form-control" <%if (p != null) {%> value="<%=p.getNom_prob()%>" <%}%>/>

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

                                </select>
                            </div>

                            <div class="form-group">
                                <label for="dia"><strong>Fecha de Reserva</strong></label>
                                <input type="date" name="dia" class="form-control">
                            </div>

                            <div class="form-group">
                                <label for="hora"><strong>Hora de Reserva</strong></label>
                                <input type="time" name="hora" class="form-control"></input>
                            </div>


                            <div class="alinea">
                                <!--modificando-->


                                <%if (session.getAttribute("user") != null) {%>
                                <button type="submit" value="Buscar" name="btnBuscar"  class="btn boton btn-success ">Reservar</button>


                                <%
                                    
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
                                %>

                            
                        </form>                        <!-- Button trigger modal -->




                        <%if (session.getAttribute("user") == null) {%>
                        <button type="button" value="Buscar" class="btn boton btn-success " data-toggle="modal" data-target="#exampleModal">Reservar</button>
                        <%}%>
                        </div>
                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel" style="text-align: justify;">Al parecer no tienes una cuenta, Por favor regístrate primero antes de hacer una reserva en el taller</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="servletCliente" method="get">

                                            <div class="container">
                                                <div class="row">
                                                    <div class="col-6">
                                                        <div class="form-group">
                                                            <label>Nombre: </label>
                                                            <input type="text" name="nomre" class="form-control" required>
                                                        </div>
                                                    </div>
                                                    <div class="col-6">
                                                        <div class="form-group">
                                                            <label>Apepat: </label>
                                                            <input type="text" name="apepatre" class="form-control"required>
                                                        </div>
                                                    </div>
                                                </div>


                                                <div class="row">
                                                    <div class="col-6">
                                                        <div class="form-group">
                                                            <label>Apemat: </label>
                                                            <input type="text" name="apematre" class="form-control" required>
                                                        </div>
                                                    </div>

                                                    <div class="col-6">
                                                        <div class="form-group">
                                                            <label>Fecnac: </label>
                                                            <input type="date" name="fecnacre" class="form-control" required>
                                                        </div>

                                                    </div>
                                                </div>



                                                <div class="row">
                                                    <div class="col-6">
                                                        <div class="form-group">
                                                            <label>Email: </label>
                                                            <input type="text" name="emailre" class="form-control" required>
                                                        </div>
                                                    </div>

                                                    <div class="col-6">
                                                        <div class="form-group">
                                                            <label>Contraseña: </label>
                                                            <input type="password" name="passre" class="form-control" required>
                                                        </div>
                                                    </div>
                                                </div> 
                                            </div>


                                       
                                    
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                        <button type="submit" name="btnRegistrar" class="btn btn-primary">Registrar</button>
                                    </div>
                                 </form>
                                        </div>
                                </div>
                            </div>
                        </div>






                        <div class="col-3">

                        </div>

                        <div class="col-2">

                        </div>
                        <div class="col-3">

                        </div>



                    </div>
                </div>
            </div>
        </div>
        <!--Fin parte 1-->

        <!--Inicio parte 2 - Servicios-->

        <div class="container parte2">
            <h3>Conoce nuestros servicios</h3>
            <br>
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="row">
                            <div class="col-5">
                                <img class="d-block w-100 imgc" src="img/1.jpg" alt="First slide">
                            </div>
                            <div class="col-7">
                                <center>
                                    <h4>Título del servicio</h3>
                                </center>
                                <br>
                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus
                                    aut non consequuntur dolorem quia, nemo, natus dolore quam vitae aperiam placeat
                                    beatae illum commodi ipsam deserunt fugiat accusantium, ab est

                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="row">
                            <div class="col-5">
                                <img class="d-block w-100 imgc" src="img/fondo.jpg" alt="First slide">
                            </div>
                            <div class="col-7">
                                <center>
                                    <h4>Título del servicio</h3>
                                </center>
                                <br>
                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus
                                    aut non consequuntur dolorem quia, nemo, natus dolore quam vitae aperiam placeat
                                    beatae illum commodi ipsam deserunt fugiat accusantium, ab est.</p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="row">
                            <div class="col-5">
                                <img class="d-block w-100 imgc" src="img/3slider.jpeg" alt="First slide">
                            </div>
                            <div class="col-7">
                                <center>
                                    <h4>Título del servicio</h3>
                                </center>
                                <br>
                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ducimus
                                    aut non consequuntur dolorem quia, nemo, natus dolore quam vitae aperiam placeat
                                    beatae illum commodi ipsam deserunt fugiat accusantium, ab est.</p>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <br>
        <br>
        <!--Fin parte 2 - Servicios-->


        <!--Inicio parte 3 - Distribuidores-->
        <div class="container">
            <h3>Nuestros distribuidores son</h3>
            <br>
            <div id="idC" class="carousel slide carouselbot" data-ride="carousel">
                <ol class="carousel-indicators">

                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="row">
                            <div class="col">
                                <img class="d-block w-50 cat" src="img/logo1.png" alt="1 slide" height="100px">
                            </div>
                            <div class="col">
                                <img class="d-block w-50 cu" src="img/logo2.png" alt="2 slide" height="100px">
                            </div>
                            <div class="col">
                                <img class="d-block w-50 spi" src="img/logo5.jpg" alt="5 slide" height="80px">
                            </div>



                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="row">

                            <div class="col">

                                <img class="d-block w-100 imgm" src="img/logo6.png" alt="6 slide" height="90px">
                            </div>

                            <div class="col">
                                <img class="d-block w-40 imgm rocket" src="img/logo3.png" alt="3 slide" height="100px">
                            </div>


                            <div class="col">
                                <img class="d-block w-100 imgm" src="img/logo4.png" alt="4 slide" height="90px">
                            </div>

                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#idC" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#idC" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <br>
        <br>
        <!--Fin parte 3 - Distribuidores-->

        <!--Inicio parte 4 - Comentarios de Usuarios-->

        <div class="opinion">
            <div class="container">
                <center><h3>Opiniones de los clientes</h3></center>
                <br>
                <div class="row">
                    <div class="col-1">

                    </div>

                    <!--editable1-->
                    <div class="col-4 cartaopinion">
                        <center><img src="img/user.png" alt=""></center>
                        <center>Nombre Apellido</center>
                        <br>
                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Asperiores quas placeat beatae tenetur maiores
                            nostrum!
                            Velit, cumque voluptas minima, inventore, obcaec
                            ati doloremque labore architecto sit quam veritatis laborum fugiat voluptatum!</p>
                    </div>
                    <!--fin editable1-->


                    <div class="col-2">

                    </div>

                    <!--editable2-->
                    <div class="col-4 cartaopinion">
                        <center><img src="img/user.png" alt=""></center>
                        <center>Nombre Apellido</center>
                        <br>
                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Asperiores quas placeat beatae tenetur maiores
                            nostrum!
                            Velit, cumque voluptas minima, inventore, obcaec
                            ati doloremque labore architecto sit quam veritatis laborum fugiat voluptatum!</p>
                    </div>
                    <!--fin editable2-->

                    <div class="col-1">

                    </div>
                </div>
            </div>
        </div>

        <!--Fin parte 4 - Comentarios de de Usuarios-->


        <!--Inicio parte 5 -Footer-->


        <footer>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <h2>Logo</h2>
                    </div>

                    <div class="col">
                        Central: 
                        <li>Calle la Calera N°270 - Ate</li>
                        <li>Cel. +51 985632665</li>
                        <li>RPM. *358299</li>
                        <li>Email.   cmatrucks@mail.com</li> 
                    </div>
                  
                </div>

            </div>
        </footer>

        <!--Fin parte 5 -Footer-->
        <!--Fin primera pag-->











        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

      



    </body>

</html>
