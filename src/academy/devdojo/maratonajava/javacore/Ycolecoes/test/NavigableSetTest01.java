package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SmartPhone;

class SmartphoneBrandComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaValueComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getValue(), o2.getValue());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneBrandComparator());
        SmartPhone s1 = new SmartPhone("123", "Nokia");
        set.add(s1);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 5));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));
        mangas.descendingSet().forEach(System.out::println);

        Manga yuyu = new Manga(21L, "Yu Yu Hakusho", 8, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("-----------------------------");
        System.out.println(mangas.lower(yuyu));
;    }
}
