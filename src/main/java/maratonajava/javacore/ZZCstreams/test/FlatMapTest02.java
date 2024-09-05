package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest02 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String> letters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters);
    }
}
