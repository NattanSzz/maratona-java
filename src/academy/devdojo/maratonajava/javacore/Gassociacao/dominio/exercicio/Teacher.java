package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;
    
    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

}
