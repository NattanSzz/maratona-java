package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student02 = new Student();
        
        student02.name = "Jerry";

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println("------------------------");

        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.gender);
    }
}
