package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Worker extends Person {
    private double wage;

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
