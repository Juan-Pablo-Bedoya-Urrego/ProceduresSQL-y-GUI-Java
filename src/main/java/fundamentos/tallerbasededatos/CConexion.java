/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos.tallerbasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class CConexion {

    Connection conectar = null;

    String usuario = "";
    String password = "";
    String bd = "medcenter_db";
    String ip = "localhost";
    String puerto = "1433";

    public Connection establecerConexion(String usuario, String password) {

        try {
            String cadena = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName=" + bd;
            conectar = DriverManager.getConnection(cadena, usuario, password);
            JOptionPane.showMessageDialog(null, "Usuario valido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario no valido"
                    + e.toString());
        }
        return conectar;
    }
    
    public Connection Conexion(String usuario, String password) {

        try {
            String cadena = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName=" + bd;
            conectar = DriverManager.getConnection(cadena, usuario, password);
        } catch (Exception e) {
            
        }
        return conectar;
    }
}
