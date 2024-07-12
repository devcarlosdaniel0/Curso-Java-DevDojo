package academy.devdojo.maratonajava.introducao;

public class ForEach {
    public static void main(String[] args) {
        String[] nomes = new String[]{"Pedro", "Paulo", "João"};

        for (String i:nomes) {
            System.out.print(i + " ");
        }

        System.out.println("");
        // --------------------------------------------------------- //

        int[] numeros = new int[]{1,2,3,4,5};

        for (int i:numeros) {
            System.out.print(i + " ");
        }
    }
}