package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Dean", "Sam", "Castiel");
        List<Integer> stringLengths = map(strings, string -> string.length());
        System.out.println(stringLengths);
    }

    private static <T, R> List<R> map(List<T> lst, Function<T, R> Function){
        List<R> result = new ArrayList<>();
        for(T e : lst) {
            R r = Function.apply(e);
            result.add(r);
        }
        return result;
    }
}
