package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.LinkedHashSet;
import java.util.Set;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 5));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
