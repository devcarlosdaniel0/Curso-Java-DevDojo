package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("Carlos");
        nomes1.add("Daniel");
        nomes2.add("Marchesin");
        nomes2.add("da Silva");
        
        nomes1.addAll(nomes2);

        for (String nome : nomes1) {
            System.out.println(nome);
        }

        System.out.println("--------------");

        for (int i = 0; i < nomes1.size(); i++) {
            System.out.println(nomes1.get(i));
        }

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        System.out.println(integers);
    }
}
