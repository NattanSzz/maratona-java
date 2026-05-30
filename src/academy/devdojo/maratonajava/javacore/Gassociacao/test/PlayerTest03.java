package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Pele");
        Player player2 = new Player("Cafu");
        Team team = new Team("Brasil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("------- Jogador -------");
        player.print();
        System.out.println("------- Time -------");
        team.print();
    }
}
