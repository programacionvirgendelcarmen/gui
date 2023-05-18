package teoria.app4;

import javax.swing.*;
import java.util.List;

public class Controlador {
    private App4 vista;
    private Modelo modelo;

    public Controlador(App4 vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        inicializarVista();
        registrarEventos();
    }

    private void inicializarVista() {
        vista.setVisible(true);
    }

    private void registrarEventos() {
        List<JButton> botones = vista.getGrupoBotones();
        for (JButton boton: botones) {
            boton.addActionListener(actionEvent ->
                    mostrarEnDisplay(boton));
        }
        vista.getBotonReset().addActionListener(actionEvent -> resetear());
        vista.getBotonIgual().addActionListener(actionEvent -> calcular());
    }

    private void mostrarEnDisplay(JButton boton) {
        if (vista.getDisplay().getText().equals("0"))
            vista.getDisplay().setText("");
        String operacion = modelo.getOperacion() + boton.getText();
        modelo.setOperacion(operacion);
        vista.getDisplay().setText(operacion);
    }

    private void resetear() {
        modelo.setOperacion("0");
        vista.getDisplay().setText(modelo.getOperacion());
    }

    private void calcular() {
        String operacion = modelo.getResultado();
        modelo.setOperacion(operacion);
        vista.getDisplay().setText(operacion);
    }
}
