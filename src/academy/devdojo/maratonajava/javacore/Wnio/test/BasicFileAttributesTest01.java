package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("folder2/new.txt");
        file.createNewFile();
        file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path file2 = Paths.get("folder2/new_path.txt");
        Files.createFile(file2);
        FileTime time = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(file2, time);
    }
}
