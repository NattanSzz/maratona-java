package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import java.util.List;
import java.util.Optional;
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
            case 4 -> update();
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

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(scanner.nextLine()));
        if(producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }
        Producer producer = producerOptional.get();
        System.out.println("Producer found " + producer);
        System.out.println("Type the new name or enter to keep the same");
        String name = scanner.nextLine();
        name = name.isEmpty() ? producer.getName() : name;
        Producer producerToUpdate = Producer.builder().id(producer.getId()).name(name).build();
        ProducerRepository.update(producerToUpdate);
    }
}
