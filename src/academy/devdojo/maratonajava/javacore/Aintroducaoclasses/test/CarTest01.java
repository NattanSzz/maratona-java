package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args){
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Civic";
        car01.model = "4x4";
        car01.year = 2024;

        car02.name = "Volkswagen";
        car02.model = "1.4 Turbo";
        car02.year = 2018;

        System.out.println("Nome: " + car01.name + ", Modelo: " + car01.model + ", Ano: " + car01.year);
        System.out.println("Nome: " + car02.name + ", Modelo: " + car02.model + ", Ano: " + car02.year);

    }
}
