package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> carros = new ArrayList<>();
        carros.add("Mercedez");
        carros.add("Volkswagen");

        for (String carro : carros) {
            System.out.println(carro);
        }

        System.out.println("--------------");
        carros.add("Lamborghini");

        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
    }
}
