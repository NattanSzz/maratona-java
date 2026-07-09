package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Book;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;

public class StreamTest14 {
    private static List<Book> books = new ArrayList<>(List.of(
        new Book("Pequeno Princpe", 8.99, Category.FANTASY),
        new Book("Dune", 3.99, Category.FANTASY),
        new Book("I Have No Mouth", 5.99, Category.DRAMA),
        new Book("A Metamorfose", 2.99, Category.FANTASY),
        new Book("Harry Potter", 5.99, Category.FANTASY),
        new Book("Coraline", 1.99, Category.FANTASY),
        new Book("Coraline", 1.99, Category.FANTASY),
        new Book("Peter Pan", 4.00, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, Long> collect = books.stream().collect(Collectors.groupingBy(Book::getCategory, Collectors.counting()));
        System.out.println(collect);
    }
    
}
