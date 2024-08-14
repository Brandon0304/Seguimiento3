package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000000, true, "bandejapaisa5000");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Presentar el menú
            System.out.println("\nMenú del Cajero Electrónico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Consignar efectivo");
            System.out.println("4. Cambiar clave");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirarEfectivo(retiro);
                    break;
                case 3:
                    System.out.print("Ingresa el monto a consignar: ");
                    double consignacion = scanner.nextDouble();
                    cuenta.consignarEfectivo(consignacion);
                    break;
                case 4:
                    cuenta.cambiarClave();
                    break;
                case 5:
                    System.out.println("Saliendo del cajero. ¡Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while(opcion != 5);

        scanner.close();
    }
}
