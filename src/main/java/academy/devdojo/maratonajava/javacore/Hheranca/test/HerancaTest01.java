package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Person;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Worker;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Xique-Xique Bahia");
        address.setCep("012345-209");

        Person person = new Person("Lord");
        person.setCpf("1234567");
        person.setAddress(address);
        person.print();

        Worker worker = new Worker("Bruninho Mars");
        worker.setCpf("7654321");
        worker.setAddress(address);
        worker.setWage(1450);
        worker.print();
        worker.report();
    }
}
