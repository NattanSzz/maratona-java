package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Zoio";
        student.age = 32;
        student.gender = 'M';

        student.print();
    }
}
