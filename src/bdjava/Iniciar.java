/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import Componentes.MisComponentes;
import static bdjava.Mostrar.btnBuscar;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class Iniciar {
    
    static JLabel lblHost, lblBD, lblTabla, lblUsuario, lblPassword;
    static JTextField txtHost, txtBD, txtTabla, txtUsuario, txtPassword;
    static JButton btnConectar;
    
    Iniciar() {
        
        JFrame f = new JFrame("Ventana Iniciar");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHost = c.getLabel("Host");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblHost, restricciones);
        
        p.add(lblHost);
        
        txtHost = c.getField(8);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtHost, restricciones);
        
        p.add(txtHost);
        
        lblBD = c.getLabel("Base de Datos");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblBD, restricciones);
        
        p.add(lblBD);
        
        txtBD = c.getField(8);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtBD, restricciones);
        
        p.add(txtBD);
        
        lblTabla = c.getLabel("Nombre Tabla");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblTabla, restricciones);
        
        p.add(lblTabla);
        
        txtTabla = c.getField(8);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtTabla, restricciones);
        
        p.add(txtTabla);
        
        lblUsuario = c.getLabel("Usuario");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblUsuario, restricciones);
        
        p.add(lblUsuario);
        
        txtUsuario = c.getField(8);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtUsuario, restricciones);
        
        p.add(txtUsuario);
        
        lblPassword = c.getLabel("Password");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblPassword, restricciones);
        
        p.add(lblPassword);
        
        txtPassword = c.getField(8);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtPassword, restricciones);
        
        p.add(txtPassword);
        
        btnConectar = c.getButton("Conectar");
        btnConectar.addActionListener(new EventosIniciar());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnConectar, restricciones);
        
        p.add(btnConectar);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
