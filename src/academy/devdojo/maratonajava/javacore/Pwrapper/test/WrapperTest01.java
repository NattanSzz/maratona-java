package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // byte byteP = 1;
        // short shortP = 1;
        // int intP = 1;
        // long longP = 10L;
        // double doubleP = 1D;
        // float floatP = 1F;
        // char charP = 'A';
        // boolean booleanP = true;

        Byte byteW = 1; // Autoboxing
        // Short shortW = 1;
        Integer intW = 1;
        // long longW = 10L;
        // Double doubleW = 1D;
        // Float floatW = 1F;
        // Character charW = 'A';
        // Boolean booleanW = true;

        System.out.println(intW);

        int i = byteW; // Unboxing
        System.out.println(i);
        // Integer intW2 = Integer.parseInt("1");
        // boolean isTrue = Boolean.parseBoolean("TruE");

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
