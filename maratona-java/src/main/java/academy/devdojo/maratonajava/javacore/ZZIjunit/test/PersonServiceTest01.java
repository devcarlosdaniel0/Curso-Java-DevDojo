package academy.devdojo.maratonajava.javacore.ZZIjunit.test;

import academy.devdojo.maratonajava.javacore.ZZIjunit.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZIjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("is adult? '{}'", personService.isAdult(person));
    }
}
