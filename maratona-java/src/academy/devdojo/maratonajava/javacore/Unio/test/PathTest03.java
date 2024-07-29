package academy.devdojo.maratonajava.javacore.Unio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        String pathDiretorioProjeto = "home/william/dev";
        String pathArquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(pathDiretorioProjeto, pathArquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./william./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
