package code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ej3NIO {
    public static void readFiles() {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        System.out.println("Introduce la ruta del fichero que deseas leer");
        ruta = sc.next();
        Path dir = Path.of(ruta);

        if (Files.isReadable(dir)) {
            if (ruta.toString().endsWith(".txt")) {
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
