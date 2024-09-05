package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByTest01 {
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
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case FANTASY: fantasy.add(lightNovel); break;
                case DRAMA : drama.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.ROMANCE, romance);

        System.out.println(categoryListMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
