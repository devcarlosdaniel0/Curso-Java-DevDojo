package academy.devdojo.maratonajava.javacore.ZZFpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZFpadroesdeprojeto.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZFpadroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));
    }
}
