import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opcion = "0";

        while (!salir) {
            System.out.println("""
                        ********************************
                        1. Ejercicio1 ficheros
                        2. Ejercicio2 ficheros
                        0. Salir
                        ********************************""");
            opcion = sc.next();

            //opcion = libs.Leer.pedirCadena("Introduce una opción");

            switch (opcion) {
                case "0" -> salir = true;
                case "1" -> code.ej1.checkFiles();
                case "2" -> code.ej2NIO.showFiles();
                default -> System.out.println("");
            }
        }
    }
}