package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class EntradaDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta: ");

        String question = input.nextLine();
        if(question.charAt(0) == ' ') {
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }

        input.close();
    }
}
