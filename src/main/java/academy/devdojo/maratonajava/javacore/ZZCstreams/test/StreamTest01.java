package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import academy.devdojo.maratonajava.javacore.ZZCstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shirata", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Eve", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal", 5.99),
            new LightNovel("Kumo", 3.99),
            new LightNovel("Attack on Titan", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() < 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) break;
        }

        System.out.println(titles);
    }
}
