package academy.devdojo.maratonajava.javacore.ZZIjunit.service;

import academy.devdojo.maratonajava.javacore.ZZIjunit.dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person cant be null");
        return person.getAge() >= 18;
    }
}
