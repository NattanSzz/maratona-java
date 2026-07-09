package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;
        List<Integer> arrayToList = Arrays.asList(numbersArray);
        List<Integer> arrayToList2 = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println(arrayToList);
        System.out.println(arrayToList2);
    }
}
