package dao;



import bean.Empleado;
import java.sql.*;
import java.util.ArrayList;
import util.Conexion;

public class EmpleadoDAO {
     Connection cn=null;
 ResultSet rs=null;
 PreparedStatement pt=null;
 
 
 public void registrarMecanico(Empleado c){
        
       try{
            cn = Conexion.getConnection();
            pt = cn.prepareStatement("INSERT INTO EMPLEADO(DNI,NOM,APEPAT,APEMAT,FECNAC,EMAIL,PASS,RANGO,OBSER) VALUES(?,?,?,?,?,?,?,?,?)");
            pt.setString(1,c.getDni());
            pt.setString(2,c.getNom());
            pt.setString(3,c.getApepat());
            pt.setString(4, c.getApemat());
            pt.setString(5, c.getFecnac());
            pt.setString(6, c.getEmail());
            pt.setString(7, c.getPass());
            pt.setString(8, c.getRango());  
            pt.setString(9, c.getObser());
            pt.execute();
            pt.close();
            cn.close();
       }catch(Exception e){
           
       }
       
    }
 
 
 public boolean autenticarEmpleado(String email, String pass){
       
        
        try {
          cn=Conexion.getConnection();
          pt=cn.prepareStatement("SELECT * FROM EMPLEADO WHERE EMAIL=? AND PASS=?");   
          pt.setString(1,email);
          pt.setString(2,pass);
          rs=pt.executeQuery();
          
          return rs.next();
          
           
        } catch (Exception e) {
        }
      
       
        return false;
    }
 
 
 
 
        public   ArrayList<Empleado> listaEmpleado(){
    ArrayList<Empleado> listaE=new ArrayList<>();
    Empleado objE;
     try{	 
	   cn  =  Conexion.getConnection();
           pt  = cn.prepareStatement("select * from problema");
           rs  =pt.executeQuery();	
            while(rs.next()) {
            	 objE=new  Empleado();
            	 objE.setDni(rs.getString(1));
                 objE.setNom(rs.getString(2));
                 objE.setApepat(rs.getString(3));
                 objE.setApemat(rs.getString(4));
                 objE.setFecnac(rs.getString(5));
                 objE.setEmail(rs.getString(6));
                 objE.setPass(rs.getString(7));
                 objE.setRango(rs.getString(8));
                 objE.setObser(rs.getString(9));
                 listaE.add(objE);
         }	        
        } catch (Exception e) {
                 return null;
	        }
       return listaE;
    }
 
 
 
 
}
