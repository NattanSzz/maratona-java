package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Developer extends Worker {

    public Developer(String name, double wage) {
        super(name, wage);
    }
    
    @Override
    public String toString() {
        return "Worker [name=" + name + ", wage=" + wage + "]";
    }

    @Override
    public void calcBonus() {
        this.wage = this.wage + this.wage * 0.05;
    }

}
