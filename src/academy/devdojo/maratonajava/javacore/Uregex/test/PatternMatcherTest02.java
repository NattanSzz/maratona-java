package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d Tudo o que é digito
        // \D Tudo o que não é digito
        // \s Todos os espaços em branco
        // \S Todos os caracteres que não são espaços em branco
        // \w a-zA-Z, digitos, _
        // \W Tudo que não for incluso no \w
        String regex = "\\W";
        String text2 = "@#hhj2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Texto: " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
