package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Car;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.LIMIT_VELOCITY);
        car.BUYER.setName("Toreto");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Furioso");
        ferrari.print();
    }
}
