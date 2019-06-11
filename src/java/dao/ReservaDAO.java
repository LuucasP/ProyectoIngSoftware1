package dao;

import util.Conexion;
import bean.Reserva;
import bean.ReservaCliente;
import java.sql.*;
import java.util.ArrayList;

public class ReservaDAO {

    Connection cn;
    ResultSet rs;
    PreparedStatement pt;
    Reserva objR = null;
    ReservaCliente objRC = null;


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
  
  
   public   ArrayList<ReservaCliente> listaReservaCliente(String nom){
    ArrayList<ReservaCliente> listaRC=new ArrayList<>();
    ReservaCliente objRC;
     try{	 
	   cn  =  Conexion.getConnection();
           pt  = cn.prepareStatement("select r.idreserva , c.nom||' '||c.apepat||' '||c.apemat , p.nom_prob , r.fec_res , r.hora_res , r.estado from Reserva_cliente r, cliente c , problema p where r.cli_fk = (select idcliente from cliente where email = ?) and c.idcliente = r.cli_fk and r.prob_fk = p.idprob");
           pt.setString(1,nom);
	   rs  =pt.executeQuery();	
            while(rs.next()) {
            	 objRC=new  ReservaCliente();
            	 objRC.setIdr(rs.getInt(1));
                 objRC.setNom(rs.getString(2));
                 objRC.setNomprob(rs.getString(3));                                    
                 objRC.setFecres(rs.getString(4));
                 objRC.setHorares(rs.getString(5));
                 objRC.setEstado(rs.getString(6));
                 listaRC.add(objRC);
         }	        
        } catch (Exception e) {
                 return null;
	        }
       return listaRC;
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
