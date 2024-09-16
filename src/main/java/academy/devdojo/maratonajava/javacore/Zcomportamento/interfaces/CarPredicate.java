package academy.devdojo.maratonajava.javacore.Zcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.Zcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, funções, conciso
    // (parametro) -> <expressão>
    // (Car car) -> car.getColor().equals("green");
    boolean test(Car car);
}
