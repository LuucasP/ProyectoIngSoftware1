/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.Cliente;
import java.sql.*;
import util.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
@WebServlet(name = "servletReserva", urlPatterns = {"/servletReserva"})
public class servletReserva extends HttpServlet {

    Connection cn;
    PreparedStatement pt;
    ResultSet rs;
    Cliente objC=null;
    String motivoS,diaS,horaS,usuario;
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
                            try {

                                        motivoS = request.getParameter("motivo");
                                       diaS = request.getParameter("dia");
                                       horaS = request.getParameter("hora");

                                       HttpSession rSesion = request.getSession();
                                      
                if(request.getParameter("btnEnviar")!=null){
               
                cn=Conexion.getConnection();
                pt=cn.prepareStatement("INSERT INTO RESERVA_CLIENTE(CLI_FK,PROB_FK,FEC_RES,HORA_RES) VALUES((SELECT IDCLIENTE FROM CLIENTE WHERE EMAIL = '"+request.getAttribute("user")+"'), (SELECT IDPROB FROM PROBLEMA WHERE NOM_PROB='ASDAWQ'),'PRUEBA5','PRUEBA5')");
                pt.execute();
               response.encodeURL("Inicio.jsp");
                }
             
                    
                
                
           

                                    } catch (Exception e) {

                                    }

                                    
        
        
        
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold><

}
