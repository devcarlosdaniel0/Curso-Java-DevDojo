package academy.devdojo.maratonajava.javacore.Ostring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concactString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a String " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concactStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a StringBuilder " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concactStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a StringBuffer " + (fim - inicio) + " ms");
    }

    private static void concactString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concactStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concactStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
