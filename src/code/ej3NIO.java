package code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ej3NIO {
    public static void readFiles() {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        //Se introduce la ruta del fichero a leer
        System.out.println("Introduce la ruta del fichero que deseas leer");
        ruta = sc.next();
        Path dir = Path.of(ruta);

        //Se comprueba si se puede leer el fichero
        if (Files.isReadable(dir)) {

            //Se comprueba si el fichero es un archivo de texto
            if (ruta.toString().endsWith(".txt")) {

                //Se lee el archivo de texto y se imprime por pantalla linea a linea
                try {
                    Files.readAllLines(dir).forEach((line)->{
                        System.out.println(line);
                    });
                } catch (SecurityException e) {
                    System.err.println("No tiene permiso para leer el fichero introducido");
                } catch (Exception e) {
                    System.err.println("Ocurrio un error durante la lectura");
                }
            } else {
                System.err.println("La ruta introducida no es un archivo de texto");
            }
        } else {
            System.err.println("No se ha podido leer el fichero introducido");
        }
    }
}
