/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import Componentes.MisComponentes;
import static bdjava.Ventana.btnMostrar;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class Mostrar {
    
    static JLabel lblNoControl;
    static JTextField txtNoControl;
    static JButton btnBuscar, btnAtras;
    static JTable tablaAlumnos;
    static DefaultTableModel modelo;
    
    Mostrar() {
        
        JFrame f = new JFrame("Ventana Mostrar");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocation(900, 190);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblNoControl = c.getLabel("No. Control");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblNoControl, restricciones);
        
        p.add(lblNoControl);
        
        txtNoControl = c.getField(8);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtNoControl, restricciones);
        
        p.add(txtNoControl);
        
        btnBuscar = c.getButton("Buscar");
        btnBuscar.addActionListener(new EventosMostrar());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnBuscar, restricciones);
        
        p.add(btnBuscar);
        
        tablaAlumnos = new JTable();
        
        modelo = (DefaultTableModel) tablaAlumnos.getModel();
        tablaAlumnos.setModel(modelo);
        
        modelo.addColumn("No Control");
        modelo.addColumn("Alumno");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(tablaAlumnos, restricciones);
        
        p.add(tablaAlumnos);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
