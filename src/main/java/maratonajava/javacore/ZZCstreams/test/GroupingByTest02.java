package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shirata", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Eve", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal", 5.99, Category.FANTASY),
            new LightNovel("Kumo", 3.99, Category.FANTASY),
            new LightNovel("Kumo", 3.99, Category.FANTASY),
            new LightNovel("Attack on Titan", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PICRE));

        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PICRE)));

        System.out.println(collect1);
    }
}
