package academy.devdojo.maratonajava.javacore.ZZEconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1,11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa Callable... %n", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d%n", Thread.currentThread().getName(), num);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws Exception {
        RandomNumberCallable random = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(random);
        Future<String> future2 = executorService.submit(random);
        String s = future.get();
        String s2 = future2.get();
        System.out.printf("Program finished %s", s);
        System.out.printf("Program finished %s", s2);
        executorService.shutdown();
    }
}
