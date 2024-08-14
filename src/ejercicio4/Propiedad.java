package ejercicio4;

import javax.swing.*;

public class Propiedad {
    private int id;
    private String direccion;
    private float area;
    private float precio;
    private int canhabitaciones;
    private int canbaños;
    private String garaje;
    private String estado;

    public Propiedad(int id, String direccion, float area, float precio, int canhabitaciones, int canbaños, String garaje, String estado){
        this.id = id;
        this.direccion = direccion;
        this.area = area;
        this.precio = precio;
        this.canhabitaciones = canhabitaciones;
        this.canbaños = canbaños;
        this.garaje = garaje;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCanhabitaciones() {
        return canhabitaciones;
    }

    public void setCanhabitaciones(int canhabitaciones) {
        this.canhabitaciones = canhabitaciones;
    }

    public int getCanbaños() {
        return canbaños;
    }

    public void setCanbaños(int canbaños) {
        this.canbaños = canbaños;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", precio=" + precio +
                ", canhabitaciones=" + canhabitaciones +
                ", canbaños=" + canbaños +
                ", garaje='" + garaje + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
