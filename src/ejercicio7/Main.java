package ejercicio7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // crear libros
        Libro libro1 = new Libro("978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", 1605, "Francisco de Robles", 900, new String[]{"Novela", "Clásico"});
        Libro libro2 = new Libro("978-0-14-044926-6", "1984", "George Orwell", 1949, "Austral Editorial", 289, new String[]{"Ciencia ficción", "Ficción distópica"});
        Libro libro3 = new Libro("978-0-7432-7356-5", "El Código Da Vinci", "Dan Brown", 2003, "Doubleday", 489, new String[]{"Suspenso", "Ficción"});

        // usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "123456", "555-1234");
        Usuario usuario2 = new Usuario("Ana García", "654321", "555-5678");

        // registrar préstamos
        Prestamo[] prestamos = new Prestamo[10];
        int numPrestamos = 0;

        // préstamo
        if (numPrestamos < prestamos.length) {
            prestamos[numPrestamos] = new Prestamo(libro1.getISBN(), usuario1.getIdentificacion(), new Date(), null);
            numPrestamos++;
        } else {
            System.out.println("No se pueden registrar más préstamos.");
        }

        // otro préstamo
        if (numPrestamos < prestamos.length) {
            prestamos[numPrestamos] = new Prestamo(libro2.getISBN(), usuario2.getIdentificacion(), new Date(), null);
            numPrestamos++;
        } else {
            System.out.println("No se pueden registrar más préstamos.");
        }

        // detalles de los préstamos
        for (int i = 0; i < numPrestamos; i++) {
            System.out.println(prestamos[i]);
        }

        // devolución de un libro
        prestamos[0].setFechaDevolucion(new Date());
        System.out.println("Devolución registrada: " + prestamos[0]);

        // libros prestados por el usuario
        String usuarioConsulta = "123456";
        System.out.println("Libros prestados al usuario con ID: " + usuarioConsulta);
        for (int i = 0; i < numPrestamos; i++) {
            if (prestamos[i].getIdentificacionUsuario().equals(usuarioConsulta)) {
                System.out.println(prestamos[i]);
            }
        }
    }
}
