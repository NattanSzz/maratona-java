package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private long id;
    private String name;

    public Consumidor(String name) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Consumidor [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Consumidor other = (Consumidor) obj;
        if (id != other.id)
            return false;
        return true;
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

    

}
