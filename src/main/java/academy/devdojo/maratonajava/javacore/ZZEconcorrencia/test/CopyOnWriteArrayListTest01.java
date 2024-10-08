package academy.devdojo.maratonajava.javacore.ZZEconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                Thread.sleep(2000);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i, list.remove(i));
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
