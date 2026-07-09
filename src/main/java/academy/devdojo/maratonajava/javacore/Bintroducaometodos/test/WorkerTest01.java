package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Worker;

public class WorkerTest01 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "Bob Esponja";
        worker.age = 27;
        worker.wage = new double[]{1500, 1250, 3400};

        worker.print();
        worker.wageAverage();
    }
}
