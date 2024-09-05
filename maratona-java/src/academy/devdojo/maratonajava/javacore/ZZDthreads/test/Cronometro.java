package academy.devdojo.maratonajava.javacore.ZZDthreads.test;

class SimpleStopwatch implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        int seconds = 0;

        while (running) {
            try {
                Thread.sleep(1000); // Pausa a execução por 1 segundo (1000 milissegundos)
                seconds++;
                System.out.println("Tempo decorrido: " + seconds + " segundos");
            } catch (InterruptedException e) {
                // Se a thread for interrompida, podemos parar o cronômetro
                System.out.println("Cronômetro interrompido.");
                running = false;
            }
        }
    }

    public void stop() {
        running = false; // Método para parar o cronômetro
    }

}

public class Cronometro {
    public static void main(String[] args) {
        SimpleStopwatch stopwatch = new SimpleStopwatch();
        Thread stopwatchThread = new Thread(stopwatch);
        stopwatchThread.start(); // Inicia a execução do cronômetro

    }
}
