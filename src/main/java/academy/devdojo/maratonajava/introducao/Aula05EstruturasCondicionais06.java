package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch: Dados os valores de 1 á 7, imprima se é dia útil ou final de semana. Considerando 1 como domingo

        byte day = 7;
        switch (day) {
            case 1, 7:
                System.out.println("Fim de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}