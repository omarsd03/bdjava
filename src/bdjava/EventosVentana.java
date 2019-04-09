/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import static bdjava.Iniciar.txtHost;
import static bdjava.Ventana.btnIniciar;
import static bdjava.Ventana.btnMostrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Omar
 */
public class EventosVentana implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnIniciar)) {
            new Iniciar();
        }
        
        if (e.getSource().equals(btnMostrar)) {
            new Mostrar();
        }
        
    }
    
}
