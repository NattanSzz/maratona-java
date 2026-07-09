package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Discount;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Discount.Code;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;

public class StoreServiceWithDiscount {
    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Code discountCode = Discount.Code.values()[
            ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
        ];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscount(Quote quote) {
        delay();
        double discountValue = quote.getPRICE() * (100 - quote.getDISCOUNT_CODE().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'", quote.getSTORE(), quote.getPRICE(), quote.getDISCOUNT_CODE(), discountValue);
    }

    private double priceGenerator(){
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
