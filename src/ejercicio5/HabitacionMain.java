package ejercicio5;

public class HabitacionMain {
    public static void main(String[] args) {
        Habitacion arr[] = {
                new Habitacion(12, "Premium", 80000, false, 2),
                new Habitacion(13, "Doble", 55000, true, 0),
                new Habitacion(14, "Simple", 45000, true, 0)
    };

        for (Habitacion habitacion : arr){
            System.out.println(habitacion);
        }

    }
}