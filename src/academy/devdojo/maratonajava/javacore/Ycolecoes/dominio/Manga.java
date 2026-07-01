package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga {
    private Long id;
    private String name;
    private double value;

    public Manga(long id, String name, double value) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Manga [id=" + id + ", name=" + name + ", value=" + value + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Manga other = (Manga) obj;
        if(Double.compare(value, other.value) != 0) return false;
        return Double.compare(other.value, value) == 0 && id.equals(other.id) && name.equals(other.name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
