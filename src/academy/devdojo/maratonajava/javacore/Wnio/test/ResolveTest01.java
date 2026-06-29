package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Paths;
import java.nio.file.Path;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/willian");
        Path file = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/willian");
        Path relative = Paths.get("dev");
        Path file2 = Paths.get("file.txt");
        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(file2));
    }
}
