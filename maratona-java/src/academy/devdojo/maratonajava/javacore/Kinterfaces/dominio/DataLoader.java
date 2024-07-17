package academy.devdojo.maratonajava.javacore.Kinterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retriveMaxDataSize() {
        System.out.println("retriveMaxDataSize dentro da Interface");
    }
}
