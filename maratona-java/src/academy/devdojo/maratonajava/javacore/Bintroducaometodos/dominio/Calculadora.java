package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(int a, int b) {
        int soma = a + b;
        System.out.println(soma);
    }

    public void subtracaoDoisNumeros(int a, int b) {
        int subtracao = a - b;
        System.out.println(subtracao);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        int multiplicao = a * b;
        System.out.println(multiplicao);
    }

    public double divideDoisNumeros (double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}