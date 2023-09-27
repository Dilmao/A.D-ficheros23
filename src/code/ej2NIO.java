package code;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej2NIO {
    public static void showFilesNIO() {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        //Se introduce la rota del fichero a comprobar
        System.out.println("Introduzca la ruta del archivo que quiere comprobar");
        ruta = sc.next();
        Path dir  = Path.of(ruta);

        //Se comprueba si el fichero existe
        if (Files.exists(dir)) {

            //Se comprueba si el fichero es un directorio
            if (Files.isDirectory(dir)) {

                //Se muestran por pantalla todos los archivos que contenga el directorio
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                    for (Path p : stream) {
                        System.out.println(p.getFileName());
                    }
                } catch (SecurityException e) {
                    System.err.println("No tiene permiso de lectura para este directorio");
                } catch (IOException e) {
                    System.err.println("No se ha podido leer el directorio introducido");
                }
            } else {
                System.err.println("La ruta introducida no contiene un directorio");
            }
        } else {
            System.err.println("La ruta introducida no existe");
        }
    }
}
