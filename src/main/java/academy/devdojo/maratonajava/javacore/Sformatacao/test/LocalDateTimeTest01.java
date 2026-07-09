package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.parse("2022-08-06");
        LocalTime lt = LocalTime.parse("09:45:00");
        System.out.println(ldt);
        System.out.println(ld);
        System.out.println(lt);
        LocalDateTime ldt1 = ld.atTime(lt);
        LocalDateTime ldt2 = lt.atDate(ld);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
