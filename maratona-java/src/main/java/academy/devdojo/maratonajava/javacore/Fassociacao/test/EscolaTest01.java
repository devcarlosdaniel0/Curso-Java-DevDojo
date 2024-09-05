package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ricardo");
        Professor professor2 = new Professor("Sandra");
        Professor professor3 = new Professor("Mariana");

        Professor[] professores = {professor1, professor2, professor3};

        Escola escola = new Escola("Colégio Pilares", professores);
        escola.imprime();
    }
}
