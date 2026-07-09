package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Book;

public class StreamTest11 {
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
        System.out.println(books.stream().count());
        System.out.println(books.stream().collect(Collectors.counting()));

        books.stream().max(Comparator.comparing(Book::getPrice)).ifPresent(System.out::println);

        DoubleSummaryStatistics collect = books.stream().collect(Collectors.summarizingDouble(Book::getPrice));
        System.out.println(collect);
    }
}
