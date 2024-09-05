package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Métodos interessantes
        // descendingSet() - Organiza do maior para o menor
        // lower - <
        // floor - <=
        // higher - >
        // ceiling - >=
        // poolFirst() - Remove o primeiro elemento da lista
        // pollLast() - Remove o último elemento da lista

        System.out.println(map.descendingMap());
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.size());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map.size());
    }
}
