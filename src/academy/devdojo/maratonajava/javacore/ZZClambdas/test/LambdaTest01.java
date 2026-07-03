package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> lst = List.of("Willian", "Suane", "Devdojo", "Java");
        forEach(lst, s -> System.out.println(s));
    }

    private static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        for(T e : lst) {
            consumer.accept(e);
        }
    }
}
