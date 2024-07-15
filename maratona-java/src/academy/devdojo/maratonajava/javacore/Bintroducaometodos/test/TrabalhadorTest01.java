package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Trabalhador;

public class TrabalhadorTest01 {
    public static void main(String[] args) {
        Trabalhador trabalhador = new Trabalhador();
        trabalhador.nome = "Marcão";
        trabalhador.idade = 30;
        trabalhador.salarios = new float[]{1200,943.32f,1454.94f};

        trabalhador.imprime();
    }
}
