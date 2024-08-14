package ejercicio5;

public class Habitacion {
    private int numerohabitacion;
    private String tipo;
    private float precionoche;
    private boolean disponibilidad;
    private int huepedesalojados;

    public Habitacion(int numerohabitacion, String tipo, float precionoche, boolean disponibilidad, int huepedesalojados){
        this.numerohabitacion = numerohabitacion;
        this.tipo = tipo;
        this.precionoche = precionoche;
        this.disponibilidad = disponibilidad;
        this.huepedesalojados = huepedesalojados;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public float getPrecionoche() {
        return precionoche;
    }

    public void setPrecionoche(float precionoche) {
        this.precionoche = precionoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getHuepedesalojados() {
        return huepedesalojados;
    }

    public void setHuepedesalojados(int huepedesalojados) {
        this.huepedesalojados = huepedesalojados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numerohabitacion=" + numerohabitacion +
                ", tipo=" + tipo +
                ", precionoche=" + precionoche +
                ", disponibilidad=" + disponibilidad +
                ", huepedesalojados=" + huepedesalojados +
                '}';
    }
}
