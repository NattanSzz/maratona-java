package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("======================================");
        System.out.println("Buscando objeto disponivel...");
        System.out.println("--------------------------------------");
        T objeto = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto:\n-> " + objeto);
        System.out.println("======================================\n");
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println("--------------------------------------");
        objetosDisponiveis.forEach(objetox -> System.out.println("-> " + objetox));
        System.out.println("======================================\n");
        return objeto;
    }
    
    public void retornarObjetoAlugado(T objeto) {
        System.out.println("======================================\n");
        objetosDisponiveis.forEach(objetox -> System.out.println("Devolendo objeto:\n-> " + objeto));
        objetosDisponiveis.add(objeto);
        System.out.println("======================================\n");
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println("--------------------------------------");
        objetosDisponiveis.forEach(objetox -> System.out.println("-> " + objetox));
        System.out.println("======================================\n");
    }
}
