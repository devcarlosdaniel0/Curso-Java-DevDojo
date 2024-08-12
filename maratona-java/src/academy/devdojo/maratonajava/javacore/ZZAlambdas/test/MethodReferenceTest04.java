package academy.devdojo.maratonajava.javacore.ZZAlambdas.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;
import academy.devdojo.maratonajava.javacore.ZZAlambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZAlambdas.service.AnimeComparators;
import academy.devdojo.maratonajava.javacore.ZZAlambdas.service.TriFunction;
import academy.devdojo.maratonajava.javacore.Zcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 56), new Anime("Attack on Titan", 173), new Anime("Spy Family", 16)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction.apply("Dragon Ball Z", 500));
        System.out.println(animeBiFunction2.apply("Nanatsu", 170));


        TriFunction<Long, String, Double, Jogo> jogoTriFunction = Jogo::new;
        System.out.println(jogoTriFunction.aplly(3L, "Ghost of Tsushima", 300.5));
    }
}
