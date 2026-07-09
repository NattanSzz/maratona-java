package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

public class MetodosGenericsTest01 {
    public static void main(String[] args) {
        criarArrayComObjeto(new Barco("Canoa Marota"));
    }

    public static <T> void criarArrayComObjeto(T t){
        List<T> lst = new ArrayList<>();
        lst.add(t);
        System.out.println(lst);
    }
}
