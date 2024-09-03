package academy.devdojo.maratonajava.javacore.ZZFpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZFpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Carlos")
                .lastName("Silva")
                .email("carlos.daniel@gmail.com")
                .username("carlaodev")
                .build();
        System.out.println(person);
    }
}
