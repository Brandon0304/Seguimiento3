package ejercicio6;

public class Inventario {
    private Zapato modelo;
    private int[] tallas;
    private int[] cantidades;

    public Inventario(Zapato modelo, int[] tallas) {
        this.modelo = modelo;
        this.tallas = tallas;
        this.cantidades = new int[tallas.length];
    }

    public Zapato getModelo() {
        return modelo;
    }

    public void registrarEntrada(int talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla) {
                cantidades[i] += cantidad;
                break;
            }
        }
    }

    public boolean registrarSalida(int talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla && cantidades[i] >= cantidad) {
                cantidades[i] -= cantidad;
                return true;
            }
        }
        return false;
    }

    public int consultarStock(int talla) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla) {
                return cantidades[i];
            }
        }
        return 0;
    }

    public void imprimirInventario() {
        System.out.println("Inventario para el modelo: " + modelo);
        for (int i = 0; i < tallas.length; i++) {
            System.out.println("Talla " + tallas[i] + ": " + cantidades[i] + " unidades");
        }
    }
}

