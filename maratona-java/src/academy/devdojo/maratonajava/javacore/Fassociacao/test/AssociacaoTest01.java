package academy.devdojo.maratonajava.javacore.Fassociacao.test;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("CNPEM");
        Local local2 = new Local("Fatec");
        Aluno aluno1 = new Aluno("Maria",17);
        Aluno aluno2 = new Aluno("Carlos",16);
        Professor professor = new Professor("Fábio","Matemática");

        Aluno[] alunos = new Aluno[]{aluno1,aluno2};

        Seminario seminario1 = new Seminario("Seminário de Química",alunos, local1);
        Seminario seminario2 = new Seminario("Seminário de Física", alunos, local2);

        Seminario[] seminarios = new Seminario[]{seminario1,seminario2};

        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}
