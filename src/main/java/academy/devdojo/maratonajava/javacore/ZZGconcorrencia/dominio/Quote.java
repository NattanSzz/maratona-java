package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Discount.Code;

public final class Quote {
    private final String STORE;
    private final double PRICE;
    private final Discount.Code DISCOUNT_CODE;

    private Quote(String sTORE, double pRICE, Code dISCOUNT_CODE) {
        STORE = sTORE;
        PRICE = pRICE;
        DISCOUNT_CODE = dISCOUNT_CODE;
    }

    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1].replace(",", ".")), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote [STORE=" + STORE + ", PRICE=" + PRICE + ", DISCOUNT_CODE=" + DISCOUNT_CODE + "]";
    }

    public String getSTORE() {
        return STORE;
    }

    public double getPRICE() {
        return PRICE;
    }

    public Discount.Code getDISCOUNT_CODE() {
        return DISCOUNT_CODE;
    }

}
