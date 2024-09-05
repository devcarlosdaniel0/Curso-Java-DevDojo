package academy.devdojo.maratonajava.javacore.Tio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\texto.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Cursando Java pelo YouTube a fins educacionais e profissionais");
            bufferedWriter.newLine();
            bufferedWriter.write("Testando a quebra de linha do bufferedWriter");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
