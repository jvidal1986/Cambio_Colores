/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_color_paneles;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Controlador_Vista implements MouseListener {

    private Vista vista;

    public Controlador_Vista(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        switch (((JPanel) e.getSource()).getName()) {
            case Vista.AZUL_PANEL_ID:
                vista.cambiar_Titulo_Azul();
                break;

            case Vista.CYAN_PANEL_ID:
                vista.cambiar_Titulo_Cyan();
                break;

            case Vista.NARANAJA_PANEL_ID:
                vista.cambiar_Titulo_Naranja();
                break;

            case Vista.ROJO_PANEL_ID:
                vista.cambiar_Titulo_Rojo();
                break;

            case Vista.VERDE_PANEL_ID:
                vista.cambiar_Titulo_Verde();
                break;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        switch (((JPanel) e.getSource()).getName()) {
            case Vista.AZUL_PANEL_ID:
                vista.cambiarPanelAzul();
                break;

            case Vista.CYAN_PANEL_ID:
                vista.cambiarpanelCyan();
                break;

            case Vista.NARANAJA_PANEL_ID:
                vista.cambiarPanelNaranja();
                break;

            case Vista.ROJO_PANEL_ID:
                vista.cambiarPanelRojo();
                break;

            case Vista.VERDE_PANEL_ID:
                vista.cambiarPanelVerde();
                break;
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
