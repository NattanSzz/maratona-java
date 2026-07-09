package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Mobile;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Television;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Mobile mobile = new Mobile("Redmi", 1450);
        Television tv = new Television("TLC", 5000);

        //CalcTax.calcTaxComputer(computer);
        //CalcTax.calcTaxMobile(mobile);

        CalcTax.calcTax(mobile);
        CalcTax.calcTax(computer);
        CalcTax.calcTax(tv);
    }
}
