package academy.devdojo.maratonajava.javacore.Wcolecoes.test;

import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Wcolecoes.dominio.Jogo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("José Neto");
        Consumidor consumidor2 = new Consumidor("Mauro Macedo");

        Jogo jogo1 = new Jogo(5L, "Stardew Valley", 19.9D);
        Jogo jogo2 = new Jogo(1L, "Red Dead 2", 9.5D);
        Jogo jogo3 = new Jogo(4L,"Gta 5", 3.2D);
        Jogo jogo4 = new Jogo(3L,"Detroit Become Human", 11.2D);
        Jogo jogo5 = new Jogo(2L,"Mafia", 2.99D);
        Jogo jogo6 = new Jogo(6L,"Resident Evil", 5.75D);

        List<Jogo> listaConsumidor1 = List.of(jogo1, jogo2, jogo3);
        List<Jogo> listaConsumidor2 = List.of(jogo4, jogo5, jogo6);

        Map<Consumidor, List<Jogo>> consumidorJogoMap = new HashMap<>();
        consumidorJogoMap.put(consumidor1, listaConsumidor1);
        consumidorJogoMap.put(consumidor2, listaConsumidor2);

        for (Map.Entry<Consumidor, List<Jogo>> entry : consumidorJogoMap.entrySet()) {
            System.out.println("----" + entry.getKey().getNome());
            for (Jogo jogo : entry.getValue()) {
                System.out.println(jogo.getNome());
            }

        }
    }
}
