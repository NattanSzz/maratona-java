package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Mobile extends Product {
    public static final double TAX = 0.06;

    public Mobile(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculando imposto do celular");
        return this.value * TAX;
    }

}
