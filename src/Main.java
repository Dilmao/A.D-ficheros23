import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opcion = "0";

        while (!salir) {
            System.out.println("""
                        ********************************
                        1. Ejercicio 1: Comprobar ficheros en directorio
                        2. Ejercicio 2: Escribir ficheros en directorio
                        3. Ejercicio 3: Leer fichero de texto
                        4. Ejercicio 4: Escribir en fichero de texto
                        0. Salir
                        ********************************""");
            opcion = sc.next();

            //opcion = libs.Leer.pedirCadena("Introduce una opción");

            switch (opcion) {
                case "0" -> salir = true;
                case "1" -> code.ej1NIO.checkFilesNIO();
                case "2" -> code.ej2NIO.showFilesNIO();
                case "3" -> code.ej3NIO.readFiles();
                case "4" -> code.ej5NIO.writeFiles();
                default -> System.out.println("");
            }
        }
    }
}