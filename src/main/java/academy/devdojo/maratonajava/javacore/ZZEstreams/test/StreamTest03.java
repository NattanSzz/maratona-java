package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Book;

public class StreamTest03 {
    private static List<Book> books = new ArrayList<>(List.of(
        new Book("Pequeno Princpe", 8.99),
        new Book("Dune", 3.99),
        new Book("I Have No Mouth", 5.99),
        new Book("A Metamorfose", 2.99),
        new Book("Harry Potter", 5.99),
        new Book("Coraline", 1.99),
        new Book("Coraline", 1.99),
        new Book("Peter Pan", 4.00)));
    public static void main(String[] args) {
        //Stream<Book> bookStream = books.stream();
        books.forEach(System.out::println);
        long count = books.stream().filter(b -> b.getPrice() <= 4)
            .count();
        long count2 = books.stream()
            .distinct()
            .filter(b -> b.getPrice() <= 4)
            .count();
        System.out.println(count);
        System.out.println(count2);
    }
}
