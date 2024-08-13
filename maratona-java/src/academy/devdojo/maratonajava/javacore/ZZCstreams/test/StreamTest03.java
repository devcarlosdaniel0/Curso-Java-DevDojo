package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shirata", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Eve", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal", 5.99),
            new LightNovel("Kumo", 3.99),
            new LightNovel("Kumo", 3.99),
            new LightNovel("Attack on Titan", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .count();
        
        System.out.println(count);
    }
}
