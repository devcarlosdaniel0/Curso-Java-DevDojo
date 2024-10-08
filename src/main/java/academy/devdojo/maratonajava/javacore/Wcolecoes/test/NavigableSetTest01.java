package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;
import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o1.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Jogo> jogos = new TreeSet<>(new JogoByPrecoComparator());
        jogos.add(new Jogo(5L, "Stardew Valley", 19.9D, 0));
        jogos.add(new Jogo(1L, "Red Dead 2", 9.5D, 5));
        jogos.add(new Jogo(4L,"Gta 5", 3.2D, 3));
        jogos.add(new Jogo(3L,"Detroit Become Human", 11.2D, 0));
        jogos.add(new Jogo(2L,"Mafia", 2.99D,0));
        jogos.add(new Jogo(6L,"Resident Evil", 5.75D,2));

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        // Métodos interessantes
        // descendingSet() - Organiza do maior para o menor
        // lower - <
        // floor - <=
        // higher - >
        // ceiling - >=
        // poolFirst() - Remove o primeiro elemento da lista
        // pollLast() - Remove o último elemento da lista

        System.out.println();

        Jogo mine = new Jogo(21L, "minecraft", 5.75, 5);
        System.out.println(jogos.lower(mine));
        System.out.println(jogos.floor(mine));
        System.out.println(jogos.higher(mine));
        System.out.println(jogos.ceiling(mine));

        System.out.println();

        System.out.println(jogos.size());
        System.out.println(jogos.pollFirst());
        System.out.println(jogos.pollLast());
        System.out.println(jogos.size());
    }
}
