package dao;

import bean.Cliente;
import java.sql.*;
import java.util.ArrayList;
import util.Conexion;

public class ClienteDAO {
 Connection cn=null;
 ResultSet rs=null;
 PreparedStatement pt=null;
 Cliente objC=null;
 
 
 public void registrarCliente(Cliente cl){
     
     try {
         cn=Conexion.getConnection();
         pt=cn.prepareStatement("Insert into cliente(NOM , APEPAT , APEMAT , FECNAC , EMAIL , PASS ) VALUES(?,?,?,?,?,?)");
         pt.setString(1, cl.getNom());
         pt.setString(2, cl.getApepat());
         pt.setString(3, cl.getApemat());
         pt.setString(4, cl.getFecnac());
         pt.setString(5, cl.getEmail());
         pt.setString(6, cl.getPass());
         pt.execute();
         pt.close();
         cn.close();
     } catch (Exception e) {   
     }
     
 }
 
 
 
     
 
     public boolean autenticarCliente(String email, String pass){
       
        
        try {
          cn=Conexion.getConnection();
          pt=cn.prepareStatement("SELECT * FROM CLIENTE WHERE EMAIL=? AND PASS=?");   
          pt.setString(1,email);
          pt.setString(2,pass);          
          rs=pt.executeQuery();
          return rs.next();
        } catch (Exception e) {
        }
      
       
        return false;
    }
 
 
     
     
     public Cliente listaCliente(String nom,String apepat,String apemat,String fecnac,String email,String pass){
         try{
             cn=Conexion.getConnection();
             pt=cn.prepareStatement("SELECT NOM,APEPAT,APEMAT,FECNAC,EMAIL,PASS FROM CLIENTES WHERE EMAIL=? AND PASS=?");
             pt.setString(1, email);
             pt.setString(2, pass);
             rs=pt.executeQuery();
             while(rs.next()){
                 objC = new Cliente();
                 objC.setNom(rs.getString(1));
                 objC.setApepat(rs.getString(2));
                 objC.setApemat(rs.getString(3));
                 objC.setFecnac(rs.getString(4));
                 objC.setEmail(rs.getString(5));
                 objC.setPass(rs.getString(6));
                 
             }
         }catch(Exception e){
         }           
         return objC;
     }
     
     
     
     
   public   ArrayList<Cliente> listaCliente(String email,String pass){
    ArrayList<Cliente> lista=new ArrayList<>();
    Cliente objC;
    
     try{	 
	   cn  =  Conexion.getConnection();
           pt  = cn.prepareStatement("SELECT * FROM CLIENTES WHERE EMAIL=? AND PASS=?");
           pt.setString(1, email);
           pt.setString(2, pass);
	   rs  =pt.executeQuery();	
            while(rs.next()) {
            	 objC=new  Cliente();
                 objC.setNom(rs.getString(1));
                 objC.setApepat(rs.getString(2));
                 objC.setApemat(rs.getString(3));
                 objC.setFecnac(rs.getString(4));
                 objC.setEmail(rs.getString(5));
                 objC.setPass(rs.getString(6));
                 lista.add(objC);
         }	        
        } catch (Exception e) {
                 return null;
	        }
       return lista;
    }  
     
     
     
     
     
     
}
    


     
  
     
     
     
     
     
     
     
    
    
    

