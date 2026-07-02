package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("======================================");
        System.out.println("Buscando carro disponivel...");
        System.out.println("--------------------------------------");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro:\n-> " + carro.getName());
        System.out.println("======================================\n");
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println("--------------------------------------");
        carrosDisponiveis.forEach(carrox -> System.out.println("-> " + carrox.getName()));
        System.out.println("======================================\n");
        return carro;
    }
    
    public void retornarCarroAlugado(Carro carro) {
        System.out.println("======================================\n");
        carrosDisponiveis.forEach(carrox -> System.out.println("Devolendo carro:\n-> " + carro.getName()));
        carrosDisponiveis.add(carro);
        System.out.println("======================================\n");
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println("--------------------------------------");
        carrosDisponiveis.forEach(carrox -> System.out.println("-> " + carrox.getName()));
        System.out.println("======================================\n");
    }
}
