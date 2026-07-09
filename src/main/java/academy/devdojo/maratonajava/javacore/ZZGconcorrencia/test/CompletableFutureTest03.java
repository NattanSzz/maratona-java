package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesASyncCompletableFuture(storeService);
    }

    private static void searchPricesASyncCompletableFuture(StoreServiceDeprecated storeService) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        long start = System.currentTimeMillis();
        List<CompletableFuture<Double>> completableFuture = stores.stream()
            .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s)))
            .collect(Collectors.toList());
        List<Double> prices = completableFuture.stream()
            .map(CompletableFuture::join)
            .collect(Collectors.toList());
        
        System.out.println(prices);
        
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

}
