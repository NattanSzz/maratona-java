package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Movie;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.MovieComparators;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<MovieComparators> newMovieComparators = MovieComparators::new;
        MovieComparators movieComparators = newMovieComparators.get();
        List<Movie> movieList = new ArrayList<>(List.of(new Movie("Avengers", 4), new Movie("Velozes e Furiosos", 10), new Movie("Toy Story", 5)));

        movieList.sort(movieComparators::compareBySequences);
        System.out.println(movieList);
    }
}
