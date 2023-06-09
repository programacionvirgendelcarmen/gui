package teoria.app4;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class App4 extends JFrame{
    private JPanel mainPanel;
    private JTextField display;
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonMas;
    private JButton botonMenos;
    private JButton botonPor;
    private JButton botonDividir;
    private JButton botonReset;
    private JButton botonIgual;

    public App4()  {
        crearVista();
    }

    private void crearVista() {
        setTitle("CALCULADORA");
        Container container = getContentPane();
        container.add(mainPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);
        setResizable(false);
    }

    public JButton getBoton0() {
        return boton0;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public JButton getBoton3() {
        return boton3;
    }

    public JButton getBoton4() {
        return boton4;
    }

    public JButton getBoton5() {
        return boton5;
    }

    public JButton getBoton6() {
        return boton6;
    }

    public JButton getBoton7() {
        return boton7;
    }

    public JButton getBoton8() {
        return boton8;
    }

    public JButton getBoton9() {
        return boton9;
    }

    public JButton getBotonMas() {
        return botonMas;
    }

    public JButton getBotonMenos() {
        return botonMenos;
    }

    public JButton getBotonPor() {
        return botonPor;
    }

    public JButton getBotonDividir() {
        return botonDividir;
    }

    public JButton getBotonReset() {
        return botonReset;
    }

    public JButton getBotonIgual() {
        return botonIgual;
    }

    public JTextField getDisplay() {
        return display;
    }
    public List<JButton> getGrupoBotones() {
        return List.of(boton0, boton1, boton2, boton3, boton4, boton5,
                boton6, boton7, boton8, boton9, botonMas, botonMenos,
                botonDividir, botonPor);
    }
}
