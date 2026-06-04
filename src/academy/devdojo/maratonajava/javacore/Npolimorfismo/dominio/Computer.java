package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computer extends Product {
    public static final double TAX = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculando imposto do Computador");
        return this.value * TAX;
    }
    
}
