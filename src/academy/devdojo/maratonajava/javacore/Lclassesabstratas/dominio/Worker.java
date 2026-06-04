package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Worker {
    protected String name;
    protected double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }
    
}
