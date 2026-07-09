package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService EXECUTOR = Executors.newScheduledThreadPool(1);

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now() + " beep");
        };

        EXECUTOR.schedule(r, 5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        beeper();
    }
}
