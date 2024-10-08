package academy.devdojo.maratonajava.javacore.Sregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não é dígito
        // \s = espaço em branco \t \n \f \r
        // \S = todos caracteres excluindo os brancos
        // \w = a-z A-Z, dígitos, _
        // \W = Tudo que não está no \w

        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "@$h_23 84has 79";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }


    }
}
