package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if(Files.notExists(folderPath)){
            Path folderDir = Files.createDirectory(folderPath);
            System.out.println(folderDir);
        }
        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");

        Path folderDir = Files.createDirectories(subFolderPath);
        System.out.println(folderDir);
        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if(Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
            System.out.println(filePathCreated);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
