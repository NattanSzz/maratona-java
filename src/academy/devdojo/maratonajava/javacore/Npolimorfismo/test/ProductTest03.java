package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Mobile;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Mobile mobile = new Mobile("Galaxy", 850);

        mobile.setStorage("64MB");

        CalcTax.calcTax(mobile);

    }
}
