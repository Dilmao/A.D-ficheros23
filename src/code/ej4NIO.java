package code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ej4NIO {
    public static void writeFiles() {
        Scanner sc = new Scanner(System.in);
        Path ruta = Path.of("src/resources/fileEj4.txt");
        String frase = "";

        if (Files.exists(ruta)) {
            try {
                Files.writeString(ruta, "");
                while (!frase.equals("fin")) {
//                    Files.readAllLines(ruta).forEach();
                    System.out.println("Introduzca una frase");
                    frase = sc.nextLine();
                    Files.writeString(ruta, frase);
                }
                Files.readAllLines(ruta).forEach((line)->{
                    System.out.println(line);
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("El archivo introducido no existe");
        }
        sc.close();
    }
}
