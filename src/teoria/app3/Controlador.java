package teoria.app3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador  {
    private App4 vista;
    private Modelo modelo;

    public Controlador(App4 vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        //registrar componentes que generan eventos
        registrarComponentesConEventos();
    }

    private void registrarComponentesConEventos() {
      //  vista.getBoton0().addActionListener();
    }




}
