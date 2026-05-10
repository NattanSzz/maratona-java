package academy.devdojo.maratonajava.introducao;
/*
Pratica
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <name>, morando no endereço <address>, confirmo que recebi o salário de <wage>, na data <date>.
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Nattan";
        String address = "Xique Xique Bahia nº 12b";
        double wage = 2350.12;
        String date = "01/05/2026";
        
        System.out.println("Eu, " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de R$ " + wage + ", na data " + date);
    }
}
