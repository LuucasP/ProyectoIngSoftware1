package dao;


import java.sql.*;
import util.Conexion;
import bean.Problemas;

import java.util.ArrayList;
public class ProblemaDAO {
    Connection cn=null;
    ResultSet rs=null;
    PreparedStatement pt=null;
    Problemas  p = null;
    
    public void registrarProblemas(Problemas p){
        
       try{
            cn = Conexion.getConnection();
            pt = cn.prepareStatement("INSERT INTO PROBLEMA (IDPROB,NOM_PROB) VALUES(?,?)");
            pt.setString(1,p.getIdprob());
            pt.setString(2,p.getNom_prob());
            pt.execute();
            pt.close();
            cn.close();
       }catch(Exception e){
           
       }
       
    }
    
    
    
       public   ArrayList<Problemas> listaProblemas(){
    ArrayList<Problemas> listaP=new ArrayList<>();
    Problemas objP;
     try{	 
	   cn  =  Conexion.getConnection();
           pt  = cn.prepareStatement("select * from problema");
           	   rs  =pt.executeQuery();	
            while(rs.next()) {
            	 objP=new  Problemas();
            	 objP.setIdprob(rs.getString(1));
                 objP.setNom_prob(rs.getString(2));
                 listaP.add(objP);
         }	        
        } catch (Exception e) {
                 return null;
	        }
       return listaP;
    }

    
    
    
}
