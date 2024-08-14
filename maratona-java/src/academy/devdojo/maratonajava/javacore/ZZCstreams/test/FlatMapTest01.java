package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest01 {
    public static void main(String[] args) {
        List<List<String>> escola = new ArrayList<>();
        List<String> estudantes = List.of("Cazé", "Nicolas", "Bacchin");
        List<String> professores = List.of("Sandra", "Dani", "Tchesko");
        List<String> funcionarios = List.of("Tia", "Fabiana");
        escola.add(estudantes);
        escola.add(professores);
        escola.add(funcionarios);

        for (List<String> pessoas : escola) {
            for (String pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
        System.out.println("--------");

        Stream<String> stringStream = escola.stream()
                .flatMap(Collection::stream);
        stringStream.forEach(System.out::println);
    }
}
