package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Nattan";
        student.age = 15;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
