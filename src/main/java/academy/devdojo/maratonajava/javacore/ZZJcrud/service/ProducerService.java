package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import java.util.List;
import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

public class ProducerService {
    private static final Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = scanner.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        producers.forEach(p -> System.out.printf("[ %d ] -> %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Are you sure? [S/N]");
        String choice = scanner.nextLine();
        if("s".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = scanner.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
}
