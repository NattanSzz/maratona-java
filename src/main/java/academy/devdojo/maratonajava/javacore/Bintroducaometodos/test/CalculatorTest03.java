package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divideTwoNumber(12, 2);
        System.out.println(result);
    }
}
