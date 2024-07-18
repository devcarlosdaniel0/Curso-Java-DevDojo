package academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
