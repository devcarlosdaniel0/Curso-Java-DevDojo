package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DiaUtilExercicio2 {
    public static void main(String[] args) {
        // Dado uma determinada data, retorne o próximo dia útil dessa data
        LocalDate data = LocalDate.of(2024,07,28);
        System.out.println("Hoje é " + data.getDayOfWeek());
        System.out.println("Dia " + data);

        System.out.println("-------------------------");

        LocalDate proximoDiaUtil = obterProximoDiaUtil(data);
        System.out.println("O próximo dia útil é " + proximoDiaUtil.getDayOfWeek());
        System.out.println(proximoDiaUtil);
    }

    public static LocalDate obterProximoDiaUtil(LocalDate data) {
        DayOfWeek dayOfWeek = data.getDayOfWeek();
        LocalDate proximoDiaUtil;
        if (dayOfWeek.equals(DayOfWeek.FRIDAY) || dayOfWeek.equals(DayOfWeek.SATURDAY)) {
            proximoDiaUtil = data.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        } else {
            proximoDiaUtil = data.plusDays(1);
        }
        return proximoDiaUtil;
    }
}
