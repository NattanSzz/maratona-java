package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu, o devdojo é foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        Optional<String> nameOptional = Optional.ofNullable(fndName("Willian"));
        System.out.println(nameOptional);
    }

    private static String fndName(String name){
        List<String> lst = List.of("Willian", "Devdojo");
        int i = lst.indexOf(name);
        if(i > 0) {
            return lst.get(i);
        }
        return null;
    }
}
