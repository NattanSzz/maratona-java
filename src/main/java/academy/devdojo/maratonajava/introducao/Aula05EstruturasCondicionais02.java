package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        Idade < 15 = Categoria Infantil
        Idade >= 15 && idade < 18 = Categoria Juvenil
        Idade >= 18 = Categoria Adulta
         */
        int age = 17;
        if(age < 15){
            System.out.println("Categoria Infantil");
        }else if(age >= 15 && age < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulta");
        }
    }
}
