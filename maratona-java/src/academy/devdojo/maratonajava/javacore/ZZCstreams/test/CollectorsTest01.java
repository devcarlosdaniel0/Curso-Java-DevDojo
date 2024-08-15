package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest01 {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
