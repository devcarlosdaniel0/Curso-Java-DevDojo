package academy.devdojo.maratonajava.javacore.Tio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("folder");
        boolean isDiretorioCreated = diretorio.mkdir();
        System.out.println("Diretório folder criado " + isDiretorioCreated);

        File file = new File(diretorio, "file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Arquivo file.txt criado " + isFileCreated);

        File fileRenamed = new File(diretorio, "file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("Arquivo file.txt renomeado? " + isFileRenamed);

        File diretorioRenamed = new File("folder_renamed");
        boolean isDiretorioRenamed = diretorio.renameTo(diretorioRenamed);
        System.out.println("Diretório renomeado? " + isDiretorioRenamed);
    }
}
