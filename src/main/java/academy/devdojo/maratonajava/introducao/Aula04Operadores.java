package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;

        System.out.println(number01 + number02);

        // %
        int rest = 21 % 2;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTenGreaterThanTwelve = 10 > 20;
        System.out.println("Is Ten greater than Twelve? " + isTenGreaterThanTwelve);

        // && (AND) || (OR) ! (NOT)
        int age = 29;
        float wage = 3500f;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && wage >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && wage >= 3381;
        System.out.println("Is Within The Law Greater Than 30? " + isWithinTheLawGreaterThanThirty);
        System.out.println("Is Within The Law Less Than 30? " + isWithinTheLawLessThanThirty);

        double valueCurrentAccount = 200;
        double valueSavingsAccount = 10000;
        double totalAccounts = valueCurrentAccount + valueSavingsAccount;
        float ps5Value = 5000F;
        boolean isPS5Affordable = valueCurrentAccount >= ps5Value || valueSavingsAccount >= ps5Value || totalAccounts >= ps5Value;
        System.out.println("Is PS5 Affordable? " + isPS5Affordable);

        // = += -= *= /= %=
        double bonus = 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
    }
}
