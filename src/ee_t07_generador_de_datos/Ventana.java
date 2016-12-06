/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t07_generador_de_datos;

/**
 *
 * @author angel
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class Ventana extends JFrame implements ActionListener {

    GeneradorDeDatos g = new GeneradorDeDatos();
    Icon imagen;
    private JButton boton,limpiar;
    JLabel etiqueta;
    private JPanel panel;
    private JTextArea area;
    private JTextField texto;

    public Ventana() {
        imagen = new ImageIcon("C://Users//angel//Documents//s//Mario.ico");
        etiqueta = new JLabel("Cantidad de Datos a Generar");
        etiqueta.setBounds(10, 20, 190, 40);
        etiqueta.setIcon(imagen);

        texto = new JTextField("");
        texto.setBounds(210, 20, 70, 30);

        area = new JTextArea();
        area.setBounds(50, 100, 800, 500);

        boton = new JButton("Aceptar");
        boton.setBounds(290, 20, 90, 30);
        boton.setBackground(Color.blue);
        
        limpiar= new JButton("Limpiar");
        limpiar.setBounds(400,20,90,30);
        limpiar.setBackground(Color.yellow);

        JScrollPane barra = new JScrollPane(area);
        barra.setBounds(50,100,10,10);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(etiqueta);
        panel.add(texto);
        panel.add(area);
        panel.add(barra);
        panel.add(boton);
        panel.add(limpiar);
        panel.setBackground(Color.lightGray);
        boton.addActionListener(this);
        limpiar.addActionListener(this);

        add(panel);

        setTitle("Generador de Datos");
        setSize(900, 900);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadena = "";
        if (e.getSource() == boton) {
            cadena=g.generar2(Integer.parseInt(texto.getText()));
            area.setText(cadena);
        }else if(e.getSource()==limpiar){
            area.setText("");
        }
    }
}

