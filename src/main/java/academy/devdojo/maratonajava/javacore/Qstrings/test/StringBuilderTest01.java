package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Willian Suane";
        name.concat(" DevDojo");
        System.out.println(name);

        StringBuilder sb = new StringBuilder();
        sb.append(" DevDojo");
        System.out.println(sb);
    }
}
