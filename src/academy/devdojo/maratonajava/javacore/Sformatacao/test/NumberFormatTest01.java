package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = Locale.of("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getInstance(localeDefault);
        nf[1] = NumberFormat.getInstance(localeJP);
        nf[2] = NumberFormat.getInstance(localePT);
        nf[3] = NumberFormat.getInstance(localeIT);

        double value = 10_000.2130;

        for (NumberFormat n : nf) {
            System.out.println(n.format(value));
        }

        String valueString = "10_000.2130";
        try{
            System.out.println(nf[0].parse(valueString));
        }catch(ParseException e) {
            e.printStackTrace();
        }
        
    }
}
