package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.of("en", "US");
        Locale localePT = Locale.of("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getCurrencyInstance(localeDefault);
        nf[1] = NumberFormat.getCurrencyInstance(localeJP);
        nf[2] = NumberFormat.getCurrencyInstance(localePT);
        nf[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 10_000.2130;

        for (NumberFormat n : nf) {
            System.out.println(n.format(value));
        }
        
    }
}
