package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class backUp {
    public static void createCopy() {
        Path rutaOrigen = Path.of("src/resources/dirBackUp");
        Path rutaDestino = Path.of("src/resources/dirBackUp2");

        //todo controlar excepciones
        try {
            Files.copy(rutaOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Ha ocurrido un problema durante la creacion de la copia de seguridad");
        }
    }
}
