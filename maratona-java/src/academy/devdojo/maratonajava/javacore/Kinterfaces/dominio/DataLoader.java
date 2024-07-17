package academy.devdojo.maratonajava.javacore.Kinterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
