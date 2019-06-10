package util;


import java.sql.*;
public class Conexion  {
    
    
    public static Connection getConnection(){
        Connection cn=null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SOFTWARE";
        String pass = "SOFTWARE";
        
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn=(Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion en línea");
        } catch (Exception e) {
            System.out.println("Fallo en la conexión");
        }
        return cn;
    }
    
    
    
    public static void main(String args[]){
        getConnection();
        
    }
}
