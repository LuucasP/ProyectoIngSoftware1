package dao;

import util.Conexion;
import bean.Reserva;
import java.sql.*;
import java.util.ArrayList;

public class ReservaDAO {

    Connection cn;
    ResultSet rs;
    PreparedStatement pt;
    Reserva objR = null;

  public   ArrayList<Reserva> listaReserva(String nom){
    ArrayList<Reserva> listaR=new ArrayList<>();
    Reserva objR;
     try{	 
	   cn  =  Conexion.getConnection();
           pt  = cn.prepareStatement("select * from Reserva_cliente where cli_fk = (select idcliente from cliente where email = ?)");
           pt.setString(1,nom);
	   rs  =pt.executeQuery();	
            while(rs.next()) {
            	 objR=new  Reserva();
            	 objR.setIdR(rs.getInt(1));
                 objR.setClifk(rs.getInt(2));
                 objR.setProbfk(rs.getString(3));                                    
                 objR.setFec(rs.getString(4));
                 objR.setHora(rs.getString(5));
                 objR.setEstado(rs.getString(6));
                 listaR.add(objR);
         }	        
        } catch (Exception e) {
                 return null;
	        }
       return listaR;
    }



   public   ArrayList<Reserva> listaReservaA(){
    ArrayList<Reserva> listaRA=new ArrayList<>();
    Reserva objR;
     try{	 
	   cn  =  Conexion.getConnection();
           pt  = cn.prepareStatement("select * from Reserva_cliente");
           
	   rs  =pt.executeQuery();	
            while(rs.next()) {
            	 objR=new  Reserva();
            	 objR.setIdR(rs.getInt(1));
                 objR.setClifk(rs.getInt(2));
                 objR.setProbfk(rs.getString(3));                                    
                 objR.setFec(rs.getString(4));
                 objR.setHora(rs.getString(5));
                 objR.setEstado(rs.getString(6));
                 listaRA.add(objR);
         }	        
        } catch (Exception e) {
                 return null;
	        }
       return listaRA;
    }
  
  

    
}
