package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Seminar;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Student;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Teacher;

public class SeminarTest01 {
    public static void main(String[] args) {
        Local local = new Local("Juazeiro do Norte");
        Seminar seminar = new Seminar("Inteligencia Artificial", local);

        Student student = new Student("Nattan", 15);
        Student[] students = {student};
        Teacher teacher = new Teacher("Paulo", "Software Enginner");

        Seminar[] seminars = {seminar};
        teacher.setSeminars(seminars);
        student.setSeminar(seminar);

        seminar.setStudents(students);
        seminar.setTeacher(teacher);

        seminar.print();
        teacher.print();
        student.print();
    }
}
