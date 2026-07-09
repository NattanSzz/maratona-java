package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Movie;

public class MovieTest01 {
    public static void main(String[] args) {
        Movie movie = new Movie("One Piece");

        System.out.println(movie.getEpisodes());
        for (int ep : movie.getEpisodes()) {
            System.out.print(ep + " ");
        }
    }
}
