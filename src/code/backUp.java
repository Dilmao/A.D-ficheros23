package code;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class backUp {
    public static void createCopy() {
        Path rutaOrigen = Path.of("src/resources/backUp/original/");
        Path rutaDestino = Path.of("src/resources/backUp/completo/");

        //todo controlar excepciones
        //Se comprueba si el archivo existe
        if (Files.exists(rutaOrigen)) {

            //Se comprueba si el archivo es un direcorio
            if (Files.isDirectory(rutaOrigen)) {

                //Se comprueba si se puede leer el directorio
                if (Files.isReadable(rutaOrigen)) {

                    //Se crea la copia de seguridad
                    try {
                        copiarCarpeta(rutaOrigen, rutaDestino);
                        System.out.println("Copia de seguridad completada");
                    } catch (IOException e) {
                        System.err.println("Ha ocurrido un problema durante la creacion de la copia de seguridad");
                    }

                } else {
                    System.err.println("No se tienen permisos para modificar el archivo");
                }

            } else {
                System.err.println("El archivo seleccionado no es un directorio");
            }

        } else {
            System.err.println("No se ha encontrado el archivo");
        }
    }

    private static void copiarCarpeta(Path origen, Path destino) throws IOException{
        Files.walkFileTree(origen, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException{
                Path targetDir = destino.resolve(origen.relativize(dir));
                Files.createDirectories(targetDir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, destino.resolve(origen.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
