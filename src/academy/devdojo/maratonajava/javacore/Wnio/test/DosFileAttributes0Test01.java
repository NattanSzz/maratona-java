package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributes0Test01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/test.txt");
        if(Files.notExists(path)) {
            Files.createFile(path);
        }
        // Files.setAttribute(path, "dos:hidden", false);
        // Files.setAttribute(path, "dos:readonly", false);

        DosFileAttributes dfa = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dfa.isHidden());
        System.out.println(dfa.isReadOnly());

        DosFileAttributeView dfav = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dfav.setHidden(true);
        dfav.setReadOnly(true);;
        System.out.println(dfav.readAttributes().isHidden());
        System.out.println(dfav.readAttributes().isReadOnly());
    }
}
