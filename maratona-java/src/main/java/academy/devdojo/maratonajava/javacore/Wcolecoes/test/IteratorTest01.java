package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Jogo> jogos = new LinkedList<>();
        jogos.add(new Jogo(5L, "Stardew Valley", 19.9D, 0));
        jogos.add(new Jogo(1L, "Red Dead 2", 9.5D, 5));
        jogos.add(new Jogo(4L,"Gta 5", 3.2D, 3));
        jogos.add(new Jogo(3L,"Detroit Become Human", 11.2D, 0));
        jogos.add(new Jogo(2L,"Mafia", 2.99D,0));
        jogos.add(new Jogo(6L,"Resident Evil", 5.75D,2));

//        Iterator<Jogo> jogoIterator = jogos.iterator();
//        while(jogoIterator.hasNext()) {
//            if (jogoIterator.next().getQuantidade() == 0) {
//                jogoIterator.remove();
//            }
//        }

        jogos.removeIf(jogo -> jogo.getQuantidade() == 0);
        System.out.println(jogos);
    }
}
