package academy.devdojo.maratonajava.introducao;

public class AulaArrays {
    public static void main(String[] args) {
        // Primeira forma
        int[] idades = new int[5];
        idades[0] = 15;
        idades[1] = 20;
        idades[2] = 18;
        idades[3] = 50;
        idades[4] = 60;
        for (int i = 0;i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }

        System.out.println("");

        // Segunda forma
        int[] numeros = {10,20,30,40,50};
        for (int i = 0; i < numeros.length;i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");

        // Terceira forma
        int[] numeros2 = new int[]{10,20,30,40,50};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }

        System.out.println("");
    }
}