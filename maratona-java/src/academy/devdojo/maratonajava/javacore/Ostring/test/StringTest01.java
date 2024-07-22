package academy.devdojo.maratonajava.javacore.Ostring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = " Carlos";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("l","r"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());
    }
}
