package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Nanatsu", "TV", 12, "Aventura", "MAPPA");
        //anime.init("Nanatsu", "TV", 12);

        anime.print();
    }
}
