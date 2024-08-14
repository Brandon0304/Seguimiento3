package ejercicio8;

public class Concierto {
    private Entrada[] entradasGeneral;
    private Entrada[] entradasVIP;
    private int contadorGeneral;
    private int contadorVIP;

    public Concierto(int maxGeneral, int maxVIP) {
        this.entradasGeneral = new Entrada[maxGeneral];
        this.entradasVIP = new Entrada[maxVIP];
        this.contadorGeneral = 0;
        this.contadorVIP = 0;
    }

    public boolean hayDisponibilidad(String zona) {
        if (zona.equalsIgnoreCase("GENERAL")) {
            return contadorGeneral < entradasGeneral.length;
        } else if (zona.equalsIgnoreCase("VIP")) {
            return contadorVIP < entradasVIP.length;
        } else {
            System.out.println("Zona no válida.");
            return false;
        }
    }

    public boolean venderEntrada(String zona, double valor) {
        if (hayDisponibilidad(zona)) {
            int numero;
            Entrada entrada = null;

            if (zona.equalsIgnoreCase("GENERAL")) {
                numero = contadorGeneral + 1;
                entrada = new Entrada(numero, zona, valor);
                entrada.vender();
                entradasGeneral[contadorGeneral] = entrada;
                contadorGeneral++;
            } else if (zona.equalsIgnoreCase("VIP")) {
                numero = contadorVIP + 1;
                entrada = new Entrada(numero, zona, valor);
                entrada.vender();
                entradasVIP[contadorVIP] = entrada;
                contadorVIP++;
            }

            if (entrada != null) {
                System.out.println("Entrada vendida: " + entrada.getNumero());
            }
            return true;
        } else {
            System.out.println("No hay disponibilidad en la zona " + zona);
            return false;
        }
    }

    public void marcarIngreso(int numeroEntrada, String zona) {
        Entrada entrada = null;

        if (zona.equalsIgnoreCase("GENERAL")) {
            if (numeroEntrada > 0 && numeroEntrada <= contadorGeneral) {
                entrada = entradasGeneral[numeroEntrada - 1];
            }
        } else if (zona.equalsIgnoreCase("VIP")) {
            if (numeroEntrada > 0 && numeroEntrada <= contadorVIP) {
                entrada = entradasVIP[numeroEntrada - 1];
            }
        }

        if (entrada != null) {
            entrada.marcarIngreso();
            System.out.println("Ingreso marcado para entrada " + numeroEntrada);
        } else {
            System.out.println("Entrada no encontrada en la zona " + zona);
        }
    }
}


