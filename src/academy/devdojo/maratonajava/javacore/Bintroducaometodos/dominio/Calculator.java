package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculator {
    public void sumTwoNumber() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(1 - 2);
    }

    public void multiplyTwoNumber(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void sumArrayValues(int[] arr) {
        int result = 0;
        for (int v : arr) {
            result += v;
        }
        System.out.println(result);
    }

    public double divideTwoNumber(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void changeTwoNumber(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do changeTwoNumber");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
