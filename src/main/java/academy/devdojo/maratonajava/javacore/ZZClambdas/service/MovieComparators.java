package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Movie;

public class MovieComparators {
    public static int compareByTittle(Movie m1, Movie m2){
        return m1.getTitle().compareTo(m2.getTitle());
    }

    public int compareBySequences(Movie m1, Movie m2) {
        return Integer.compare(m1.getSequences(), m2.getSequences());
    }
}
