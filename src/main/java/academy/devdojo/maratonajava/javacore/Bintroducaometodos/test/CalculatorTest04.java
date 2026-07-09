package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculator calculator = new Calculator();
        calculator.changeTwoNumber(num1, num2);
        System.out.println("Dentro do CalculatorTest04");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
