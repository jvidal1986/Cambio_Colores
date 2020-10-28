/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_color_paneles;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Vista extends JFrame {

    private JPanel panel_Titulo;
    private JLabel label_Titulo;
    private final String TITULO = "TRINITARIAS";

    static final String PINTAR_PANEL_ID = "Panel_Pintar";
    static final String AZUL_PANEL_ID = "Azul";
    static final String CYAN_PANEL_ID = "Cyan";
    static final String NARANAJA_PANEL_ID = "Naranaja";
    static final String ROJO_PANEL_ID = "Rojo";
    static final String VERDE_PANEL_ID = "Verde";

    private JPanel panel_A_pintar;
    private JPanel panel_Compilacion_Colores;
    private JPanel panel_Rojo;
    private JPanel panel_Azul;
    private JPanel panel_Verde;
    private JPanel panel_Naranja;
    private JPanel panel_Cyan;
    private Controlador_Vista controlador_Vista;

    public Vista() {
        this.setLayout(new GridLayout(3, 1));
        anadir_Componentes();

        iniciar();
        controlador_Vista = new Controlador_Vista(this);
        anadirEscuchadores_Paneles();
    }

    private void iniciar() {

        this.setSize(1000, 1000);
        this.setVisible(true);

    }

    public void anadir_Componentes() {
        anadir_Titulo();
        anadir_Panel_APintar();
        anadir_Paneles_Colores();
    }

    private void anadir_Titulo() {
        panel_Titulo = new JPanel();
        this.add(panel_Titulo);
        label_Titulo = new JLabel(TITULO);
        Font fuente = new Font("Arial", Font.ITALIC, 60);
        label_Titulo.setFont(fuente);
        panel_Titulo.add(label_Titulo);

    }

    private void anadir_Panel_APintar() {
        panel_A_pintar = new JPanel();
        panel_A_pintar.setBackground(Color.white);
        panel_A_pintar.setName(PINTAR_PANEL_ID);
        this.add(panel_A_pintar);
    }

    private void anadir_Paneles_Colores() {
        panel_Compilacion_Colores = new JPanel();
        panel_Compilacion_Colores.setLayout(new GridLayout(5, 1));
        this.add(panel_Compilacion_Colores);

        panel_Azul = new JPanel();
        panel_Azul.setName(AZUL_PANEL_ID);
        panel_Azul.setBackground(Color.blue);

        panel_Compilacion_Colores.add(panel_Azul);

        panel_Cyan = new JPanel();
        panel_Cyan.setBackground(Color.cyan);
        panel_Cyan.setName(CYAN_PANEL_ID);
        panel_Compilacion_Colores.add(panel_Cyan);

        panel_Naranja = new JPanel();
        panel_Naranja.setBackground(Color.orange);
        panel_Naranja.setName(NARANAJA_PANEL_ID);
        panel_Compilacion_Colores.add(panel_Naranja);

        panel_Rojo = new JPanel();
        panel_Rojo.setBackground(Color.red);
        panel_Rojo.setName(ROJO_PANEL_ID);
        panel_Compilacion_Colores.add(panel_Rojo);

        panel_Verde = new JPanel();
        panel_Verde.setBackground(Color.green);
        panel_Verde.setName(VERDE_PANEL_ID);
        panel_Compilacion_Colores.add(panel_Verde);
    }

    public void anadirEscuchadores_Paneles() {

        panel_A_pintar.addMouseListener(controlador_Vista);

        panel_Azul.addMouseListener(controlador_Vista);
        panel_Cyan.addMouseListener(controlador_Vista);
        panel_Naranja.addMouseListener(controlador_Vista);
        panel_Rojo.addMouseListener(controlador_Vista);
        panel_Verde.addMouseListener(controlador_Vista);

    }

    public void cambiarPanelAzul() {
        panel_A_pintar.setBackground(Color.blue);
    }

    public void cambiarpanelCyan() {
        panel_A_pintar.setBackground(Color.cyan);
    }

    public void cambiarPanelNaranja() {
        panel_A_pintar.setBackground(Color.orange);
    }

    public void cambiarPanelRojo() {
        panel_A_pintar.setBackground(Color.red);
    }

    public void cambiarPanelVerde() {
        panel_A_pintar.setBackground(Color.green);
    }

    public void cambiar_Titulo_Azul() {
        label_Titulo.setForeground(Color.blue);
    }

    public void cambiar_Titulo_Cyan() {
        label_Titulo.setForeground(Color.cyan);
    }

    public void cambiar_Titulo_Naranja() {
        label_Titulo.setForeground(Color.orange);
    }

    public void cambiar_Titulo_Rojo() {
        label_Titulo.setForeground(Color.red);
    }

    public void cambiar_Titulo_Verde() {
        label_Titulo.setForeground(Color.green);
    }

}
