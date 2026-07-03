package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private static String name;
    public String name2;
    static class Nested {
        void print() {
            System.out.println(name);
            // System.out.println(new OuterClassesTest03().name);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
