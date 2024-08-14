package ejercicio2;

public class EstudianteMain {
    public static void main(String[] args) {
    Estudiante arr[] = {
            new Estudiante("Brandon", "Ortiz Medina", 11, 17, 4.0f, "Nathalia", "Hernando"),
            new Estudiante("Sofía", "Giraldo Gonzalez", 11, 18, 4.0f, "Marcela", "Enrique", "3115674381"),
            new Estudiante("Marcos", "Quiñones Ruiz", 9, 14, 4.5f, "Daniela", "Ricardo", "3124728192", "3124562842")};

        for (Estudiante estudiante : arr){
            System.out.println(estudiante);
        }
    }
}
