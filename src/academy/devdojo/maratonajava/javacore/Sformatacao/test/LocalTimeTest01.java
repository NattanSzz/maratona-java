package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
    }
}
