package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class backUpIncremental {
    public static void createCopy() {
        SimpleDateFormat formateo= new SimpleDateFormat("yyyyMMdd'_'HH-mm-ss");
        Date fecha =new Date(System.currentTimeMillis());

        Path rutaOrigen = Path.of("src/resources/backUp/original/");
        Path rutaDestino = Path.of("src/resources/backUp/incremental-"+fecha);

        try {
            Files.copy(rutaOrigen, rutaDestino);
        } catch (IOException e) {
            System.err.println("Problemon");
        }
    }
}
