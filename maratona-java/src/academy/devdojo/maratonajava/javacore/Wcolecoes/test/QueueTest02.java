package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Jogo> jogos = new PriorityQueue<>(new JogoByPrecoComparator().reversed());
        jogos.add(new Jogo(5L, "Stardew Valley", 19.9D, 0));
        jogos.add(new Jogo(1L, "Red Dead 2", 9.5D, 5));
        jogos.add(new Jogo(4L,"Gta 5", 3.2D, 3));
        jogos.add(new Jogo(3L,"Detroit Become Human", 11.2D, 0));
        jogos.add(new Jogo(2L,"Mafia", 2.99D,0));
        jogos.add(new Jogo(6L,"Resident Evil", 5.75D,2));

        while (!jogos.isEmpty()) {
            System.out.println(jogos.poll());
        }
    }
}
