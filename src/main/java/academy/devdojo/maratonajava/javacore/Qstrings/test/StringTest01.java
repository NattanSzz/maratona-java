package academy.devdojo.maratonajava.javacore.Qstrings.test;

public interface StringTest01 {
    public static void main(String[] args) {
        String name = "Willian"; // String Constant Pool
        String name2 = "Willian";

        name = name.concat(" Suane");

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);

        String name3 = new String("Willian");
        System.out.println(name2 == name3);
    }
}
