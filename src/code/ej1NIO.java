package code;

import java.nio.file.Files;
import java.nio.file.Path;

public class ej1NIO {
    public static void checkFilesNIO() {
        //Se ponen las rutas de los archivos a comprobar
        Path p1 = Path.of("src/resources/fileEJ1.txt");
        Path p2 = Path.of("src/resources/fileEJ2.txt");
        Path p3 = Path.of("src/resources/ej1");
        Path p4 = Path.of("src/resources/ej2");

        //Los archivos son mandados a la función
        checkIfExist(p1);
        checkIfExist(p2);
        checkIfExist(p3);
        checkIfExist(p4);
    }

    static void checkIfExist (Path p) {
        //Se comprueba si los archivos existen
        if (Files.exists(p)) {
            System.out.print(p.getFileName() + " existe");

            //Se comprueba si los archivos son directorios o ficheros y se imprime por pantalla
            if (Files.isDirectory(p)) {
                System.out.println(" y es un directorio.");
            } else {
                System.out.println(" y es un fichero.");
            }

        } else {
            System.out.println(p.getFileName() + " no existe.");
        }
    }

}
