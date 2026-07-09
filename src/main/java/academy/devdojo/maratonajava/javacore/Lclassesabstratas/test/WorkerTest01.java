package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Developer;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Manager;

public class WorkerTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Lula Molusco", 5000);
        Developer developer = new Developer("Patrick", 12000);
        System.out.println(manager);
        System.out.println(developer);
    }
}
