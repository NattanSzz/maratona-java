package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.Optional;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Serie;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.SerieRepository;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Serie> serieByTitle = SerieRepository.findByTitle("The Walking Dead");
        serieByTitle.ifPresent(s -> s.setTitle("Fear The Walking Dead"));
        System.out.println(serieByTitle);

        SerieRepository.findById(2)
            .orElseThrow(IllegalArgumentException::new);

        Serie serie = SerieRepository.findByTitle("Better Call Saul")
            .orElse(new Serie(3, "Better Call Saul", 10));
        System.out.println(serie);
    }
}
