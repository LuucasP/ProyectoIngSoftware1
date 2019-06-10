/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.Cliente;
import bean.Empleado;
import bean.Problemas;
import dao.ClienteDAO;
import dao.EmpleadoDAO;
import dao.ProblemaDAO;
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
@WebServlet(name = "servletAdmin", urlPatterns = {"/servletAdmin"})
public class servletAdmin extends HttpServlet {

    Cliente objC = null;
    ClienteDAO objCDAO = new ClienteDAO();
    Problemas objP = null;
    ProblemaDAO objDAO = new ProblemaDAO();
    String idprob,nom_prob;
    
    Empleado objE = null;
    EmpleadoDAO objEDAO = new EmpleadoDAO();
    String dni,nom,apepat,apemat,fecnac,email,pass,rango,obser;//aún no usados
    String passA,emailA;
    String nomf,apepatf,apematf,fecnacf,emailf,passf;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try{
            
            //Admin
            emailA = request.getParameter("user");
            passA = request.getParameter("pass");
            
        idprob = request.getParameter("cod");
        nom_prob=request.getParameter("nom");
        
        
        nomf = request.getParameter("nomfr");
        apepatf = request.getParameter("apepatfr");
        apematf = request.getParameter("apematfr");
        fecnacf = request.getParameter("fecnacfr");
        emailf = request.getParameter("emailfr");
        passf = request.getParameter("passfr");
        
        
        nom = request.getParameter("nomfe");
        apepat = request.getParameter("apepatfe");
        apemat = request.getParameter("apematfe");
        fecnac = request.getParameter("fecnacfe");
        email = request.getParameter("emailfe");
        pass = request.getParameter("passfe");
        dni = request.getParameter("dnife");
        rango = request.getParameter("rangofe");
        obser = request.getParameter("obserfe");
        
        if(request.getParameter("btnEnviar")!=null){
           if(idprob!=null && nom_prob!=null){
              objDAO.registrarProblemas(new Problemas(idprob, nom_prob));     
              request.getRequestDispatcher("Inicio.jsp").forward(request, response);
           }
                 
             request.getRequestDispatcher("loginCliente.jsp").forward(request, response);
        
        }
        
        
        
        
        if(request.getParameter("btnEnviarLogin")!=null){
             if(emailA!=null && passA!=null){
                    if(objEDAO.autenticarEmpleado(emailA, passA)){
                        HttpSession nuevaSesion = request.getSession();
                        nuevaSesion.setAttribute("userA", emailA);
                        request.getRequestDispatcher("DashboardAdmin.jsp").forward(request, response);
                    }else{
                        request.getRequestDispatcher("loginEmpleado.jsp").forward(request, response);
                    }
                        
                }
        }
        
        
        
        if(request.getParameter("btnRegistrarCliente")!=null){
            if(nomf!=null && apepatf!=null && apematf!=null && fecnacf!=null && emailf!=null && passf!=null){
            objCDAO.registrarCliente(new Cliente(nomf, apepatf, apematf, fecnacf, emailf, passf));
          
        }
              request.getRequestDispatcher("RegistrarClienteAdmin.jsp").forward(request, response);
        }
        
        
           
        if(request.getParameter("btnRegistrarEmpleado")!=null){
            if(nom!=null && apepat!=null && apemat!=null  && email!=null && pass!=null && dni!=null && rango!=null && obser!=null){
            objEDAO.registrarMecanico(new Empleado(dni, nom, apepat, apemat, fecnac, email+"@cmatrucks.com", pass, rango,obser));
            }
             request.getRequestDispatcher("RegistrarEmpleadosAdmin.jsp").forward(request, response);
        }
        
        
        }catch(Exception e){
            
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
    }// </editor-fold>

}
