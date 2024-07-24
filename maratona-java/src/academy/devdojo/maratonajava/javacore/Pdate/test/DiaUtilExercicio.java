package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiaUtilExercicio {
    public static void main(String[] args) {
        // Dado uma determinada data, retorne o próximo dia útil dessa data
        LocalDate data = LocalDate.of(2024,07,29);
        System.out.println("Hoje é " + data.getDayOfWeek());

        System.out.println("O proximo dia útil é " + retornaProximoDiaUtil(data));
    }

    public static DayOfWeek retornaProximoDiaUtil(LocalDate diaSemana) {
        LocalDate diaUtil = null;
        if (diaSemana.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            diaUtil = diaSemana.plusDays(3);
        } else if (diaSemana.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            diaUtil = diaSemana.plusDays(2);
        } else {
            diaUtil = diaSemana.plusDays(1);
        }

        return diaUtil.getDayOfWeek();
    }
}
