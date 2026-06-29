package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Walt, Jesse, Saul";
        String[] tokens = text.split(",");
        for (String token : tokens) {
            System.out.println(token.trim());
        }
    }
}
