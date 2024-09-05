package academy.devdojo.maratonajava.javacore.ZZDthreads.test;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() );
        switch (Thread.currentThread().getName()) {
            case "T1":
                System.out.print("K");
                break;
            case "T2":
                System.out.print("M");
                break;
            case "T3":
                System.out.print("H");
                break;
        }
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("A"), "T1");
        Thread t2 = new Thread(new ThreadExampleRunnable2("E"), "T2");
        Thread t3 = new Thread(new ThreadExampleRunnable2("A"), "T3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
