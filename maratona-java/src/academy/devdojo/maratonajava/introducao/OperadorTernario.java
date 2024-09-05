package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class OperadorTernario {

    public static void main(String[] args) {
        // (condicao)?verdadeiro:falso
        String msgGanhar = "Ganhei na loteria!";
        String msgPerder = "Perdi, que pena!";

        Random random = new Random();
        int aleatorio = 1 + random.nextInt(4);
        String jogarLoteria = (aleatorio == 3)?msgGanhar:msgPerder;
        System.out.println(jogarLoteria);

        String comprar = (jogarLoteria.equals(msgGanhar))?"Vou comprar uma porsche":"Fica pro próximo ano";
        System.out.println(comprar);

        /*Criei uma String para exibir uma msg de ganha ou perda da loteria
         *Caso o número aleatório seja 3, exibirá a msg de Ganho, caso contrário a de perda
         *Criei uma String comprar, onde se eu ganhar na loteria comprarei uma porsche, caso contrário
         *fica pro próximo ano.
         */
    }
}