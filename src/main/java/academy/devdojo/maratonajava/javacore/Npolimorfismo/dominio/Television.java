package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Television extends Product {
    public static final double TAX = 0.21;

    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculando imposto da Televisão");
        return this.value * TAX;
    }
    
}
