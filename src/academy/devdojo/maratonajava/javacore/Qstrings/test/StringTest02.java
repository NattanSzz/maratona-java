package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Goodman";
        String numbers = "012345";

        System.out.println(name.charAt(1));
        System.out.println(name.length());
        System.out.println(name.replace('o', 'a'));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        System.out.println(numbers.substring(0, 2));
    }
}
