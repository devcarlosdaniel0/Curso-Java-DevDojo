package academy.devdojo.maratonajava.javacore.Tio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\test.txt");


        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("Absolute Path " + file.getAbsolutePath());
            System.out.println("Is Directory " + file.isDirectory());
            System.out.println("Is File " + file.isFile());
            System.out.println("Is Hidden " + file.isHidden());
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if (file.exists()) {
                System.out.println("Arquvio deletado " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
