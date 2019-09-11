package chapter15;

public class MyRunnable implements Runnable {

    public void run() {

    }

    public void go() {

    }

    public void doMore() {
        System.out.println("Stack start");
    }
}

 class ThreadTester {
     public static void main(String[] args) {
         Runnable threadJob = new MyRunnable();
         Thread myThread = new Thread(threadJob);

         myThread.start();

         System.out.println(" Back to main method");
     }
 }
