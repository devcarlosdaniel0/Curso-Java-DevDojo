package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExercicioSwitchCase {

    public static void main(String[] args) {
        int dia = 0;
        String continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite um dia da semana [1-7]");
            dia = sc.nextInt();
            switch (dia) {
                case 1:
                case 7:
                    System.out.println("Final de semana");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia útil");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Continuar? [s / n]");
            continuar = sc.next();
        } while (continuar.equals("s"));
    }
}