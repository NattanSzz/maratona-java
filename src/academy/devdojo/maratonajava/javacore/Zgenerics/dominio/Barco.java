package academy.devdojo.maratonajava.javacore.Zgenerics.dominio;

public class Barco {
    private String name;

    public Barco(String name) {
        this.name = name;
    }

    public String toString() {
        return "Barco\n----> " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
