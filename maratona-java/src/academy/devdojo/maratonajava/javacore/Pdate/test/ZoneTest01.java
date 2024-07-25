package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId TokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(TokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime1 = now.atZone(TokyoZone);
        System.out.println(zonedDateTime1);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(TokyoZone);
        System.out.println(zonedDateTime2);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        System.out.println(offSetManaus);

        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime2);

        // OBS: Para mudar o horário dentro da Zona utilize a classe Instant, pois ela é Zulu Time


        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println(japaneseDate);
    }
}
