package academy.devdojo.maratonajava.javacore.ZZFpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
