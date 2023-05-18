package teoria.app4;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        App4 vista = new App4();
        //vista.setVisible(true);
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);

    }
}
