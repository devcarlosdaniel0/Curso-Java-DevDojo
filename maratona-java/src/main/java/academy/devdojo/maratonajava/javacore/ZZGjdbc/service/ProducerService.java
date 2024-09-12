package academy.devdojo.maratonajava.javacore.ZZGjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void insert(Producer producer) {
        ProducerRepository.insert(producer);
    }

    public static void saveTransaction(List<Producer> producers) {
        ProducerRepository.saveTransaction(producers);
    }

    public static void delete(Integer id) {
        requiredValidId(id);
        ProducerRepository.delete(id);
    }

    public static void deleteBetween(Integer idInicio, Integer idFinal) {
        requiredValidId(idInicio);
        requiredValidId(idFinal);
        ProducerRepository.deleteBetween(idInicio, idFinal);
    }

    public static void update(Producer producer) {
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatement(Producer producer) {
        requiredValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNamePreparedStatment(String name) {
        return ProducerRepository.findByNamePreparedStatment(name);
    }

    public static List<Producer> findByNameCallableStatment(String name) {
        return ProducerRepository.findByNameCallableStatment(name);
    }

    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }

    private static void requiredValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
