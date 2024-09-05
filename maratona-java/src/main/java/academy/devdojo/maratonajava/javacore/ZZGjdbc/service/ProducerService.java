package academy.devdojo.maratonajava.javacore.ZZGjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZGjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZGjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void insert(Producer producer) {
        ProducerRepository.insert(producer);
    }

    public static void delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.delete(id);
    }

    public static void deleteBetween(int idInicio, int idFinal) {
        if (idInicio <= 0 || idFinal <= 0) {
            throw new IllegalArgumentException("Invalid value for ids");
        }
        ProducerRepository.deleteBetween(idInicio, idFinal);
    }
}
