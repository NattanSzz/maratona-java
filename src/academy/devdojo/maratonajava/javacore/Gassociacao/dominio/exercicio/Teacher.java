package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;
    
    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void print() {
        System.out.println("=======================");
        System.out.println("Professor");
        System.out.println("-----------------------");
        System.out.println("Nome:");
        System.out.println(this.name);

        System.out.println("\nEspecialidade: ");
        System.out.println(this.specialty);

        System.out.println("\nSeminarios:");
        if(this.seminars != null) {
            for(Seminar seminar : this.seminars) {
                System.out.println(seminar.getTitle());
            }
        }else{
            System.out.println("Nenhum");
        }
        System.out.println("=======================");
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
