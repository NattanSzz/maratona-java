package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Book;

// 1 - Order Books by title
// 2 - Retrieve the first 3 books with price less than 4
public class StreamTest01 {
    private static List<Book> books = new ArrayList<>(List.of(
        new Book("Pequeno Princpe", 8.99),
        new Book("Dune", 3.99),
        new Book("I Have No Mouth", 5.99),
        new Book("A Metamorfose", 2.99),
        new Book("Harry Potter", 5.99),
        new Book("Coraline", 1.99),
        new Book("Peter Pan", 4.00)));
    public static void main(String[] args) {
        books.sort(Comparator.comparing(Book::getTitle));
        System.out.println(books);
        List<String> titles = new ArrayList<>();
        for(Book book : books) {
            if(book.getPrice() <= 4) {
                titles.add(book.getTitle());
            }
            if(titles.size() >= 3) {
                break;
            }
        }
        System.out.println(titles);
    }
}
