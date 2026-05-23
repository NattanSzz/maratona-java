package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] values = {1, 2, 3, 4, 7, 15};
        
        calculator.multiplyTwoNumber(10, 2);
        calculator.sumArrayValues(values);
    }
}
