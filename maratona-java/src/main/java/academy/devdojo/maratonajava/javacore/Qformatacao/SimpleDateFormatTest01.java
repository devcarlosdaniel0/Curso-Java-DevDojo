package academy.devdojo.maratonajava.javacore.Qformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String patternUK = "'United Kingdom,' dd MMM yyyy HH:mm:ss";
        String patternBR = "'Brasil,' dd MMM yyyy HH:mm:ss";

        SimpleDateFormat[] sdfs = new SimpleDateFormat[2];

        sdfs[0] = new SimpleDateFormat(patternUK);
        sdfs[1] = new SimpleDateFormat(patternBR);

        sdfs[0].setTimeZone(TimeZone.getTimeZone("GMT+1"));
        sdfs[1].setTimeZone(TimeZone.getTimeZone("GMT-3"));

        System.out.println(sdfs[0].format(new Date()));
        System.out.println(sdfs[1].format(new Date()));

        try {
            System.out.println(sdfs[0].parse("United Kingdom, 23 Jul 2024 17:55:00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
