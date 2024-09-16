package academy.devdojo.maratonajava.javacore.ZZAlambdas.service;

@FunctionalInterface
public interface TriFunction <T, U, V, R> {
    R aplly(T t, U u, V v);
}
