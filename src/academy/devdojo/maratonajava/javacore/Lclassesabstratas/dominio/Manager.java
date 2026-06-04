package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Manager extends Worker {
    public Manager(String name, double wage) {
        super(name, wage);
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", wage=" + wage + "]";
    }
    
}
