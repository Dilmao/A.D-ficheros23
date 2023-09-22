package code;

import java.io.File;

public class ej1 {
    public static void checkFiles() {
        File f1 = new File("src/resources/fileEJ1.txt");
        File f2 = new File("src/resources/fileEJ2.txt");
        File dir1 = new File("src/resources/ej1");
        File dir2 = new File("src/resources/ej2");

        checkIfExist(f1);
        checkIfExist(f2);
        checkIfExist(dir1);
        checkIfExist(dir2);

    }

    static void checkIfExist(File f) {
        if (f.exists()) {
            System.out.print(f.getName() + " existe");
            if (f.isDirectory()) {
                System.out.println(" y es un directorio.");
            } else {
                System.out.println(" y es un fichero.");
            }
        } else {
            System.out.println(f.getName() + " no existe.");
        }
    }
}
