package ejercicio6;

import java.util.Date;

public class Venta {
    private Date fecha;
    private Zapato modelo;
    private int talla;
    private int cantidad;
    private double valor;

    public Venta(Date fecha, Zapato modelo, int talla, int cantidad) {
        this.fecha = fecha;
        this.modelo = modelo;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valor = calcularTotal();
    }

    public double calcularTotal() {
        return cantidad * modelo.getPrecio();
    }

    public void imprimirDetalle() {
        System.out.println("Venta: " + modelo.getNombre() + " - Talla: " + talla + " - Cantidad: " + cantidad + " - Valor: $" + valor + " - Fecha: " + fecha);
    }
}

