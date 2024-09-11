package academy.devdojo.maratonajava.javacore.ZZGjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.insert(producer);
//        ProducerService.delete(24);
//        ProducerService.deleteBetween(14,23);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findByName("mad");
//        List<Producer> producers = ProducerService.findAll();
//        log.info("Produces found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("A-1 pictures");
        List<Producer> producers = ProducerService.findByNamePreparedStatment("bo");
        log.info("Producers found '{}'", producers);
    }
}
