package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.InvalidLoginException;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try{
            login();
        }catch(InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Batman";
        String passwordDB = "batleite123";
        
        System.out.println("Username: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();

        input.close();

        if(!username.equals(usernameDB) || !password.equals(passwordDB)){
            throw new InvalidLoginException("Usuario ou senha invalidos");
        }
        System.out.println("Logado com sucesso");

    }
}
