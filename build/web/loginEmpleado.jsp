<%-- 
    Document   : loginCliente
    Created on : 07/05/2019, 11:18:56 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>





<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login Cliente</title>
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
</head>

<body>


    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">CMATRUCKS</a>

    </nav>
    <div class="container">

        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
            </div>
            <!--área-->

            <div class="col-lg-6 col-md-6 col-sm-6 login">
                <div class="imag">
                    <img src="img/1.png" alt="">
                </div>
                <br>
                <br>
                <div class="form-group">
                    <center><h2>Iniciar Sesión</h2></center>
                    <br>
                    <form action="servletAdmin" method="post">
                    <label for="user">Usuario: </label>
                    <input type="text" name="user" class="form-control">
                    <!--experimental-->
                    <br>
                    <br>
                    <!--fin-->
                    <label for="pass">Contraseña: </label>
                    <input type="password" name="pass" class="form-control">
                    <br>
                    <!--experimental2-->


                    <!--fin2-->
                    <!--experimental3
                    <div class="d-flex">
                        <div class="form-group">
                          
                    <a href="loginMecanico.html">Soy un mecánico</a> 
                     <br>
                     <a href="registroUsuario.html">No tengo una cuenta</a>  
                        
                    <button type="button" name="btnEnviar"  class="btn btn-success  ml-auto">Enviar</button> 
                    </div>  
                    </div>  -->

                    <!--experimental4
                    <div class="bot">
                       <a href="loginMecanico.html">Soy un mecánico</a>  <br>
                        <a href="registroUsuario.html">No tengo una cuenta</a> 
                         <button type="button" name="btnEnviar"  class="btn btn-success">Enviar</button>
                    </div>-->
                    <div class="row texto">
                        <div class="col-6">
                            <a href="loginCliente.html">Soy un Cliente</a> <br>
                           
                        </div>
                        <div class="col-3">

                        </div>

                        <div class="col-3 ">
                            <input type="submit" name="btnEnviarLogin" value="Enviar" class="btn btn-success form-control"></button>
                        </div>
                    </div>
                    </form>




                    <!--fin-->
                    <div class="col-lg-3 col-md-3 col-sm-3">

                    </div>

                </div>

            </div>




            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
                crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
                crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
                crossorigin="anonymous"></script>
</body>

</html>
