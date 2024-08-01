package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    }
}
