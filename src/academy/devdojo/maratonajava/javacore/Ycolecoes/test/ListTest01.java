package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Willian");
        names.add("DevDojo");
        names2.add("Suane");
        names2.add("Academy");
        // names.remove("Willian");

        for(Object name : names) {
            System.out.println(name);
        }

        System.out.println("---------------------");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}
