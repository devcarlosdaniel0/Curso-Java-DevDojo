package academy.devdojo.maratonajava.javacore.Ostring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);

        StringBuilder stringBuilder = new StringBuilder("William Suane");
        stringBuilder.append(" DevDojo").append(" Academy");
        stringBuilder.reverse();
        stringBuilder.reverse();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);

    }
}
