package academy.devdojo.maratonajava.javacore.ZZAlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Carlos", "Matheus", "Maria", "Leandro"));
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4));

        forEach(strings, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));
    }

    private static <T> void forEach (List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
