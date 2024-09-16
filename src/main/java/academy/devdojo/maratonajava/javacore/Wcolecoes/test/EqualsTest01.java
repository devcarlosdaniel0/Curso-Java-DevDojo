package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Samsung");
        Smartphone s2 = new Smartphone("1ABC1", "Samsung");

        System.out.println(s1.equals(s2));
    }
}
