package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch(RuntimeException e) {
            System.out.println("Dentro do Runtime Exception");
        }

        try{
            maybeThrowException();
        }catch(SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {

    }
}
