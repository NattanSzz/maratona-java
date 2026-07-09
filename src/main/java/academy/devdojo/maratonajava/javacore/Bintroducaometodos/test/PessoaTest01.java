package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Person;

public class PessoaTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Chapolin");
        person.setAge(57);

        person.print();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
