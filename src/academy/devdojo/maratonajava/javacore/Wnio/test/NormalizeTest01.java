package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDir = "home/willian/dev";
        String txtFile = "../../file.txt";
        Path path = Paths.get(projectDir, txtFile);
        System.out.println(path);
        System.out.println(path.normalize());
    }
}
