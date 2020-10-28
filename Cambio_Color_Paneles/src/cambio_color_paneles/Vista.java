/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_color_paneles;

import java.awt.Color;
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
    private final String TITULO="TRINITARIAS";
    
    private JPanel panel_A_pintar;
    private JPanel panel_Compilacion_Colores;
    private JPanel panel_Rojo;
    private JPanel panel_Azul;
    private JPanel panel_Verde;
    private JPanel panel_Naranja;
    private JPanel panel_Cyan;
    private Controlador_Vista controlador_Vista;

    public Vista() {
        this.setLayout(new GridLayout(3,1));
        anadir_Componentes();
        iniciar();
        controlador_Vista=new Controlador_Vista(this);
    }
    
    
    private void iniciar(){
        
        this.setSize(600,600);
        this.setVisible(true);
        
    }
    
    public void anadir_Componentes(){
        anadir_Titulo();
        anadir_Panel_APintar();
        anadir_Paneles_Colores();
    }
    
    private void anadir_Titulo(){
        panel_Titulo=new JPanel();
        this.add(panel_Titulo);
        label_Titulo=new JLabel(TITULO);
        Font fuente=new Font("Arial", Font.ITALIC, 60);
        label_Titulo.setFont(fuente);
        panel_Titulo.add(label_Titulo);
        
        
    }
    
    private void anadir_Panel_APintar(){
        panel_A_pintar=new JPanel();
        panel_A_pintar.setBackground(Color.white);
        this.add(panel_A_pintar);
    }
    
    private void anadir_Paneles_Colores(){
        panel_Compilacion_Colores=new JPanel();
        this.add(panel_Compilacion_Colores);
        
        panel_Azul=new JPanel();
        panel_Azul.setBackground(Color.blue);
        
        panel_Compilacion_Colores.add(panel_Azul);
        
        panel_Cyan=new JPanel();
        panel_Cyan.setBackground(Color.cyan);
        panel_Compilacion_Colores.add(panel_Cyan);
        
        
        panel_Naranja=new JPanel();
        panel_Naranja.setBackground(Color.orange);
        panel_Compilacion_Colores.add(panel_Naranja);
        
        panel_Rojo=new JPanel();
        panel_Rojo.setBackground(Color.red);
        panel_Compilacion_Colores.add(panel_Rojo);
        
        panel_Verde=new JPanel();
        panel_Verde.setBackground(Color.green);
        panel_Compilacion_Colores.add(panel_Verde);
    }
}
