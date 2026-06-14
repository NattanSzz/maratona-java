package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
        super("Login Invalido");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
    
}
