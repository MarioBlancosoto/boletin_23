package boletin_23;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana {
    String [] elementos ={"ElementoLista1","ElementoLista2","ElementoLista2"};
    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JTextField texto;
    JPasswordField JPass;
    JButton boton1,boton2,boton3;
    JTextArea area;
    JList lista;
    public void marco() {
        marco = new JFrame();
        marco.setSize(1500, 1500);
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
        marco.add(panel1);
        marco.add(panel2);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paneles() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setBounds(0, 0, 1500, 650);
        panel2.setBounds(500, 0, 200, 200);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel1.setVisible(true);
        panel2.setVisible(true);
        panel1.setBackground(Color.DARK_GRAY);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(JPass);
        panel1.add(texto);
        panel1.add(boton1);
        panel1.add(boton2);
        panel2.add(boton3);
        panel2.add(area);
        panel2.add(lista);
    }

    public void etiquetas() {

        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("Password");
        etiqueta1.setVisible(true);
        etiqueta2.setVisible(true);
        etiqueta1.setSize(200, 175);
        etiqueta2.setSize(200, 420);
        etiqueta1.setLocation(0, 30);
        etiqueta2.setLocation(00, 5);
        Font fuente = new Font("Verdana", Font.BOLD, 23);
        etiqueta1.setFont(fuente);
        etiqueta2.setFont(fuente);
        etiqueta1.setForeground(Color.yellow);
        etiqueta2.setForeground(Color.yellow);
        

    }

    public void campos() {
        texto = new JTextField();
        JPass = new JPasswordField();
        JPass.setSize(600, 50);
        JPass.setLocation(200, 200);
        texto.setLocation(200, 100);
        texto.setSize(600, 50);
        area = new JTextArea();
        area.setSize(300, 400);
        area.setLocation(1000,700);
        area.setText("Area de Texto");
        lista = new JList(elementos);
        lista.setSize(500, 400);
        lista.setLocation(100, 700);

    }
public void botones(){
    
    boton1 = new JButton("Premer");
    boton2 = new JButton("Limpar");  
    boton3 = new JButton("Boton");
    boton1.setSize(400, 100);
    boton2.setSize(200, 200);
    boton1.setLocation(280, 500);
    boton2.setSize(400, 100);
    boton2.setLocation(800, 500);
    boton3.setSize(250, 150);
    boton3.setLocation(680, 800);
}   


}
