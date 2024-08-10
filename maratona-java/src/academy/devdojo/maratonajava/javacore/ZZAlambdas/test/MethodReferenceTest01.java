package academy.devdojo.maratonajava.javacore.ZZAlambdas.test;

import academy.devdojo.maratonajava.javacore.ZZAlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZAlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 56), new Anime("Attack on Titan", 173), new Anime("Spy Family", 16)));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort((a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
