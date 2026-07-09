package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws InvalidLoginException, FileNotFoundException{
        System.out.println("Salvando pessoa");
    }
}
