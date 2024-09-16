package academy.devdojo.maratonajava.javacore.Kinterfaces.test;

import academy.devdojo.maratonajava.javacore.Kinterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Kinterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Kinterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        dataBaseLoader.retriveMaxDataSize();
    }
}
