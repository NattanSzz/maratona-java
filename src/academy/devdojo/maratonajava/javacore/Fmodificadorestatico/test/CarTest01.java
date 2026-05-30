package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Car;;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Mercedes", 275);
        Car car03 = new Car("Audi", 290);

        Car.setLimitVelocity(180);

        car01.print();
        car02.print();
        car03.print();
    }
}
