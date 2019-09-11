package chapter15;

public class RunThreads implements Runnable {

    public static void main(String[] args) {

        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("Stream Alpha");
        beta.setName("Stream Beta");

        alpha.start();
        beta.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Now working : " + threadName);
        }
    }
}
