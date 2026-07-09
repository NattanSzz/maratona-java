package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.regex.Matcher;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d Tudo o que é digito
        // \D Tudo o que não é digito
        // \s Todos os espaços em branco
        // \S Todos os caracteres que não são espaços em branco
        // \w a-zA-Z, digitos, _
        // \W Tudo que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais 
        // + Uma ou mais
        // {n, n} de n ate n
        // ()
        // | o(v|c)o ovo | oco
        // . 1.3 123 133 1@3
        String regex = "([a-zA-Z0-9\\._-])+@([A-Za-z])+(\\.([A-Za-z])+)+";
        String text = "Dean@hotmail.com, 123sammy@gmail.com.br, @#!castiel@mail.br, teste@gmail.com, jack@mail";
        System.out.println(Arrays.toString(text.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Texto: " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        //int numberHex = 0x59F86A;
        //System.out.println(numberHex);
    }
}
