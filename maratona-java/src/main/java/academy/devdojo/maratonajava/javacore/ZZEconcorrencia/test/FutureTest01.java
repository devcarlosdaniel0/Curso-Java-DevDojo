package academy.devdojo.maratonajava.javacore.ZZEconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(6);
            return 5.71;
        });

        System.out.println(doSomething());

        try {
            Double dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
            System.out.println(dollarResponse);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum+=i;
        }
        return sum;
    }
}
