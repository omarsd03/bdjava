/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import static bdjava.Iniciar.txtBD;
import static bdjava.Iniciar.txtHost;
import static bdjava.Iniciar.txtPassword;
import static bdjava.Iniciar.txtTabla;
import static bdjava.Iniciar.txtUsuario;
import static bdjava.Mostrar.modelo;
import static bdjava.Mostrar.txtNoControl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class Conexion {
    
    static Connection conexion;
    
    public Connection Conecta() {
        
        String host = txtHost.getText();
        String bd = txtBD.getText();
        String tabla = txtTabla.getText();
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        // String driver = "jdbc:postgresql://localhost//javabd3";
        String driver = "jdbc:postgresql://" + host + "/" + bd;
        try {
            conexion = DriverManager.getConnection(driver, usuario, password);
            System.out.println("Conexion Establecida!! :D");
            String query="SELECT * FROM " + tabla;
                Statement stmt=conexion.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                System.out.println(rs);
            
        } catch (SQLException ex) {
            Logger.getLogger(EventosIniciar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
        
    }
    
    public void Selecciona(Connection conexion) throws SQLException {
        
        System.out.println(conexion);
        
        String tabla = txtTabla.getText();
        String noControl = txtNoControl.getText();
        
        String query = "SELECT * FROM " + tabla + " WHERE nc = " + noControl;
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()){

            modelo.setRowCount(0);

            Object[] fila = new Object[2];
            fila[0] = rs.getInt("nc");
            fila[1] = rs.getString("nombre");

            modelo.addRow(fila);

            System.out.print(rs.getInt("nc"));
            System.out.print(rs.getString("nombre"));

        }
        
    }
    
}
