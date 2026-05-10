package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int ageInt = 10;
        // long bigNumber = 1000000;
        double wageDouble = 2000;
        // float wageFloat = 2500.0F;
        // byte ageByte = 10;
        // short ageShort = 10;
        // boolean verity = true;
        // boolean faked = false;
        char character = 'M';

        System.out.println("A idade é " + ageInt);
        System.out.println("Sexo: " + character);

        // Casting
        int doubleConvertido = (int) wageDouble;
        System.out.println(doubleConvertido);

        // String - Reference Type
        String msg = "Hello, world!";
        System.out.println(msg);
    }
}
