package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaValueComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 5));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
