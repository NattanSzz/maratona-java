package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Seminar {
    private String title;
    private Student[] students;
    private Teacher teacher;
    private Local local;

    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public void print() {
        System.out.println("=======================");
        System.out.println("Seminário");
        System.out.println("-----------------------");

        System.out.println("Titulo:");
        System.out.println(this.title);

        System.out.println("\nAluno:");
        if(this.students != null) {
            for(Student student : this.students) {
                System.out.println(student.getName() + ", " + student.getAge() + " anos");
            }
        }else{
            System.out.println("Nenhum");
        }

        System.out.println("\nProfessor:");
        if(this.teacher != null) {
            System.out.println(this.teacher.getName() + ", " + this.teacher.getSpecialty());
        }else{
            System.out.println("Nenhum");
        }

        System.out.println("\nLocal:");
        System.out.println(this.local.getName());

        System.out.println("=======================");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
}
