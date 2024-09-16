package academy.devdojo.maratonajava.javacore.Mexception.runtime.test;

import java.util.IllformedLocaleException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(3,0));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static double divisao(double a, double b)  {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
