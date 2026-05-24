package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};
        calculator.sumArrayValues(numbers);

        calculator.sumVarArgs(1, 2, 3, 4, 5);
    }
}
