package ejercicio3;
import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean estado;
    private String clave;

    public CuentaBancaria(String numeroCuenta, double saldoInicial, boolean estado, String clave) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.estado = estado;
        this.clave = clave;
    }

    public void consultarSaldo() {
        if (estado){
            System.out.println("El saldo actual es: " + saldo);
        }else{
            System.out.println("La cuenta está inactiva");
        }

    }

    public void retirarEfectivo(double valor) {
        if (estado){
            if (valor > saldo) {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            } else {
                saldo -= valor;
                System.out.println("Has retirado " + valor + ". El nuevo saldo es: " + saldo);
            }
        }else{
            System.out.println("La cuenta está inactiva");
        }
    }

    public void consignarEfectivo(double valor) {
        if (estado){
            saldo += valor;
            System.out.println("Has consignado " + valor + ". El nuevo saldo es: " + saldo);
        }else{
            System.out.println("La cuenta está inactiva");
        }
    }

    public void cambiarClave() {
        if (estado){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa la clave actual: ");
            String claveActual = scanner.nextLine();

            if (claveActual.equals(clave)) {
                System.out.print("Ingresa la nueva clave: ");
                String nuevaClave = scanner.nextLine();
                clave = nuevaClave;
                System.out.println("La clave ha sido cambiada exitosamente.");
            } else {
                System.out.println("Clave incorrecta. No se pudo cambiar la clave.");
            }
        }else{
            System.out.println("La cuenta está inactiva");
        }

    }
}
