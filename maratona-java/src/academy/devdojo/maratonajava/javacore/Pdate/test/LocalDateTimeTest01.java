package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.parse("2024-12-31");
        System.out.println(date);

        LocalTime time = LocalTime.parse("23:59:59");
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
