package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Student;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.PrintStudent;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent printStudent = new PrintStudent();

        student01.name = "Silvio Santos";
        student01.age = 92;
        student01.gender = 'M';

        student02.name = "Ana Maria Braga";
        student02.age = 75;
        student02.gender = 'F';

        printStudent.print(student01);
        System.out.println("--------------------------");
        printStudent.print(student02);
    }
}
