package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Roberto";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        Estudante estudante02 = new Estudante();
        estudante02.nome = "Maria";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
