package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        fileCreate();
    }

    private static void fileCreate() {
        File file = new File("arquivo\\arquivo.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
