package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Teacher;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teatcher = new Teacher("Ronaldo");
        Teacher teatcher2 = new Teacher("Vanildo");
        Teacher[] teachers = {teatcher, teatcher2};
        School school = new School("José Monteiro", teachers);
        school.print();
    }
}
