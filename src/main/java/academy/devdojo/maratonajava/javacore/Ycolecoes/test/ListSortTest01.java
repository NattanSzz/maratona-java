package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball z");

        Collections.sort(mangas);

        List<Double> moneys = new ArrayList<>();
        moneys.add(100.21);
        moneys.add(23.98);
        moneys.add(21.21);
        moneys.add(98.10);
        System.out.println(moneys);

        for(String manga : mangas) {
            System.out.println(manga);
        }
    }
}
