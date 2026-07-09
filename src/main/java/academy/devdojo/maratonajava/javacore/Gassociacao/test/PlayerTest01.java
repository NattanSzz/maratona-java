package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafu");

        Player[] players = {player1, player2, player3};
        for(Player p : players) {
            p.print();
        }
    }
}
