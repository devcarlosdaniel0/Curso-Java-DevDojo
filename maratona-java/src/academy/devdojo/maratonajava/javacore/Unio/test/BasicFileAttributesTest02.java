package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivo/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("creationTime " + creationTime.toInstant().atZone(ZoneId.of("GMT-3")));
        System.out.println("lastAccessTime " + lastAccessTime.toInstant().atZone(ZoneId.of("GMT-3")));
        System.out.println("lastModifiedTime " + lastModifiedTime.toInstant().atZone(ZoneId.of("GMT-3")));

        System.out.println("-------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newAcessTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newAcessTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creationTime " + creationTime.toInstant().atZone(ZoneId.of("GMT-3")));
        System.out.println("lastAccessTime " + lastAccessTime.toInstant().atZone(ZoneId.of("GMT-3")));
        System.out.println("lastModifiedTime " + lastModifiedTime.toInstant().atZone(ZoneId.of("GMT-3")));
    }
}
