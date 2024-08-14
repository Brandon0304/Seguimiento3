package ejercicio7;

import java.util.Date;

public class Prestamo {
    private String ISBNLibro;
    private String identificacionUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(String ISBNLibro, String identificacionUsuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.ISBNLibro = ISBNLibro;
        this.identificacionUsuario = identificacionUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getISBNLibro() {
        return ISBNLibro;
    }

    public void setISBNLibro(String ISBNLibro) {
        this.ISBNLibro = ISBNLibro;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Préstamo [ISBN Libro=" + ISBNLibro + ", Usuario ID=" + identificacionUsuario +
                ", Fecha de Préstamo=" + fechaPrestamo + ", Fecha de Devolución=" + fechaDevolucion + "]";
    }
}

