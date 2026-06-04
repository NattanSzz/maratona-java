package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Worker extends Person{
    protected String name;
    protected double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
        calcBonus();
    }
    
    public abstract void calcBonus();

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }
}
