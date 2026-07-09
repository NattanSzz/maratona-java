package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(List.of("Tom", "Jerry", "Spike"));
        Collections.sort(lst, String::compareTo);
        System.out.println(lst);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        System.out.println(stringToInteger.apply("12"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(lst, "Spike"));
    }
}
