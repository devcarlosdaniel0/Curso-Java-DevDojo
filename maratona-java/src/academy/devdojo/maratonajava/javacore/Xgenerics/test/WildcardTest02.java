package academy.devdojo.maratonajava.javacore.Xgenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorroList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoList = List.of(new Gato(), new Gato());
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
