package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("AbsolutePath: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
            if(file.exists()){
                System.out.println("Deleted: " + file.delete());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
