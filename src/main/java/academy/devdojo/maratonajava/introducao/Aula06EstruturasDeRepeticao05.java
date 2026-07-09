package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double totalValue = 30000;
        for(int i = (int) totalValue; i >= 1; i--){
            double installment = totalValue / i;
            if(installment < 1000){
                continue;
            }
            System.out.printf("%dx de R$ %.2f %n", i, installment);
        }
    }
}
