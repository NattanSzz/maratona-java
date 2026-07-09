package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double wage = 70000;
        double taxe;
        if(wage <= 34712){
            taxe = 9.70;
        }else if(wage <= 68507){
            taxe = 37.35;
        }else{
            taxe = 49.50;
        }
        double wageWithTaxe = wage - ((wage * taxe) / 100);

        System.out.println("Seu salário com impostos fica € " + wageWithTaxe);
    }
}
