package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Movie;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.MovieComparators;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        MovieComparators movieComparators = new MovieComparators();
        List<Movie> movieList = new ArrayList<>(List.of(new Movie("Avengers", 4), new Movie("Velozes e Furiosos", 10), new Movie("Toy Story", 5)));
        Collections.sort(movieList, movieComparators::compareBySequences);
        System.out.println(movieList);
    }
}
