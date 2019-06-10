<%-- 
    Document   : Ubiquenos
    Created on : 07/05/2019, 11:18:39 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Ubíquenos</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="css/Ubiquenos.css">
</head>

<body>

  <!--Primera Pag-->

  <div class="fondo">

    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #414141;">
      <a class="navbar-brand" href="#">Logo</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02"
        aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
        <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
          <li class="nav-item">
            <a class="nav-link" href="Inicio.jsp">Inicio<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="QuienesSomos.jsp">Quienes Somos</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="Ubiquenos.jsp">Ubiquenos</a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="#">Registrate</a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="#">Iniciar Sesión</a>
          </li>
        </ul>
      </div>
    </nav>



    
  </div>
  <!--Fin parte 1-->

  <!--Inicio parte 2-->
  <div class="bgd">
    <div class="container conte">
      <strong><h3>Nuestro taller</h3></strong>
      <br>
        <div class="row">
            <div class="col-md-4 col-lg-4 col-sm-12 col-xs-12">
                    <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                            <a class="nav-link active" id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home" role="tab" aria-controls="v-pills-home" aria-selected="true">
                                <h5>Sede Ate</h5>
                                <ul>
                                    <li>Calle la Calera  N°270</li>
                                    <li>Lun-Vie 8:00am - 6:00pm</li>
                                    <li>Sab     8:00am - 12:00pm </li>
                                </ul>    
                            </a>
                    </div>
            </div>
            <br>

            <div class="col-md-8 col-lg-8 col-sm-12 col-xs-12">
     
          <div class="tab-content" id="v-pills-tabContent">
            <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15606.91559632043!2d-76.98572234672754!3d-12.0621646463269!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x7c66e14c272fa018!2sCmatrucks+S.A.C.!5e0!3m2!1ses-419!2spe!4v1556490387272!5m2!1ses-419!2spe" width="800" height="600" frameborder="0" style="border:0"  class="d-block w-100" allowfullscreen ></iframe>
            </div>
          </div>
        </div>
        </div>
       
      
      <!--Fin Navigation-->
    </div>
</div>
  <!--Fin parte 2-->
 


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













  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
</body>

</html>
