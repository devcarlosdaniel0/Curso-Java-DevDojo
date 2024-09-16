package academy.devdojo.maratonajava.javacore.ZZGjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("White fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
