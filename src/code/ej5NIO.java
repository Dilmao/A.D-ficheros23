package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ej5NIO {
    public static void writeFiles() {
        Scanner sc = new Scanner(System.in);

        //Se selecciona la ruta del archivo
        Path ruta = Path.of("src/resources/fileEj5.txt");
        final String[] frase = {""};

        //Se comprueba si existe la ruta introducida
        if (Files.exists(ruta)) {

            try {
                //Se piden frases al usuario hasta que introduzca "fin"
                while (!frase[0].equals("fin")) {
                    System.out.println("Introduzca una frase");
                    frase[0] = sc.nextLine();

                    //Si la frase introducida por el usuario no es "fin" se escriben en el archivo
                    if (!frase[0].equals("fin")) {
                        Files.writeString(ruta, frase[0] +"\n", StandardOpenOption.APPEND);
                    }
                }

                //Se lee el archivo linea a linea
                Files.readAllLines(ruta).forEach((line)->{
                    System.out.println(line);
                });
            } catch (SecurityException e) {
                System.err.println("No es posible modificar el archivo");
            } catch (IllegalArgumentException e) {
                System.err.println("No se pueden introducir los valores introducidos");
            } catch (IOException e) {
                System.err.println("Ha ocurrido un problema durante la ejecución del programa");
            }
        } else {
            System.err.println("No se ha encontrado el archivo");
        }
    }
}
