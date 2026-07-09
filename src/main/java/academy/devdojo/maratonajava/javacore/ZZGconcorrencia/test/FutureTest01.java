package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollar = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 4.35D;
        });
        System.out.println(doSomething());
        Double dollarResponse = dollar.get(3, TimeUnit.SECONDS);
        System.out.println("Dollar: " + dollarResponse);
        executorService.shutdown();
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for(int i = 0; i < 1_000_000; i++){
            sum += i;
        }
        return sum;
    }
}
