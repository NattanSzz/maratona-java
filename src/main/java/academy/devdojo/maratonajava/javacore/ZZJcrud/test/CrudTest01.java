package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

public class CrudTest01 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true) {
            menu();
            op = Integer.parseInt(scanner.nextLine());
            if(op == 0) break;
            switch (op) {
                case 1 -> {
                    producerMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    ProducerService.buildMenu(op);
                }
                case 2 -> {
                    bookMenu();
                    op = Integer.parseInt(scanner.nextLine());
                    ProducerService.buildMenu(op);
                }
            }
        }
    }

    private static void menu() {
        System.out.println("Type the number of your operation");
        System.out.println("-------------------------------------------");
        System.out.println("[ 1 ] Producer Menu");
        System.out.println("[ 2 ] Book Menu");
        System.out.println("[ 0 ] Exit");
    }

    private static void producerMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("-------------------------------------------");
        System.out.println("[ 1 ] Search for producers");
        System.out.println("[ 2 ] Delete producer");
        System.out.println("[ 3 ] Save producer");
        System.out.println("[ 4 ] Update producer");
        System.out.println("[ 9 ] Go Back");
    }

    private static void bookMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("-------------------------------------------");
        System.out.println("[ 1 ] Search for book");
        System.out.println("[ 2 ] Delete book");
        System.out.println("[ 3 ] Save book");
        System.out.println("[ 4 ] Update book");
        System.out.println("[ 9 ] Go Back");
    }
}
