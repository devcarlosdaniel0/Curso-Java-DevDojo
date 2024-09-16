package academy.devdojo.maratonajava.javacore.ZZAlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Gohan", "Freeza", "Picolo"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer numInt = numStringToInteger.apply("40");
        System.out.println(numInt);

        Function<String, Double> numStringToDouble = Double::parseDouble;
        Double numDouble = numStringToDouble.apply("50");
        System.out.println(numDouble);

        // Testa se na lista tem um elemento
        BiPredicate<List<String>, String> checkName = List::contains;
        boolean test = checkName.test(list, "Gohan");
        System.out.println(test);
    }
}
