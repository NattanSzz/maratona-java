package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Seminar {
    private String title;
    private Student[] students;
    private Teacher teacher;
    private String local;

    public Seminar(String title, String local) {
        this.title = title;
        this.local = local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
}
