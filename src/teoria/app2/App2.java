package teoria.app2;

import javax.swing.*;
import java.awt.*;

public class App2 extends JFrame {
    private static Font FONT = new Font("Serif", Font.BOLD, 30);
    private static int widthFrame  = 650;
    private static int heigthFrame = 300;
    public App2() {
      //  super();
        setVentana();
        Container contenedor = getContentPane();
        JPanel panelCentral  = setPanelCentral();
        JPanel panelInferior = setPanelInferior();
        BorderLayout layout = new BorderLayout(30, 30);
        contenedor.setLayout(layout);
        contenedor.add(panelCentral, BorderLayout.CENTER);
        contenedor.add(panelInferior, BorderLayout.SOUTH);

    }

    private JPanel setPanelInferior() {
        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setHgap(50);
        panel.setLayout(layout);
        JButton botonAceptar  = new JButton("ACEPTAR");
        JButton botonCancelar = new JButton("CANCELAR");
        panel.add(botonAceptar);
        panel.add(botonCancelar);
        return panel;
    }

    private JPanel setPanelCentral() {
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(3, 2, 10, 30);
        panel.setLayout(layout);
        JLabel nombre = new JLabel("NOMBRE");
        nombre.setFont(FONT);
        JTextField textoNombre = new JTextField(10);
        JLabel dni = new JLabel("DNI");
        dni.setFont(FONT);
        JTextField textoDNI = new JTextField(20);
        JLabel fecha = new JLabel("FECHA NACIMIENTO");
        fecha.setFont(FONT);
        JPanel panelFecha = getPanelFecha();
        panel.add(nombre);
        panel.add(textoNombre);
        panel.add(dni);
        panel.add(textoDNI);
        panel.add(fecha);
        panel.add(panelFecha);
        return panel;
    }

    private JPanel getPanelFecha() {

        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setHgap(15);
        JTextField textoDia = new JTextField(2);
        JLabel barra1 = new JLabel("/");

        JLabel barra2 = new JLabel("/");
        JTextField textoMes = new JTextField(2);
        JTextField textoAnno = new JTextField(4);
        panel.add(textoDia);
        panel.add(barra1);
        panel.add(textoMes);
        panel.add(barra2);
        panel.add(textoAnno);
        return panel;

    }

    private void setVentana() {
        setTitle("Añadir usuario");
        setSize(widthFrame, heigthFrame);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
     //   setResizable(false);
    }
}
