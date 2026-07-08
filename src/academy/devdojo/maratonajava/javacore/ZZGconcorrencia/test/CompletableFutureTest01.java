package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.service.StoreService;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesSync(storeService);
        System.out.println("--------------------------------");
        searchPricesASyncFuture(storeService);
        System.out.println("--------------------------------");
        searchPricesASyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        System.out.println(storeService.getPriceSync("Store 5"));
        System.out.println(storeService.getPriceSync("Store 6"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesASyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> paf1 = storeService.getPricesAsyncFuture("Store 1");
        Future<Double> paf2 = storeService.getPricesAsyncFuture("Store 2");
        Future<Double> paf3 = storeService.getPricesAsyncFuture("Store 3");
        Future<Double> paf4 = storeService.getPricesAsyncFuture("Store 4");
        try {
            System.out.println(paf1.get());
            System.out.println(paf2.get());
            System.out.println(paf3.get());
            System.out.println(paf4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }

    private static void searchPricesASyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> paf1 = storeService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> paf2 = storeService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> paf3 = storeService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> paf4 = storeService.getPricesAsyncCompletableFuture("Store 4");
        try {
            System.out.println(paf1.get());
            System.out.println(paf2.get());
            System.out.println(paf3.get());
            System.out.println(paf4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }
}
