package academy.devdojo.maratonajava.javacore.Lpolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorioA = new RepositorioArquivo();
        repositorioA.salvar();

        Repositorio repositorioB = new RepositorioBancoDeDados();
        repositorioB.salvar();

        Repositorio repositorioM = new RepositorioMemoria();
        repositorioM.salvar();
    }
}
