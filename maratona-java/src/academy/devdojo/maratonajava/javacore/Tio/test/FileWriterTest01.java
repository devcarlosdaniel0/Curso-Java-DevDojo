package academy.devdojo.maratonajava.javacore.Tio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\texto.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Cursando Java pelo YouTube a fins educacionais e profissionais\nPulando linha\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
