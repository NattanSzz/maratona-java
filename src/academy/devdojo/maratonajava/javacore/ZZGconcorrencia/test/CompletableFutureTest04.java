package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
        System.out.println("------------------------------------------");
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        // stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
            .map(service::getPriceSync)
            .map(Quote::newQuote)
            .map(service::applyDiscount)
            .forEach(System.out::println);;

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        
        List<CompletableFuture<String>> completableFuture = stores.stream()
            .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
            .map(cf -> cf.thenApply(Quote::newQuote))
            .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
            .collect(Collectors.toList());
        
        completableFuture.stream()
            .map(CompletableFuture::join)
            .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
