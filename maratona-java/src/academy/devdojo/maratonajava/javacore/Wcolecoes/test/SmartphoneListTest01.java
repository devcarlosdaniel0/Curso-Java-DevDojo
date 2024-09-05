package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Samsung");
        Smartphone s2 = new Smartphone("ABCDE", "Iphone");
        Smartphone s3 = new Smartphone("XLFE2", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("ABCDE", "Iphone");
        System.out.println(s4.equals(s2));
        System.out.println(smartphones.contains(s4));

        int i = smartphones.indexOf(s4);
        System.out.println("índice do s4 = " + i);
        System.out.println("índice do s2 = " + smartphones.indexOf(s2));
        System.out.println(smartphones.get(1));

    }
}
