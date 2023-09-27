package code;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/*Comprueba si un directorio existe y
  muestra los nombres de sus ficheros*/
public class ej2 {
    public static void showFiles() {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        //Se introduce la rota del fichero a comprobar
        System.out.println("Introduzca la ruta del archivo que quiere comprobar");
        ruta = sc.next();
        File f = new File(ruta);

        //Se comprueba si el fichero existe
        if (f.exists()) {

            //Se comprueba si el fichero es un directorio
            if (f.isDirectory()) {

                //Se muestran por pantalla todos los archivos que contenga el directorio
                for (int contador = 0; contador < f.listFiles().length; contador++) {
                    System.out.println(Arrays.stream(f.listFiles()).toList().get(contador).getName());
                }
            } else {
                System.err.println("La ruta introducida no contiene un directorio");
            }
        } else {
            System.err.println("La ruta introducida no existe");
        }
    }
}
