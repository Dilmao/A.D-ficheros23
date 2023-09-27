package code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ej5NIO {
    public static void writeFiles() {
        Scanner sc = new Scanner(System.in);
        Path ruta = Path.of("src/resources/fileEj5.txt");
        final String[] frase = {""};

        if (Files.exists(ruta)) {
            try {
                Files.readAllLines(ruta).forEach((line)->{
                    frase[0] = line + "\n";
                });
                //problema a la hora de escribir las frases en el txt
                while (!frase[0].equals("fin")) {
                    System.out.println("Introduzca una frase");
                    frase[0] = sc.nextLine();
                    if (!frase[0].equals("fin")) {
                        Files.writeString(ruta, frase[0] +"\n", StandardOpenOption.APPEND);
                    }
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
    }
}
