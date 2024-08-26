package academy.devdojo.maratonajava.javacore.ZZDthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return this.emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checando se tem email");
        synchronized (this.emails) {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " não tem email disponível na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " não estamos pegando mais emails");
            this.emails.notifyAll();
        }
    }
}
