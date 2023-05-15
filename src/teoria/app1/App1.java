package teoria.app1;

import javax.swing.*;
import java.awt.*;

public class App1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        setVentana(frame);
        Container contenedor = setContenedor(frame);
        setComponentes(contenedor);
        frame.setVisible(true);
    }

    private static void setVentana(JFrame frame) {

        frame.setTitle("Primera ventana");
        Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = scrnSize.height;
        int width  = scrnSize.width;
        frame.setSize(width / 2 ,height / 2 );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }

    private static Container setContenedor(JFrame frame) {
        Container contenedor = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(20); layout.setVgap(20);
        contenedor.setLayout(layout);
        return contenedor;
    }

    private static void setComponentes(Container contenedor) {
        JPanel panel = new JPanel();


        JLabel etiqueta = new JLabel("componente etiqueta");
        JTextField campoTexto = new JTextField(20);
        JButton boton = new JButton("submit");
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        contenedor.add(panel);


    }
}
