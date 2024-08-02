package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class JogoByIdComparator implements Comparator<Jogo> {
    @Override
    public int compare(Jogo jogo1, Jogo jogo2) {
        return jogo1.getId().compareTo(jogo2.getId());
    }
}

class JogoByPrecoComparator implements Comparator<Jogo> {
    @Override
    public int compare(Jogo jogo1, Jogo jogo2) {
        return Double.compare(jogo1.getPreco(),jogo2.getPreco());
    }
}

public class JogoSortTest01 {
    public static void main(String[] args) {
        List<Jogo> jogos = new ArrayList<>();
        jogos.add(new Jogo(5L, "Stardew Valley", 19.9D));
        jogos.add(new Jogo(1L, "Red Dead 2", 9.5D));
        jogos.add(new Jogo(4L,"Gta 5", 3.2D));
        jogos.add(new Jogo(3L,"Detroit Become Human", 11.2D));
        jogos.add(new Jogo(2L,"Mafia", 2.99D));
        jogos.add(new Jogo(6L,"Resident Evil", 5.75D));

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        Collections.sort(jogos);
        System.out.println();
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        Collections.sort(jogos, new JogoByIdComparator());
        System.out.println();
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        Collections.sort(jogos, new JogoByPrecoComparator());
        System.out.println();
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
    }
}
