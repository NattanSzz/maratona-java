package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Book;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.BookRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

public class BookService {
    private static final Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = scanner.nextLine();
        List<Book> books = BookRepository.findByName(name);
        books.forEach(p -> System.out.printf("[ %d ] -> %s, %d chapters, by %s%n", p.getId(), p.getName(), p.getChapters(), p.getProducer().getName()));
    }

    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Are you sure? [S/N]");
        String choice = scanner.nextLine();
        if("s".equalsIgnoreCase(choice)){
            BookRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the book");
        String name = scanner.nextLine();
        System.out.println("Type the number of the chapters");
        int chapters = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the id of the producer");
        ProducerRepository.findByName("");
        Integer producerId = Integer.parseInt(scanner.nextLine());
        Book book = Book.builder()
                .name(name)
                .chapters(chapters)
                .producer(Producer.builder().id(producerId).build())
                .build();
        BookRepository.save(book);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Book> bookOptional = BookRepository.findById(Integer.parseInt(scanner.nextLine()));
        if(bookOptional.isEmpty()){
            System.out.println("Book not found");
            return;
        }
        Book book = bookOptional.get();
        System.out.println("Book found " + book);
        System.out.println("Type the new name or enter to keep the same");
        String name = scanner.nextLine();
        name = name.isEmpty() ? book.getName() : name;
        System.out.println("Type the new number of chapters");
        int chapters = Integer.parseInt(scanner.nextLine());
        Book bookToUpdate = Book.builder()
                .id(book.getId())
                .chapters(chapters)
                .producer(book.getProducer())
                .name(name)
                .build();
        BookRepository.update(bookToUpdate);
    }
}
