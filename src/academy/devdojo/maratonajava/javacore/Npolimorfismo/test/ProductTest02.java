package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Mobile;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Product;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calcTax());

        System.out.println("----------------------------------------");

        Product product2 = new Mobile("Galaxy", 850);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calcTax());
    }
}
