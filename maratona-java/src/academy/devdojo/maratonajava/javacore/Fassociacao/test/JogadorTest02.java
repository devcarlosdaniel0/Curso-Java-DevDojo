package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Gabigol");
        Time time = new Time("Flamengo");

        jogador.setTime(time);
        jogador.imprime();
    }
}
