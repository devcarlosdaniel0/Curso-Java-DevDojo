package academy.devdojo.maratonajava.javacore.ZZGjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.repository.ProducerRepositoryRowSet;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.service.ProducerService;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        log.info("---------------------");
        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
        log.info(producers);
    }
}
