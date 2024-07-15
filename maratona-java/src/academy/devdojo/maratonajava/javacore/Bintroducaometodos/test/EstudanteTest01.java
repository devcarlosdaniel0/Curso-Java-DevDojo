package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Roberto";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        Estudante estudante02 = new Estudante();
        estudante02.nome = "Maria";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        ImprimeEstudante escrever = new ImprimeEstudante();
        escrever.imprime(estudante01);
        escrever.imprime(estudante02);
    }
}
