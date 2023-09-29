package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ej6NIO {
    public static void createCopy() {
        //Se ponen las rutas del archivo a copiar y de la carpeta donde guardarlo
        Path rutaOrigen = Path.of("src/resources/fileEj5.txt");
        Path rutaDestino = Path.of("src/resources/securityCopyEj6/copiaEjercicio5.txt");

        //Se comprueba si la ruta existe
        if (Files.exists(rutaOrigen)) {

            //Se comprueba que se puede leer el archivo origen
            if (Files.isReadable(rutaOrigen)) {

                //Se hace la copia de seguridad, en caso de ya existir un archivo de copia se reemplaza
                try {
                    Files.copy(rutaOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    System.err.println("Ha ocurrido un problema durante la creacion de la copia de seguridad");
                }
            } else {
                System.err.println("No se tienen permisos para modificar el archivo");
            }
        } else {
            System.err.println("No se ha encontrado el archivo");
        }
    }
}
