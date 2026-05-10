package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /* Default Values:
        int, byte, short, long, float & double = 0
        char '\u0000' = ' '
        boolean = false
        String = null */

        String [] names = new String[3];
        names[0] = "Heisenberg";
        names[1] = "Jesse";
        names[2] = "Mike";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
