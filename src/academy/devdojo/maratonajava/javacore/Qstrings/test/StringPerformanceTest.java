package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long init = System.currentTimeMillis();
        concatString(10_000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo: " + (end - init) + "ms");

        init = System.currentTimeMillis();
        concatString(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo: " + (end - init) + "ms");

        init = System.currentTimeMillis();
        concatString(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo: " + (end - init) + "ms");
    }

    public static void concatString(int lenght) {
        String text = "";
        for(int i = 0; i < lenght; i++){
            text += i;
        }
    }

    public static void concatStringBuilder(int lenght) {
        StringBuilder text = new StringBuilder(lenght);
        for(int i = 0; i < lenght; i++){
            text.append(i);
        }
    }

    public static void concatStringBuffer(int lenght) {
        StringBuffer text = new StringBuffer(lenght);
        for(int i = 0; i < lenght; i++){
            text.append(i);
        }
    }
}
