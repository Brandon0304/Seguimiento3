package ejercicio4;

public class PropiedadMain {
    public static void main(String[] args) {
        //Creo un array de objetos para las propiedades (0, 1, 2)
        Propiedad arr[] = {
                new Propiedad(12345, "Calle cuarta", 65.7f, 550000, 3, 2, "Sí", "Disponible"),
                new Propiedad(13254, "Calle quinta", 68.9f, 600000, 3, 2, "Sí", "Vendida"),
                new Propiedad(31234, "Calle sexta", 92.5f, 1000000, 4, 2, "Sí", "Rentada")};

        for(Propiedad propiedad : arr){
            System.out.println(propiedad.toString());
        }

        //Aquí modifico los datos dentro del objeto y los imprimo
        arr[0].setCanbaños(3);
        System.out.println(arr[0].toString());

        //Imprimir un dato del objeto como prueba
        System.out.println(arr[0].getDireccion());

    }



}
