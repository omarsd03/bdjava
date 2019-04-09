/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import static bdjava.Conexion.conexion;
import static bdjava.Iniciar.txtBD;
import static bdjava.Iniciar.txtHost;
import static bdjava.Iniciar.txtPassword;
import static bdjava.Iniciar.txtTabla;
import static bdjava.Iniciar.txtUsuario;
import static bdjava.Mostrar.btnBuscar;
import static bdjava.Mostrar.modelo;
import static bdjava.Mostrar.txtNoControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class EventosMostrar implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnBuscar)) {
            
            try {
                new Conexion().Selecciona(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosMostrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
