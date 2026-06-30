package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("folder/subfolder1/subsubfolder1");
        Path pathZip = Paths.get("folder/file.zip");
        zip(pathZip, path);
    }

    private static void zip(Path fileZip, Path filesForZip){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesForZip)){
                for (Path file : directoryStream) {
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                    zipStream.putNextEntry(zipEntry);
                    Files.copy(file, zipStream);
                    zipStream.closeEntry();
                }
                System.out.println("Arquivo criado com sucesso");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
