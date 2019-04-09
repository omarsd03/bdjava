/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import Componentes.MisComponentes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class Ventana {
    
    static JButton btnIniciar, btnMostrar;
    
    Ventana() {
        
        JFrame f = new JFrame("Ventana Principal");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnIniciar = c.getButton("Iniciar");
        btnIniciar.addActionListener(new EventosVentana());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnIniciar, restricciones);
        
        p.add(btnIniciar);
        
        btnMostrar = c.getButton("Mostrar");
        btnMostrar.addActionListener(new EventosVentana());
        btnMostrar.setEnabled(false);
        // btnMostrar.setEnabled(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnMostrar, restricciones);
        
        p.add(btnMostrar);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
