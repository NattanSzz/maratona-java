package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("Digite seu sexo: ");
        char gender = input.next().charAt(0);
        System.out.println(name);

        System.out.println("------------------------------");
        System.out.println("Nome: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("------------------------------");

        input.close();
    }
}
