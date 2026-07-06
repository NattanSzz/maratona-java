package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Book;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumStreaParallel(num);
        sumStreaParallelIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 0; i <= num; i++){
            result += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - init) + "ms");
    }

    private static void sumStreaParallel(long num) {
        System.out.println("Sum Stream Parallel");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - init) + "ms");
    }

    private static void sumStreaParallelIterate(long num) {
        System.out.println("Sum Stream Parallel Iterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - init) + "ms");
    }
    
}
