package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serializable;

public class Student implements Serializable {
    private long id;
    private String name;
    private String password;

    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    

    @Override
    public String toString() {
        return "Student ID: " + id + "\nname: " + name + "\npassword=" + password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
