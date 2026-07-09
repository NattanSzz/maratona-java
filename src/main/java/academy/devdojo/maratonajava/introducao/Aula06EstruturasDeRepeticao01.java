package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        byte count = 12;
        while(count <= 10){
            System.out.println(count);
            count++;
        }


        do {
            System.out.println("Dentro do Do-While");
        } while (count < 10);


        for(int i = 0; i < 10; i++){
            System.out.println("For " + i);
        }
    }
}
