package academy.devdojo.maratonajava.javacore.ZZCstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Eleve", "o", "cosmo", "no seu coração")
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int[] nums = {1,2,3,4,5};
        Arrays.stream(nums).average().ifPresent(System.out::println);

        Path path = Paths.get("file.txt");
        try (Stream<String> lines = Files.lines(path)) {
            if (Files.notExists(path)) Files.createFile(path);
            lines.filter(linha -> linha.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
