package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball z", 2.99);

        // Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        // consumidorManga.put(consumidor1, manga1);
        // consumidorManga.put(consumidor2, manga4);
        // for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
        //     System.out.println(entry.getKey().getName() + " -> " + entry.getValue().getName());
        // }

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, List.of(manga1, manga2, manga3));
        consumidorManga.put(consumidor2, List.of(manga3, manga4));

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getName());
            for(Manga manga : entry.getValue()){
                System.out.println("-> " + manga.getName());
            }
        }
    }
}
