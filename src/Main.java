import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opcion;

        while (!salir) {
            System.out.println("""
                        \n*****************************************************************
                        1. Ejercicio 1: Comprobar ficheros en directorio
                        2. Ejercicio 2: Escribir ficheros en directorio
                        3. Ejercicio 3: Leer fichero de texto
                        4. Ejercicio 4: Escribir en fichero de texto
                        5. Ejercicio 5: Escribir en fichero de texto con permanencia
                        6. Ejercicio 6: Copia de seguridad del ejercicio 5
                        7. Ejercicio 7: BackUp de carpeta completo
                        8. Ejercicio 7: BackUp de carpeta incremental
                        9. Ejercicio 10: PONER NOMBRE
                        0. Salir
                        *****************************************************************""");
            opcion = sc.next();

            //opcion = libs.Leer.pedirCadena("Introduce una opción");

            switch (opcion) {
                case "0" -> salir = true;
                case "1" -> code.ej1NIO.checkFilesNIO();
                case "2" -> code.ej2NIO.showFilesNIO();
                case "3" -> code.ej3NIO.readFiles();
                case "4" -> code.ej4NIO.writeFiles();
                case "5" -> code.ej5NIO.writeFiles();
                case "6" -> code.ej6NIO.createCopy();
                case "7" -> code.backUp.createCopy();
                case "8" -> code.backUpIncremental.createCopy();
                case "9" -> code.ej10NIO.readFiles();
                default -> System.out.println("");
            }
        }
    }
}