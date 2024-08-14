package ejercicio6;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Modelos de zapatos
        Zapato[] zapatos = {
                new Zapato("Nike", "Cuero", "Negro", 150000),
                new Zapato("Oakley", "Gamuza", "Marrón", 120000),
                new Zapato("Adidas", "Cuero", "Negro", 130000),
                new Zapato("Tommy Hilfiger", "Cuero", "Marrón", 140000),
                new Zapato("Balenciaga", "Cuero", "Negro", 160000)
        };

        // inventario para los modelos
        Inventario[] inventario = new Inventario[zapatos.length];
        int[] tallas = {40, 41, 42, 43, 44};

        for (int i = 0; i < zapatos.length; i++) {
            inventario[i] = new Inventario(zapatos[i], tallas);
            // Registrar stock inicial para cada modelo y talla
            for (int talla : tallas) {
                inventario[i].registrarEntrada(talla, 10);
            }
        }

        // ventas
        Venta venta1 = new Venta(new Date(), zapatos[0], 42, 2);
        if (inventario[0].registrarSalida(42, 2)) {
            venta1.imprimirDetalle();
        } else {
            System.out.println("Stock insuficiente para realizar la venta.");
        }

        Venta venta2 = new Venta(new Date(), zapatos[3], 43, 1);
        if (inventario[3].registrarSalida(43, 1)) {
            venta2.imprimirDetalle();
        } else {
            System.out.println("Stock insuficiente para realizar la venta.");
        }

        // inventario actual
        for (Inventario inv : inventario) {
            inv.imprimirInventario();
        }
    }
}

