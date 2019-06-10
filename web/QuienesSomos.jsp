<%-- 
    Document   : QuienesSomos
    Created on : 07/05/2019, 11:18:23 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Quienes Somos</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="css/QuienesSomos.css">
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
          <li class="nav-item active">
            <a class="nav-link" href="QuienesSomos.jsp">Quienes Somos</a>
          </li>
          <li class="nav-item ">
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
      <br>
      <strong><h3>Nosotros</h3></strong>
      <br>

      <!--Navigation-->
      <ul class="nav nav-tabs" id="myTab" role="tablist">
        <li class="nav-item">
          <a class="nav-link active" id="acerca-tab" data-toggle="tab" href="#acerca" role="tab" aria-controls="acerca" aria-selected="true">Acerca de Nosotros</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" id="mision-tab" data-toggle="tab" href="#mision" role="tab" aria-controls="mision" aria-selected="false">Misión</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" id="vision-tab" data-toggle="tab" href="#vision" role="tab" aria-controls="vision" aria-selected="false">Visión</a>
        </li>
      </ul>
      <div class="tab-content" id="myTabContent">
        <!--Acerca de Nosotros-->
        <div class="tab-pane fade show active" id="acerca" role="tabpanel" aria-labelledby="acerca-tab">
          <div class="row">
            <div class="col-12">
                Somos una empresa Lorem ipsum dolor sit amet consectetur adipisicing elit. 
                Delectus dicta corporis repellat odio nostrum assumenda non eligendi. Ex amet voluptatibus 
                adipisci incidunt mollitia quidem nam invento
                re laudantium autem, accusamus eligendi.
                <br>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Excepturi reiciendis delectus eius deleniti optio cum asperiores mollitia nisi quisquam voluptate repudiandae, similique autem facere quia ducimus officiis suscipit voluptatum voluptatibus.
                Lorem ipsum dolor sit amet consectetur, adipisicing elit. Totam tempore cum exercitationem modi, minus earum nisi. Sequi accusantium necessitatibus suscipit corporis amet, perferendis dolor architecto facilis, adipisci blanditiis obcaecati nemo!
                
              </div>

          </div>
          <div class="row">
            <div class="col-12 ">
              <img src="img/taller.jpg" class="d-block w-100" alt="">
            </div>
            </div>
          
          
        </div>
        <!--Fin Acerca de Nostros-->
        <div class="tab-pane fade" id="mision" role="tabpanel" aria-labelledby="mision-tab">
          
            <div class="row">
                <div class="col-12">
                    Nuestra misión Lorem ipsum dolor sit amet consectetur adipisicing elit. 
                    Delectus dicta corporis repellat odio nostrum assumenda non eligendi. Ex amet voluptatibus 
                    adipisci incidunt mollitia quidem nam invento
                    re laudantium autem, accusamus eligendi.
                    <br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Excepturi reiciendis delectus eius deleniti optio cum asperiores mollitia nisi quisquam voluptate repudiandae, similique autem facere quia ducimus officiis suscipit voluptatum voluptatibus.
                    Lorem ipsum dolor sit amet consectetur, adipisicing elit. Totam tempore cum exercitationem modi, minus earum nisi. Sequi accusantium necessitatibus suscipit corporis amet, perferendis dolor architecto facilis, adipisci blanditiis obcaecati nemo!
                    
                  </div>
    
              </div>
              <div class="row">
                <div class="col-12 ">
                  <img src="img/taller.jpg" class="d-block w-100" alt="">
                </div>
                </div>


        </div>
        <div class="tab-pane fade" id="vision" role="tabpanel" aria-labelledby="vision-tab">
   
            <div class="row">
                <div class="col-12">
                    Nuestra visión   Lorem ipsum dolor sit amet consectetur adipisicing elit. 
                    Delectus dicta corporis repellat odio nostrum assumenda non eligendi. Ex amet voluptatibus 
                    adipisci incidunt mollitia quidem nam invento
                    re laudantium autem, accusamus eligendi.
                    <br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Excepturi reiciendis delectus eius deleniti optio cum asperiores mollitia nisi quisquam voluptate repudiandae, similique autem facere quia ducimus officiis suscipit voluptatum voluptatibus.
                    Lorem ipsum dolor sit amet consectetur, adipisicing elit. Totam tempore cum exercitationem modi, minus earum nisi. Sequi accusantium necessitatibus suscipit corporis amet, perferendis dolor architecto facilis, adipisci blanditiis obcaecati nemo!
                    
                  </div>
    
              </div>
              <div class="row">
                <div class="col-12 ">
                  <img src="img/taller.jpg" class="d-block w-100" alt="">
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