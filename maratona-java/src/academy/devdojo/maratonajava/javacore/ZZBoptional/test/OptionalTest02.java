package academy.devdojo.maratonajava.javacore.ZZBoptional.test;

import academy.devdojo.maratonajava.javacore.ZZBoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZBoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters").orElseGet(() -> new Manga(3, "Drifters", 30));
        System.out.println(newManga);
    }
}
