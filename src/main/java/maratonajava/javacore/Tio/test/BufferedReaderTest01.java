package academy.devdojo.maratonajava.javacore.Tio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\Área de Trabalho\\Repositórios\\Curso-Java-DevDojo\\maratona-java\\arquivo\\texto.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
