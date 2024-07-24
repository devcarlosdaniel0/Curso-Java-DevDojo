package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2YearsAnd7Days = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now,nowAfter2YearsAnd7Days);
        Period p2 = Period.ofDays(40);
        Period p3 = Period.ofWeeks(24);
        Period p4 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
