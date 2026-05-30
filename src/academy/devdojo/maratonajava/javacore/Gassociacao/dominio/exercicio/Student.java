package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("=======================");
        System.out.println("Aluno");
        System.out.println("-----------------------");

        System.out.println("Nome:");
        System.out.println(this.name);

        System.out.println("\nIdade:");
        System.out.println(this.age);

        System.out.println("\nSeminario:");
        if(this.seminar != null) {
            System.out.println(this.seminar.getTitle());
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

}
