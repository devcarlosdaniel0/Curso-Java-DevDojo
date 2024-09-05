package academy.devdojo.maratonajava.javacore.Kinterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checagem de permissões no banco de dados");
    }

    public void retriveMaxDataSize() {
        System.out.println("retriveMaxDataSize dentro da DataBaseLoader");
    }
}
