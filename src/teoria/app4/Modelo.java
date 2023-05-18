package teoria.app4;

public class Modelo {

        private String operacion;

        public Modelo(String operacion) {
            this.operacion = operacion;
        }

        public Modelo() {
        }

        public String getOperacion() {
            return operacion;
        }

        public void setOperacion(String operacion) {
            this.operacion = operacion;
        }

        public String getResultado() {
            if (validaOperacion()) {
                return calcularOperacion();
            }
            return "ERROR";
        }

        private String calcularOperacion() {
            String[] tokens = operacion.split("[-\\+\\*/]");
            int valor1 = Integer.parseInt(tokens[0]);
            int valor2 = Integer.parseInt(tokens[1]);
            if (operacion.contains("+"))
                return (valor1 + valor2) + "";
            else if (operacion.contains("-"))
                return (valor1 - valor2) + "";
            else if (operacion.contains("/")) {
                if (valor2 == 0)
                    return "ERROR";
                return (valor1 / valor2) + "";
            }
            else
                return (valor2 * valor1) + "";
        }

        private boolean validaOperacion() {
            return operacion.matches("[0-9]+[-\\+\\*/][0-9]+");
        }

        public static void main(String[] args) {
            Modelo modelo = new Modelo("99/0");
            System.out.println(modelo.getResultado());
        }
}
