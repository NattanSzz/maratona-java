package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Paths;
import java.nio.file.Path;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/willian");
        Path clazz = Paths.get("/home/willian/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
    }
}
