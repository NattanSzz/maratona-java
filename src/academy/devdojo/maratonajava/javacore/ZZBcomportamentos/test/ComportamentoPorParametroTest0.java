package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

public class ComportamentoPorParametroTest0 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    private static <T> List<T> filter(List<T> cars, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for(T e : cars) {
            if(predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
    public static void main(String[] args) {
        List<Car> carsByAge = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(carsByAge);
    }
}
