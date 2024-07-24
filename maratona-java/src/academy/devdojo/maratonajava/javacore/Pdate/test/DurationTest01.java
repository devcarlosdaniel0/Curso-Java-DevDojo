package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter2Years = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now,nowAfter2Years);
        Duration d2 = Duration.between(timeNow,timeNowMinus7Hours);
        Duration d3 = Duration.ofDays(730); // 2 anos

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
