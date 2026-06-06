package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            division(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private static int 'division(int a , int b) throws IllegalArgumentException {
        if(b == 0) {
            throw new RuntimeException("Argumento ilegal, não pode ser 0");
        }
        return a / b;

        // try {
        //     return a/b;
        // } catch(RuntimeException e) {
        //     e.printStackTrace();
        // }
        // return 0;
    }
}
