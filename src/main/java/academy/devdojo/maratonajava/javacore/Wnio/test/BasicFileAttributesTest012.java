package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest012{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new_path.txt");
        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = bfa.creationTime();
        FileTime lastModFileTime = bfa.lastModifiedTime();
        FileTime lastAcessTime = bfa.lastAccessTime();

        System.out.println("Creation Time: " + creationTime);
        System.out.println("Last Modified Time: " + lastModFileTime);
        System.out.println("Last Acess Time: " + lastAcessTime);
    }
}
