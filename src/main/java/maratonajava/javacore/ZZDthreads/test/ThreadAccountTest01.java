package academy.devdojo.maratonajava.javacore.ZZDthreads.test;

import academy.devdojo.maratonajava.javacore.ZZDthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "T1");
        Thread t2 = new Thread(threadAccountTest01, "T2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FUDEU");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
//        System.out.println(getThreadName() + "#### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + "**** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual " + account.getBalance());
            } else {
                System.out.println("Não tem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
