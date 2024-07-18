package academy.devdojo.maratonajava.javacore.Mexception.runtime.test;

import java.util.IllformedLocaleException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(3,0));
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b)  {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
