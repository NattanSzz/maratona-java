package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 5));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()) {
            Manga manga = mangaIterator.next();
            if(manga.getAmount() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getAmount() == 0);
    }
}
