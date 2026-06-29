package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("folder");
        boolean isDirCreated = dir.mkdir();
        System.out.println("Diretorio criado: " + isDirCreated);
        File file = new File(dir + "\\file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Arquivo criado: " + isFileCreated);

        File fileRenamed = new File(dir + "\\arquivo_renomeado.txt");
        boolean isRenamed = file.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado: " + isRenamed);

        File dirRenamed = new File("dir_renomeado");
        boolean isDirRenamed = dir.renameTo(dirRenamed);
        System.out.println("Diretorio renomeado: " + isDirRenamed);
    }
}
