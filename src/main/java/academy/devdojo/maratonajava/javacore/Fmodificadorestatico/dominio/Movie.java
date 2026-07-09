package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Movie {
    private String name;
    private static int[] episodes;

    // Bloco de inicialização é carregado quando a JVM carregar a classe
    // Alocado espaço em memoria para o objeto
    // Atributos inicializados por default ou o que for passado
    // Bloco de inicialização é executado
    // Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie() {
        for(int ep : Movie.episodes) {
            System.out.print(ep + " ");
        }
    }

    public String getName() {
        return this.name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

}
