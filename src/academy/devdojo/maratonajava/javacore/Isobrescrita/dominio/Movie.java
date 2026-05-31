package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
