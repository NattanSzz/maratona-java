package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("======================================");
        System.out.println("Buscando barco disponivel...");
        System.out.println("--------------------------------------");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco:\n-> " + barco.getName());
        System.out.println("======================================\n");
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println("--------------------------------------");
        barcosDisponiveis.forEach(barcox -> System.out.println("-> " + barcox.getName()));
        System.out.println("======================================\n");
        return barco;
    }
    
    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("======================================\n");
        barcosDisponiveis.forEach(barcox -> System.out.println("Devolendo barco:\n-> " + barco.getName()));
        barcosDisponiveis.add(barco);
        System.out.println("======================================\n");
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println("--------------------------------------");
        barcosDisponiveis.forEach(barcox -> System.out.println("-> " + barcox.getName()));
        System.out.println("======================================\n");
    }
}
