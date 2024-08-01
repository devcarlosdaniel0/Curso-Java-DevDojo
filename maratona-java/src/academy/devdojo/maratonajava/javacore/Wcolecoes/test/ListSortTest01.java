package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> jogos = new ArrayList<>();
        jogos.add("Stardew Valley");
        jogos.add("Red Dead 2");
        jogos.add("Gta 5");
        jogos.add("Detroit Become Human");
        jogos.add("Mafia");
        jogos.add("Resident Evil");
        Collections.sort(jogos);

        for (String jogo : jogos) {
            System.out.print(jogo + ", ");
        }
        System.out.println();

        List<Double> precos = new ArrayList<>();
        precos.add(34.3);
        precos.add(100.64);
        precos.add(83D);
        precos.add(27D);
        precos.add(49.5);
        Collections.sort(precos);
        System.out.println(precos);


    }
}
