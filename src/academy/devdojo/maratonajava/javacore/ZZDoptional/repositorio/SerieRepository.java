package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Serie;

public class SerieRepository {
    private static List<Serie> series = List.of(new Serie(1, "The Walking Dead", 50), new Serie(2, "Breaking Bad", 25));

    public static Optional<Serie> findByTitle(String title) {
        return findBy(s -> s.getTitle().equals(title));
    }

    public static Optional<Serie> findById(Integer id) {
        return findBy(s -> s.getId().equals(id));
    }

    private static Optional<Serie> findBy(Predicate<Serie> predicate) {
        Serie found = null;
        for(Serie serie : series) {
            if(predicate.test(serie)) {
                found = serie;
            }
        }
        return Optional.ofNullable(found);
    }
}
