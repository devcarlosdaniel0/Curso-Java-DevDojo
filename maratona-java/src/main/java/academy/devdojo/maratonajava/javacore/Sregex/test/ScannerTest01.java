package academy.devdojo.maratonajava.javacore.Sregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Cbum, Ramon, Laercio, true, 200";
        String[] nomes = texto.split(", ");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
