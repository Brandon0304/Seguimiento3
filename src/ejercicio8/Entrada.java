package ejercicio8;

public class Entrada {
        private int numero;
        private String zona;
        private double valor;
        private boolean vendida;
        private boolean ingreso;

        public Entrada(int numero, String zona, double valor) {
            this.numero = numero;
            this.zona = zona;
            this.valor = valor;
            this.vendida = false;
            this.ingreso = false;
        }

        public int getNumero() {
            return numero;
        }

        public String getZona() {
            return zona;
        }

        public double getValor() {
            return valor;
        }

        public boolean isVendida() {
            return vendida;
        }

        public boolean isIngreso() {
            return ingreso;
        }

        public void vender() {
            this.vendida = true;
        }

        public void marcarIngreso() {
            if (this.vendida) {
                this.ingreso = true;
            } else {
                System.out.println("Entrada no vendida. No se puede marcar el ingreso.");
            }
        }
}

