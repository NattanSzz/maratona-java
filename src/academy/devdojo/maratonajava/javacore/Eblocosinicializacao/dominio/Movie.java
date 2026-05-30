package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Movie {
    private String name;
    private int[] episodes;

    // Alocado espaço em memoria para o objeto
    // Atributos inicializados por default ou o que for passado
    // Bloco de inicialização é executado
    // Construtor é executado

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie() {
        
    }

    public String getName() {
        return this.name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

}
