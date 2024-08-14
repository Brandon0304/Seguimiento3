package ejercicio1;

public class MascotaMain {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Toby", 3,"Bulldog","Negro");
        Mascota m2 = new Mascota("Carlos", 5, "Bulldog", "Negro");
        Mascota m3 = new Mascota("Tommy", 2, "Dobberman", "Café");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    }
}
