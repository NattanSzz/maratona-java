package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Eleve", "o", "cosmo", "no seu coração")
            .map(String::toUpperCase)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();

        try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Administrator\\Documents\\MeusProjetos\\maratona-java\\src\\file.txt"))){
            lines.forEach(System.out::println);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
