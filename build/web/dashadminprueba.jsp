<%-- 
    Document   : dashadminprueba
    Created on : 16/05/2019, 08:45:01 AM
    Author     : PC
--%>

<%@page import="util.Conexion"%>
<%@page import="java.sql.*"%>
<%@page import="bean.Problemas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>

<%!
    Connection cn=null;
    PreparedStatement pt=null;
    ResultSet rs=null;
    Problemas p=null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prueba de admin problemas</h1>
        
        <form  action="dashadminprueba.jsp" method="get">
            
            
            <input type="submit" name="btnEnviar" value="Enviar">
            <%
            try{
                if(request.getParameter("btnEnviar")!=null){
                cn=Conexion.getConnection();
                pt=cn.prepareStatement("INSERT INTO RESERVA_CLIENTE(CLI_FK,  PROB_FK,   FEC_RES,  HORA_RES) VALUES((SELECT IDCLIENTE FROM CLIENTE WHERE EMAIL = lucas@poma.com), (SELECT IDPROB FROM PROBLEMA WHERE NOM_PROB=ASDAWQ),PRUEBA2,PRUEBA2)");
                pt.execute();
                request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                }
            }catch(Exception e){
                
            }
            
            %>
        </form>
    </body>
</html>
