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
        mangas.forEach(System.out::println);
;    }
}
