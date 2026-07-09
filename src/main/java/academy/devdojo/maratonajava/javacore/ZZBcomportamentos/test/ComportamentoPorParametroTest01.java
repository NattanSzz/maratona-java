package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

public class ComportamentoPorParametroTest01 {
    private static List<Car> filterColorCar(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for(Car car : cars) {
            if(car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));
        System.out.println(filterColorCar(cars, "green"));
    }
}
