package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    private static List<Car> filter(List<Car> cars, CarPredicate predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for(Car car : cars) {
            if(predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    public static void main(String[] args) {
        List<Car> carsByAge = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2016;
            }
        });
        System.out.println(carsByAge);
    }
}
