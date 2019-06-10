package servlet;

import dao.ClienteDAO;
import bean.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "servletCliente", urlPatterns = {"/servletCliente"})
public class servletCliente extends HttpServlet {

  
    Cliente objC = new Cliente();
    ClienteDAO objDAO = new ClienteDAO();
    
    String email, pass;
    String nomr,apepatr,apematr,fecnacr,emailr,passr;
    String nomn, apepatn, apematn, fecnacn;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    
        try {
            
            
            //login
            email = request.getParameter("user");
            pass = request.getParameter("pass");
            
            //registro
            nomr = request.getParameter("nomre");
            apepatr = request.getParameter("apepatre");
            apematr = request.getParameter("apematre");
            fecnacr = request.getParameter("fecnacre");
            emailr = request.getParameter("emailre");
            passr= request.getParameter("passre");
                   
            
            
            
            if(request.getParameter("btnEnviar")!=null){
                if(email!=null && pass!=null){
                    if(objDAO.autenticarCliente(email, pass)){
                        //inicio
                       
                        //fin
                        HttpSession nuevaSesion = request.getSession();
                        nuevaSesion.setAttribute("user",email);
                        request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                    }else{
                        try(PrintWriter out = response.getWriter()){
                        out.println("<script>");
                        out.println("var v1 = alert('Los datos ingresados no son correctos');");
                        out.println("window.location.replace('loginCliente.jsp');");
                        out.println("</script>");
                        }catch(Exception e){
                                
                        }
                        request.getRequestDispatcher("loginCliente.jsp").forward(request, response);
                       
                    }
                        
                }
                
            }
            
            
             
            
            
            if(request.getParameter("btnRegistrar")!=null){
                if(nomr!=null && apepatr!=null && apematr!=null && fecnacr!=null && emailr!=null && passr!=null){
                     objDAO.registrarCliente(new Cliente(nomr, apepatr, apematr, fecnacr, emailr, passr));
                   
                }
                
                try(PrintWriter out = response.getWriter()){
                        out.println("<script>");
                        out.println("var v1 = alert('Se registró satisfactoriamente');");
                        out.println("window.location.replace('Inicio.jsp');");
                        out.println("</script>");
                        }catch(Exception e){
                                
                        }
                
                request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
                try(PrintWriter out = response.getWriter()){
                        out.println("<script>");
                        out.println("var v1 = alert('los datos son incorrectos, por favor ingréselos de nuevo');");
                        out.println("window.location.replace('RegistrarCliente.jsp');");
                        out.println("</script>");
                        }catch(Exception e){
                                
                        }
                request.getRequestDispatcher("RegistrarCliente.jsp").forward(request, response);
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
    }// </editor-fold>

}
