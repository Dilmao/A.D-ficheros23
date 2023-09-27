package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ej4NIO {
    public static void writeFiles() {
        Scanner sc = new Scanner(System.in);

        //Se selecciona la ruta del archivo
        Path ruta = Path.of("src/resources/fileEj4.txt");
        String frase = "";

        //Se comprueba si existe la ruta introducida
        if (Files.exists(ruta)) {

            try {
                //Se borra el contenido del archivo
                Files.writeString(ruta, "");

                //Se piden frases al usuario hasta que introduzca "fin"
                while (!frase.equals("fin")) {
                    System.out.println("Introduzca una frase (escribe fin para finalizar)");
                    frase = sc.nextLine();

                    //Si la frase introducida por el usuario no es "fin" se escriben en el archivo
                    if (!frase.equals("fin")) {
                        Files.writeString(ruta, frase+"\n", StandardOpenOption.APPEND);
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
