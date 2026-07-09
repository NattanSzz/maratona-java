package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Worker extends Person {
    private double wage;

    static {
        System.out.println("Dentro do bloco de inicialização static de Worker");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Worker");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Worker 2");
    }

    public Worker(String name) {
        super(name);
        System.out.println("Dentro do construtor de Worker");
    }

    public void print() {
        super.print();
        System.out.println("Salario: R$ " + this.wage);
    }

    public void report() {
        System.out.println("Eu, " + this.name + ", recebo R$ " + this.wage);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

}
