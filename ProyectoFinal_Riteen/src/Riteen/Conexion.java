/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Harim Tejada
 */
public class Conexion implements VConexion{
    
    public Statement enunciado;
    private static Conexion instancia;
    public Connection conn = null;

    
    
    public synchronized static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public void Conexion() {
    
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,login,password);
        enunciado = conn.createStatement();
         
        if (conn != null) {
          
          System.out.println("Conectado!");
         
            }
        }
        catch(SQLException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());     
       }
        catch(Exception ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
       
        }   
}
    
    public ResultSet hacerConsulta(String consulta){
        ResultSet resultado = null;
                try{
                    resultado = enunciado.executeQuery(consulta);
                }catch(SQLException e){
                    e.printStackTrace();
                }
        return resultado;
    }

    public Connection getConexion(){
        return conn;
    }       
}