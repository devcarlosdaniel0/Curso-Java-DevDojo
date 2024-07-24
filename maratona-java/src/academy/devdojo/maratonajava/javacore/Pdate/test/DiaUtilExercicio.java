package academy.devdojo.maratonajava.javacore.Pdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiaUtilExercicio {
    public static void main(String[] args) {
        // Dado uma determinada data, retorne o próximo dia útil dessa data

        // Data especificada
        LocalDate data = LocalDate.of(2024, 7, 26);
        System.out.println("Hoje é " + data.getDayOfWeek());

        // Chamada do método para obter o próximo dia útil
        LocalDate proximoDiaUtil = obterProximoDiaUtil(data);
        System.out.println("O próximo dia útil é " + proximoDiaUtil.getDayOfWeek() + " (" + proximoDiaUtil + ")");
    }

    public static LocalDate obterProximoDiaUtil(LocalDate data) {
        LocalDate proximoDia = data;
        do {
            proximoDia = proximoDia.plusDays(1);
        } while (proximoDia.getDayOfWeek() == DayOfWeek.SATURDAY || proximoDia.getDayOfWeek() == DayOfWeek.SUNDAY);
        return proximoDia;
    }
}