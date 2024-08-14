package ejercicio6;

public class Zapato {
    private String nombre;
    private String material;
    private String color;
    private double precio;

    public Zapato(String nombre, String material, String color, double precio) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + material + ", " + color + ", $" + precio + ", " + ")";
    }
}
