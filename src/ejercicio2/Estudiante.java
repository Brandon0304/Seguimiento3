package ejercicio2;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int grado;
    private int edad;
    private float promedio;
    private String nombremadre;
    private String nombrepadre;
    private String numeromadre;
    private String numeropadre;

    public Estudiante(String nombre, String apellido, int grado, int edad, float promedio, String nombremadre, String nombrepadre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombremadre = nombremadre;
        this.nombrepadre = nombrepadre;
    }

    public Estudiante(String nombre, String apellido, int grado, int edad, float promedio, String nombremadre, String nombrepadre, String numeromadre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombremadre = nombremadre;
        this.nombrepadre = nombrepadre;
        this.numeromadre = numeromadre;
    }

    public Estudiante(String nombre, String apellido, int grado, int edad, float promedio, String nombremadre, String nombrepadre, String numeromadre, String numeropadre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado =grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombremadre = nombremadre;
        this.nombrepadre = nombrepadre;
        this.numeromadre = numeromadre;
        this.numeropadre = numeropadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNombremadre() {
        return nombremadre;
    }

    public void setNombremadre(String nombremadre) {
        this.nombremadre = nombremadre;
    }

    public String getNombrepadre() {
        return nombrepadre;
    }

    public void setNombrepadre(String nombrepadre) {
        this.nombrepadre = nombrepadre;
    }

    public String getNumeromadre() {
        return numeromadre;
    }

    public void setNumeromadre(String numeromadre) {
        this.numeromadre = numeromadre;
    }

    public String getNumeropadre() {
        return numeropadre;
    }

    public void setNumeropadre(String numeropadre) {
        this.numeropadre = numeropadre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", grado=" + grado +
                ", edad=" + edad +
                ", promedio=" + promedio +
                ", nombremadre='" + nombremadre + '\'' +
                ", nombrepadre='" + nombrepadre + '\'' +
                ", numeromadre=" + numeromadre +
                ", numeropadre=" + numeropadre +
                '}';

    }
}
