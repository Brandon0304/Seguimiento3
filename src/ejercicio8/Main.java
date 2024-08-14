package ejercicio8;

public class Main {
    public static void main(String[] args) {
        Concierto concierto = new Concierto(4, 7);

        //DISPONIBILIDAD Y VENDER LAS ENTRADAS
        concierto.venderEntrada("VIP", 50);
        concierto.venderEntrada("GENERAL", 50);
        concierto.venderEntrada("VIP", 100);
        concierto.venderEntrada("VIP", 100);
        concierto.venderEntrada("GENERAL", 50);

        //INGRESO
        concierto.marcarIngreso(4, "GENERAL");
        concierto.marcarIngreso(3, "VIP");
        concierto.marcarIngreso(3, "VIP");
    }
}
