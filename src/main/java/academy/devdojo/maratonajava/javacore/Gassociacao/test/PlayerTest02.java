package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Seleção Brasileira");
        player1.setTeam(team);
        player1.print();
    }
}
