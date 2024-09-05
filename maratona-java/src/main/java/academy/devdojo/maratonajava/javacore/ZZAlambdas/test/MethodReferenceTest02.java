package academy.devdojo.maratonajava.javacore.ZZAlambdas.test;

import academy.devdojo.maratonajava.javacore.ZZAlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZAlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 56), new Anime("Attack on Titan", 173), new Anime("Spy Family", 16)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
