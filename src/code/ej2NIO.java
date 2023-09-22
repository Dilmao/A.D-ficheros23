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
    public static void showFiles() {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        System.out.println("Introduzca la ruta del archivo que quiere comprobar");
        ruta = sc.next();
        Path p  = Path.of(ruta);
        if (Files.exists(p)) {
            if (Files.isDirectory(p)) {
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(p, String.format("*.%s"))) {
                    ArrayList<Path> files = new ArrayList<>();
                    stream.forEach(files::add);
                    files.forEach(file -> System.out.println(file.getFileName().toString()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.err.println("La ruta introducida no contiene un directorio");
            }
        } else {
            System.err.println("La ruta introducida no existe");
        }
    }
}
