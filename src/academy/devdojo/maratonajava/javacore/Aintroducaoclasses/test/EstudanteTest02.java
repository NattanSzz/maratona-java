package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        Estudante student02 = new Estudante();
        
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
