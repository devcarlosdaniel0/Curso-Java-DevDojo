package academy.devdojo.maratonajava.javacore.ZZHcrud.service;

import academy.devdojo.maratonajava.javacore.ZZHcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZHcrud.repository.ProducerRepository;

import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> insert();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type the id of producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void insert() {
        System.out.println("Type the name of producer you want to insert");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.insert(producer);
    }

}
