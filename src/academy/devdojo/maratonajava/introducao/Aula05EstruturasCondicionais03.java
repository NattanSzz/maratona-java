package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador Ternario
        double wage = 6000;
        String msgYes = "Eu vou doar 500 reais pro DevDojo";
        String msgNot = "Ainda não tenho condições";
        // (condição) ? verdadeiro : falso
        String result = (wage >= 5000) ? msgYes : msgNot;
        System.out.println(result);

    }
}
